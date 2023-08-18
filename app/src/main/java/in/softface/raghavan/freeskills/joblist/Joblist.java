/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 18/08/23, 12:22 am
 *    funwithmetamil@gmail.com
 *     Last modified 18/08/23, 12:22 am
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.joblist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import in.softface.raghavan.freeskills.R;

public class Joblist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joblist);
        setTitle("Select You Job");


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        jobsdata[] data = new jobsdata[]{
                new jobsdata("Frontend Developer", "As a frontend developer, your primary focus is on designing and developing the user interface (UI) and user experience (UX) of a website or web application. ", "https://i.ibb.co/hK7YgJ1/Frontend.png"),
                new jobsdata("Backend Developer", "As a Backend developer, your primary focus is on designing and developing the Functional  of a website or web application. ", "https://i.ibb.co/M9MkgZ1/Backend.png"),
                new jobsdata("Android Developer", "As a Android Developer, your primary focus is on designing and developing the Functional  of a Android application. ", "https://i.ibb.co/gSRQ5gn/Android.png"),


        };
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, data, Joblist.this);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
    @Override
    public void onBackPressed() {

        finishAffinity();
    }
}