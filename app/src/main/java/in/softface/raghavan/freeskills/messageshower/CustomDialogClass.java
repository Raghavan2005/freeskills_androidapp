/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 07/08/23, 10:57 pm
 *    funwithmetamil@gmail.com
 *     Last modified 30/07/23, 11:21 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.messageshower;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import in.softface.raghavan.freeskills.MainActivity;
import in.softface.raghavan.freeskills.R;

public class CustomDialogClass extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    String text_dis, btn_text1, btn_text2;
    public Button yes, no;
    TextView textdis;
    String changedusername, inputText;
    SharedPreferences sharedPreferences;
    String jobname;
    Intent i;

    public CustomDialogClass(Activity a, String text_dis, String btn1, String btn2, String jobname) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
        this.text_dis = text_dis;
        this.btn_text1 = btn1;
        this.btn_text2 = btn2;
        this.jobname = jobname;
        sharedPreferences = a.getSharedPreferences("UserData", Context.MODE_PRIVATE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        i = new Intent(c.getBaseContext(), MainActivity.class);
        setContentView(R.layout.custom_with_textedit_dialog);
        yes = (Button) findViewById(R.id.btn_yes);
        no = (Button) findViewById(R.id.btn_no);
        textdis = findViewById(R.id.txt_dia);
        textdis.setText(text_dis);
        yes.setText(btn_text1);
        no.setText(btn_text2);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_yes:
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("JobSelected", jobname);
                editor.apply();
                c.startActivity(i);
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
