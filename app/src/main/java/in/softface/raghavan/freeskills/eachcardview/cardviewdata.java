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

    public carddata[] Recommended = new carddata[]{
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
    };
    public carddata[] language = new carddata[]{
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
    };
    public carddata[] inyourlanguage = new carddata[]{
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),frameworkstype),
    };
    public carddata[] programming = new carddata[]{
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),programmingtype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),programmingtype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),programmingtype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),programmingtype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),programmingtype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),programmingtype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),programmingtype),
    };
    public carddata[] frameworks = new carddata[]{
            new carddata("Interne1t", gen_yt_imgurl("ET8mqVGDQ1s"), frameworkstype),
            new carddata("Interne23t", gen_yt_imgurl("ET8mqVGDQ1s"), frameworkstype),
            new carddata("Intern23et", gen_yt_imgurl("ET8mqVGDQ1s"), frameworkstype),
            new carddata("Intern2et", gen_yt_imgurl("ET8mqVGDQ1s"), frameworkstype),
            new carddata("Inter34net", gen_yt_imgurl("ET8mqVGDQ1s"), frameworkstype),
            new carddata("Inter23net", gen_yt_imgurl("ET8mqVGDQ1s"), frameworkstype),
    };
    public carddata[] CrashCourse = new carddata[]{
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"), crashcoursetype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),crashcoursetype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),crashcoursetype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),crashcoursetype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),crashcoursetype),
            new carddata("Internet", gen_yt_imgurl("ET8mqVGDQ1s"),crashcoursetype),
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
