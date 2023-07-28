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
    String cc = "CrashCourse", english = "English", p = "programming", f = "frameworks";

    public ArrayList<String> data(String name) {
        ArrayList<String> arrayList = new ArrayList();

        if (Objects.equals(name, "Internet")) {
            arrayList.add(0, "Internet");
            arrayList.add(1, gen_yt_videourl("zN8YNNHcaZc"));
            arrayList.add(2, "01:42:42");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "This course will help someone with no technical knowledge");
            arrayList.add(8, "This course will help someone with no technical knowledge to understand how the internet works and learn fundamentals of computer networking. \n Test your knowledge with these questions for each section of the course: https://drive.google.com/drive/folder... \n Course developed by Ian Frost. \n Check out more of his courses on Udemy: https://www.udemy.com/user/ian-frost-9");
            return arrayList;
        } else if (Objects.equals(name, "HTML")) {
            arrayList.add(0, "HTML");
            arrayList.add(1, gen_yt_videourl("kUMe1FH4CHE"));
            arrayList.add(2, "04:07:29");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, p);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;

        } else if (Objects.equals(name, "CSS")) {
            arrayList.add(0, "CSS");
            arrayList.add(1, gen_yt_videourl("OXGznpKZ_sA"));
            arrayList.add(2, "11:08:10");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, p);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "JavaScript")) {
            arrayList.add(0, "JavaScript");
            arrayList.add(1, gen_yt_videourl("PkZNo7MFNFg"));
            arrayList.add(2, "03:26:43");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, p);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "Version Control System")) {
            arrayList.add(0, "Version Control System");
            arrayList.add(1, gen_yt_videourl("RGOj5yH7evk"));
            arrayList.add(2, "01:08:30");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "Package Managers")) {
            arrayList.add(0, "Package Managers");
            arrayList.add(1, gen_yt_videourl("P3aKRdUyr0s"));
            arrayList.add(2, "00:14:26");
            arrayList.add(3, gen_channel_name("TheCoderCoder"));
            arrayList.add(4, gen_channel_url("TheCoderCoder"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "CSS Architechture")) {
            arrayList.add(0, "CSS Architechture");
            arrayList.add(1, gen_yt_videourl("MNPdifWAAa4"));
            arrayList.add(2, "00:20:33");
            arrayList.add(3, gen_channel_name("DaveGrayTeachesCode"));
            arrayList.add(4, gen_channel_url("DaveGrayTeachesCode"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "CSS Preprocessors")) {
            arrayList.add(0, "CSS Preprocessors");
            arrayList.add(1, gen_yt_videourl("_a5j7KoflTs"));
            arrayList.add(2, "2:02:58");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "Module Bundlers")) {
            arrayList.add(0, "Module Bundlers");
            arrayList.add(1, gen_yt_videourl("5IG4UmULyoA"));
            arrayList.add(2, "00:09:55");
            arrayList.add(3, gen_channel_name("Fireship"));
            arrayList.add(4, gen_channel_url("Fireship"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "React")) {
            arrayList.add(0, "React");
            arrayList.add(1, gen_yt_videourl("bMknfKXIFA8"));
            arrayList.add(2, "11:55:27");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "Tailwind CSS")) {
            arrayList.add(0, "Tailwind CSS");
            arrayList.add(1, gen_yt_videourl("ft30zcMlFao"));
            arrayList.add(2, "04:12:18");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "Jest")) {
            arrayList.add(0, "Jest");
            arrayList.add(1, gen_yt_videourl("ML5egqL3YFE"));
            arrayList.add(2, "00:22:16");
            arrayList.add(3, gen_channel_name("KrisFoster1"));
            arrayList.add(4, gen_channel_url("KrisFoster1"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "Server Side Rendering SSR in React")) {
            arrayList.add(0, "Server Side Rendering SSR in React");
            arrayList.add(1, gen_yt_videourl("NwyQONeqRXA"));
            arrayList.add(2, "00:12:01");
            arrayList.add(3, gen_channel_name("satansdeer1"));
            arrayList.add(4, gen_channel_url("satansdeer1"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "Static Site Generators Astro")) {
            arrayList.add(0, "Static Site Generators Astro");
            arrayList.add(1, gen_yt_videourl("zrPVTf761OI"));
            arrayList.add(2, "00:22:06");
            arrayList.add(3, gen_channel_name("CodinginPublic"));
            arrayList.add(4, gen_channel_url("CodinginPublic"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "Desktop Applications Electron")) {
            arrayList.add(0, "Desktop Applications Electron");
            arrayList.add(1, gen_yt_videourl("ML743nrkMHw"));
            arrayList.add(2, "01:11:47");
            arrayList.add(3, gen_channel_name("TraversyMedia"));
            arrayList.add(4, gen_channel_url("TraversyMedia"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "Authentication Strategies")) {
            arrayList.add(0, "Authentication Strategies");
            arrayList.add(1, gen_yt_videourl("F-sFp_AvHc8"));
            arrayList.add(2, "06:13:28");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "Mobile Applications React Native")) {
            arrayList.add(0, "Mobile Applications React Native");
            arrayList.add(1, gen_yt_videourl("obH0Po_RdWk"));
            arrayList.add(2, "04:40:39");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else if (Objects.equals(name, "Git")) {
            arrayList.add(0, "Git");
            arrayList.add(1, gen_yt_videourl("Uszj_k0DGsg"));
            arrayList.add(2, "00:40:42");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "ty");
            arrayList.add(8, "ty");
            return arrayList;
        } else {
            arrayList.add(0, "Not Found");
            arrayList.add(1, "Not Found");
            arrayList.add(2, "Not Found");
            arrayList.add(3, "Not Found");
            arrayList.add(4, "Not Found");
            arrayList.add(5, "Not Found");
            arrayList.add(6, "Not Found");
            arrayList.add(7, "Not Found");
            arrayList.add(8, "Not Found");
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
        String channelname = "@" + name;
        return channelname.toUpperCase();
    }

    private String gen_channel_url(String url) {
        String channelurl = "https://www.youtube.com/" + "@" + url;
        return channelurl;
    }
}
