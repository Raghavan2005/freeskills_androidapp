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

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import in.softface.raghavan.freeskills.R;

public class AlarmReceiver extends BroadcastReceiver {
    private static final String CHANNEL_ID = "notification_channel";
    private static final int NOTIFICATION_ID = 1;

    @Override
    public void onReceive(Context context, Intent intent) {
        // This method will be called when the alarm is triggered
        Log.d("AlarmReceiver", "Alarm received");

        // Check if the notification is enabled

        // Build the notification
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(R.drawable.app_logo)
                .setContentTitle("Notification Title")
                .setContentText("Notification Text")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        // Create a notification channel (required for Android 8.0 and higher)
        createNotificationChannel(context);

        // Show the notification
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.RECEIVE_BOOT_COMPLETED) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        notificationManager.notify(NOTIFICATION_ID, builder.build());
    }

    private void createNotificationChannel(Context context) {
        // Create the notification channel (required for Android 8.0 and higher)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence channelName = "Notification Channel";
            String channelDescription = "Channel Description";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, channelName, importance);
            channel.setDescription(channelDescription);
            channel.enableLights(true);
            channel.setLightColor(Color.RED);

            NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    private boolean getNotificationEnabledState(Context context) {
        // Retrieve the notification enabled state from SharedPreferences
        SharedPreferences sharedPreferences = context.getSharedPreferences("NotificationState", Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("isEnabled", false);
    }
}
