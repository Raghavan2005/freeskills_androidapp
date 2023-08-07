/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 07/08/23, 10:57 pm
 *    funwithmetamil@gmail.com
 *     Last modified 10/07/23, 9:53 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.login.profile;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

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
