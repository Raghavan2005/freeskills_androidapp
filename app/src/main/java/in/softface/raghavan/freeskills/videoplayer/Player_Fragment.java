/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/12/23, 8:20 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/12/23, 8:20 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.videoplayer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import in.softface.raghavan.freeskills.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Player_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Player_Fragment extends Fragment {

    private String imageurl;
    private ImageView imageView;
    private View view;
    TextView videotime, title, dis_title, full_dis, lang;
    ImageButton play;
    Button whitelist;
    private ArrayList<String> array;

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
        if (getArguments() != null) {
            imageurl = getArguments().getString("imageUrl");
            array = (ArrayList<String>) getArguments().getStringArrayList("array");
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_player_, container, false);
        imageView = view.findViewById(R.id.displayvideoimage);
        Log.d("error", "onCreateView: " + imageurl);
        Picasso.get().load(imageurl).into(imageView);
        videotime = view.findViewById(R.id.videotime);
        title = view.findViewById(R.id.coursetitile);
        dis_title = view.findViewById(R.id.dis_title);
        whitelist = view.findViewById(R.id.whitelist);
        full_dis = view.findViewById(R.id.full_dis);
        title.setText(array.get(0));
        lang = view.findViewById(R.id.lang);
        lang.setText(array.get(5));
        String dishalf = array.get(6) + "......";
        dis_title.setText(array.get(6) + ".....");
        full_dis.setText(array.get(7));
        play = view.findViewById(R.id.play);
        String url = array.get(1);

        dis_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dis_title.getVisibility() == view.VISIBLE) {
                    dis_title.setText("Description");
                    full_dis.setVisibility(view.VISIBLE);

                }

            }
        });
        full_dis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (full_dis.getVisibility() == view.VISIBLE) {
                    dis_title.setText(dishalf);
                    full_dis.setVisibility(view.GONE);
                }
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }
        });

        return view;
    }
}
