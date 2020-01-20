package com.example.androidtask.model;

import com.google.gson.annotations.SerializedName;

public class data {
    @SerializedName("createdDate")
    private static String createdDate;
    @SerializedName("jobTitle")
    private String jobTitle;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @SerializedName("companyLogo")
    private String companyLogo;

    public static String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }



    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }
}
