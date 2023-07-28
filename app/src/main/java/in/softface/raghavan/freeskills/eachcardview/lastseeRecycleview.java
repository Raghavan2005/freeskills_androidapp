package in.softface.raghavan.freeskills.eachcardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.dateset.conditiondataset;

public class lastseeRecycleview extends RecyclerView.Adapter<lastseeRecycleview.ViewHolder> {

    conditiondataset cdata;
    private ArrayList<String> carddata;
    private Context context;

    public lastseeRecycleview(ArrayList<String> data, Context context) {
        this.carddata = data;
        this.context = context;
        cdata = new conditiondataset();

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final String card = carddata.get(position);

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
}
