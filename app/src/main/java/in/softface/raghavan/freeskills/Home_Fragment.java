package in.softface.raghavan.freeskills;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.AnimationTypes;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.gson.Gson;

import java.util.ArrayList;

import in.softface.raghavan.freeskills.dateset.cardviewdata;
import in.softface.raghavan.freeskills.eachcardview.CardlistDisplayonRecycleview;

public class Home_Fragment extends Fragment {
    ImageSlider mainslider;
    TextView usernameview;
    ImageView proimage;
    String lastsee;
    SharedPreferences sharedPreferences, sharedPreferences1;
    RecyclerView ContinuerecyclerView, RecommendedrecyclerView, watchlanguagerecyclerView, inyourlanguagerecyclerView, programmingrecyclerView, frameworksrecyclerView, CrashCourserecyclerView;
    private ArrayList<String> array, lastseearray;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.activity_home, container, false);
        sharedPreferences1 = getActivity().getSharedPreferences("LastseeData", Context.MODE_PRIVATE);
        cardviewdata cvd = new cardviewdata();
        mainslider = mView.findViewById(R.id.main_slider);
        proimage = mView.findViewById(R.id.action_bar_image);
        usernameview = mView.findViewById(R.id.username);
        mainslider = mView.findViewById(R.id.main_slider);
        usernameview = mView.findViewById(R.id.username);
        ContinuerecyclerView = mView.findViewById(R.id.ContinuerecyclerView);
        RecommendedrecyclerView = mView.findViewById(R.id.RecommendedrecyclerView);
        watchlanguagerecyclerView = mView.findViewById(R.id.watchlanguagerecyclerView);
        programmingrecyclerView = mView.findViewById(R.id.programmingrecyclerView);
        frameworksrecyclerView = mView.findViewById(R.id.frameworksrecyclerView);
        CrashCourserecyclerView = mView.findViewById(R.id.CrashCourserecyclerView);


        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://bit.ly/2YoJ77H", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://bit.ly/2BteuF2", ScaleTypes.FIT));

        mainslider.setImageList(slideModels, ScaleTypes.FIT);
        mainslider.startSliding(3000);
        mainslider.setSlideAnimation(AnimationTypes.DEPTH_SLIDE);

        // ... (rest of the code remains unchanged)

        ///// Continue Watching
        ContinuerecyclerView = mView.findViewById(R.id.ContinuerecyclerView);
        ContinuerecyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        CardlistDisplayonRecycleview continueImageAdapter = new CardlistDisplayonRecycleview(cvd.Recommended, getActivity());
        ContinuerecyclerView.setAdapter(continueImageAdapter);
        ContinuerecyclerView.scrollToPosition(continueImageAdapter.getItemCount() + 1);
//
//
//// Recommended
        RecommendedrecyclerView = mView.findViewById(R.id.RecommendedrecyclerView);
        RecommendedrecyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        CardlistDisplayonRecycleview recommendedImageAdapter = new CardlistDisplayonRecycleview(cvd.Recommended, getActivity());
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

        return mView;
    }

    private void savelastseedata() {
        Gson gson = new Gson();
        lastsee = gson.toJson(lastseearray);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("lastsee", lastsee);
        editor.apply();
    }


    // Helper method to capitalize the first letter of a string
}
