/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 13/07/23, 8:07 pm
 *    funwithmetamil@gmail.com
 *     Last modified 13/07/23, 8:07 pm
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
import android.transition.Fade;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import in.softface.raghavan.freeskills.R;

public class CreateProfile1 extends AppCompatActivity {
    RadioGroup Educationalrg, Current_Levelrg;
    RadioButton Educationalbn, Current_Levelbn;
    String Educational, Current_Level;
    SharedPreferences sharedPreferences;
    Intent i;
    Button nxt;
    // TODO - Save in shared

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile1);
        i = new Intent(this, CreateProfile2.class);
        Educationalrg = (RadioGroup) findViewById(R.id.radioGroup);
        Current_Levelrg = findViewById(R.id.radioGroup2);
        sharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);

        nxt = findViewById(R.id.next);
        setupWindowAnimations();
        Objects.requireNonNull(getSupportActionBar()).hide();
        nxt.setOnClickListener(v -> {
            // Code to execute when the button is clicked
            onbuttonclick();
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

    private void setupWindowAnimations() {
        Fade fade = new Fade();
        fade.setDuration(1000);
        getWindow().setEnterTransition(fade);
    }

    void onbuttonclick() {
        if (Educational != null && Current_Level != null) {
            USharedPreferences(Educational, Current_Level);
            startActivity(i);
            finish();

        } else {
            Toast.makeText(this, "Please Select The Option", Toast.LENGTH_SHORT).show();
        }

    }

    private void USharedPreferences(@NotNull String educational, @NotNull String current_Level) {
        @SuppressLint("CommitPrefEdits") SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Educational", educational);
        editor.putString("Current_Level", current_Level);
        editor.apply();
    }
}