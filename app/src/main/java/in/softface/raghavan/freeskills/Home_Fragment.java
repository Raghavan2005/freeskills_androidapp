/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 07/08/23, 10:57 pm
 *    funwithmetamil@gmail.com
 *     Last modified 03/08/23, 8:02 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills;

import android.annotation.SuppressLint;
import android.content.Context;
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
    TextView usernameview, job;
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
        lastseearray = new ArrayList<>();
        lastseearray = getlastseelistdata();
        Log.d("hello", "onCreateView: " + lastseearray);
        if (lastseearray.isEmpty()) {
            ContinuerecyclerViewlay.setVisibility(View.GONE);
        }
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(loadImageSlide("https://lh3.googleusercontent.com/pw/AIL4fc_KIMHRtpx0HLyg7dVDukdzKzKXTigNVRwvbx_D6fHTQaCgg-6lG1DYv7KCcrhoq7IFm5wWKoYSBAKNcB94G_zoS3fxjTRUwRcFiLNaZvCuWCuTVNM44AxEYUzWobHZoiVEIOF1T6MOxXGFvLFgk-_F2qot8awN4zGIRiUaVKTkCF09WrhP4ivcBu3IOgJwlMXyDE5sPYfxpZj-SXHFUdjYMzgisQsVY73eMB_wPofgjfetqUQ2jQknMeEV_lQWc1zoL85nrqy9d1KfhXwGkajq8ny7zBzHLcD8lYqSDk7n1pxxYREubsZtL3yJ-OCJky512Bf5mPQxGhhIN6CrxYAgDamzfsSqWY_ybQtFjWy6xWrRsCokzZXamxOK4-md5V7wBsnlGPML4fY2496CRY0XkIAGBJkHEe8SKOSR3a4o4BA0DB9J8EUIS_z0BlMXGO_rorGEGZiNhNq1a6tCIQ7cXi1ZwqyUvlBDUMbCt6u6JO-jW-KbFm4gBSl28aBZUYKBHl7EQIIe8H9vzm1TaFmdif_bUTSuxpw72xzh7nifY_ctAEMMrwq-2aCBVUJi4vbiH5xpJ93-7Aj9-jU4s43TEhfIfExKWAq6hVE3B7Je6Wr5mirNSpkljVb1xujnGJ2ssGmwVSAJp-VOomtEqWZcOoS72Lclm20XT0urZN5Cb9s5NLveAr1_xepgQB2X19A-YpmpodpyLoscxsWqvPsi4qEGa4caqUPRc1xjPvCWzC1fOuzA5cXtPUh5wiF0oFJstcSGsNSnqpL7TKGKFDxe4qwM6hpRbZIngrqtkt_GrLUXM23FAtZfO-3fExXghpCFgfJT9lRkesjWf5Uyx38TgF0jwfTQTmoQNFggDtK20Fj1iXUy0SYNtzrEmW3YlAt1kSfvHjKF_ctVlKpG=w1175-h661-s-no?authuser=0"));
        slideModels.add(loadImageSlide("https://lh3.googleusercontent.com/pw/AIL4fc-kxayTWlBbiw3k6I-UFqoD8p_ZPHllu8FI-0RSct0202WC5sAc8MQvGGoYk299vMlFao2IqHzYmV_1UCaMCypToTMly37r-D7Pqo8jBcGu9Vafq1t82Yiq6wwYu9dSRxExqYRC1RnONw31KeZQrNcXk1UZTiH-7vwet41UtDBB3XaHki5QxnorP6hF4E4AjdldMEqbauTfp1ZuO8pzaCni2ufSWZd5N3_IAlFfksWRyqNMK6xxSDmw565kJ-exeCmwdEEdM9o7NQGr_6jYsdDj45taXCZKGLXQOlxKiArD8QcoVir4f0vbURcQwRAvXEEkadSFnz3pS7-SRaxjbmlGm2p-O1ys52l0gEra7nOwlxGLt1gofwPrZh450vms6Fol5043aMH58N8nkjFVCm4wFgErcuhlxJ0xdVjHIR0QrpSV8OXQ5uyGrbTnhk5j-nWumZ_Vzy1epP04APe44BF-Dm5FJvleyadiudpzzJOCfxcyPdz5IWy-4gwLKDsxBNUYQr_fNU3NquvxJO-g263TttzyVnv_A3OvXlpkVRKv201Hrl98xjBkpNaSASfIaKxJ8sW6Ufxa6761pxpza6W-SYR4na7C5gBz-7rtvoCYsjggD2ijjRmWU4joEiC3t1ZzfTzbIk2zp4x-dRCp-oxqnPyBcwDW5CERBxw8__hcm4gmIn4Vgb5tiaON20BgZv0eYUAiaPFHytpBW2yIgLYZDAVhbplwNCQ2RcsMihKJOREctaHF7oSnJ86SvItZDLuWOxQD9_C0czLM8Nq38blsT2riMPuFX-30g_pB_LKsXaLyOl9PV2VTj0KYTK0_5OkCjEFcOEC1s8pF4izAUnvPKfBLvnNU2sMhGl2PxUJZWhcNjDelBD6-2ymLM1s34w-SMiknMDAzwYO7fx2D=w1175-h661-s-no?authuser=0"));
        slideModels.add(loadImageSlide("https://lh3.googleusercontent.com/pw/AIL4fc-hv12pVF_ZimoclNFeKKfD0A9ygSdK2vmQ7ymEs62hR8haHWz60WdWXKldbICq5fAprppIMAlRe1d9xU5aDbO_7qcLmSrYUtwUjkwHm1jqzHIgvp1b5_Kma4UjuHDufd9QXYE-te4KwddSSLx-bs7ZUXbGTKrlYoGqi_12PmvP_tNDh1PnemMTPBj1elY4roiB-6ovLsreFwUx8ZYqesK99oi5gaj3Qv_9d3GTNIJKAUm8MJEzkrxRMIpetOXstovsNCJIdL331zulGQZrdwwi88nmjzIRFpYx-XRnN9389JfxIE6tgIPb6TVBX0Cj17BnPmmMrlU952cOX1LVoQVTOqv8b_icLnEjaYv6_Du4uS0gokvaLghXSRaYs5Agn9DLo1fiilUMaTKZPri9bDMpbZPNd53_RtihpNQen7uURSZ_nwDxgO6-w6LP5ibnL2uPy7oBYfpI-9NG_pWEGlhyIMcjjKUOiJpPM6brhaA9wXLbZHFVdroPuIgX26chkKsSw-95hNgaKhd7a7KU_8XrPtgV-Ak4Rg_-h_bc-mbxcVfmi5bX38u8VhijOtyQxXH8DCaMlHUs488deexQjYti-WIql1HeSchM3eHnpTeJGWWHmAx1I34GkddE7xiA_XNCNvIPPDKtdVz2H6SDWenuL11_4sBfu-ZLM7SdwV2uvDCx-HvoDeLpcEh_ymPgKAK7Fn0IoecdlLtEGj54pO-2UE5FWFvdH4oFt_vggwXv-WQhcGsPyyMXodV6UwUFay225Dc11xBxL8vpPMrN4hSw_zxjQ4PJW0L4QIcpDXokofTSabs6zNOURv8GKcmDt2eziNPXd4AngR2SXhzWxO_OHmsClU7tUKXN9aMaRj9rySA47y9RLVeLf43EvxIzJP5XIpZAg7c3j1mYuXdB=w1175-h661-s-no?authuser=0"));

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
