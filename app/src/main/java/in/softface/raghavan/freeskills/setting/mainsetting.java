/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 07/08/23, 10:57 pm
 *    funwithmetamil@gmail.com
 *     Last modified 02/08/23, 10:03 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.setting;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.squareup.picasso.Picasso;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.Whitelist_fragment;
import in.softface.raghavan.freeskills.login.Sign_up_Activity;
import in.softface.raghavan.freeskills.messageshower.dialog_loading;
import in.softface.raghavan.freeskills.messageshower.snackbarCaller;
import in.softface.raghavan.freeskills.notifications.Notification_Screen;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link mainsetting#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mainsetting extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    LinearLayout whitelist, clearcontinue, aboutus, not, Apply;
    TextView username, appv;
    AppCompatButton signout;
    ImageView profileimage;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    SharedPreferences sharedPreferences;

    public mainsetting() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment mainsetting.
     */
    // TODO: Rename and change types and number of parameters
    public static mainsetting newInstance(String param1, String param2) {
        mainsetting fragment = new mainsetting();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mview = inflater.inflate(R.layout.fragment_mainsetting, container, false);
        sharedPreferences = getActivity().getSharedPreferences("UserData", Context.MODE_PRIVATE);
        String Email = sharedPreferences.getString("email", "Not Found");
        String imageurl = sharedPreferences.getString("profileImage", "");
        username = mview.findViewById(R.id.username);
        appv = mview.findViewById(R.id.appversion);
        whitelist = mview.findViewById(R.id.whitelistlay);
        not = mview.findViewById(R.id.notification);
        clearcontinue = mview.findViewById(R.id.clearcontinue);
        aboutus = mview.findViewById(R.id.aboutus);
        signout = mview.findViewById(R.id.signout);
        Apply = mview.findViewById(R.id.Apply);
        dialog_loading dl = new dialog_loading(getActivity());
        signout.setOnClickListener(view -> {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.clear(); // Clear all values from SharedPreferences
            editor.apply(); // Apply the changes
            dl.show();
            FirebaseAuth.getInstance().signOut();
            Intent i = new Intent(getActivity(), Sign_up_Activity.class);
            startActivity(i);
        });

        whitelist.setOnClickListener(view -> {
            Intent i = new Intent(getActivity(), Whitelist_fragment.class);
            startActivity(i);
        });
        Apply.setOnClickListener(view -> {
            Intent i = new Intent(getActivity(), GetCertificate.class);
            startActivity(i);
        });
        PackageManager pm = getContext().getPackageManager();
        String pkgName = getContext().getPackageName();
        PackageInfo pkgInfo = null;
        try {
            pkgInfo = pm.getPackageInfo(pkgName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        assert pkgInfo != null;
        String ver = pkgInfo.versionName;
        appv.setText("" + ver);

        profileimage = mview.findViewById(R.id.profileimg);
        username.setText("Logging as " + Email);
        Picasso.get()
                .load(imageurl)
                .into(profileimage);

        aboutus.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), WebViewActivity.class);
            String url = "https://cyberspherestudio.com";
            intent.putExtra("urltoopen", url);
            startActivity(intent);
        });
        not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Notification_Screen.class);
                startActivity(i);
            }
        });
        clearcontinue.setOnClickListener(view -> {
            snackbarCaller sc = new snackbarCaller(getActivity(), clearcontinue, "All Data Cleared", 0);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.remove("lastseedata");
            editor.apply();
        });


        return mview;
    }

    private void showNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(getContext(), "notificationforfreeskills")
                .setContentTitle("Daily Reminder")
                .setContentText("It's time for your daily task!")
                .setSmallIcon(R.drawable.framework);


        // Create a notification manager
        NotificationManager notificationManager = (NotificationManager) getContext().getSystemService(Context.NOTIFICATION_SERVICE);
        Log.d("times", "notification: 3");

        // Notify
        notificationManager.notify(1223423356, builder.build());
        builder.build();
        Log.d("times", "notification: 4");
    }
}