/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 07/08/23, 10:57 pm
 *    funwithmetamil@gmail.com
 *     Last modified 02/08/23, 11:11 pm
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
        } else if (Objects.equals(name, "1120")) {
            arrayList.add(0, "Python");
            arrayList.add(1, gen_yt_videourl("sxTmJE4k0ho"));
            arrayList.add(2, "6:21:13");
            arrayList.add(3, gen_channel_name("TechWithTim"));
            arrayList.add(4, gen_channel_url("TechWithTim"));
            arrayList.add(5, english);
            arrayList.add(6, p);
            arrayList.add(7, "1120");
            return arrayList;
        } else if (Objects.equals(name, "1122")) {
            arrayList.add(0, "Terminal_usage");
            arrayList.add(1, gen_yt_videourl("ZtqBQ68cfJc"));
            arrayList.add(2, "5:00:16");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1122");
            return arrayList;
        } else if (Objects.equals(name, "1123")) {
            arrayList.add(0, "POSIX_Basics");
            arrayList.add(1, gen_yt_videourl("U0GbJtnfqSM"));
            arrayList.add(2, "0:19:21");
            arrayList.add(3, gen_channel_name("hak5"));
            arrayList.add(4, gen_channel_url("hak5"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1123");
            return arrayList;
        } else if (Objects.equals(name, "1124")) {
            arrayList.add(0, "PostgreSQL");
            arrayList.add(1, gen_yt_videourl("qw--VYLpxG4"));
            arrayList.add(2, "4:19:34");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1124");
            return arrayList;
        } else if (Objects.equals(name, "1125")) {
            arrayList.add(0, "MongoDB-Document_databases");
            arrayList.add(1, gen_yt_videourl("c2M-rlkkT5o"));
            arrayList.add(2, "1:00:00");
            arrayList.add(3, gen_channel_name("BroCodez"));
            arrayList.add(4, gen_channel_url("BroCodez"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1125");
            return arrayList;
        } else if (Objects.equals(name, "1126")) {
            arrayList.add(0, "InfluxDB-Timeseries_databases");
            arrayList.add(1, gen_yt_videourl("Vq4cDIdz_M8"));
            arrayList.add(2, "7:48");
            arrayList.add(3, gen_channel_name("DevOpsJourney"));
            arrayList.add(4, gen_channel_url("DevOpsJourney"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1126");
            return arrayList;
        } else if (Objects.equals(name, "1127")) {
            arrayList.add(0, "firebase-Realtime_databases");
            arrayList.add(1, gen_yt_videourl("fgdpvwEWJ9M"));
            arrayList.add(2, "3:44:50");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1127");
            return arrayList;
        } else if (Objects.equals(name, "1128")) {
            arrayList.add(0, "Apache_Cassandra-Column_Databases");
            arrayList.add(1, gen_yt_videourl("J-cSy5MeMOA"));
            arrayList.add(2, "1:08:40");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1128");
            return arrayList;
        } else if (Objects.equals(name, "1129")) {
            arrayList.add(0, "Redis-Key-Value_Databases");
            arrayList.add(1, gen_yt_videourl("XCsS_NVAa1g"));
            arrayList.add(2, "1:26:59");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1129");
            return arrayList;
        } else if (Objects.equals(name, "1130")) {
            arrayList.add(0, "futuristic_databases");
            arrayList.add(1, gen_yt_videourl("jb2AvF8XzII"));
            arrayList.add(2, "0:08:42");
            arrayList.add(3, gen_channel_name("Fireship"));
            arrayList.add(4, gen_channel_url("Fireship"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1130");
            return arrayList;
        } else if (Objects.equals(name, "1131")) {
            arrayList.add(0, "scaling_database");
            arrayList.add(1, gen_yt_videourl("dkhOZOmV7Fo"));
            arrayList.add(2, "0:06:52");
            arrayList.add(3, gen_channel_name("Udacity"));
            arrayList.add(4, gen_channel_url("Udacity"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1131");
            return arrayList;
        } else if (Objects.equals(name, "1132")) {
            arrayList.add(0, "Authentication");
            arrayList.add(1, gen_yt_videourl("rhi1eIjSbvk"));
            arrayList.add(2, "0:05:06");
            arrayList.add(3, gen_channel_name("OktaDev"));
            arrayList.add(4, gen_channel_url("OktaDev"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1132");
            return arrayList;
        } else if (Objects.equals(name, "1133")) {
            arrayList.add(0, "REST");
            arrayList.add(1, gen_yt_videourl("lsMQRaeKNDk"));
            arrayList.add(2, "0:09:12");
            arrayList.add(3, gen_channel_name("IBMTechnology"));
            arrayList.add(4, gen_channel_url("IBMTechnology"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "1133");
            return arrayList;
        } else if (Objects.equals(name, "1134")) {
            arrayList.add(0, "JSON_APIs");
            arrayList.add(1, gen_yt_videourl("uxf0--uiX0I"));
            arrayList.add(2, "0:16:21");
            arrayList.add(3, gen_channel_name("TheCodingTrain"));
            arrayList.add(4, gen_channel_url("TheCodingTrain"));
            arrayList.add(5, english);
            arrayList.add(6, f);
            arrayList.add(7, "1134");
            return arrayList;
        } else if (Objects.equals(name, "1135")) {
            arrayList.add(0, "Client_Side_Caching");
            arrayList.add(1, gen_yt_videourl("iAnttA0O1Xg"));
            arrayList.add(2, "0:06:02");
            arrayList.add(3, gen_channel_name("mulesoftvids"));
            arrayList.add(4, gen_channel_url("mulesoftvids"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1135");
            return arrayList;
        } else if (Objects.equals(name, "1136")) {
            arrayList.add(0, "CDN_(Content_Delivery_Network)");
            arrayList.add(1, gen_yt_videourl("Bsq5cKkS33I"));
            arrayList.add(2, "0:04:36");
            arrayList.add(3, gen_channel_name("IBMTechnology"));
            arrayList.add(4, gen_channel_url("IBMTechnology"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1136");
            return arrayList;
        } else if (Objects.equals(name, "1137")) {
            arrayList.add(0, "web_security_knowledge_");
            arrayList.add(1, gen_yt_videourl("qjrkV4RjgIU"));
            arrayList.add(2, "0:56:25");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1137");
            return arrayList;
        } else if (Objects.equals(name, "1138")) {
            arrayList.add(0, "Design_and_Development_Principles");
            arrayList.add(1, gen_yt_videourl("XQzEo1qag4A"));
            arrayList.add(2, "0:14:37");
            arrayList.add(3, gen_channel_name("TechWithTim"));
            arrayList.add(4, gen_channel_url("TechWithTim"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1138");
            return arrayList;
        } else if (Objects.equals(name, "1139")) {
            arrayList.add(0, "Architectural_Patterns");
            arrayList.add(1, gen_yt_videourl("BrT3AO8bVQY"));
            arrayList.add(2, "0:11:00");
            arrayList.add(3, gen_channel_name("CodingTech"));
            arrayList.add(4, gen_channel_url("CodingTech"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1139");
            return arrayList;
        } else if (Objects.equals(name, "1140")) {
            arrayList.add(0, "Message_Brokers");
            arrayList.add(1, gen_yt_videourl("7rkeORD4jSw"));
            arrayList.add(2, "0:10:09");
            arrayList.add(3, gen_channel_name("IBMTechnology"));
            arrayList.add(4, gen_channel_url("IBMTechnology"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1140");
            return arrayList;
        } else if (Objects.equals(name, "1141")) {
            arrayList.add(0, "Containerization_vs._Virtualization");
            arrayList.add(1, gen_yt_videourl("eyNBf1sqdBQ"));
            arrayList.add(2, "0:08:57");
            arrayList.add(3, gen_channel_name("PowerCertAnimatedVideos"));
            arrayList.add(4, gen_channel_url("PowerCertAnimatedVideos"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1141");
            return arrayList;
        } else if (Objects.equals(name, "1142")) {
            arrayList.add(0, "Web_sockets");
            arrayList.add(1, gen_yt_videourl("8ARodQ4Wlf4"));
            arrayList.add(2, "0:29:26");
            arrayList.add(3, gen_channel_name("freecodecamp "));
            arrayList.add(4, gen_channel_url("freecodecamp "));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1142");
            return arrayList;
        } else if (Objects.equals(name, "1143")) {
            arrayList.add(0, "Server_Sent_Events");
            arrayList.add(1, gen_yt_videourl("KkI3yHjKjqs"));
            arrayList.add(2, "7:25");
            arrayList.add(3, gen_channel_name("codedamn"));
            arrayList.add(4, gen_channel_url("codedamn"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1143");
            return arrayList;
        } else if (Objects.equals(name, "1144")) {
            arrayList.add(0, "Nginx");
            arrayList.add(1, gen_yt_videourl("7VAI73roXaY"));
            arrayList.add(2, "0:50:52");
            arrayList.add(3, gen_channel_name("laithacademy"));
            arrayList.add(4, gen_channel_url("laithacademy"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1144");
            return arrayList;
        } else if (Objects.equals(name, "1145")) {
            arrayList.add(0, "Instrumentation,_Monitoring,_and_Telemetry");
            arrayList.add(1, gen_yt_videourl("r8UvWSX3KA8"));
            arrayList.add(2, "1:08:47");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1145");
            return arrayList;
        } else if (Objects.equals(name, "1146")) {
            arrayList.add(0, "Mitigation_Strategies");
            arrayList.add(1, gen_yt_videourl("PMe_uMtZvMI"));
            arrayList.add(2, "0:54:15");
            arrayList.add(3, gen_channel_name("Webagesolutionsinc"));
            arrayList.add(4, gen_channel_url("Webagesolutionsinc"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1146");
            return arrayList;
        } else if (Objects.equals(name, "1147")) {
            arrayList.add(0, "Kotlin");
            arrayList.add(1, gen_yt_videourl("EExSSotojVI"));
            arrayList.add(2, "13:18:15");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, p);
            arrayList.add(7, "1147");
            return arrayList;
        } else if (Objects.equals(name, "1148")) {
            arrayList.add(0, "Data Structures and Algorithms");
            arrayList.add(1, gen_yt_videourl("bo_LP6QOUio"));
            arrayList.add(2, "3:29:44");
            arrayList.add(3, gen_channel_name("freecodecamp"));
            arrayList.add(4, gen_channel_url("freecodecamp"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1148");
            return arrayList;
        } else if (Objects.equals(name, "1149")) {
            arrayList.add(0, "Gradle");
            arrayList.add(1, gen_yt_videourl("o0M4f5djJTQ"));
            arrayList.add(2, "24:13");
            arrayList.add(3, gen_channel_name("PhilippLackner"));
            arrayList.add(4, gen_channel_url("PhilippLackner"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1149");
            return arrayList;
        } else if (Objects.equals(name, "1151")) {
            arrayList.add(0, "Activity Lifecycle");
            arrayList.add(1, gen_yt_videourl("UJN3AL4tiqw"));
            arrayList.add(2, "08:30");
            arrayList.add(3, gen_channel_name("codinginflow"));
            arrayList.add(4, gen_channel_url("codinginflow"));
            arrayList.add(5, english);
            arrayList.add(6, "");
            arrayList.add(7, "1151");
            return arrayList;
        } else if (Objects.equals(name, "1152")) {
            arrayList.add(0, "fragments in Android Studio");
            arrayList.add(1, gen_yt_videourl("PiExmkR3aps"));
            arrayList.add(2, "24:27");
            arrayList.add(3, gen_channel_name("ZeeshanAcademy"));
            arrayList.add(4, gen_channel_url("ZeeshanAcademy"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1152");
            return arrayList;
        } else if (Objects.equals(name, "1153")) {
            arrayList.add(0, "Jetpack Compose");
            arrayList.add(1, gen_yt_videourl("6_wK_Ud8--0"));
            arrayList.add(2, "48:27");
            arrayList.add(3, gen_channel_name("PhilippLackner"));
            arrayList.add(4, gen_channel_url("PhilippLackner"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1153");
            return arrayList;
        } else if (Objects.equals(name, "1154")) {
            arrayList.add(0, "Resources & Qualifiers");
            arrayList.add(1, gen_yt_videourl("vj1ZdUfPlJM"));
            arrayList.add(2, "16:14");
            arrayList.add(3, gen_channel_name("PhilippLackner"));
            arrayList.add(4, gen_channel_url("PhilippLackner"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1154");
            return arrayList;
        } else if (Objects.equals(name, "1155")) {
            arrayList.add(0, "Publish an Android App");
            arrayList.add(1, gen_yt_videourl("5GHT4QtotE4"));
            arrayList.add(2, "14:39");
            arrayList.add(3, gen_channel_name("MJSDCoding"));
            arrayList.add(4, gen_channel_url("MJSDCoding"));
            arrayList.add(5, english);
            arrayList.add(6, cc);
            arrayList.add(7, "1155");
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
