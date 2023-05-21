package in.softface.raghavan.freeskills.joblist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import in.softface.raghavan.freeskills.MainActivity;
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
                new jobsdata("Frontend Developer","As a frontend developer, your primary focus is on designing and developing the user interface (UI) and user experience (UX) of a website or web application. ",R.drawable.fed),
        };

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(data, Joblist.this);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}