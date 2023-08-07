/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 07/08/23, 10:57 pm
 *    funwithmetamil@gmail.com
 *     Last modified 17/07/23, 12:02 am
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.messageshower;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;

import com.github.ybq.android.spinkit.sprite.Sprite;
import com.github.ybq.android.spinkit.style.Circle;

import in.softface.raghavan.freeskills.R;

public class dialog_loading extends Dialog implements
        android.view.View.OnClickListener {

    Activity c;
    int time = 3000;

    public dialog_loading(Activity b) {
        super(b);
        // TODO Auto-generated constructor stub
        this.c = b;
    }

    public dialog_loading(Activity b, int a) {
        super(b);
        // TODO Auto-generated constructor stub
        this.c = b;
        this.time = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_loading);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.loading_image);
        Sprite doubleBounce = new Circle();
        progressBar.setIndeterminateDrawable(doubleBounce);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                dismiss();
            }
        }, time);

    }


    @Override
    public void onClick(View view) {
    }

}
