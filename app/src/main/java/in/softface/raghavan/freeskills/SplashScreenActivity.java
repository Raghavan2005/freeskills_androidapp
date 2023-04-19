package in.softface.raghavan.freeskills;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import in.softface.raghavan.freeskills.onboarding.GetStarted;
import in.softface.raghavan.freeskills.onboarding.NavigationActivity;

public class SplashScreenActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor sharedEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedPreferences = getPreferences(Context.MODE_PRIVATE);
        sharedEditor = sharedPreferences.edit();
        super.onCreate(savedInstanceState);
        if (settingfirst()) {
            startActivity(new Intent(SplashScreenActivity.this, NavigationActivity.class));
        } else {
            startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
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
}
