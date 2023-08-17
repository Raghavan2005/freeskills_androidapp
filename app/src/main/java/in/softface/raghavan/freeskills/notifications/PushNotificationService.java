/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 18/08/23, 12:22 am
 *    funwithmetamil@gmail.com
 *     Last modified 08/08/23, 10:10 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.notifications;

import android.Manifest;
import android.content.pm.PackageManager;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import in.softface.raghavan.freeskills.R;

public class PushNotificationService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        String title = remoteMessage.getNotification().getTitle();
        String msg = remoteMessage.getNotification().getBody();

        Log.d("PushNotificationService", "Received FCM message:");
        Log.d("PushNotificationService", "Title: " + title);
        Log.d("PushNotificationService", "Message: " + msg);

        getFirebaseMessage(title, msg);
    }

    public void getFirebaseMessage(String title, String msg) {
        Log.d("PushNotificationService", "Creating notification...");

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "PushNotification")
                .setSmallIcon(R.drawable.app_logo)
                .setContentTitle(title)
                .setContentText(msg)
                .setAutoCancel(true);

        NotificationManagerCompat manager = NotificationManagerCompat.from(this);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            Log.d("PushNotificationService", "No notification permission.");
            // TODO: Request permission if needed
            return;
        }


        manager.notify(0, builder.build());
        Log.d("PushNotificationService", "Displaying notification...");
    }
}

