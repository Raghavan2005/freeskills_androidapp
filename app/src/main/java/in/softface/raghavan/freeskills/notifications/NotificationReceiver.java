package in.softface.raghavan.freeskills.notifications;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

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

        // Notify
        notificationManager.notify(1, builder.build());
    }
}
