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

//starting - 11 is english
public class conditiondataset {
    String cc = "CrashCourse", english = "English", p = "programming", f = "frameworks";

    public ArrayList<String> data(String name) {
        ArrayList<String> arrayList = new ArrayList();

        if (Objects.equals(name, "1101")) {
            arrayList.add(0, "Internet");
            arrayList.add(1, gen_yt_videourl("zN8YNNHcaZc"));
            arrayList.add(2, "01:42:42");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1101");

            return arrayList;
        } else if (Objects.equals(name, "1102")) {
            arrayList.add(0, "HTML");
            arrayList.add(1, gen_yt_videourl("kUMe1FH4CHE"));
            arrayList.add(2, "04:07:29");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, p);
            arrayList.add(7, "1102");
            return arrayList;

        } else if (Objects.equals(name, "1103")) {
            arrayList.add(0, "CSS");
            arrayList.add(1, gen_yt_videourl("OXGznpKZ_sA"));
            arrayList.add(2, "11:08:10");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, p);
            arrayList.add(7, "1103");
            return arrayList;
        } else if (Objects.equals(name, "1104")) {
            arrayList.add(0, "JavaScript");
            arrayList.add(1, gen_yt_videourl("PkZNo7MFNFg"));
            arrayList.add(2, "03:26:43");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, p);
            arrayList.add(7, "1104");
            return arrayList;
        } else if (Objects.equals(name, "1105")) {
            arrayList.add(0, "Version Control System");
            arrayList.add(1, gen_yt_videourl("RGOj5yH7evk"));
            arrayList.add(2, "01:08:30");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1105");
            return arrayList;
        } else if (Objects.equals(name, "1106")) {
            arrayList.add(0, "Package Managers");
            arrayList.add(1, gen_yt_videourl("P3aKRdUyr0s"));
            arrayList.add(2, "00:14:26");
            arrayList.add(3, gen_channel_name("TheCoderCoder"));
            arrayList.add(4, gen_channel_url("TheCoderCoder"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1106");
            return arrayList;
        } else if (Objects.equals(name, "1107")) {
            arrayList.add(0, "CSS Architechture");
            arrayList.add(1, gen_yt_videourl("MNPdifWAAa4"));
            arrayList.add(2, "00:20:33");
            arrayList.add(3, gen_channel_name("DaveGrayTeachesCode"));
            arrayList.add(4, gen_channel_url("DaveGrayTeachesCode"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1107");
            return arrayList;
        } else if (Objects.equals(name, "1108")) {
            arrayList.add(0, "CSS Preprocessors");
            arrayList.add(1, gen_yt_videourl("_a5j7KoflTs"));
            arrayList.add(2, "2:02:58");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "1108");
            return arrayList;
        } else if (Objects.equals(name, "1109")) {
            arrayList.add(0, "Module Bundlers");
            arrayList.add(1, gen_yt_videourl("5IG4UmULyoA"));
            arrayList.add(2, "00:09:55");
            arrayList.add(3, gen_channel_name("Fireship"));
            arrayList.add(4, gen_channel_url("Fireship"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1109");
            return arrayList;
        } else if (Objects.equals(name, "1110")) {
            arrayList.add(0, "React");
            arrayList.add(1, gen_yt_videourl("bMknfKXIFA8"));
            arrayList.add(2, "11:55:27");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "1110");
            return arrayList;
        } else if (Objects.equals(name, "1111")) {
            arrayList.add(0, "Tailwind CSS");
            arrayList.add(1, gen_yt_videourl("ft30zcMlFao"));
            arrayList.add(2, "04:12:18");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "1111");
            return arrayList;
        } else if (Objects.equals(name, "1112")) {
            arrayList.add(0, "Jest");
            arrayList.add(1, gen_yt_videourl("ML5egqL3YFE"));
            arrayList.add(2, "00:22:16");
            arrayList.add(3, gen_channel_name("KrisFoster1"));
            arrayList.add(4, gen_channel_url("KrisFoster1"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1112");
            return arrayList;
        } else if (Objects.equals(name, "1113")) {
            arrayList.add(0, "Server Side Rendering SSR in React");
            arrayList.add(1, gen_yt_videourl("NwyQONeqRXA"));
            arrayList.add(2, "00:12:01");
            arrayList.add(3, gen_channel_name("satansdeer1"));
            arrayList.add(4, gen_channel_url("satansdeer1"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "1113");
            return arrayList;
        } else if (Objects.equals(name, "1114")) {
            arrayList.add(0, "Static Site Generators Astro");
            arrayList.add(1, gen_yt_videourl("zrPVTf761OI"));
            arrayList.add(2, "00:22:06");
            arrayList.add(3, gen_channel_name("CodinginPublic"));
            arrayList.add(4, gen_channel_url("CodinginPublic"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "1114");
            return arrayList;
        } else if (Objects.equals(name, "1115")) {
            arrayList.add(0, "Desktop Applications Electron");
            arrayList.add(1, gen_yt_videourl("ML743nrkMHw"));
            arrayList.add(2, "01:11:47");
            arrayList.add(3, gen_channel_name("TraversyMedia"));
            arrayList.add(4, gen_channel_url("TraversyMedia"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "1115");
            return arrayList;
        } else if (Objects.equals(name, "1116")) {
            arrayList.add(0, "Authentication Strategies");
            arrayList.add(1, gen_yt_videourl("F-sFp_AvHc8"));
            arrayList.add(2, "06:13:28");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1116");
            return arrayList;
        } else if (Objects.equals(name, "1117")) {
            arrayList.add(0, "Mobile Applications React Native");
            arrayList.add(1, gen_yt_videourl("obH0Po_RdWk"));
            arrayList.add(2, "04:40:39");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "1117");
            return arrayList;
        } else if (Objects.equals(name, "1118")) {
            arrayList.add(0, "Git");
            arrayList.add(1, gen_yt_videourl("Uszj_k0DGsg"));
            arrayList.add(2, "00:40:42");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1118");
            return arrayList;
        } else {
            arrayList.add(0, "Not Found");
            arrayList.add(1, "Not Found");
            arrayList.add(2, "Not Found");
            arrayList.add(3, "Not Found");
            arrayList.add(4, "Not Found");
            arrayList.add(5, "Not Found");
            arrayList.add(6, "Not Found");
            arrayList.add(7, "0000");

            return arrayList;

        }
    }


/*else if (Objects.equals(name,"HTML")){
           arrayList.add(0, "HTML");
            arrayList.add(1, gen_yt_videourl(""));
            arrayList.add(2, "");
            arrayList.add(3, gen_channel_name(""));
            arrayList.add(4, gen_channel_url(""));
            arrayList.add(5, english);
            arrayList.add(6, "");
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;}*/

    @NonNull
    @Contract(pure = true)
    private String gen_yt_videourl(String videoid) {
        String videourl = "https://www.youtube.com/watch?v=";
        return videourl + videoid;
    }

    private String gen_channel_name(String name) {
        String channelname = '@' + name;
        return channelname.toUpperCase();
    }

    private String gen_channel_url(String url) {
        String channelurl = "https://www.youtube.com/" + "@" + url;
        return channelurl;
    }
}
