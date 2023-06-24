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
