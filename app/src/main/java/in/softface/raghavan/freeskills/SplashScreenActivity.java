/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 18/08/23, 12:22 am
 *    funwithmetamil@gmail.com
 *     Last modified 07/08/23, 10:59 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import in.softface.raghavan.freeskills.login.Sign_up_Activity;
import in.softface.raghavan.freeskills.onboarding.NavigationActivity;

public class SplashScreenActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor sharedEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        sharedEditor = sharedPreferences.edit();
        super.onCreate(savedInstanceState);
        checkProcessExecution();
        if (settingfirst()) {
            startActivity(new Intent(SplashScreenActivity.this, NavigationActivity.class));
        } else {
            startActivity(new Intent(SplashScreenActivity.this, Sign_up_Activity.class));
        }
        finish();
    }

    public boolean settingfirst() {
        if (sharedPreferences.getBoolean("firstTime", true)) {
            sharedEditor.putBoolean("firstTime", false);
            sharedEditor.commit();
            sharedEditor.apply();
            return true;
        } else {
            return false;
        }
    }


    private void checkProcessExecution() {
        SharedPreferences sharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        long lastExecutionTime = sharedPreferences.getLong("last_execution_time", 0);

        long currentTime = System.currentTimeMillis();
        long twoDaysInMillis = 2 * 24 * 60 * 60 * 1000; // 2 days in milliseconds

        if (currentTime - lastExecutionTime >= twoDaysInMillis) {
            // Execute your process here

            // Save the current time as the last execution time
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putLong("last_execution_time", currentTime);
            editor.apply();
        }

        // Proceed to the next screen or perform any necessary actions
        // after checking the process execution.
        // For example, you can navigate to the main activity or show a login screen.

    }


}
