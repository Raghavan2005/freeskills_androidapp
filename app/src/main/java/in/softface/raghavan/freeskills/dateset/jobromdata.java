/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 29/07/23, 1:40 pm
 *    funwithmetamil@gmail.com
 *     Last modified 29/07/23, 1:40 pm
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
        } else {
            arraylist.add("Not Found");
            return arraylist;
        }

    }

}
