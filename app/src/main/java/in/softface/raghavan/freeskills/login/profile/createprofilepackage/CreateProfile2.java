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

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import in.softface.raghavan.freeskills.R;

public class CreateProfile2 extends AppCompatActivity {

    String language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile2);
        Spinner spinner = findViewById(R.id.spinner);

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
                String item = getItem(position);
                textView.setText(item);

                // Apply the slide-down animation to the dropdown view
                Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.slide_down);
                convertView.startAnimation(animation);

                return convertView;
            }
        };

        adapter.add("English");

        spinner.setAdapter(adapter);


        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}