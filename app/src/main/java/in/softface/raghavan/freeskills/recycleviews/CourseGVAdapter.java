package in.softface.raghavan.freeskills.recycleviews;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.dateset.conditiondataset;
import in.softface.raghavan.freeskills.eachcardview.carddata;
import in.softface.raghavan.freeskills.videoplayer.VideoplayerActivity;

public class CourseGVAdapter extends ArrayAdapter<carddata> {
    Context context;
    conditiondataset cdata;
    ArrayList array;

    public CourseGVAdapter(@NonNull Context context, carddata[] cardviewdataList) {
        super(context, 0, cardviewdataList);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(context).inflate(R.layout.gridview, parent, false);
            cdata = new conditiondataset();
            array = new ArrayList<>();
        }

        carddata card = getItem(position);
        array = cdata.data(card.getcardName());
        if (array.get(0) != "Not Found") {
            array = cdata.data(card.getcardName());
            String url = getYouTubeVideoID((String) array.get(1));
            ImageView courseIV = listItemView.findViewById(R.id.whitelistcard);
            TextView tv = listItemView.findViewById(R.id.text);
            TextView date = listItemView.findViewById(R.id.language);
            tv.setText((String) convertToTitleCase((String) array.get(0)));
            date.setText((String) array.get(2));
            Picasso.get()
                    .load(url)
                    .placeholder(R.drawable.loading_background)
                    .error(R.drawable.loadingerror)
                    .into(courseIV);

            courseIV.setOnClickListener(v -> {
                Intent intent = new Intent(context, VideoplayerActivity.class);
                intent.putExtra("array", cdata.data(card.getcardName()));
                ImageView sharedView = courseIV;
                String transitionName = context.getString(R.string.blue_namemain);
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity) context, sharedView, transitionName);
                context.startActivity(intent, transitionActivityOptions.toBundle());
            });
        }

        return listItemView;
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

    public String convertToTitleCase(String input) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : input.toCharArray()) {
            if (c == '_') {
                result.append(' ');
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
        }

        return result.toString();
    }
}
