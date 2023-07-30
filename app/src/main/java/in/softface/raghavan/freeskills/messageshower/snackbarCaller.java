/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/24/23, 11:27 AM
 *    funwithmetamil@gmail.com
 *     Last modified 6/24/23, 11:27 AM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.messageshower;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import in.softface.raghavan.freeskills.R;

public class snackbarCaller {

    private Context context;
    //id = 0 = ok = green
    //id = 1 = error = red

    public snackbarCaller(Context context, LinearLayout button, String displaytext, int id) {
        this.context = context;


        final Snackbar snackbar = Snackbar.make(button, " ", Snackbar.ANIMATION_MODE_SLIDE);
        View customView = LayoutInflater.from(context).inflate(R.layout.snackbar, null);
        TextView message = customView.findViewById(R.id.message);
        message.setText(displaytext);
        if (id == 0) {
            message.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.ok_baseline_check_24, 0, 0, 0);
            customView.setBackgroundResource(R.drawable.green_rounded_background);
            } else if (id == 1) {
                customView.setBackgroundResource(R.drawable.red_rounded_background);
                message.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.error_baseline_close_24, 0, 0, 0);
            }
            // snackbar.getView().setBackgroundColor(Color.TRANSPARENT);
            Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
            snackbarLayout.setPadding(0, 0, 0, 0);
            snackbarLayout.addView(customView, 0);

            Animation fadeInAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_in);
            snackbar.getView().startAnimation(fadeInAnimation);
            snackbar.show();
    }
}
