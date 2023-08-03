/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/8/23, 11:32 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/8/23, 11:32 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.login.profile;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.HashMap;
import java.util.Map;

public class FirebaseDataSave {


    private FirebaseFirestore db;
    private String userID;
    SharedPreferences sharedPreferences;
    String savedEducational, savedCurrentLevel, savedLanguage, savedUsername, savedProfileImage, token;
    boolean savedNotifications, savedUserPolicy;
    String email;

    public FirebaseDataSave(Context context) {
        db = FirebaseFirestore.getInstance();
        sharedPreferences = context.getSharedPreferences("UserData", Context.MODE_PRIVATE);

    }

    public void saveUserData(String educational, String currentLevel, String language, String username,
                             String ProfileImage, boolean notifications, boolean userPolicy) {
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();

        assert currentUser != null;
        email = currentUser.getEmail();

        userID = currentUser.getUid();
        savedEducational = educational;
        savedCurrentLevel = currentLevel;
        savedLanguage = language;
        savedUsername = username;
        savedProfileImage = ProfileImage;
        savedNotifications = notifications;
        savedUserPolicy = userPolicy;

        getFBM(token -> {
            // Save the FBM token in the data map
            Map<String, Object> data = new HashMap<>();
            data.put("UserID", userID);
            data.put("Username", savedUsername);
            data.put("Educational", savedEducational);
            data.put("CurrentLevel", savedCurrentLevel);
            data.put("Language", savedLanguage);
            data.put("ProfileImageURL", savedProfileImage);
            data.put("Notifications", savedNotifications);
            data.put("UserPolicy", savedUserPolicy);
            data.put("Email", email);
            data.put("FBM", token);

            // Now, after obtaining the token, you can proceed to save the data in Firestore.
            db.collection("UsersData").document(userID)
                    .set(data)
                    .addOnSuccessListener(aVoid -> {
                        Log.d("Firebase", "DocumentSnapshot written with ID: " + userID);
                    })
                    .addOnFailureListener(e -> {
                        Log.w("Firebase", "Error adding document", e);
                    });

            // Save the FBM token in shared preferences
        });
    }


    private void Savedinlocal(){
        SharedPreferences.Editor editor = sharedPreferences.edit();

        // Save the values in shared preferences
        editor.putString("Userid",userID);
        editor.putString("email",email);

        // Apply the changes
        editor.apply();

    }


    private void getFBM(FirebaseMessagingCallback callback) {
        FirebaseMessaging.getInstance().getToken()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        // Get the token from the task
                        String token = task.getResult();
                        Log.d("FMC", "FCM Token: " + token);
                        callback.onTokenReceived(token);
                    } else {
                        Log.d("FMC", "Failed to get FCM token.");
                        callback.onTokenReceived(null); // Handle failure
                    }
                });
    }

    interface FirebaseMessagingCallback {
        void onTokenReceived(String token);
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


