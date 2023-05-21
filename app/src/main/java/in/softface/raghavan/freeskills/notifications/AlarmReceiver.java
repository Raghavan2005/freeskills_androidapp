package in.softface.raghavan.freeskills.notifications;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import in.softface.raghavan.freeskills.R;

public class AlarmReceiver extends BroadcastReceiver {
    private static int notificationCounter = 0;
    private static final String CHANNEL_ID = "channel_id";
    private static final int PERMISSION_REQUEST_CODE = 123;

    @RequiresApi(api = Build.VERSION_CODES.TIRAMISU)
    @Override
    public void onReceive(Context context, Intent intent) {
        // Create and display the notification
        createNotificationChannel(context);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(R.drawable.app_logo)
                .setContentTitle("Reminder")
                .setContentText("It's time to do something!")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        // Check if the app has the required permission
        if (ActivityCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS)
                != PackageManager.PERMISSION_GRANTED) {
            // Request the missing permission if not granted
            // You should handle the result of the permission request in the corresponding activity or fragment
            // using the onRequestPermissionsResult() method
            ActivityCompat.requestPermissions((Notification_Screen) context,
                    new String[]{Manifest.permission.POST_NOTIFICATIONS},
                    PERMISSION_REQUEST_CODE);
            return;
        }

        int notificationId = generateUniqueNotificationId();
        notificationManager.notify(notificationId, builder.build());
    }

    // Generate a unique notification ID
    private int generateUniqueNotificationId() {
        return ++notificationCounter;
    }

    // Create a notification channel for Android Oreo and above
    private void createNotificationChannel(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "Channel Name", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}
