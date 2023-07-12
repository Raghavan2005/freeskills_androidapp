/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 12/07/23, 9:30 pm
 *    funwithmetamil@gmail.com
 *     Last modified 11/07/23, 10:59 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.dateset;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Contract;

import java.util.Objects;

import in.softface.raghavan.freeskills.videoplayer.topics.topicdata;

public class topicviewdata {

    public topicdata[] Internet, NotFound;
    private String cardname;

    public topicviewdata(String cardname) {
        this.cardname = cardname;
    }

    public topicdata[] topicdata() {
        if (Objects.equals(cardname, "Internet")) {
            Internet = new topicdata[]{
                    new topicdata("Intro", "00m00s", gen_yt_timeurl("00m00s", "zN8YNNHcaZc")),
                    new topicdata("What is the switch and why do we need it?", "13m16s", gen_yt_timeurl("13m16s", "zN8YNNHcaZc")),
                    new topicdata("What does the internet represent\nPart-1?", "19m43s", gen_yt_timeurl("19m43s", "zN8YNNHcaZc")),
                    new topicdata("What does the internet represent\nPart-2?", "28m28s", gen_yt_timeurl("28m28s", "zN8YNNHcaZc")),
                    new topicdata("What does the internet represent\nPart-3?", "35m27s", gen_yt_timeurl("35m27s", "zN8YNNHcaZc")),
                    new topicdata("Connecting to the internet from a computer's perspective", "48m00s", gen_yt_timeurl("48m00s", "zN8YNNHcaZc")),
                    new topicdata("Wide Area Network(WAN)", "55m10s", gen_yt_timeurl("55m10s", "zN8YNNHcaZc")),
                    new topicdata("What is the Router?\nPart-2", "1h10m02s", gen_yt_timeurl("1h10m02s", "zN8YNNHcaZc")),
                    new topicdata("Internet Service Provider ISP\nPart-1", "1h17m26s", gen_yt_timeurl("1h17m26s", "zN8YNNHcaZc")),
                    new topicdata("Internet Service Provider ISP\nPart-2", "1h32m21s", gen_yt_timeurl("1h32m21s", "zN8YNNHcaZc")),};
            return Internet;
        } else {
            NotFound = new topicdata[]{
                    new topicdata("NotFound", "NotFound", "NotFound"),
            };
            return NotFound;
        }
    }


    @NonNull
    @Contract(pure = true)
    private String gen_yt_timeurl(String time, String videoid) {
        String imageurl = "https://youtu.be/";
        return imageurl + videoid + time;
    }

}
