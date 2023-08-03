package in.softface.raghavan.freeskills.recycleviews;

import android.app.Activity;
import android.app.ActivityOptions;
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
import in.softface.raghavan.freeskills.videoplayer.VideoplayerActivity;

public class recommendedrecycleview extends RecyclerView.Adapter<recommendedrecycleview.ViewHolder> {

    conditiondataset cdata;
    private ArrayList<String> carddata, name;
    private Context context;

    public recommendedrecycleview(ArrayList<String> data, Context context) {
        this.carddata = data;
        this.context = context;
        cdata = new conditiondataset();

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_job, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final String card = carddata.get(position);
        int ir = position;
        String count = "" + (ir + 1);
        holder.count.setText(count);

        name = cdata.data(card);
        String url1 = getYouTubeVideoID(name.get(1));
        Picasso.get()
                .load(url1)
                .placeholder(R.drawable.loading_background)
                .error(R.drawable.loadingerror)
                .into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = cdata.data(card);
                // Handle the item click event
                Intent intent = new Intent(context, VideoplayerActivity.class);
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

        public ImageView imageView;
        TextView count;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.cardimage);
            count = itemView.findViewById(R.id.numbercon);
        }

    }


}
