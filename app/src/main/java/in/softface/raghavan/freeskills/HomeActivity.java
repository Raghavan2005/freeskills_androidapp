/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/8/23, 11:32 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/8/23, 11:32 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills;


import android.annotation.SuppressLint;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.AnimationTypes;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Objects;

import in.softface.raghavan.freeskills.dateset.cardviewdata;
import in.softface.raghavan.freeskills.eachcardview.CardlistDisplayonRecycleview;
import in.softface.raghavan.freeskills.login.profile.createprofilepackage.CreateProfile;
import in.softface.raghavan.freeskills.messageshower.dialog_loading;
import in.softface.raghavan.freeskills.setting.SettingsActivity;

public class HomeActivity extends AppCompatActivity {
    ImageSlider mainslider;
    TextView usernameview;

    SharedPreferences sharedPreferences;
    RecyclerView ContinuerecyclerView, RecommendedrecyclerView, watchlanguagerecyclerView, inyourlanguagerecyclerView, programmingrecyclerView, frameworksrecyclerView, CrashCourserecyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("Username", null);
        if (username == null) {
            Intent i = new Intent(HomeActivity.this, CreateProfile.class);
            startActivity(i);
        }
        setContentView(R.layout.activity_home);
        dialog_loading dl = new dialog_loading(HomeActivity.this, 3000);
        dl.show();
        cardviewdata cvd = new cardviewdata();
        Objects.requireNonNull(getSupportActionBar()).setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);
        mainslider = findViewById(R.id.main_slider);
        ImageView proimage = findViewById(R.id.action_bar_image);
        usernameview = findViewById(R.id.username);
        overridePendingTransition(R.transition.explode, 0);

        String imageurl = sharedPreferences.getString("profileImage", null);

        Picasso.get()
                .load(imageurl)
                .into(proimage);

        usernameview.setText(" " + capitalizeFirstLetter(username));

        proimage.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            Intent i = new Intent(HomeActivity.this, SettingsActivity.class);
                                            View sharedView = proimage;
                                            String transitionName = getString(R.string.blue_name);

                                            ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this, sharedView, transitionName);
                                            startActivity(i, transitionActivityOptions.toBundle());

                                        }
                                    }
        );


        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2BteuF2", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2BteuF2", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2BteuF2", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        mainslider.setImageList(slideModels, ScaleTypes.FIT);
        mainslider.startSliding(3000);
        mainslider.setSlideAnimation(AnimationTypes.DEPTH_SLIDE);


     /*   ScrollView scrollView = findViewById(R.id.mainScroll);

        scrollView.smoothScrollTo(0, 0); // Scrolls to the top position (0, 0) with smooth animation*/


///// Continue Watching
        ContinuerecyclerView = findViewById(R.id.ContinuerecyclerView);
        ContinuerecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        CardlistDisplayonRecycleview continueImageAdapter = new CardlistDisplayonRecycleview(cvd.Recommended, HomeActivity.this);
        ContinuerecyclerView.setAdapter(continueImageAdapter);
        ContinuerecyclerView.scrollToPosition(continueImageAdapter.getItemCount() - 1);
//
//
//// Recommended
        RecommendedrecyclerView = findViewById(R.id.RecommendedrecyclerView);
        RecommendedrecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        CardlistDisplayonRecycleview recommendedImageAdapter = new CardlistDisplayonRecycleview(cvd.Recommended, HomeActivity.this);
        RecommendedrecyclerView.setAdapter(recommendedImageAdapter);
        RecommendedrecyclerView.scrollToPosition(recommendedImageAdapter.getItemCount() - 1);
//
//
//// watch in your language
        watchlanguagerecyclerView = findViewById(R.id.watchlanguagerecyclerView);
        watchlanguagerecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        CardlistDisplayonRecycleview watchlanguageImageAdapter = new CardlistDisplayonRecycleview(cvd.language, HomeActivity.this);
        watchlanguagerecyclerView.setAdapter(watchlanguageImageAdapter);
        watchlanguagerecyclerView.scrollToPosition(watchlanguageImageAdapter.getItemCount() - 1);

////programming languages

        programmingrecyclerView = findViewById(R.id.programmingrecyclerView);
        programmingrecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        CardlistDisplayonRecycleview programmingImageAdapter = new CardlistDisplayonRecycleview(cvd.programming, HomeActivity.this);
        programmingrecyclerView.setAdapter(programmingImageAdapter);
        programmingrecyclerView.scrollToPosition(programmingImageAdapter.getItemCount() - 1);
////frameworks
        frameworksrecyclerView = findViewById(R.id.frameworksrecyclerView);
        frameworksrecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        CardlistDisplayonRecycleview frameworksImageAdapter = new CardlistDisplayonRecycleview(cvd.frameworks, HomeActivity.this);
        frameworksrecyclerView.setAdapter(frameworksImageAdapter);
        frameworksrecyclerView.scrollToPosition(frameworksImageAdapter.getItemCount() - 1);


        CrashCourserecyclerView = findViewById(R.id.CrashCourserecyclerView);
        CrashCourserecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        CardlistDisplayonRecycleview CrashCourseImageAdapter = new CardlistDisplayonRecycleview(cvd.CrashCourse, HomeActivity.this);
        CrashCourserecyclerView.setAdapter(CrashCourseImageAdapter);
        CrashCourserecyclerView.scrollToPosition(CrashCourseImageAdapter.getItemCount() - 1);


    }

    private void recreateActivity() {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String firstLetter = str.substring(0, 1).toUpperCase();
        String restOfString = str.substring(1).toLowerCase();

        return firstLetter + restOfString;
    }


}
