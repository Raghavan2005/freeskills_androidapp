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

    public carddata[] Recommended = new carddata[]{
            new carddata("", gen_yt_imgurl(""), frameworkstype),

    };
    public carddata[] language = new carddata[]{
            new carddata("", gen_yt_imgurl(""), frameworkstype),

    };
    public carddata[] programming = new carddata[]{
            new carddata("JavaScript", gen_yt_imgurl("PkZNo7MFNFg"), programmingtype),
            new carddata("CSS", gen_yt_imgurl("OXGznpKZ_sA"), programmingtype),
            new carddata("HTML", gen_yt_imgurl("kUMe1FH4CHE"), programmingtype),
    };
    public carddata[] frameworks = new carddata[]{
            new carddata("Mobile Applications React Native", gen_yt_imgurl("obH0Po_RdWk"), frameworkstype),
            new carddata("Desktop Applications Electron", gen_yt_imgurl("ML743nrkMHw"), frameworkstype),
            new carddata("Static Site Generators Astro", gen_yt_imgurl("zrPVTf761OI"), frameworkstype),
            new carddata("Server Side Rendering SSR in React", gen_yt_imgurl("NwyQONeqRXA"), frameworkstype),
            new carddata("Tailwind CSS", gen_yt_imgurl("ft30zcMlFao"), frameworkstype),
            new carddata("React", gen_yt_imgurl("bMknfKXIFA8"), frameworkstype),
            new carddata("CSS Preprocessors", gen_yt_imgurl("_a5j7KoflTs"), frameworkstype),
    };
    public carddata[] CrashCourse = new carddata[]{
            new carddata("Git", gen_yt_imgurl("Uszj_k0DGsg"), crashcoursetype),
            new carddata("Authentication Strategies", gen_yt_imgurl("F-sFp_AvHc8"), crashcoursetype),
            new carddata("Jest", gen_yt_imgurl("ML5egqL3YFE"), crashcoursetype),
            new carddata("Module Bundlers", gen_yt_imgurl("5IG4UmULyoA"), crashcoursetype),
            new carddata("CSS Architechture", gen_yt_imgurl("MNPdifWAAa4"), crashcoursetype),
            new carddata("Package Managers", gen_yt_imgurl("P3aKRdUyr0s"), crashcoursetype),
            new carddata("Version Control System", gen_yt_imgurl("RGOj5yH7evk"), crashcoursetype),
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
