/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/23/23, 11:40 AM
 *    funwithmetamil@gmail.com
 *     Last modified 6/23/23, 11:40 AM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.login.profile;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.gcm.Task;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;

public class userlogged {

   // Replace with the actual user ID you want to check
    public boolean userfind(String cuserid) {
        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        assert currentUser != null;
        String userID = currentUser.getUid();
        if (cuserid==userID){
            return true;
        }
        else {
            return false;
        }

    }

}
