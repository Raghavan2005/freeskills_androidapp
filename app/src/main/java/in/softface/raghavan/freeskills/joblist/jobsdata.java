/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 18/08/23, 12:22 am
 *    funwithmetamil@gmail.com
 *     Last modified 18/08/23, 12:10 am
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills.joblist;

public class jobsdata {

    private String jobName;
    private String jobDate;
    private String jobImage;

    public jobsdata(String jobName, String jobDate, String jobImage) {
        this.jobName = jobName;
        this.jobDate = jobDate;
        this.jobImage = jobImage;
    }

    public String getjobName() {
        return jobName;
    }

    public void setjobName(String jobName) {
        this.jobName = jobName;
    }

    public String getjobDate() {
        return jobDate;
    }

    public void setjobDate(String jobDate) {
        this.jobDate = jobDate;
    }

    public String getjobImage() {
        return jobImage;
    }

}