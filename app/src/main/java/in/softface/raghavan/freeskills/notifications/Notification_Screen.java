/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/8/23, 11:32 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/8/23, 11:32 PM
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
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.login.profile.PCreatedActivity;

public class Notification_Screen extends AppCompatActivity {

    private Button button;
    private int hour, minute;
    private AlarmManager alarmManager;
    TextView time;
    Switch notificationSwitch;
    private PendingIntent alarmIntent;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_screen);
        button = findViewById(R.id.button);
        notificationSwitch = findViewById(R.id.everyday);
        time = findViewById(R.id.time);
        alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        sharedPreferences = getSharedPreferences("NotificationState", Context.MODE_PRIVATE);
        setTitle("Set the Notification");

        boolean isEnabled = sharedPreferences.getBoolean("isEnabled", false);
        notificationSwitch.setChecked(isEnabled);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTimePickerDialog();
            }
        });

        // Create the PendingIntent for the alarm receiver
        Intent intent = new Intent(this, AlarmReceiver.class);
        alarmIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    private void showTimePickerDialog() {
        // Get the current time
        Calendar currentTime = Calendar.getInstance();
        hour = currentTime.get(Calendar.HOUR_OF_DAY);
        minute = currentTime.get(Calendar.MINUTE);

        // Create the TimePickerDialog
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, (view, hourOfDay, minute) -> {
            // Set the selected time
            Calendar selectedTime = Calendar.getInstance();
            selectedTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
            selectedTime.set(Calendar.MINUTE, minute);

            // Schedule the alarm
            String formattedTime = formatTime(selectedTime);
            scheduleAlarm(selectedTime);
            time.setText(formattedTime);
            Intent i = new Intent(this, PCreatedActivity.class);
            Log.d("Date", "showTimePickerDialog: " +" "+ formattedTime);
            // Save the selected time in SharedPreferences
            saveNotificationTime(selectedTime);
            // Save the enabled state in SharedPreferences
            saveNotificationEnabledState(notificationSwitch.isChecked());
            startActivity(i);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            finish();

        }, hour, minute, false);

        // Show the TimePickerDialog
        timePickerDialog.show();

    }

    private void scheduleAlarm(Calendar selectedTime) {
        // Set the alarm time
        long alarmTimeMillis = selectedTime.getTimeInMillis();

        // Set the repeating interval to 24 hours
        long repeatingIntervalMillis = 24 * 60 * 60 * 1000;

        // Create a PendingIntent for the alarm receiver
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, alarmTimeMillis, repeatingIntervalMillis, alarmIntent);


        // Set the formatted time in the TextView


        // Display a toast or perform any other action to indicate the alarm is set
        Toast.makeText(this, "Alarm set for " + selectedTime.getTime().toString(), Toast.LENGTH_SHORT).show();
    }

    private void saveNotificationTime(Calendar selectedTime) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong("NotificationTime", selectedTime.getTimeInMillis());
        editor.apply();
    }

    private void saveNotificationEnabledState(boolean isEnabled) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean("isEnabled", isEnabled);
        editor.apply();

        if (isEnabled) {
            DailyStatementScheduler.scheduleDailyStatement(this);
        } else {
            DailyStatementScheduler.cancelDailyStatement(this);
        }
    }
    private String formatTime(Calendar calendar) {
        // Format the date and time as desired (e.g., "dd/MM/yyyy HH:mm")
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        return dateTimeFormat.format(calendar.getTime());
    }

}
