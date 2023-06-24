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

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Objects;
import java.util.Random;

import in.softface.raghavan.freeskills.BackgroundTask;
import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.joblist.Joblist;

public class PCreatedActivity extends AppCompatActivity {

    String[] quotes = {
            "The only way to do great work is to love what you do.",
            "In the middle of every difficulty lies opportunity.",
            "Believe you can and you're halfway there.",
            "Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful.",
            "Don't watch the clock; do what it does. Keep going.",
            "The best way to predict the future is to create it.",
            "The only limit to our realization of tomorrow will be our doubts of today.",
            "Success is not final, failure is not fatal: It is the courage to continue that counts.",
            "Your work is going to fill a large part of your life, and the only way to be truly satisfied is to do what you believe is great work.",
            "The future belongs to those who believe in the beauty of their dreams."
    };
    String randomQuote;
    String UserName, imageurl;
    ImageView profile;
    private FirebaseFirestore db;
    TextView username, textquotes;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcreated);
        sharedPreferences = getSharedPreferences("UsersData", Context.MODE_PRIVATE);
        UserName = sharedPreferences.getString("username", "Not Found");
        imageurl = sharedPreferences.getString("profileImage", "");
        profile = findViewById(R.id.profileimage);
        username = findViewById(R.id.username);
        textquotes = findViewById(R.id.quotes);
       // Log.d("sdasdas", UserName + "  " + imageurl);

        Random random = new Random();
        int index = random.nextInt(quotes.length);
        UserName = capitalizeFirstLetter(UserName);
        randomQuote = quotes[index];
        Picasso.get()
                .load(imageurl)
                .into(profile);
        username.setText(UserName);
        textquotes.setText(randomQuote);

        Objects.requireNonNull(getSupportActionBar()).hide();

        // Delay in milliseconds before switching to the next activity
        long switchDelay = 2000; // 2 seconds

        // Create an instance of AutoSwitchActivity
        AutoSwitchActivity autoSwitchActivity = new AutoSwitchActivity(this, Joblist.class, switchDelay);

        // Start the auto switching
        autoSwitchActivity.start();

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
