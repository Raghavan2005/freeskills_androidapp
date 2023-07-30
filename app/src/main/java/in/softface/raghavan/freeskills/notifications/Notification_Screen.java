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
        sharedPreferences = getSharedPreferences("NotificationState", Context.MODE_PRIVATE);
        setTitle("Set the Notification");
        boolean isEnabled = sharedPreferences.getBoolean("isEnabled", false);


    }
}
