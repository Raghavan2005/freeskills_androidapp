package in.softface.raghavan.freeskills.notifications;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import in.softface.raghavan.freeskills.R;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (remoteMessage.getNotification() != null) {
            // Handle notification message
            String title = remoteMessage.getNotification().getTitle();
            String body = remoteMessage.getNotification().getBody();

            // Display the notification
            showNotification(title, body);
        }

        // Handle data message
        if (remoteMessage.getData().size() > 0) {
            // TODO: Handle data payload
        }
    }

    private void showNotification(String title, String message) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        String channelId = "channel_id";
        String channelName = "Channel Name";
        String channelDescription = "Channel Description";

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription(channelDescription);
            channel.enableLights(true);
            channel.setLightColor(Color.BLUE);
            notificationManager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, channelId)
                .setSmallIcon(R.drawable.app_logo)
                .setContentTitle(title)
                .setContentText(message)
                .setAutoCancel(true);

        notificationManager.notify(0, builder.build());
    }

    public void handleNotificationMessage(String title, String body) {
        // Handle the notification message here

        // Display the notification
        showNotification(title, body);
    }
}
