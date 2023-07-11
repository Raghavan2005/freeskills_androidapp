/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/24/23, 8:04 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/24/23, 8:04 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.dateset;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.Objects;


public class conditiondataset {

    public ArrayList<String> data(String name) {
        ArrayList<String> arrayList = new ArrayList();

        if (Objects.equals(name, "Internet")) {
            arrayList.add(0, "Internet");
            arrayList.add(1, gen_yt_videourl("zN8YNNHcaZc"));
            arrayList.add(2, "1:42:42");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            return arrayList;
        } else {
            arrayList.add(0, "Not Found");
            arrayList.add(1, "Not Found");
            arrayList.add(2, "Not Found");
            arrayList.add(3, "Not Found");
            arrayList.add(4, "Not Found");
            return arrayList;

        }
    }

    @NonNull
    @Contract(pure = true)
    private String gen_yt_videourl(String videoid) {
        String videourl = "https://www.youtube.com/watch?v=";
        return videourl + videoid;
    }
    private String gen_channel_name(String name){
        String channelname = "@"+name;
    return channelname.toUpperCase();
    }
    private String gen_channel_url(String url){
        String channelurl = "https://www.youtube.com/"+"@"+url;
        return channelurl;
    }
}
