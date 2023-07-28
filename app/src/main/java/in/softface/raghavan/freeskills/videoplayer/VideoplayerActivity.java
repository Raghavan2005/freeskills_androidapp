package in.softface.raghavan.freeskills.videoplayer;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Objects;

import in.softface.raghavan.freeskills.R;

public class VideoplayerActivity extends AppCompatActivity {

    private ImageView imagetype;
    private String imageUrl;
    String cardName;

    private ArrayList<String> data;
    private String type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoplayer);

        cardName = getIntent().getStringExtra("cardName");
        imageUrl = getIntent().getStringExtra("imageUrl");
        type = getIntent().getStringExtra("type");
        data = getIntent().getStringArrayListExtra("array");
        ImageButton backButton = findViewById(R.id.backButton);
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
                .replace(R.id.fragment_container, Player_Fragment.newInstance(imageUrl, data), "fragmentA")
                .commit();

        imagetype = findViewById(R.id.imagetype);
        if (Objects.equals(type, "CrashCourse")) {
            imagetype.setImageResource(R.drawable.crashcourser);
        } else if (Objects.equals(type, "programming")) {
            imagetype.setImageResource(R.drawable.programming);
        } else if (Objects.equals(type, "frameworks")) {
            imagetype.setImageResource(R.drawable.framework);
        }

        backButton.setOnClickListener(v -> {
            onBackPressed();
            finish();
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish(); // Close the current activity and return to the previous one
    }


}
