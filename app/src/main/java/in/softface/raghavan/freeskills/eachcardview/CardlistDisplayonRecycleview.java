package in.softface.raghavan.freeskills.eachcardview;

import static android.provider.Settings.System.getString;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import in.softface.raghavan.freeskills.HomeActivity;
import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.dateset.conditiondataset;
import in.softface.raghavan.freeskills.login.profile.userlogged;
import in.softface.raghavan.freeskills.videoplayer.VideoplayerActivity;

public class CardlistDisplayonRecycleview extends RecyclerView.Adapter<CardlistDisplayonRecycleview.ViewHolder> {

    private carddata[] carddata;
    private Context context;
    conditiondataset cdata;

    public CardlistDisplayonRecycleview(carddata[] data, Context context) {
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
        final carddata card = carddata[position];
        Picasso.get()
                .load(card.getcardImage())
                .into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                // Handle the item click event
                Intent intent = new Intent(context, VideoplayerActivity.class);
                intent.putExtra("cardName", card.getcardName());
                intent.putExtra("imageUrl", card.getcardImage());
                intent.putExtra("type", card.gettype());
                intent.putExtra("array", cdata.data(card.getcardName()));
                View sharedView = holder.imageView;
                String transitionName = context.getString(R.string.blue_name);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, sharedView, transitionName);
                context.startActivity(intent, transitionActivityOptions.toBundle());


            }
        });
    }

    @Override
    public int getItemCount() {
        return carddata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.cardimage);
        }

        public ImageView getBlueIconImageView() {
            return this.imageView;
        }
    }
}
