/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 18/08/23, 12:22 am
 *    funwithmetamil@gmail.com
 *     Last modified 07/08/23, 10:57 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.eachcardview;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.dateset.conditiondataset;
import in.softface.raghavan.freeskills.videoplayer.VideoplayerActivity;

public class lastseeRecycleview extends RecyclerView.Adapter<lastseeRecycleview.ViewHolder> {

    conditiondataset cdata;
    private ArrayList<String> carddata, name;
    private Context context;

    public lastseeRecycleview(ArrayList<String> data, Context context) {
        this.carddata = removeDuplicates(data);
        this.context = context;
        cdata = new conditiondataset();

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent, false);
        return new ViewHolder(view);
    }

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> arrayList) {
        // Create a HashSet to store unique elements
        HashSet<T> uniqueSet = new HashSet<>();

        // Create a new ArrayList to store the elements without duplicates
        ArrayList<T> result = new ArrayList<>();

        // Loop through the original ArrayList
        for (T item : arrayList) {
            // If the item is not already in the HashSet, add it to the result ArrayList
            if (!uniqueSet.contains(item)) {
                result.add(item);
                uniqueSet.add(item);
            }
        }

        return result;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final String card = carddata.get(position);
        Log.d("asafsdfdsfsdf", "onBindViewHolder: " + card);
        name = cdata.data(card);
        String url1 = getYouTubeVideoID(name.get(1));
        Log.d("asafsdfdsfsdf", "onBindViewHolder: url " + url1);
        Picasso.get()
                .load(url1)
                .placeholder(R.drawable.loading_background)
                .error(R.drawable.loadingerror)
                .into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the item click event
                Intent intent = new Intent(context, VideoplayerActivity.class);
                intent.putExtra("cardName", name.get(0));
                intent.putExtra("imageUrl", url1);
                intent.putExtra("type", name.get(6));
                intent.putExtra("array", name);
                ImageView sharedView = holder.imageView;
                String transitionName = context.getString(R.string.blue_namemain);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, sharedView, transitionName);
                context.startActivity(intent, transitionActivityOptions.toBundle());


            }
        });
    }

    @Override
    public int getItemCount() {
        return carddata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.cardimage);
        }

    }

    private String gen_yt_imgurl(String videoid) {
        String imageurl = "https://img.youtube.com/vi/";
        String imageres = "/maxresdefault.jpg";
        return imageurl + videoid + imageres;
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

}
