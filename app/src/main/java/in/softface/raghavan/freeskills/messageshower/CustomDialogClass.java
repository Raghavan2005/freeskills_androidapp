/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/24/23, 6:09 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/24/23, 6:09 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.messageshower;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import in.softface.raghavan.freeskills.R;

public class CustomDialogClass extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button yes, no;
    String changedusername,inputText;
    SharedPreferences sharedPreferences ;

    public CustomDialogClass(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_with_textedit_dialog);
        yes = (Button) findViewById(R.id.btn_yes);
        no = (Button) findViewById(R.id.btn_no);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);

        sharedPreferences = getContext().getSharedPreferences("UsersData", Context.MODE_PRIVATE);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_yes:

                c.finish();
                break;
            case R.id.btn_no:
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }
}
