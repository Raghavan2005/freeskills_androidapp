/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 18/08/23, 12:22 am
 *    funwithmetamil@gmail.com
 *     Last modified 07/08/23, 10:57 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.videoplayer.topics;

public class topicdata {
    private String topicname;

    private String topictime;
    private String topictimeurl;


    public topicdata(String topicname, String topictime ,String topictimeurl) {
        this.topicname = topicname;
        this.topictime = topictime;
        this.topictimeurl=topictimeurl;
    }

    public String gettopicname() {
        return topicname;
    }


    public String gettopictime() {
        return topictime;
    }
    public String gettopictimeurl() {
        return topictimeurl;
    }

}
