package in.softface.raghavan.freeskills.eachcardview;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Type;
import java.util.ArrayList;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.dateset.conditiondataset;
import in.softface.raghavan.freeskills.videoplayer.VideoplayerActivity;

public class CardlistDisplayonRecycleview extends RecyclerView.Adapter<CardlistDisplayonRecycleview.ViewHolder> {

    private carddata[] carddata;
    private Context context;
    conditiondataset cdata;
    SharedPreferences sh;
    private ArrayList<String> array, lastseearray;

    public CardlistDisplayonRecycleview(carddata[] data, Context context) {
        this.carddata = data;
        this.context = context;
        cdata = new conditiondataset();
        sh = context.getSharedPreferences("LastseeData", Context.MODE_PRIVATE);
        ;

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
                if (!getwhitelistdata().isEmpty()) {
                    lastseearray.add(card.getcardName());
                }
                intent.putExtra("cardName", card.getcardName());
                intent.putExtra("imageUrl", card.getcardImage());
                intent.putExtra("type", card.gettype());
                intent.putExtra("array", cdata.data(card.getcardName()));
                ImageView sharedView = holder.imageView;
                String transitionName = context.getString(R.string.blue_namemain);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, sharedView, transitionName);
                context.startActivity(intent, transitionActivityOptions.toBundle());


            }
        });
    }

    private void savelastseedata() {
        Gson gson = new Gson();
        String lastsee = gson.toJson(lastseearray);
        SharedPreferences.Editor editor = sh.edit();
        editor.putString("lastsee", lastsee);
        editor.apply();
    }

    private ArrayList<String> getwhitelistdata() {
        String json = sh.getString("lastsee", "null");
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<String>>() {
        }.getType();
        ArrayList<String> list = gson.fromJson(json, type);
        Log.d("list", "onClick: " + list);
        if (list == null) {
            list = new ArrayList<>();
        }
        return list;
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

    }
}
