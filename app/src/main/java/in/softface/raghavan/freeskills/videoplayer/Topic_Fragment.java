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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import in.softface.raghavan.freeskills.R;

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

    private  String cardname;

    public Topic_Fragment() {
        // Required empty public constructor
    }

    public static Topic_Fragment newInstance(String cardname) {
        Topic_Fragment fragment = new Topic_Fragment();
        Bundle args = new Bundle();
        args.putString("cardName", cardname);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            cardname = getArguments().getString("cardName");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_topic, container, false);
        // topicRecyclerView = view.findViewById(R.id.topicRecyclerView);
        /// topicRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        // topicviewdata td = new topicviewdata(cardname);
        //  topicAdapter = new TopicAdapter(td.topicdata(),getContext());
        //  topicRecyclerView.setAdapter(topicAdapter);

        return view;
    }
}
