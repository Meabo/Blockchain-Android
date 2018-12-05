
package com.mehdi.blockchainandroid.Model.POJOs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LatestBlock {

    @SerializedName("block_index")
    @Expose
    private Integer blockIndex;
    @SerializedName("hash")
    @Expose
    private String hash;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("time")
    @Expose
    private Integer time;

    public Integer getBlockIndex() {
        return blockIndex;
    }

    public void setBlockIndex(Integer blockIndex) {
        this.blockIndex = blockIndex;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

}
