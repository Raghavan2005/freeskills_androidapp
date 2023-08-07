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

import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public class AutoSwitchActivity {
    private Context context;
    private Class<?> targetActivity;
    private long delayMillis;

    public AutoSwitchActivity(Context context, Class<?> targetActivity, long delayMillis) {
        this.context = context;
        this.targetActivity = targetActivity;
        this.delayMillis = delayMillis;
    }

    public void start() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(context, targetActivity);
                context.startActivity(intent);
            }
        }, delayMillis);
    }
}
