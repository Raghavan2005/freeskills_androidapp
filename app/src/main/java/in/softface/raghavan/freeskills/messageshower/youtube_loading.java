/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 30/07/23, 12:09 pm
 *    funwithmetamil@gmail.com
 *     Last modified 30/07/23, 12:08 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.messageshower;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.Circle;

import in.softface.raghavan.freeskills.R;

public class youtube_loading {
    int time = 2000;
    private Activity activity;
    private AlertDialog dialog;

    // constructor of dialog class
    // with parameter activity
    public youtube_loading(Activity myActivity) {
        activity = myActivity;
    }


    public void startLoadingdialog() {

        // adding ALERT Dialog builder object and passing activity as parameter
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        // layoutinflater object and use activity to get layout inflater
        LayoutInflater inflater = (LayoutInflater) activity.getLayoutInflater();
        final Handler handler = new Handler();
        builder.setView(((android.view.LayoutInflater) inflater).inflate(R.layout.youtube_loading, null));
        builder.setCancelable(true);
        dialog = builder.create();
        dialog.show();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                dismissdialog();

            }
        }, time);
    }

    // dismiss method
    void dismissdialog() {
        dialog.dismiss();
    }
}
