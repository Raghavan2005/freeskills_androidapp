/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 07/08/23, 10:57 pm
 *    funwithmetamil@gmail.com
 *     Last modified 04/08/23, 2:21 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.videoplayer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.dateset.jobromdata;
import in.softface.raghavan.freeskills.dateset.topicviewdata;
import in.softface.raghavan.freeskills.messageshower.youtube_loading;
import in.softface.raghavan.freeskills.recycleviews.redvideos;

public class Player_Fragment extends Fragment {

    private String imageurl;
    private ImageView imageView;
    private View view;
    TextView videotime, title, lang, sourcename;
    LinearLayout dis_title;
    ImageButton play;
    String listofwhitelist, lastseelist;
    SharedPreferences sharedPreferences;
    private RecyclerView topicRecyclerView;
    private TopicAdapter topicAdapter;

    SparkButton whitelist, sharebtn;

    private boolean whitestatus;
    private ArrayList<String> array, whitelistarray, lastseearray;


    public Player_Fragment() {
        // Required empty public constructor
    }

    public static Player_Fragment newInstance(ArrayList<String> array) {
        Player_Fragment fragment = new Player_Fragment();
        Bundle args = new Bundle();
        args.putSerializable("array", array);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getActivity().getSharedPreferences("UserData", Context.MODE_PRIVATE);
        if (getArguments() != null) {
            array = (ArrayList<String>) getArguments().getSerializable("array");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_player_, container, false);
        imageView = view.findViewById(R.id.displayvideoimage);
        imageurl = getYouTubeVideoID(array.get(1));
        Picasso.get()
                .load(imageurl)
                .placeholder(R.drawable.loading_background)
                .error(R.drawable.loadingerror)
                .into(imageView);
        videotime = view.findViewById(R.id.videotime);
        redvideos rw;
        RecyclerView re = view.findViewById(R.id.ray);
        title = view.findViewById(R.id.coursetitile);
        dis_title = view.findViewById(R.id.dis_title);
        whitelist = view.findViewById(R.id.whitelist);
        sourcename = view.findViewById(R.id.sourcename);
        sharebtn = view.findViewById(R.id.sharebtn);
        title.setText(convertToTitleCase(array.get(0)));
        lang = view.findViewById(R.id.lang);
        lang.setText(array.get(5));
        sourcename.setText(array.get(3));
        topicRecyclerView = view.findViewById(R.id.topicRecyclerView);
        topicRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        topicviewdata td = new topicviewdata(array.get(7));
        if (td.topicdata() == null) {
            topicRecyclerView.setVisibility(view.GONE);
            re.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
            rw = new redvideos(getActivity(), getContext(), getalllist());
            re.setAdapter(rw);
            re.scrollToPosition(rw.getItemCount() - 1);

        } else {
            re.setVisibility(view.GONE);
            topicAdapter = new TopicAdapter(td.topicdata(), getContext());
            topicRecyclerView.setAdapter(topicAdapter);
        }


        videotime.setText(array.get(2));
        play = view.findViewById(R.id.play);
        String url = array.get(1);
        whitelistarray = new ArrayList<>();
        lastseearray = new ArrayList<>();
        lastseearray = getlastseelistdata();
        whitelistarray = getwhitelistdata();
        youtube_loading yl = new youtube_loading(getActivity());
        boolean isTextFound = getwhitelistdata().contains(array.get(7));
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
        sharebtn.setOnClickListener(view1 -> {
            Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            String a = "Learning on your terms! FreeSkills lets you study anytime, anywhere. Dive into engaging content and expand your horizons.";
            String b = "Title : " + array.get(0);
            String app_url = a + "\n" + b + "\n" + "https://freeskills.app/share/" + array.get(7);
            shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, app_url);
            startActivity(Intent.createChooser(shareIntent, "Share via"));
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
        SharedPreferences.Editor editor = sharedPreferences.edit();
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
        String json = sharedPreferences.getString("lastseedata", "null");
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

    public String getYouTubeVideoID(String youtubeURL) {
        String videoID = null;
        if (youtubeURL != null && youtubeURL.length() > 0) {
            String pattern = "(?<=watch\\?v=|/videos/|embed\\/|youtu.be\\/|\\/v\\/|watch\\?v%3D|watch\\?feature=player_embedded&v=|%2Fvideos%2F|embed%\u200C\u200B2F|youtu.be%\u200C\u200B2F|%2Fv%2F)[^#\\&\\?\\n]*";
            Pattern compiledPattern = Pattern.compile(pattern);
            Matcher matcher = compiledPattern.matcher(youtubeURL);
            if (matcher.find()) {
                videoID = matcher.group();
            }
        }
        return gen_yt_imgurl(videoID);
    }

    private String gen_yt_imgurl(String videoid) {
        String imageurl = "https://img.youtube.com/vi/";
        String imageres = "/maxresdefault.jpg";
        return imageurl + videoid + imageres;
    }

    private ArrayList<String> getalllist() {
        ArrayList l1, l2, l3;

        l1 = new ArrayList<>();
        l2 = new ArrayList<>();
        jobromdata jd = new jobromdata();
        l1 = jd.data("Frontend Developer");
        l2 = jd.data("Backend Developer");
        l3 = new ArrayList<>(l1);
        l3.addAll(l2);
        Set<String> uniqueSet = new HashSet<>(l3);
        List<String> finalList = new ArrayList<>(uniqueSet);
        Collections.shuffle(finalList);
        int limit = Math.min(10, finalList.size());
        List<String> limitedList = finalList.subList(0, limit);
        Log.d("listing", "getalllist: " + limitedList);
        return new ArrayList<>(limitedList);

    }

    public String convertToTitleCase(String input) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : input.toCharArray()) {
            if (c == '_') {
                result.append(' ');
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
        }

        return result.toString();
    }

}
