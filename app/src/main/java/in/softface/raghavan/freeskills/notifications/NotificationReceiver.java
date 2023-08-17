/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 18/08/23, 12:22 am
 *    funwithmetamil@gmail.com
 *     Last modified 16/08/23, 9:22 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.notifications;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import in.softface.raghavan.freeskills.R;

public class NotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // Create a notification
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "notificationforfreeskills")
                .setContentTitle("Daily Reminder")
                .setContentText("It's time for your daily task!")
                .setSmallIcon(R.drawable.app_logo);


        // Create a notification manager
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        Log.d("times", "notification: 3");

        // Notify
        notificationManager.notify(12356, builder.build());
        Log.d("times", "notification: 4");
    }
}
