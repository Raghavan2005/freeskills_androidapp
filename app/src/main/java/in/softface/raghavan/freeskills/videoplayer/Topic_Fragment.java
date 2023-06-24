/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/12/23, 8:21 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/12/23, 8:21 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.videoplayer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.videoplayer.topics.topicviewdata;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Topic_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Topic_Fragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private RecyclerView topicRecyclerView;
    private TopicAdapter topicAdapter;

    private String mParam1;
    private String mParam2;

    public Topic_Fragment() {
        // Required empty public constructor
    }

    public static Topic_Fragment newInstance(String param1, String param2) {
        Topic_Fragment fragment = new Topic_Fragment();
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
        View view = inflater.inflate(R.layout.fragment_topic, container, false);
        topicRecyclerView = view.findViewById(R.id.topicRecyclerView);
        topicRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        topicviewdata td = new topicviewdata();
        topicAdapter = new TopicAdapter(td.Internet,getContext());
        topicRecyclerView.setAdapter(topicAdapter);

        return view;
    }
}
