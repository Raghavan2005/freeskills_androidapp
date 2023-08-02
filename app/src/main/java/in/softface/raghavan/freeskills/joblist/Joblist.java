/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/8/23, 11:32 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/8/23, 11:32 PM
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
                new jobsdata("Frontend Developer", "As a frontend developer, your primary focus is on designing and developing the user interface (UI) and user experience (UX) of a website or web application. ", R.drawable.fed),
                new jobsdata("Backend Developer", "As a Backend developer, your primary focus is on designing and developing the Functional  of a website or web application. ", R.drawable.fed),


        };
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this, data, Joblist.this);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}