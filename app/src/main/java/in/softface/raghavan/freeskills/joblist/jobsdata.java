package in.softface.raghavan.freeskills.joblist;

public class jobsdata {

    private String jobName;
    private String jobDate;
    private Integer jobImage;

    public jobsdata(String jobName, String jobDate, Integer jobImage) {
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

    public Integer getjobImage() {
        return jobImage;
    }

    public void setjobImage(Integer jobImage) {
        this.jobImage = jobImage;
    }
}