
package com.example.androidtask.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestHeader {

    @SerializedName("appLanguage")
    @Expose
    private int appLanguage;
    @SerializedName("appversion")
    @Expose
    private String appversion;
    @SerializedName("countryId")
    @Expose
    private int countryId;
    @SerializedName("currencyId")
    @Expose
    private int currencyId;
    @SerializedName("deviceSerial")
    @Expose
    private String deviceSerial;
    @SerializedName("deviceType")
    @Expose
    private int deviceType;
    @SerializedName("ip")
    @Expose
    private String ip;
    @SerializedName("isWeb")
    @Expose
    private Boolean isWeb;
    @SerializedName("notificationToken")
    @Expose
    private String notificationToken;
    @SerializedName("osversion")
    @Expose
    private String osversion;
    @SerializedName("userId")
    @Expose
    private int userId;
    @SerializedName("userType")
    @Expose
    private int userType;

    public int getAppLanguage() {
        return appLanguage;
    }

    public void setAppLanguage(int appLanguage) {
        this.appLanguage = appLanguage;
    }

    public String getAppversion() {
        return appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Boolean getIsWeb() {
        return isWeb;
    }

    public void setIsWeb(Boolean isWeb) {
        this.isWeb = isWeb;
    }

    public String getNotificationToken() {
        return notificationToken;
    }

    public void setNotificationToken(String notificationToken) {
        this.notificationToken = notificationToken;
    }

    public String getOsversion() {
        return osversion;
    }

    public void setOsversion(String osversion) {
        this.osversion = osversion;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

}
