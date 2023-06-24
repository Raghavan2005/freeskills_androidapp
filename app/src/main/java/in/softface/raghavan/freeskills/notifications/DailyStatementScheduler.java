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
import android.content.Context;
import android.content.Intent;

public class DailyStatementScheduler {

    private static final int REQUEST_CODE = 123;

    public static void scheduleDailyStatement(Context context) {
        // Create the PendingIntent for the alarm receiver
        Intent intent = new Intent(context, AlarmReceiver.class);
        PendingIntent alarmIntent = PendingIntent.getBroadcast(context, REQUEST_CODE, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        // Get the AlarmManager instance
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);

        // Schedule the alarm to repeat every day
        long intervalMillis = AlarmManager.INTERVAL_DAY;
        long triggerTimeMillis = getTriggerTimeMillis(); // Get the desired trigger time
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, triggerTimeMillis, intervalMillis, alarmIntent);
    }

    public static void cancelDailyStatement(Context context) {
        // Create the PendingIntent for the alarm receiver
        Intent intent = new Intent(context, AlarmReceiver.class);
        PendingIntent alarmIntent = PendingIntent.getBroadcast(context, REQUEST_CODE, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        // Get the AlarmManager instance
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);

        // Cancel the alarm
        alarmManager.cancel(alarmIntent);
        alarmIntent.cancel();
    }

    // Helper method to calculate the desired trigger time (e.g., based on user-selected time)
    private static long getTriggerTimeMillis() {
        // TODO: Implement your logic to calculate the desired trigger time (e.g., based on user-selected time)
        // Return the trigger time in milliseconds
        return System.currentTimeMillis();
    }
}
