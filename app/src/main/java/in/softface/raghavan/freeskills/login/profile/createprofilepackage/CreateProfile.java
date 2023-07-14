/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 13/07/23, 7:59 pm
 *    funwithmetamil@gmail.com
 *     Last modified 10/07/23, 9:53 pm
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
import android.transition.Slide;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.Random;

import in.softface.raghavan.freeskills.R;

public class CreateProfile extends AppCompatActivity {
    EditText editText;
    Intent i;
    Handler handler = new Handler();
    Button Summit;
    String Username = "Username";
    SharedPreferences sharedPreferences;
    ProgressBar progressBar2;
    final int delayMillis = 200;
    //179
    @SuppressLint("UseSwitchCompatOrMaterialCode")

    ImageView profileimage;
    String randomProfileImage;

    private void setupWindowAnimations() {
        Slide slide = new Slide();
        slide.setDuration(1000);
        getWindow().setExitTransition(slide);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
        // Declaration Of Object
        //Next file TO GO
        i = new Intent(CreateProfile.this, CreateProfile1.class);
        editText = findViewById(R.id.editUsername);
        Summit = findViewById(R.id.Summit);
        InputMethodManager keyboard = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        profileimage = findViewById(R.id.profileimage);
        sharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        progressBar2 = findViewById(R.id.progressBar2);
        randomProfileImage = ProfileImageGenerator.generateRandomProfileImage();
        boolean n = randomProfileImage.isEmpty();
        Log.d("asdasdasda", "onCreate: " + n);

        if (!randomProfileImage.isEmpty()) {

            progressBar2.setVisibility(View.GONE);
        }
        setupWindowAnimations();
        Picasso.get()
                .load(randomProfileImage)
                .into(profileimage);

        SaveTextOnScreenClick saveTextOnScreenClick = new SaveTextOnScreenClick(this, editText);

//username input
        editText.setOnEditorActionListener((v, actionId, event) -> {
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                String inputText = editText.getText().toString();
                // Handle the "Done" action here

                editText.setText(inputText);
                Username = editText.getText().toString().toUpperCase().replaceAll("\\s", "");
                // Save the user's input to a string
                saveTextOnScreenClick.onScreenClick(v);
                keyboard.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                // Clear focus and hide the cursor
                editText.clearFocus();
                if (Username.isEmpty()) {
                    Summit.setEnabled(true);
                }

                return true;
            }

            return false;
        });


        Objects.requireNonNull(getSupportActionBar()).hide();


        Summit.setOnClickListener(v -> {
            // Code to execute when the button is clicked

            onButtonClick();

        });

    }

    public void onButtonClick() {

        if (Username != null) {
            USharedPreferences(this.Username);
            startActivity(i);
            finish();
        } else {

            Toast.makeText(this, "Enter the Vaild Usernname", Toast.LENGTH_SHORT).show();
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

    private void USharedPreferences(@NotNull String username) {
        @SuppressLint("CommitPrefEdits") SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Username", username);
        editor.apply();
    }

}




