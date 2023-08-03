/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 19/07/23, 8:36 pm
 *    funwithmetamil@gmail.com
 *     Last modified 19/07/23, 8:36 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.squareup.picasso.Picasso;

import java.util.Objects;

import in.softface.raghavan.freeskills.joblist.Joblist;
import in.softface.raghavan.freeskills.login.profile.createprofilepackage.CreateProfile;
import in.softface.raghavan.freeskills.setting.mainsetting;

public class MainActivity extends AppCompatActivity {
    TextView titleview;

    SharedPreferences sharedPreferences;
    ImageView proimage;
    private in.softface.raghavan.freeskills.setting.mainsetting mainsetting;
    private Home_Fragment Home_Fragment;

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String firstLetter = str.substring(0, 1).toUpperCase();
        String restOfString = str.substring(1).toLowerCase();

        return firstLetter + restOfString;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        String username = sharedPreferences.getString("Username", null);
        String jobname = sharedPreferences.getString("JobSelected", null);

        if (username == null) {
            Intent i = new Intent(this, CreateProfile.class);
            startActivity(i);
            finish();
        } else if (jobname == null) {
            Intent i = new Intent(this, Joblist.class);
            startActivity(i);
            finish();
        }
        //  getSupportActionBar().hide();
        Objects.requireNonNull(getSupportActionBar()).setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar);
        proimage = findViewById(R.id.action_bar_image);
        titleview = findViewById(R.id.title);


        //menu
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    if (Home_Fragment == null) {
                        Home_Fragment = new Home_Fragment();
                    }
                    proimage.setVisibility(View.VISIBLE);
                    getSupportFragmentManager().beginTransaction()
                            //   .setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_out_left, R.anim.slide_in_right)
                            .replace(R.id.fragment_container, Home_Fragment, "homeFragment")
                            .commit();
                    titleview.setText("FreeSkills");
                    return true;

                case R.id.user:
                    if (mainsetting == null) {
                        mainsetting = new mainsetting();
                    }
                    proimage.setVisibility(View.INVISIBLE);
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, mainsetting, "whitelistFragment")
                            .commit();
                    titleview.setText("Settings");
                    return true;
            }
            return false;
        });
        //end
        // Check if the fragment is already added (e.g., during configuration changes)
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
                    .replace(R.id.fragment_container, new Home_Fragment(), "fragmentA")
                    .commit();
        }


        String imageurl = sharedPreferences.getString("profileImage", null);

        Picasso.get()
                .load(imageurl)
                .into(proimage);


        proimage.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {


                                        }
                                    }
        );


    }

    private void recreateActivity() {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    public void reloadFragment() {
        // Replace the existing Fragment with a new instance of the same Fragment
        Fragment fragment = mainsetting.newInstance("whitelistFragment", "whitelistFragment");
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }

    @Override
    public void onBackPressed() {

        finishAffinity();
    }

}

