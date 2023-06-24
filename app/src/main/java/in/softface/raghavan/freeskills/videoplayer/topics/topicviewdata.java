/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/24/23, 10:57 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/24/23, 10:57 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.videoplayer.topics;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Contract;

import in.softface.raghavan.freeskills.eachcardview.carddata;

public class topicviewdata {

    public topicdata[] Internet = new topicdata[]{
            new topicdata("Intro","00m00s",gen_yt_timeurl("00m00s")),
            new topicdata("What is the switch and why do we need it?","13m16s",gen_yt_timeurl("13m16s")),
            new topicdata("What does the internet represent\nPart-1?","19m43s",gen_yt_timeurl("19m43s")),
            new topicdata("What does the internet represent\nPart-2?","28m28s",gen_yt_timeurl("28m28s")),
            new topicdata("What does the internet represent\nPart-3?","35m27s",gen_yt_timeurl("35m27s")),
            new topicdata("Connecting to the internet from a computer's perspective","48m00s",gen_yt_timeurl("48m00s")),
            new topicdata("Wide Area Network(WAN)","55m10s",gen_yt_timeurl("55m10s")),
            new topicdata("What is the Router?\nPart-2","1h10m02s",gen_yt_timeurl("1h10m02s")),
            new topicdata("Internet Service Provider ISP\nPart-1","1h17m26s",gen_yt_timeurl("1h17m26s")),
            new topicdata("Internet Service Provider ISP\nPart-2","1h32m21s",gen_yt_timeurl("1h32m21s")),

    };

    @NonNull
    @Contract(pure = true)
    private String gen_yt_timeurl(String time) {
        String imageurl = "https://youtu.be/";
        String imageres = "zN8YNNHcaZc?t=";
        return imageurl + imageres + time;
    }
}
