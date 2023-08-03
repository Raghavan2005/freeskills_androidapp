package in.softface.raghavan.freeskills.videoplayer;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import in.softface.raghavan.freeskills.R;

public class VideoplayerActivity extends AppCompatActivity {

    private ImageView imagetype;
    private String imageUrl;


    private ArrayList<String> data;
    private String type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoplayer);

        data = getIntent().getStringArrayListExtra("array");
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
                .replace(R.id.fragment_container, Player_Fragment.newInstance(data), "fragmentA")
                .commit();

    }


    // @Override
    // public void onBackPressed() {
    //    super.onBackPressed();
    //    finish();
    // Close the current activity and return to the previous one
    // }


}
