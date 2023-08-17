/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 18/08/23, 12:22 am
 *    funwithmetamil@gmail.com
 *     Last modified 16/08/23, 7:12 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.AnimationTypes;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

import in.softface.raghavan.freeskills.dateset.cardviewdata;
import in.softface.raghavan.freeskills.dateset.jobromdata;
import in.softface.raghavan.freeskills.eachcardview.CardlistDisplayonRecycleview;
import in.softface.raghavan.freeskills.eachcardview.lastseeRecycleview;
import in.softface.raghavan.freeskills.recycleviews.recommendedrecycleview;

public class Home_Fragment extends Fragment {
    ImageSlider mainslider;
    TextView usernameview, job, protext, framtext, cctext;
    ImageView proimage;
    SharedPreferences sharedPreferences;
    String jobnames;
    LinearLayout ContinuerecyclerViewlay;
    RecyclerView ContinuerecyclerView, RecommendedrecyclerView, watchlanguagerecyclerView, inyourlanguagerecyclerView, programmingrecyclerView, frameworksrecyclerView, CrashCourserecyclerView;
    private ArrayList<String> lastseearray;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.activity_home, container, false);
        sharedPreferences = getActivity().getSharedPreferences("UserData", Context.MODE_PRIVATE);
        jobnames = getjobname();
        cardviewdata cvd = new cardviewdata();
        mainslider = mView.findViewById(R.id.main_slider);
        proimage = mView.findViewById(R.id.action_bar_image);
        usernameview = mView.findViewById(R.id.username);
        job = mView.findViewById(R.id.jobname);
        job.setText(jobnames);
        mainslider = mView.findViewById(R.id.main_slider);
        usernameview = mView.findViewById(R.id.username);
        ContinuerecyclerView = mView.findViewById(R.id.ContinuerecyclerView);
        RecommendedrecyclerView = mView.findViewById(R.id.RecommendedrecyclerView);
        watchlanguagerecyclerView = mView.findViewById(R.id.watchlanguagerecyclerView);
        programmingrecyclerView = mView.findViewById(R.id.programmingrecyclerView);
        frameworksrecyclerView = mView.findViewById(R.id.frameworksrecyclerView);
        CrashCourserecyclerView = mView.findViewById(R.id.CrashCourserecyclerView);
        ContinuerecyclerViewlay = mView.findViewById(R.id.ContinuerecyclerViewlay);
        protext = mView.findViewById(R.id.protext);
        framtext = mView.findViewById(R.id.framtext);
        cctext = mView.findViewById(R.id.cctext);
        lastseearray = new ArrayList<>();
        lastseearray = getlastseelistdata();
        Log.d("hello", "onCreateView: " + lastseearray);
        if (lastseearray.isEmpty()) {
            ContinuerecyclerViewlay.setVisibility(View.GONE);
        }
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(loadImageSlide("https://i.ibb.co/ftWnkmH/p1.png"));
        slideModels.add(loadImageSlide("https://i.ibb.co/cw4PpjS/p2.png"));
        slideModels.add(loadImageSlide("https://i.ibb.co/q0j1k0w/p3.png"));
        mainslider.setImageList(slideModels, ScaleTypes.FIT);
        mainslider.startSliding(3000);
        mainslider.setSlideAnimation(AnimationTypes.DEPTH_SLIDE);


        // ... (rest of the code remains unchanged)

        ///// Continue Watching
        ContinuerecyclerView = mView.findViewById(R.id.ContinuerecyclerView);
        ContinuerecyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        lastseeRecycleview continueImageAdapter = new lastseeRecycleview(lastseearray, getActivity());
        ContinuerecyclerView.setAdapter(continueImageAdapter);
        ContinuerecyclerView.scrollToPosition(continueImageAdapter.getItemCount() + 1);

//// Recommended
        RecommendedrecyclerView = mView.findViewById(R.id.RecommendedrecyclerView);
        RecommendedrecyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        recommendedrecycleview recommendedImageAdapter = new recommendedrecycleview(getjobviewlist(), getActivity());
        Log.d("listss", "onCreateView: " + getjobviewlist());
        RecommendedrecyclerView.setAdapter(recommendedImageAdapter);
        RecommendedrecyclerView.scrollToPosition(recommendedImageAdapter.getItemCount() + 1);
//
//
//// watch in your language
        watchlanguagerecyclerView = mView.findViewById(R.id.watchlanguagerecyclerView);
        watchlanguagerecyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        CardlistDisplayonRecycleview watchlanguageImageAdapter = new CardlistDisplayonRecycleview(cvd.language, getActivity());
        watchlanguagerecyclerView.setAdapter(watchlanguageImageAdapter);
        watchlanguagerecyclerView.scrollToPosition(watchlanguageImageAdapter.getItemCount() + 1);

////programming languages

        programmingrecyclerView = mView.findViewById(R.id.programmingrecyclerView);
        programmingrecyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        CardlistDisplayonRecycleview programmingImageAdapter = new CardlistDisplayonRecycleview(cvd.programming, getActivity());
        programmingrecyclerView.setAdapter(programmingImageAdapter);
        programmingrecyclerView.scrollToPosition(programmingImageAdapter.getItemCount() + 1);
////frameworks
        frameworksrecyclerView = mView.findViewById(R.id.frameworksrecyclerView);
        frameworksrecyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        CardlistDisplayonRecycleview frameworksImageAdapter = new CardlistDisplayonRecycleview(cvd.frameworks, getActivity());
        frameworksrecyclerView.setAdapter(frameworksImageAdapter);
        frameworksrecyclerView.scrollToPosition(frameworksImageAdapter.getItemCount() + 1);


        CrashCourserecyclerView = mView.findViewById(R.id.CrashCourserecyclerView);
        CrashCourserecyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        CardlistDisplayonRecycleview CrashCourseImageAdapter = new CardlistDisplayonRecycleview(cvd.CrashCourse, getActivity());
        CrashCourserecyclerView.setAdapter(CrashCourseImageAdapter);
        CrashCourserecyclerView.scrollToPosition(CrashCourseImageAdapter.getItemCount() + 1);
//switch for grid view

        protext.setOnClickListener(view -> {

            Intent i = new Intent(getActivity(), MoreDisplay.class);
            i.putExtra("key", "programming");
            startActivity(i);
        });
        framtext.setOnClickListener(view -> {

            Intent i = new Intent(getActivity(), MoreDisplay.class);
            i.putExtra("key", "frameworks");
            startActivity(i);
        });
        cctext.setOnClickListener(view -> {
            Intent i = new Intent(getActivity(), MoreDisplay.class);
            i.putExtra("key", "CrashCourse");
            startActivity(i);
        });
        return mView;
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
        Collections.reverse(list);
        return list;
    }

    private ArrayList<String> getjobviewlist() {
        String jobname = sharedPreferences.getString("JobSelected", "null");
        jobromdata jb = new jobromdata();
        return jb.data(jobname);
    }

    private String getjobname() {
        String jobname = sharedPreferences.getString("JobSelected", "null");
        return jobname;
    }

    private SlideModel loadImageSlide(String imageUrl) {
        // Use Glide to load and cache the image
        Glide.with(this)
                .load(imageUrl)
                .preload(); // Preload the image into cache

        // Create a SlideModel instance with the loaded image URL
        return new SlideModel(imageUrl, ScaleTypes.FIT);
    }

    // Helper method to capitalize the first letter of a string
}
