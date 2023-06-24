/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/8/23, 11:32 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/8/23, 11:32 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.login.profile;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.Objects;
import java.util.Random;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.notifications.Notification_Screen;

public class CreateProfile extends AppCompatActivity {
    EditText editText;
    Intent i,i1;
    Handler handler = new Handler();


    Button Summit;
    RadioGroup Educationalrg, Current_Levelrg;
    RadioButton Educationalbn, Current_Levelbn;
    String Educational, Current_Level, language, Username ,ProfileImage;
    final int delayMillis = 200;
    //179
     public boolean Notifications, user_policy;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    Switch Notificationtg;
    CheckBox user_policytg;
    ProgressBar loadingpg;
    ImageView profileimage;

    String randomProfileImage = ProfileImageGenerator.generateRandomProfileImage();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
        // Declaration Of Object
       //Next file TO GO

            i = new Intent(CreateProfile.this, Notification_Screen.class);
            i1 = new Intent(CreateProfile.this, PCreatedActivity.class);


        editText = findViewById(R.id.editUsername);
        Educationalrg = (RadioGroup) findViewById(R.id.radioGroup);
        Current_Levelrg = findViewById(R.id.radioGroup2);
        InputMethodManager keyboard = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        Spinner spinner = findViewById(R.id.spinner);
        Summit = findViewById(R.id.Summit);
        loadingpg = (ProgressBar) findViewById(R.id.loadingpg);
        Notificationtg = findViewById(R.id.Notificationtg);
        user_policytg = findViewById(R.id.user_policy);
        profileimage = findViewById(R.id.profileimage);
        Picasso.get()
                .load(randomProfileImage)
                .into(profileimage);



        //username input
        editText.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                String inputText = editText.getText().toString();
                // Handle the "Done" action here
                editText.setText(inputText);
                Username = editText.getText().toString().toUpperCase().replaceAll("\\s", "");
                // Clear focus and hide the cursor
                keyboard.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                editText.clearFocus();


                return true;
            }
            return false;
        });
        //laugage Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item);
        adapter.add("English");
        adapter.add("Tamil");
        adapter.add("Hindi");
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedOption = (String) parent.getItemAtPosition(position);
                setTitle(selectedOption);
                language = selectedOption.toUpperCase();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Handle case when no item is selected (if needed)
            }
        });
        Objects.requireNonNull(getSupportActionBar()).hide();

        Summit.setOnClickListener(v -> {
            // Code to execute when the button is clicked

            onButtonClick();

        });
    }

    public void checkButton(View v) {
        int radioId = Educationalrg.getCheckedRadioButtonId();
        Educationalbn = findViewById(radioId);
        Educational = (String) Educationalbn.getText().toString().toUpperCase();

    }

    public void checkButton1(View v) {
        int radioid2 = Current_Levelrg.getCheckedRadioButtonId();
        Current_Levelbn = findViewById(radioid2);
        Current_Level = (String) Current_Levelbn.getText().toString().toUpperCase();

    }

    public void checkswitchandcheckbox(View v) {
           Notifications=Notificationtg.isChecked();

            Log.d("Noooooooo", "checkswitchandcheckbox: " + Notifications);

        user_policy = user_policytg.isChecked();

    }

    public void onButtonClick() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                if(!Notifications){
                    startActivity(i1);
                    finish();
                }
                else {
                    startActivity(i);
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                    finish();
                }



            }
        };
        if (user_policy) {

            if (Educational != null && Current_Level != null && Username != null) {
                FirebaseDataSave firebaseDataSave = new FirebaseDataSave(getApplicationContext());
                firebaseDataSave.saveUserData(Educational, Current_Level, language, Username, randomProfileImage, Notifications, user_policy);
                loadingpg.setVisibility(View.VISIBLE);
                Summit.setVisibility(View.GONE);
                Toast.makeText(CreateProfile.this, "Account Created", Toast.LENGTH_SHORT).show();
                // Log.d("TAG", "Created");
                handler.postDelayed(runnable, delayMillis);
            } else {

                Toast.makeText(this, "Account Cant Created : Try Again", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "Account Cant Created : Please acknowledge your agreement to our user policy", Toast.LENGTH_SHORT).show();


        }
    }
    public static class ProfileImageGenerator {
        private static final String BASE_URL = "https://api.multiavatar.com/";

        public static String generateRandomProfileImage() {
            Random random = new Random();
            int randomNumber = random.nextInt(1000); // Generate a random number for variety

            return BASE_URL + "Bond" + randomNumber + ".png";
        }
    }


    }




