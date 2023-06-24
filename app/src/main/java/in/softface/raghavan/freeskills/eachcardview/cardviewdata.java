/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 6/18/23, 4:19 PM
 *    funwithmetamil@gmail.com
 *     Last modified 6/18/23, 4:19 PM
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.eachcardview;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Contract;

public class cardviewdata {
    /*    public carddata[]  Continue = new carddata[]{
                new carddata("Frontend_",gen_yt_imgurl("ugjsOJLH52o"),"asdas");
                new carddata("Internet",gen_yt_imgurl("ugjsOJLH52o")),
                new carddata("Internet","https://img.youtube.com/vi/bMknfKXIFA8/maxresdefault.jpg"),
                new carddata("Internet",gen_yt_imgurl("ugjsOJLH52o")),
                new carddata("Internet","https://img.youtube.com/vi/bMknfKXIFA8/maxresdefault.jpg"),
                new carddata("Internet",gen_yt_imgurl("ugjsOJLH52o")),
                new carddata("Internet","https://img.youtube.com/vi/bMknfKXIFA8/maxresdefault.jpg"),*/
    //  };
    String crashcoursetype = "CrashCourse";
    String programmingtype = "programming";
    String frameworkstype = "frameworks";

    public carddata[] Recommended = new carddata[]{
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
    };
    public carddata[] language = new carddata[]{
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
    };
    public carddata[] inyourlanguage = new carddata[]{
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
    };
    public carddata[] programming = new carddata[]{
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),programmingtype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),programmingtype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),programmingtype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),programmingtype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),programmingtype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),programmingtype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),programmingtype),
    };
    public carddata[] frameworks = new carddata[]{
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),frameworkstype),
    };
    public carddata[] CrashCourse = new carddata[]{
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"), crashcoursetype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),crashcoursetype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),crashcoursetype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),crashcoursetype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),crashcoursetype),
            new carddata("Internet", gen_yt_imgurl("ugjsOJLH52o"),crashcoursetype),
            new carddata("Internet", gen_yt_imgurl("zN8YNNHcaZc"), crashcoursetype),
    };

    @NonNull
    @Contract(pure = true)
    private String gen_yt_imgurl(String videoid) {
        String imageurl = "https://img.youtube.com/vi/";
        String imageres = "/maxresdefault.jpg";
        return imageurl + videoid + imageres;
    }

}
