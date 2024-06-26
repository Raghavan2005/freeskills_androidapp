/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 18/08/23, 12:22 am
 *    funwithmetamil@gmail.com
 *     Last modified 16/08/23, 7:35 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import in.softface.raghavan.freeskills.dateset.cardviewdata;
import in.softface.raghavan.freeskills.recycleviews.CourseGVAdapter;

public class MoreDisplay extends AppCompatActivity {
    TextView no;
    GridView gr;
    String id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cardviewdata cv = new cardviewdata();
        setContentView(R.layout.activity_more_display);
        no = findViewById(R.id.count);
        Intent intent = getIntent();
        if (intent != null) {
            // Retrieve the variable using the key you used while sending
            id = intent.getStringExtra("key");
            // Now you can use the receivedValue as needed
        }
        gr = findViewById(R.id.idGVcourses);
        if (Objects.equals(id, "programming")) {
            CourseGVAdapter adapter = new CourseGVAdapter(this, cv.programming);
            gr.setAdapter(adapter);
            setTitle("Programming Language");
            int programmingArrayLength = cv.programming.length;
            String ram = programmingArrayLength + " Items";
            no.setText(ram);
        } else if (Objects.equals(id, "frameworks")) {
            CourseGVAdapter adapter = new CourseGVAdapter(this, cv.frameworks);
            gr.setAdapter(adapter);
            setTitle("Frameworks");
            int programmingArrayLength = cv.frameworks.length;
            String ram = programmingArrayLength + " Items";
            no.setText(ram);
        } else {
            CourseGVAdapter adapter = new CourseGVAdapter(this, cv.CrashCourse);
            gr.setAdapter(adapter);
            setTitle("CrashCourse");
            int programmingArrayLength = cv.CrashCourse.length;
            String ram = programmingArrayLength + " Items";
            no.setText(ram);
        }
    }
}




