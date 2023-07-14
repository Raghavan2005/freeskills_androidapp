/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/23/23, 3:22 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/23/23, 3:22 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.setting;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.login.profile.createprofilepackage.CreateProfile;
import in.softface.raghavan.freeskills.messageshower.snackbarCaller;

public class SettingsActivity extends AppCompatActivity {
TextView username;
Button button;
ImageView profileimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        setTitle("Settings");
      SharedPreferences sharedPreferences = getSharedPreferences("UsersData", Context.MODE_PRIVATE);
      String   UserName = sharedPreferences.getString("username", "Not Found");
      String  imageurl = sharedPreferences.getString("profileImage", "");
      username=findViewById(R.id.username);

      profileimage=findViewById(R.id.profileimg);
      username.setText(UserName);
        Picasso.get()
                .load(imageurl)
                .into(profileimage);
        button=findViewById(R.id.clear);
        snackbarCaller sc = new snackbarCaller(getApplicationContext(),button,"Done",0);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        //   CustomDialogClass cdc = new CustomDialogClass(SettingsActivity.this);
        //  cdc.show();
        Intent i = new Intent(SettingsActivity.this, CreateProfile.class);
        startActivity(i);
        finish();
    }
});


    }


}