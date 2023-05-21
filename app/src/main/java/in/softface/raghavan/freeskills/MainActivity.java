package in.softface.raghavan.freeskills;
import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.messaging.FirebaseMessaging;

import in.softface.raghavan.freeskills.joblist.Joblist;
import in.softface.raghavan.freeskills.login.Sign_up_Activity;
import in.softface.raghavan.freeskills.notifications.Notification_Screen;

public class MainActivity extends AppCompatActivity {
    Button signout,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         signout = findViewById(R.id.signout);
          next = findViewById(R.id.next);
        signout.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            Intent i = new Intent(MainActivity.this, Sign_up_Activity.class);
            startActivity(i);
            finish();
        });
        next.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, Notification_Screen.class);
            startActivity(i);
            finish();
        });



        FirebaseMessaging.getInstance().getToken()
                .addOnCompleteListener(new OnCompleteListener<String>() {
                    @Override
                    public void onComplete(@NonNull Task<String> task) {
                        if (!task.isSuccessful()) {
                            Log.w(TAG, "Fetching FCM registration token failed", task.getException());
                            return;
                        }

                        // Get new FCM registration token
                        String token = task.getResult();

                        // Log and toast
                       // String msg = getString(R.string.msg_token_fmt, token);
                        Log.d(TAG, token);
                        Toast.makeText(MainActivity.this, token, Toast.LENGTH_SHORT).show();
                    }
                });



    }

}