package in.softface.raghavan.freeskills.login.profile;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class ScreenSizeUtils {
    public static String getScreenSizeCategory(Context context) {
        int screenSize = context.getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK;

        switch (screenSize) {
            case Configuration.SCREENLAYOUT_SIZE_SMALL:
                return "Small";
            case Configuration.SCREENLAYOUT_SIZE_NORMAL:
                return "Normal";
            case Configuration.SCREENLAYOUT_SIZE_LARGE:
                return "Large";
            case Configuration.SCREENLAYOUT_SIZE_XLARGE:
                return "XLarge";
            default:
                return "Unknown";
        }
    }

    public static int getScreenWidth(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int getScreenHeight(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }
}
