/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 12/07/23, 8:17 pm
 *    funwithmetamil@gmail.com
 *     Last modified 12/07/23, 8:17 pm
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

import in.softface.raghavan.freeskills.R;

public class dialog_loading extends Dialog implements
        android.view.View.OnClickListener {

    Activity c;

    public dialog_loading(Activity b) {
        super(b);
        // TODO Auto-generated constructor stub
        this.c = b;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_loading);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                dismiss();
            }
        }, 3000);

    }


    @Override
    public void onClick(View view) {
    }

}
