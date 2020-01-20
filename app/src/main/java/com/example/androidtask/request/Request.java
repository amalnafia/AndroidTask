
package com.example.androidtask.request;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("jobVacancyCarrerLevels")
    @Expose
    private List<Object> jobVacancyCarrerLevels = null;
    @SerializedName("employeerId")
    @Expose
    private int employeerId;
    @SerializedName("employmentTypeId")
    @Expose
    private int employmentTypeId;
    @SerializedName("requestHeader")
    @Expose
    private RequestHeader requestHeader;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("jobVacancyIndustry")
    @Expose
    private List<Object> jobVacancyIndustry = null;
    @SerializedName("keyword")
    @Expose
    private String keyword;
    @SerializedName("jobVacancyLocation")
    @Expose
    private List<Object> jobVacancyLocation = null;
    @SerializedName("pageSource")
    @Expose
    private int pageSource;
    @SerializedName("paging")
    @Expose
    private int paging;
    @SerializedName("jobVacancyPreferredDegree")
    @Expose
    private List<Object> jobVacancyPreferredDegree = null;
    @SerializedName("jobVacancyPreferredLanguage")
    @Expose
    private List<Object> jobVacancyPreferredLanguage = null;
    @SerializedName("jobVacancyPreferredNatinality")
    @Expose
    private List<Object> jobVacancyPreferredNatinality = null;
    @SerializedName("salaryFrom")
    @Expose
    private int salaryFrom;
    @SerializedName("salaryTo")
    @Expose
    private int salaryTo;
    @SerializedName("jobVacancySkills")
    @Expose
    private List<Object> jobVacancySkills = null;
    @SerializedName("yearExperienceFrom")
    @Expose
    private int yearExperienceFrom;
    @SerializedName("yearExperienceTo")
    @Expose
    private int yearExperienceTo;

    public List<Object> getJobVacancyCarrerLevels() {
        return jobVacancyCarrerLevels;
    }

    public void setJobVacancyCarrerLevels(List<Object> jobVacancyCarrerLevels) {
        this.jobVacancyCarrerLevels = jobVacancyCarrerLevels;
    }

    public int getEmployeerId() {
        return employeerId;
    }

    public void setEmployeerId(int employeerId) {
        this.employeerId = employeerId;
    }

    public int getEmploymentTypeId() {
        return employmentTypeId;
    }

    public void setEmploymentTypeId(int employmentTypeId) {
        this.employmentTypeId = employmentTypeId;
    }

    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Object> getJobVacancyIndustry() {
        return jobVacancyIndustry;
    }

    public void setJobVacancyIndustry(List<Object> jobVacancyIndustry) {
        this.jobVacancyIndustry = jobVacancyIndustry;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public List<Object> getJobVacancyLocation() {
        return jobVacancyLocation;
    }

    public void setJobVacancyLocation(List<Object> jobVacancyLocation) {
        this.jobVacancyLocation = jobVacancyLocation;
    }

    public int getPageSource() {
        return pageSource;
    }

    public void setPageSource(int pageSource) {
        this.pageSource = pageSource;
    }

    public int getPaging() {
        return paging;
    }

    public void setPaging(int paging) {
        this.paging = paging;
    }

    public List<Object> getJobVacancyPreferredDegree() {
        return jobVacancyPreferredDegree;
    }

    public void setJobVacancyPreferredDegree(List<Object> jobVacancyPreferredDegree) {
        this.jobVacancyPreferredDegree = jobVacancyPreferredDegree;
    }

    public List<Object> getJobVacancyPreferredLanguage() {
        return jobVacancyPreferredLanguage;
    }

    public void setJobVacancyPreferredLanguage(List<Object> jobVacancyPreferredLanguage) {
        this.jobVacancyPreferredLanguage = jobVacancyPreferredLanguage;
    }

    public List<Object> getJobVacancyPreferredNatinality() {
        return jobVacancyPreferredNatinality;
    }

    public void setJobVacancyPreferredNatinality(List<Object> jobVacancyPreferredNatinality) {
        this.jobVacancyPreferredNatinality = jobVacancyPreferredNatinality;
    }

    public int getSalaryFrom() {
        return salaryFrom;
    }

    public void setSalaryFrom(int salaryFrom) {
        this.salaryFrom = salaryFrom;
    }

    public int getSalaryTo() {
        return salaryTo;
    }

    public void setSalaryTo(int salaryTo) {
        this.salaryTo = salaryTo;
    }

    public List<Object> getJobVacancySkills() {
        return jobVacancySkills;
    }

    public void setJobVacancySkills(List<Object> jobVacancySkills) {
        this.jobVacancySkills = jobVacancySkills;
    }

    public int getYearExperienceFrom() {
        return yearExperienceFrom;
    }

    public void setYearExperienceFrom(int yearExperienceFrom) {
        this.yearExperienceFrom = yearExperienceFrom;
    }

    public int getYearExperienceTo() {
        return yearExperienceTo;
    }

    public void setYearExperienceTo(int yearExperienceTo) {
        this.yearExperienceTo = yearExperienceTo;
    }

}
