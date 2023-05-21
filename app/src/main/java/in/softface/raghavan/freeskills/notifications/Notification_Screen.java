package in.softface.raghavan.freeskills.notifications;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

import in.softface.raghavan.freeskills.R;

public class Notification_Screen extends AppCompatActivity {

    private TimePicker timePicker;
    private int hour, minute;
    private AlarmManager alarmManager;
    private PendingIntent alarmIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_screen);
        timePicker = findViewById(R.id.timePicker);
        alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                hour = hourOfDay;
                minute = minute;
                Log.d("Notification_Screen", "onTimeChanged: " + hour + " " + minute);
            }
        });

        // Create the PendingIntent for the alarm receiver
        Intent intent = new Intent(this, AlarmReceiver.class);
        alarmIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    private void showTimePickerDialog() {
        // Get the current time
        Calendar currentTime = Calendar.getInstance();
        int hour = currentTime.get(Calendar.HOUR_OF_DAY);
        int minute = currentTime.get(Calendar.MINUTE);

        // Create the TimePickerDialog
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                // Set the selected time
                Calendar selectedTime = Calendar.getInstance();
                selectedTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
                selectedTime.set(Calendar.MINUTE, minute);

                // Schedule the alarm
                scheduleAlarm(selectedTime);
            }
        }, hour, minute, false);

        // Show the TimePickerDialog
        timePickerDialog.show();
    }

    private void scheduleAlarm(Calendar selectedTime) {
        // Set the alarm time
        long alarmTimeMillis = selectedTime.getTimeInMillis();

        // Create a PendingIntent for the alarm receiver
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, alarmTimeMillis, alarmIntent);

        // Display a toast or perform any other action to indicate the alarm is set
        Toast.makeText(this, "Alarm set for " + selectedTime.getTime().toString(), Toast.LENGTH_SHORT).show();
    }
}
