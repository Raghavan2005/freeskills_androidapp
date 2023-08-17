package in.softface.raghavan.freeskills.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.messageshower.dialog_loading;

public class GetCertificate extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    String username, email, course;
    TextView usernametxt, emaitxtl, coursetxt, process;
    Boolean stats, cus;
    AppCompatButton summitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_certificate);
        sharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        usernametxt = findViewById(R.id.username);
        emaitxtl = findViewById(R.id.email);
        coursetxt = findViewById(R.id.course);
        summitbtn = findViewById(R.id.summitbtn);
        process = findViewById(R.id.process);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        username = sharedPreferences.getString("Username", "Not Found");
        email = sharedPreferences.getString("email", "Not Found");
        course = sharedPreferences.getString("JobSelected", "Not Found");
        usernametxt.setText(username);
        emaitxtl.setText(email);
        getSupportActionBar().hide();
        coursetxt.setText(course);
        dialog_loading dl = new dialog_loading(this);
        cus = sharedPreferences.getBoolean("certificatestats", false);

        // Initialize WorkManager
        WorkManager workManager = WorkManager.getInstance(this);

        if (cus) {
            summitbtn.setEnabled(false);
            process.setVisibility(View.VISIBLE);

            // Schedule the work to reset certificatestats after 10 seconds (for testing purposes)
            OneTimeWorkRequest resetWorkRequest = new OneTimeWorkRequest.Builder(ResetCertificateWorker.class)
                    .setInitialDelay(10, TimeUnit.SECONDS)
                    .build();
            workManager.enqueue(resetWorkRequest);
        }

        summitbtn.setOnClickListener(view -> {
            stats = true;
            dl.show();
            editor.putBoolean("certificatestats", stats);
            editor.apply(); // Apply changes to the SharedPreferences
            summitbtn.setEnabled(false);
            process.setVisibility(View.VISIBLE);

            // Call the function to save data to Firestore
            saveStringsToFirestore(username, email, course);
        });
    }

    // Function to save strings to Firestore
    private void saveStringsToFirestore(String username, String email, String course) {
        // Initialize Firestore instance
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();

        assert currentUser != null;
        email = currentUser.getEmail();
        // Create a new document with the userId as the document name in a "Certificate" collection
        String userID = currentUser.getUid(); // Replace with the actual key
        Map<String, Object> userData = new HashMap<>();
        userData.put("username", username);
        userData.put("email", email);
        userData.put("course", course);

        db.collection("Certificate")
                .document(userID) // Use userId as the document name
                .set(userData)
                .addOnSuccessListener(documentReference -> {
                    // Document saved successfully
                    // You can perform additional actions here
                })
                .addOnFailureListener(e -> {
                    // Handle document saving failure
                    Log.e("Firestore", "Document saving failed: " + e.getMessage());
                });
    }
}
