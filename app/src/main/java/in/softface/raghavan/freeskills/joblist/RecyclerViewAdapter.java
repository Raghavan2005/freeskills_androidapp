package in.softface.raghavan.freeskills.joblist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import in.softface.raghavan.freeskills.MainActivity;
import in.softface.raghavan.freeskills.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    jobsdata[] jobdatas;
    Context context;

    public RecyclerViewAdapter(jobsdata[] data, Joblist activity) {
        this.jobdatas = data;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final jobsdata jobDataList = jobdatas[position];
        holder.jobName.setText(jobDataList.getjobName());
        holder.jobdis.setText(jobDataList.getjobDate());
        holder.jobImage.setImageResource(jobDataList.getjobImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, jobDataList.getjobName(), Toast.LENGTH_SHORT).show();
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
        TextView jobdis;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jobImage = itemView.findViewById(R.id.imageview);
            jobName = itemView.findViewById(R.id.textName);
            jobdis = itemView.findViewById(R.id.textdate);

        }
    }

}
