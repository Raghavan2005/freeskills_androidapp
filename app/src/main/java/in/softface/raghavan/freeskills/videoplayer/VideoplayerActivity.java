/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 18/08/23, 12:22 am
 *    funwithmetamil@gmail.com
 *     Last modified 11/08/23, 12:02 am
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.videoplayer;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.dateset.conditiondataset;

public class VideoplayerActivity extends AppCompatActivity {

    private ImageView imagetype;
    private String imageUrl;

    private Uri uri;
    private ArrayList<String> data;
    private String type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoplayer);
        uri = getIntent().getData();
        data = getIntent().getStringArrayListExtra("array");
        if (uri != null) {

            // if the uri is not null then we are getting
            // the path segments and storing it in list.
            List<String> parameters = uri.getPathSegments();

            // after that we are extracting string
            // from that parameters.
            String param = parameters.get(parameters.size() - 1);

            // on below line we are setting that string
            // to our text view which we got as params.
            data = getlist(param);
        }

        getSupportFragmentManager().beginTransaction()

                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
                .replace(R.id.fragment_container, Player_Fragment.newInstance(data), "fragmentA")
                .commit();

    }

    private ArrayList<String> getlist(String Id) {
        ArrayList at = new ArrayList<>();
        conditiondataset sde = new conditiondataset();
        at = sde.data(Id);

        return at;
    }

    // @Override
    // public void onBackPressed() {
    //    super.onBackPressed();
    //    finish();
    // Close the current activity and return to the previous one
    // }


}
