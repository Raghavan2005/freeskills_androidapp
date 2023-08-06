package in.softface.raghavan.freeskills.eachcardview;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.dateset.conditiondataset;
import in.softface.raghavan.freeskills.videoplayer.VideoplayerActivity;

public class CardlistDisplayonRecycleview extends RecyclerView.Adapter<CardlistDisplayonRecycleview.ViewHolder> {

    private carddata[] carddata;
    private Context context;
    conditiondataset cdata;

    ArrayList array;

    public CardlistDisplayonRecycleview(carddata[] data, Context context) {
        this.carddata = data;
        this.context = context;
        cdata = new conditiondataset();
        array = new ArrayList<>();

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
        array = cdata.data(card.getcardName());
        String url = getYouTubeVideoID((String) array.get(1));
        Picasso.get()
                .load(url)
                .placeholder(R.drawable.loading_background)
                .error(R.drawable.loadingerror)
                .into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                // Handle the item click event
                Intent intent = new Intent(context, VideoplayerActivity.class);
                intent.putExtra("array", cdata.data(card.getcardName()));
                ImageView sharedView = holder.imageView;
                String transitionName = context.getString(R.string.blue_namemain);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, sharedView, transitionName);
                context.startActivity(intent, transitionActivityOptions.toBundle());


            }
        });
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
