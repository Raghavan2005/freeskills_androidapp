/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 04/08/23, 1:22 pm
 *    funwithmetamil@gmail.com
 *     Last modified 04/08/23, 1:22 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.recycleviews;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.dateset.conditiondataset;
import in.softface.raghavan.freeskills.messageshower.dialog_loading;
import in.softface.raghavan.freeskills.videoplayer.VideoplayerActivity;

public class redvideos extends RecyclerView.Adapter<redvideos.ViewHolder> {

    dialog_loading dl;
    Activity activity;
    private ArrayList<String> whitelist, selectedlist;
    private Context context;
    private conditiondataset cds;

    public redvideos(Activity activity, Context context, ArrayList<String> whitelist) {
        this.whitelist = whitelist;
        this.context = context;
        this.activity = activity;
        cds = new conditiondataset();
        ///   dl = new dialog_loading(activity,2000);
    }

    @NonNull
    @Override
    public redvideos.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.redvideos, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull redvideos.ViewHolder holder, int position) {
        String data = whitelist.get(position);
        selectedlist = cds.data(data);
        holder.text.setText(selectedlist.get(0));
        holder.time.setText(selectedlist.get(2));
        Picasso.get()
                .load(getYouTubeVideoID(selectedlist.get(1)))
                .placeholder(R.drawable.loading_background)
                .error(R.drawable.loadingerror)
                .into(holder.image);
        Intent intent = new Intent(context, VideoplayerActivity.class);
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Handle the item click event
                //   dl.show();
                selectedlist = cds.data(data);
                intent.putExtra("array", cds.data(selectedlist.get(7)));
//                ImageView sharedView = (ImageView) holder.itemView;
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                //String transitionName = context.getString(R.string.blue_namemain);
                //ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, sharedView, transitionName);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return whitelist.size();
    }

    public void setWhitelist(ArrayList<String> whitelist) {
        this.whitelist = whitelist;
        notifyDataSetChanged();
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

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView text, time;
        ImageView image;


        public ViewHolder(View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.text);
            time = itemView.findViewById(R.id.timevideo);
            image = itemView.findViewById(R.id.whitelistcard);
        }
    }

}
