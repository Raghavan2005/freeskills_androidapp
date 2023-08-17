/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 18/08/23, 12:22 am
 *    funwithmetamil@gmail.com
 *     Last modified 07/08/23, 10:57 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.login.profile.createprofilepackage;

import android.content.Context;
import android.view.View;
import android.widget.EditText;

public class SaveTextOnScreenClick {

    private EditText editText;
    private String text;

    public SaveTextOnScreenClick(Context context, EditText editText) {
        this.editText = editText;
    }

    public void onScreenClick(View view) {
        text = editText.getText().toString();
    }

    public String getText() {
        return text;
    }
}