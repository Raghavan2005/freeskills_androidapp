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

    public topicdata[] Internet, NotFound, HTML;
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
        } else if (Objects.equals(cardname, "HTML")) {
            HTML = new topicdata[]{
                    new topicdata("Intro", "00m00s", gen_yt_timeurl("00m00s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 1 - Getting Started", "00m55s", gen_yt_timeurl("00m55s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 2 - Head Element", "20m13s", gen_yt_timeurl("20m13s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 3 - Text Basics", "29m02s", gen_yt_timeurl("29m02s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 4 - List Types", "49m45s", gen_yt_timeurl("49m45s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 5 - Add Links", "59m55s", gen_yt_timeurl("59m55s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 6 - Add Images", "01h30m38s", gen_yt_timeurl("01h30m38s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 7 - Semantic Tags", "02h00m58s", gen_yt_timeurl("02h00m58s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 8 - Create Tables", "02h24m53s", gen_yt_timeurl("02h24m53s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 9 - Forms & Inputs", "02h40m42s", gen_yt_timeurl("02h40m42s", "kUMe1FH4CHE")),
                    new topicdata("Chapter 10 - HTML Project", "03h25m16s", gen_yt_timeurl("03h25m16s", "kUMe1FH4CHE")),};
            return HTML;


        } else {
            NotFound = new topicdata[]{
                    new topicdata("NotFound", "NotFound", "NotFound"),
            };
            return NotFound;
        }
    }
/*else if (Objects.equals(cardname,"HTML")) {
        HTML = new topicdata[]{
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),
                new topicdata("", "", gen_yt_timeurl("", "")),};
        return HTML;


    }*/

    @NonNull
    @Contract(pure = true)
    private String gen_yt_timeurl(String time, String videoid) {
        String imageurl = "https://youtu.be/";
        return imageurl + videoid + time;
    }

}
