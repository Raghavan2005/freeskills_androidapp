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
        } else {
            arraylist.add("Not Found");
            return arraylist;
        }

    }

}
