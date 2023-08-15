/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 07/08/23, 10:57 pm
 *    funwithmetamil@gmail.com
 *     Last modified 31/07/23, 11:15 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.notifications;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import in.softface.raghavan.freeskills.MainActivity;
import in.softface.raghavan.freeskills.R;

public class Notification_Screen extends AppCompatActivity {


    LinearLayout ly;
    String selectedTime;
    TextView time;
    Button btn;
    SharedPreferences.Editor editor;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_screen);
        sharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        ly = findViewById(R.id.picktime);
        time = findViewById(R.id.time);
        btn = findViewById(R.id.picktimebtn);
        getSupportActionBar().hide();
        ly.setOnClickListener(view -> {
            showTimePickerDialog();
        });
        btn.setOnClickListener(view -> {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        });
        boolean isEnabled = sharedPreferences.getBoolean("isEnabled", false);
        editor = sharedPreferences.edit();

    }

    private void showTimePickerDialog() {
        final Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(
                this,// Apply custom theme here
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        // Handle the selected time
                        selectedTime = hourOfDay + ":" + minute;
                        time.setText(selectedTime);
                        editor.putString("noftime", selectedTime);
                        scheduleDailyNotification(hourOfDay, minute);

                        // Do something with the selectedTime, such as updating a TextView
                    }
                },
                hour, minute, false);

        timePickerDialog.show();
    }

    private void scheduleDailyNotification(int hour, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);

        long alarmTimeMillis = calendar.getTimeInMillis();

        // Get an instance of AlarmManager
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        // Create an intent to your BroadcastReceiver
        Intent intent = new Intent(this, NotificationReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        // Set a repeating alarm
        alarmManager.setRepeating(
                AlarmManager.RTC_WAKEUP,
                alarmTimeMillis,
                AlarmManager.INTERVAL_DAY,
                pendingIntent
        );

    }
}
