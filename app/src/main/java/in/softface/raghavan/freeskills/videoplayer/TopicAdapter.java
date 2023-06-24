/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/12/23, 7:43 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/12/23, 7:43 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.videoplayer;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.checkerframework.checker.units.qual.C;

import java.util.List;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.joblist.jobsdata;
import in.softface.raghavan.freeskills.videoplayer.topics.topicdata;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.ViewHolder> {
    private topicdata[] topics;
    private Context context;
    public TopicAdapter(topicdata[] topics ,Context context) {
        this.topics = topics;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topicecard, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //String topic = topics.get(position);
        final topicdata topic =  topics[position];
        holder.topicTextView.setText(topic.gettopicname());
        holder.topicTextView.setSingleLine(false);
        String formattedTime = topic.gettopictime().replaceAll("[mh]", ":").replaceAll("[s]", "");
        holder.topicplay.setText("Play Now At\n" + formattedTime);

        holder.topicplay.setOnClickListener(v -> context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(topic.gettopictimeurl()))));

        holder.sno.setText(String.valueOf(position+1)+".");
    }

    @Override
    public int getItemCount() {
        return topics.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView topicTextView,sno;
        Button topicplay;

        public ViewHolder(View itemView) {
            super(itemView);
            topicTextView = itemView.findViewById(R.id.topicname);
            sno = itemView.findViewById(R.id.sno);
            topicplay = itemView.findViewById(R.id.topicplay);
        }
    }
}
