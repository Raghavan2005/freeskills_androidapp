/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/8/23, 11:32 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/8/23, 11:32 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.onboarding;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.login.Sign_up_Activity;

public class GetStarted extends AppCompatActivity {
    Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        startButton = findViewById(R.id.startButton);
        getSupportActionBar().hide();
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GetStarted.this, Sign_up_Activity.class);
                startActivity(i);
                finish();
            }

        });
    }
}
