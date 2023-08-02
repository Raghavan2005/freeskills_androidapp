/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 12/07/23, 9:29 pm
 *    funwithmetamil@gmail.com
 *     Last modified 11/07/23, 10:59 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.dateset;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Contract;

import in.softface.raghavan.freeskills.eachcardview.carddata;

public class cardviewdata {
    /*    public carddata[]  Continue = new carddata[]{
                new carddata("Frontend_",gen_yt_imgurl("ET8mqVGDQ1s"),"asdas");
                new carddata("Internet",gen_yt_imgurl("ET8mqVGDQ1s")),
                new carddata("Internet","https://img.youtube.com/vi/bMknfKXIFA8/maxresdefault.jpg"),
                new carddata("Internet",gen_yt_imgurl("ET8mqVGDQ1s")),
                new carddata("Internet","https://img.youtube.com/vi/bMknfKXIFA8/maxresdefault.jpg"),
                new carddata("Internet",gen_yt_imgurl("ET8mqVGDQ1s")),
                new carddata("Internet","https://img.youtube.com/vi/bMknfKXIFA8/maxresdefault.jpg"),*/
    //  };
    String crashcoursetype = "CrashCourse";
    String programmingtype = "programming";
    String frameworkstype = "frameworks";

    public carddata[] language = new carddata[]{
            new carddata("0000", gen_yt_imgurl(""), frameworkstype),

    };
    public carddata[] programming = new carddata[]{
            new carddata("1104", gen_yt_imgurl("PkZNo7MFNFg"), programmingtype),
            new carddata("1103", gen_yt_imgurl("OXGznpKZ_sA"), programmingtype),
            new carddata("1102", gen_yt_imgurl("kUMe1FH4CHE"), programmingtype),
            new carddata("1120", gen_yt_imgurl("sxTmJE4k0ho"), programmingtype),
    };
    public carddata[] frameworks = new carddata[]{
            new carddata("1117", gen_yt_imgurl("obH0Po_RdWk"), frameworkstype),
            new carddata("1115", gen_yt_imgurl("ML743nrkMHw"), frameworkstype),
            new carddata("1114", gen_yt_imgurl("zrPVTf761OI"), frameworkstype),
            new carddata("1113", gen_yt_imgurl("NwyQONeqRXA"), frameworkstype),
            new carddata("1111", gen_yt_imgurl("ft30zcMlFao"), frameworkstype),
            new carddata("1110", gen_yt_imgurl("bMknfKXIFA8"), frameworkstype),
            new carddata("1108", gen_yt_imgurl("_a5j7KoflTs"), frameworkstype),
            new carddata("1133", gen_yt_imgurl("lsMQRaeKNDk"), frameworkstype),
            new carddata("1134", gen_yt_imgurl("uxf0--uiX0I"), frameworkstype),
    };
    public carddata[] CrashCourse = new carddata[]{
            new carddata("1118", gen_yt_imgurl("Uszj_k0DGsg"), crashcoursetype),
            new carddata("1116", gen_yt_imgurl("F-sFp_AvHc8"), crashcoursetype),
            new carddata("1112", gen_yt_imgurl("ML5egqL3YFE"), crashcoursetype),
            new carddata("1109", gen_yt_imgurl("5IG4UmULyoA"), crashcoursetype),
            new carddata("1107", gen_yt_imgurl("MNPdifWAAa4"), crashcoursetype),
            new carddata("1106", gen_yt_imgurl("P3aKRdUyr0s"), crashcoursetype),
            new carddata("1105", gen_yt_imgurl("RGOj5yH7evk"), crashcoursetype),
            new carddata("1101", gen_yt_imgurl("zN8YNNHcaZc"), crashcoursetype),
            new carddata("1122", gen_yt_imgurl("ZtqBQ68cfJc"), crashcoursetype),
            new carddata("1123", gen_yt_imgurl("U0GbJtnfqSM"), crashcoursetype),
            new carddata("1124", gen_yt_imgurl("qw--VYLpxG4"), crashcoursetype),
            new carddata("1125", gen_yt_imgurl("c2M-rlkkT5o"), crashcoursetype),
            new carddata("1126", gen_yt_imgurl("Vq4cDIdz_M8"), crashcoursetype),
            new carddata("1127", gen_yt_imgurl("fgdpvwEWJ9M"), crashcoursetype),
            new carddata("1128", gen_yt_imgurl("J-cSy5MeMOA"), crashcoursetype),
            new carddata("1129", gen_yt_imgurl("XCsS_NVAa1g"), crashcoursetype),
            new carddata("1130", gen_yt_imgurl("jb2AvF8XzII"), crashcoursetype),
            new carddata("1131", gen_yt_imgurl("dkhOZOmV7Fo"), crashcoursetype),
            new carddata("1132", gen_yt_imgurl("rhi1eIjSbvk"), crashcoursetype),
            new carddata("1135", gen_yt_imgurl("iAnttA0O1Xg"), crashcoursetype),
            new carddata("1136", gen_yt_imgurl("Bsq5cKkS33I"), crashcoursetype),
            new carddata("1137", gen_yt_imgurl("qjrkV4RjgIU"), crashcoursetype),
            new carddata("1138", gen_yt_imgurl("XQzEo1qag4A"), crashcoursetype),
            new carddata("1139", gen_yt_imgurl("BrT3AO8bVQY"), crashcoursetype),
            new carddata("1140", gen_yt_imgurl("7rkeORD4jSw"), crashcoursetype),
            new carddata("1141", gen_yt_imgurl("eyNBf1sqdBQ"), crashcoursetype),
            new carddata("1142", gen_yt_imgurl("8ARodQ4Wlf4"), crashcoursetype),
            new carddata("1143", gen_yt_imgurl("4HlNv1qpZFY"), crashcoursetype),
            new carddata("1144", gen_yt_imgurl("7VAI73roXaY"), crashcoursetype),
            new carddata("1145", gen_yt_imgurl("r8UvWSX3KA8"), crashcoursetype),
            new carddata("1146", gen_yt_imgurl("PMe_uMtZvMI"), crashcoursetype),


    };

    @NonNull
    @Contract(pure = true)
    private String gen_yt_imgurl(String videoid) {
        String imageurl = "https://img.youtube.com/vi/";
        String imageres = "/maxresdefault.jpg";
        return imageurl + videoid + imageres;
    }

}
