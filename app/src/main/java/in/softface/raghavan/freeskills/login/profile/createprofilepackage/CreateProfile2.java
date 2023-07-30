/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 13/07/23, 8:12 pm
 *    funwithmetamil@gmail.com
 *     Last modified 13/07/23, 8:12 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.login.profile.createprofilepackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.login.profile.PCreatedActivity;
import in.softface.raghavan.freeskills.notifications.Notification_Screen;

public class CreateProfile2 extends AppCompatActivity {
    final int delayMillis = 2000;
    public boolean Notifications, user_policy;
    String language = "English";
    Handler handler = new Handler();
    Button fianlbutton;
    Switch Notificationtg;
    SharedPreferences sharedPreferences;
    sharedallinoneplace sp;
    CheckBox user_policytg;
    ProgressBar loadingpg;
    Intent i, i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile2);
        // i = new Intent(this, Notification_Screen.class);
        i1 = new Intent(this, PCreatedActivity.class);
        Spinner spinner = findViewById(R.id.spinner);
        sharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        sp = new sharedallinoneplace(this);
        loadingpg = (ProgressBar) findViewById(R.id.loadingpg);
        Notificationtg = findViewById(R.id.Notificationtg);
        user_policytg = findViewById(R.id.user_policy);
        fianlbutton = (Button) findViewById(R.id.finalSummit);

        //laugage Spinner
        // Create a custom ArrayAdapter with overridden getDropDownView()
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.custom_spinner_dropdown_item) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                if (convertView == null) {
                    convertView = getLayoutInflater().inflate(R.layout.custom_spinner_dropdown_item, parent, false);
                }

                TextView textView = convertView.findViewById(R.id.spinner_text);
                String item = getItem(position);
                textView.setText(item);

                return convertView;
            }

            @NonNull
            @Override
            public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                if (convertView == null) {
                    convertView = getLayoutInflater().inflate(R.layout.custom_spinner_dropdown_item, parent, false);
                }

                TextView textView = convertView.findViewById(R.id.spinner_text);
                language = getItem(position);
                textView.setText(language);

                // Apply the slide-down animation to the dropdown view
                Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down);
                convertView.startAnimation(animation);

                return convertView;
            }
        };

        adapter.add("English");

        spinner.setAdapter(adapter);


        Objects.requireNonNull(getSupportActionBar()).hide();
        fianlbutton.setOnClickListener(v -> {
            // Code to execute when the button is clicked

            onButtonClick();

        });


    }

    private void onButtonClick() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if (!Notifications) {
                    startActivity(i1);
                    finish();
                } else {
                    startActivity(i1);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }


            }
        };
        if (user_policy) {

            if (language != null) {
                loadingpg.setVisibility(View.VISIBLE);
                fianlbutton.setVisibility(View.GONE);
                USharedPreferences(language, Notifications, user_policy);
                sp.userdataimputmet();
                Toast.makeText(this, "Account Created", Toast.LENGTH_SHORT).show();
                // Log.d("TAG", "Created");
                handler.postDelayed(runnable, delayMillis);
            } else {
                loadingpg.setVisibility(View.GONE);
                fianlbutton.setVisibility(View.VISIBLE);
                Toast.makeText(this, "Account Cant Created : Try Again", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "Account Cant Created : Please acknowledge your agreement to our user policy", Toast.LENGTH_SHORT).show();


        }
    }


    private void USharedPreferences(@NotNull String language, @NotNull Boolean notifications, @NotNull Boolean user_policy) {
        @SuppressLint("CommitPrefEdits") SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("language", language);
        editor.putBoolean("notifications", notifications);
        editor.putBoolean("userPolicy", user_policy);
        editor.apply();
    }

    public void checkswitchandcheckbox(View v) {
        Notifications = Boolean.parseBoolean(String.valueOf(Notificationtg.isChecked()));
        user_policy = Boolean.parseBoolean(String.valueOf(user_policytg.isChecked()));

    }

}