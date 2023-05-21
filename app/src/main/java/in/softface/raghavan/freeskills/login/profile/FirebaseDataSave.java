package in.softface.raghavan.freeskills.login.profile;

import static java.nio.file.Paths.get;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class FirebaseDataSave extends AppCompatActivity {


    private FirebaseFirestore db;
    private String userID;
    SharedPreferences sharedPreferences ;
    String savedEducational,savedCurrentLevel,savedLanguage,savedUsername,savedProfileImage;
    boolean savedNotifications,savedUserPolicy;

     public FirebaseDataSave(Context context) {
         db = FirebaseFirestore.getInstance();
         sharedPreferences = context.getSharedPreferences("UsersData", Context.MODE_PRIVATE);

    }

    public void saveUserData(String educational, String currentLevel, String language, String username,
                             String ProfileImage, boolean notifications, boolean userPolicy) {
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();

        assert currentUser != null;

        userID = currentUser.getUid();
       savedEducational = educational;
       savedCurrentLevel = currentLevel;
       savedLanguage = language;
       savedUsername = username;
       savedProfileImage = ProfileImage;
       savedNotifications = notifications;
       savedUserPolicy = userPolicy;
        Savedinlocal();
        db.collection("UsersData").document(userID)
                .set(hashmap())
                .addOnSuccessListener(aVoid -> {
                    Log.d("Firebase", "DocumentSnapshot written with ID: " + userID);
                })
                .addOnFailureListener(e -> {
                    Log.w("Firebase", "Error adding document", e);
                });
    }

    private void Savedinlocal(){
        SharedPreferences.Editor editor = sharedPreferences.edit();

        // Save the values in shared preferences
        editor.putString("educational", savedEducational);
        editor.putString("currentLevel", savedCurrentLevel);
        editor.putString("language", savedLanguage);
        editor.putString("username", savedUsername);
        editor.putString("profileImage", savedProfileImage);
        editor.putBoolean("notifications", savedNotifications);
        editor.putBoolean("userPolicy", savedUserPolicy);

        // Apply the changes
        editor.apply();
        Log.d("DataSAVED","datasaved"+savedUsername);

    }

    private Map<String, Object> hashmap(){       // Add a new document with a generated id.
        Map<String, Object> data = new HashMap<>();
        data.put("UserID", userID);
        data.put("Username", savedUsername);
        data.put("Educational", savedEducational);
        data.put("CurrentLevel", savedCurrentLevel);
        data.put("Language", savedLanguage);
        data.put("ProfileImageURL", savedProfileImage);
        data.put("Notifications", savedNotifications);
        data.put("UserPolicy", savedUserPolicy);
        return data;
    }
//get data from firebase
       /* public void getUserData() {
            FirebaseUser currentUser1 = FirebaseAuth.getInstance().getCurrentUser();
            assert currentUser1 != null;
            userID = currentUser1.getUid();


            db.collection("UsersData").document(userID)
                    .get()
                    .addOnSuccessListener(documentSnapshot -> {
                        if (documentSnapshot.exists()) {
                             UN =new BackgroundTask().username = documentSnapshot.getString("Username");
                             PI =new BackgroundTask().imageurl = documentSnapshot.getString("ProfileImageURL");
                            Log.d("Suername",UN +"  "+PI);


                        } else {
                            Log.d("Firebase", "User data does not exist");
                        }
                    })
                    .addOnFailureListener(e -> {
                        Log.e("Firebase", "Error getting user data", e);
                    });
*/
            }


