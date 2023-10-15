/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 18/08/23, 12:22 am
 *    funwithmetamil@gmail.com
 *     Last modified 15/08/23, 8:58 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.dateset;

import java.util.ArrayList;
import java.util.Objects;

public class jobromdata {
    ArrayList<String> arraylist;


    public jobromdata() {
        arraylist = new ArrayList<>();
    }

    public ArrayList<String> data(String job) {
        if (Objects.equals(job, "Frontend Developer")) {
            arraylist.add("1101");
            arraylist.add("1102");
            arraylist.add("1103");
            arraylist.add("1104");
            arraylist.add("1105");
            arraylist.add("1106");
            arraylist.add("1107");
            arraylist.add("1108");
            arraylist.add("1109");
            arraylist.add("1110");
            arraylist.add("1111");
            arraylist.add("1112");
            arraylist.add("1113");
            arraylist.add("1114");
            arraylist.add("1115");
            arraylist.add("1116");
            arraylist.add("1117");
            arraylist.add("1118");
            return arraylist;
        } else if (Objects.equals(job, "Backend Developer")) {
            arraylist.add("1101");
            arraylist.add("1120");
            arraylist.add("1105");
            arraylist.add("1122");
            arraylist.add("1123");
            arraylist.add("1124");
            arraylist.add("1125");
            arraylist.add("1126");
            arraylist.add("1127");
            arraylist.add("1128");
            arraylist.add("1129");
            arraylist.add("1130");
            arraylist.add("1131");
            arraylist.add("1132");
            arraylist.add("1133");
            arraylist.add("1134");
            arraylist.add("1135");
            arraylist.add("1136");
            arraylist.add("1137");
            arraylist.add("1138");
            arraylist.add("1139");
            arraylist.add("1140");
            arraylist.add("1141");
            arraylist.add("1142");
            arraylist.add("1143");
            arraylist.add("1144");
            arraylist.add("1145");
            arraylist.add("1146");

            return arraylist;
        } else if (Objects.equals(job, "Android Developer")) {
            arraylist.add("1147");
            arraylist.add("1148");
            arraylist.add("1149");
            arraylist.add("1105");
            arraylist.add("1151");
            arraylist.add("1152");
            arraylist.add("1153");
            arraylist.add("1154");
            arraylist.add("1155");


            return arraylist;
        } else if (Objects.equals(job, "Full Stack Developer")) {
            arraylist.add("1102");
            arraylist.add("1103");
            arraylist.add("1104");
            arraylist.add("1106");
            arraylist.add("1105");
            arraylist.add("1111");
            arraylist.add("1110");
            arraylist.add("1156");
            arraylist.add("1124");
            arraylist.add("1133");
            arraylist.add("1157");
            arraylist.add("1129");
            arraylist.add("1122");
            arraylist.add("1158");
            arraylist.add("1159");
            arraylist.add("1160");
            arraylist.add("1161");
            return arraylist;
        } else if (Objects.equals(job,"Data Entry")) {
            arraylist.add("1162");
            arraylist.add("1163");
            arraylist.add("1164");
            arraylist.add("1165");
            arraylist.add("1166");
            arraylist.add("1167");
            arraylist.add("1168");
            arraylist.add("1169");
            arraylist.add("1170");
            arraylist.add("1171");
            return arraylist;
        }
        else {
            arraylist.add("Not Found");
            return arraylist;
        }

    }

}
