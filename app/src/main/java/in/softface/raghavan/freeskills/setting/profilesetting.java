/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 10/11/23, 10:38 PM
 *    funwithmetamil@gmail.com
 *     Last modified 10/11/23, 10:38 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.setting;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.joblist.Joblist;

public class profilesetting extends AppCompatActivity {
LinearLayout pp ,cc;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilesetting);
        pp=findViewById(R.id.nameedit);
        cc=findViewById(R.id.cc);
        sharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        pp.setOnClickListener(view->{
            callme();
        });
        cc.setOnClickListener(view->
        {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.remove("JobSelected");
            editor.apply();
            Intent i = new Intent(this, Joblist.class);
            startActivity(i);
        });
    }
    protected void callme(){
        // Create an AlertDialog.Builder instance
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AlertDialogCustomStyle);
        builder.setTitle("Enter The New Username");


        // Create an EditText widget programmatically
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_MULTI_LINE);
        input.setSingleLine(true);
        int color = Color.RED; // Change this to the color you want
        input.setTextColor(color);
        builder.setView(input);

        // Set up the buttons
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String userInput = input.getText().toString();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Username",userInput);
                editor.apply();
                Toast.makeText(getApplicationContext(), "Username Changed To\n"+userInput, Toast.LENGTH_SHORT).show();

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                Toast.makeText(getApplicationContext(), "Changes are Not Saved Try Again!!!", Toast.LENGTH_SHORT).show();

            }
        });

        // Create and show the AlertDialog
        AlertDialog dialog = builder.create();
        dialog.show();

        Button positiveButton = dialog.getButton(AlertDialog.BUTTON_POSITIVE);
        Button negativeButton = dialog.getButton(AlertDialog.BUTTON_NEGATIVE);
        positiveButton.setTextColor(getResources().getColor(android.R.color.black));
        negativeButton.setTextColor(getResources().getColor(android.R.color.black));

    }
}