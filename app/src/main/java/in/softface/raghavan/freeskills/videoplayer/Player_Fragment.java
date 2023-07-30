package in.softface.raghavan.freeskills.videoplayer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;
import com.varunest.sparkbutton.SparkButton;

import java.lang.reflect.Type;
import java.util.ArrayList;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.dateset.topicviewdata;
import in.softface.raghavan.freeskills.messageshower.youtube_loading;

public class Player_Fragment extends Fragment {

    private String imageurl;
    private ImageView imageView;
    private View view;
    TextView videotime, title, lang, sourcename;
    LinearLayout dis_title;
    ImageButton play;
    String listofwhitelist, lastseelist;
    SharedPreferences sharedPreferences, lastsee;
    private RecyclerView topicRecyclerView;
    private TopicAdapter topicAdapter;

    SparkButton whitelist;
    private String cardname;
    private boolean whitestatus;
    private ArrayList<String> array, whitelistarray, lastseearray;


    public Player_Fragment() {
        // Required empty public constructor
    }

    public static Player_Fragment newInstance(String imageUrl, ArrayList<String> array) {
        Player_Fragment fragment = new Player_Fragment();
        Bundle args = new Bundle();
        args.putString("imageUrl", imageUrl);
        args.putSerializable("array", array);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getActivity().getSharedPreferences("WhitelistData", Context.MODE_PRIVATE);
        lastsee = getActivity().getSharedPreferences("lastseeData", Context.MODE_PRIVATE);
        if (getArguments() != null) {
            imageurl = getArguments().getString("imageUrl");
            array = (ArrayList<String>) getArguments().getSerializable("array");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_player_, container, false);
        imageView = view.findViewById(R.id.displayvideoimage);
        Picasso.get().load(imageurl).into(imageView);
        videotime = view.findViewById(R.id.videotime);
        title = view.findViewById(R.id.coursetitile);
        dis_title = view.findViewById(R.id.dis_title);
        whitelist = view.findViewById(R.id.whitelist);
        sourcename = view.findViewById(R.id.sourcename);
        title.setText(array.get(0));
        lang = view.findViewById(R.id.lang);
        lang.setText(array.get(5));
        cardname = array.get(0);
        sourcename.setText(array.get(3));
        topicRecyclerView = view.findViewById(R.id.topicRecyclerView);
        topicRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        topicviewdata td = new topicviewdata(cardname);
        topicAdapter = new TopicAdapter(td.topicdata(), getContext());
        topicRecyclerView.setNestedScrollingEnabled(false);
        topicRecyclerView.setAdapter(topicAdapter);

// Add a ViewTreeObserver to the RecyclerView to calculate the height after it's laid out
        topicRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                // Calculate the height of all items in the RecyclerView
                int totalHeight = calculateRecyclerViewHeight(topicRecyclerView);

                // Set the height of the RecyclerView to the calculated height
                ViewGroup.LayoutParams layoutParams = topicRecyclerView.getLayoutParams();
                layoutParams.height = totalHeight;
                topicRecyclerView.setLayoutParams(layoutParams);

                // Remove the listener to avoid redundant calculations
                topicRecyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });


        videotime.setText(array.get(2));
        play = view.findViewById(R.id.play);
        String url = array.get(1);
        whitelistarray = new ArrayList<>();
        lastseearray = new ArrayList<>();
        lastseearray = getlastseelistdata();
        whitelistarray = getwhitelistdata();
        youtube_loading yl = new youtube_loading(getActivity());
        boolean isTextFound = getwhitelistdata().contains(array.get(0));
        if (isTextFound) {
            whitelist.setChecked(true);
        } else {
            whitelist.setChecked(false);
        }
        dis_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dis_title.getVisibility() == View.VISIBLE) {
                    showBottomSheetDialog();
                }
            }
        });

        whitelist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (whitelistarray.contains(array.get(7))) {
                    whitelistarray.remove(array.get(7));
                    Log.d("list", "onClick: " + whitelistarray);
                    whitelist.setChecked(false);
                    savewhitelistdata();
                } else {
                    whitelistarray.add(array.get(7));
                    whitelist.setChecked(true);
                    Log.d("list", "onClick: " + whitelistarray);
                    savewhitelistdata();
                }
            }
        });




        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                lastseearray.add(array.get(7));
                savelastvideo();
                yl.startLoadingdialog();
                startActivity(i);
            }
        });

        return view;
    }

    private void savewhitelistdata() {
        Gson gson = new Gson();
        listofwhitelist = gson.toJson(whitelistarray);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("whitelist", listofwhitelist);
        editor.apply();
    }

    private void savelastvideo() {
        Gson gson = new Gson();
        lastseelist = gson.toJson(lastseearray);
        SharedPreferences.Editor editor = lastsee.edit();
        editor.putString("lastseedata", lastseelist);
        Log.d("loging", "savelastvideo: " + lastseelist);
        editor.apply();
    }

    private ArrayList<String> getwhitelistdata() {
        String json = sharedPreferences.getString("whitelist", "null");
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<String>>() {
        }.getType();
        ArrayList<String> list = gson.fromJson(json, type);
        Log.d("list", "onClick: " + list);
        if (list == null) {
            list = new ArrayList<>();
        }
        return list;
    }

    private ArrayList<String> getlastseelistdata() {
        String json = lastsee.getString("lastseedata", "null");
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<String>>() {
        }.getType();
        ArrayList<String> list = gson.fromJson(json, type);
        Log.d("list", "onClick: " + list);
        if (list == null) {
            list = new ArrayList<>();
        }
        return list;
    }

    private int calculateRecyclerViewHeight(RecyclerView recyclerView) {
        RecyclerView.Adapter<?> adapter = recyclerView.getAdapter();
        int itemCount = adapter.getItemCount();
        int totalHeight = 0;
        for (int i = 0; i < itemCount; i++) {
            View itemView = recyclerView.getChildAt(i);
            if (itemView != null) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) itemView.getLayoutParams();
                totalHeight += itemView.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
        }
        return totalHeight;
    }

    private void showBottomSheetDialog() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getContext());
        bottomSheetDialog.setContentView(R.layout.bottom_dialog_layout);
        TextView name;
        Button link;
        name = bottomSheetDialog.findViewById(R.id.name);
        name.setText(array.get(3));
        link = bottomSheetDialog.findViewById(R.id.link);
        link.setOnClickListener(view1 -> {

            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(array.get(4))));
        });
        bottomSheetDialog.show();
    }

}
