package com.polsec.pyrky.findlib;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InputParams {
    @SerializedName("cameraImageUrl")
    @Expose
    private String cameraImageUrl;
    @SerializedName("cameraLat")
    @Expose
    private String cameraLat;
    @SerializedName("cameraLong")
    @Expose
    private String cameraLong;
    @SerializedName("cameraID")
    @Expose
    private String cameraID;

    public InputParams(String cameraImageUrl, String cameraLat, String cameraLong, String cameraID) {
        this.cameraImageUrl = cameraImageUrl;
        this.cameraLat = cameraLat;
        this.cameraLong = cameraLong;
        this.cameraID = cameraID;
    }

    public String getCameraImageUrl() {
        return cameraImageUrl;
    }

    public void setCameraImageUrl(String cameraImageUrl) {
        this.cameraImageUrl = cameraImageUrl;
    }

    public String getCameraLat() {
        return cameraLat;
    }

    public void setCameraLat(String cameraLat) {
        this.cameraLat = cameraLat;
    }

    public String getCameraLong() {
        return cameraLong;
    }

    public void setCameraLong(String cameraLong) {
        this.cameraLong = cameraLong;
    }

    public String getCameraID() {
        return cameraID;
    }

    public void setCameraID(String cameraID) {
        this.cameraID = cameraID;
    }
}
