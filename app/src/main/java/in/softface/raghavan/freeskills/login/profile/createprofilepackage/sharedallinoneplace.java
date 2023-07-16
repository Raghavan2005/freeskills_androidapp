/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 16/07/23, 8:42 am
 *    funwithmetamil@gmail.com
 *     Last modified 16/07/23, 8:42 am
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.login.profile.createprofilepackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import in.softface.raghavan.freeskills.login.profile.FirebaseDataSave;

public class sharedallinoneplace {
    Activity a;
    SharedPreferences sharedPreferences;
    FirebaseDataSave firebaseDataSave;
    String Educational;
    String Current_Level;
    String language;
    String Username;
    String randomProfileImage;
    boolean Notifications;
    boolean user_policy;

    sharedallinoneplace(Activity a) {
        sharedPreferences = a.getSharedPreferences("UserData", Context.MODE_PRIVATE);
        firebaseDataSave = new FirebaseDataSave(a.getApplicationContext());
        this.a = a;
        sharedpregetdata();
    }

    public void userdataimputmet() {
        firebaseDataSave.saveUserData(Educational, Current_Level, language, Username, randomProfileImage, Notifications, user_policy);
    }

    void sharedpregetdata() {
        this.Username = sharedPreferences.getString("Username", "Not Found");
        this.randomProfileImage = sharedPreferences.getString("profileImage", "");
        this.Educational = sharedPreferences.getString("Educational", "");
        this.Current_Level = sharedPreferences.getString("Current_Level", "");
        this.language = sharedPreferences.getString("language", "English");
        this.Notifications = sharedPreferences.getBoolean("notifications", true);
        this.user_policy = sharedPreferences.getBoolean("userPolicy", false);
    }

}
