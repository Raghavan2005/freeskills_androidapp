package in.softface.raghavan.freeskills.notifications;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseInstanceIdReceiver extends FirebaseMessagingService {

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);

        // TODO: Send the token to your server or perform any additional tasks
    }
}
