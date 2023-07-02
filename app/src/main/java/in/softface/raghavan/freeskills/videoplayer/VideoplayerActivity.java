package in.softface.raghavan.freeskills.videoplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

import in.softface.raghavan.freeskills.R;

public class VideoplayerActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageView imagetype;
    private String imageUrl;
    String cardName;

    private ArrayList<String> data;
    private String type;
    private int[] tabIcons = {
            R.drawable.home,
            R.drawable.topic
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoplayer);

        cardName = getIntent().getStringExtra("cardName");
        imageUrl = getIntent().getStringExtra("imageUrl");
        type = getIntent().getStringExtra("type");
        data = getIntent().getStringArrayListExtra("array");
        TextView title = findViewById(R.id.coursetitile);
        ImageButton backButton = findViewById(R.id.backButton);
        viewPager = findViewById(R.id.viewpager);
        tabLayout = findViewById(R.id.tabs);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        imagetype = findViewById(R.id.imagetype);
        if (Objects.equals(type, "CrashCourse")) {
            imagetype.setImageResource(R.drawable.crashcourser);
        } else if (Objects.equals(type, "programming")) {
            imagetype.setImageResource(R.drawable.programming);
        } else if (Objects.equals(type, "frameworks")) {
            imagetype.setImageResource(R.drawable.framework);
        }

        title.setText(cardName);
        backButton.setOnClickListener(v -> {
            onBackPressed();
            finish();
        });
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish(); // Close the current activity and return to the previous one
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        Player_Fragment playerFragment = Player_Fragment.newInstance(imageUrl, data);
        Topic_Fragment topic_fragment = Topic_Fragment.newInstance(cardName);
        adapter.addFragment(playerFragment, "HOME");
        adapter.addFragment(topic_fragment, "TOPIC");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
