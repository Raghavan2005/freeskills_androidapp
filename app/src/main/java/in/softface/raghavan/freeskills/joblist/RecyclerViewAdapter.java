/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 07/08/23, 10:57 pm
 *    funwithmetamil@gmail.com
 *     Last modified 30/07/23, 11:21 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.joblist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.messageshower.CustomDialogClass;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    jobsdata[] jobdatas;
    Context context;
    Activity a;
    View view;

    CustomDialogClass cd;
    //  Animation slideUpAnimation,slideDownAnimation;

    public RecyclerViewAdapter(Activity a, jobsdata[] data, Joblist activity) {
        this.jobdatas = data;
        this.context = activity;
        this.a = a;


        // slideUpAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_up);
        //  slideDownAnimation = AnimationUtils.loadAnimation(context, R.anim.slide_down);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        view = layoutInflater.inflate(R.layout.item_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final jobsdata jobDataList = jobdatas[position];
        holder.jobName.setText(jobDataList.getjobName());
        holder.jobdis.setText(jobDataList.getjobDate());
        Picasso.get()
                .load(jobDataList.getjobImage())
                .placeholder(R.drawable.loading_background)
                .error(R.drawable.loadingerror)
                .into(holder.jobImage);

        holder.drop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


// Load the animation XML files

                if (holder.jobdis.getVisibility() == View.GONE) {
                    // Show the view with slide-up animation
                    holder.jobdis.setVisibility(View.VISIBLE);
                    //  holder.jobdis.startAnimation(slideUpAnimation);

                } else {
                    // Hide the view with slide-down animation
                    holder.jobdis.setVisibility(View.GONE);
                    // holder.jobdis.startAnimation(slideDownAnimation);

                }
            }
        });

        holder.bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //      Toast.makeText(context, jobDataList.getjobName(), Toast.LENGTH_SHORT).show();
                cd = new CustomDialogClass(a, "Are You Sure You Selected " + jobDataList.getjobName() + " ?", "Yes,I Am Sure", "Cancel", jobDataList.getjobName());
                cd.show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return jobdatas.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView jobImage;
        TextView jobName;
        ImageButton drop;
        TextView jobdis;
        Button bt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jobImage = itemView.findViewById(R.id.imageview);
            jobName = itemView.findViewById(R.id.textName);
            jobdis = itemView.findViewById(R.id.textdate);
            drop = itemView.findViewById(R.id.drop);
            bt = itemView.findViewById(R.id.bt);


        }
    }

}
