
package com.mehdi.blockchainandroid.Model.POJOs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Xpub {

    @SerializedName("m")
    @Expose
    private String m;
    @SerializedName("path")
    @Expose
    private String path;

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
