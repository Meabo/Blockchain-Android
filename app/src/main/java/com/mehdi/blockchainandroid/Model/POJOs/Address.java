
package com.mehdi.blockchainandroid.Model.POJOs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("n_tx")
    @Expose
    private Integer nTx;
    @SerializedName("total_received")
    @Expose
    private Integer totalReceived;
    @SerializedName("total_sent")
    @Expose
    private Integer totalSent;
    @SerializedName("final_balance")
    @Expose
    private Integer finalBalance;
    @SerializedName("gap_limit")
    @Expose
    private Integer gapLimit;
    @SerializedName("change_index")
    @Expose
    private Integer changeIndex;
    @SerializedName("account_index")
    @Expose
    private Integer accountIndex;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNTx() {
        return nTx;
    }

    public void setNTx(Integer nTx) {
        this.nTx = nTx;
    }

    public Integer getTotalReceived() {
        return totalReceived;
    }

    public void setTotalReceived(Integer totalReceived) {
        this.totalReceived = totalReceived;
    }

    public Integer getTotalSent() {
        return totalSent;
    }

    public void setTotalSent(Integer totalSent) {
        this.totalSent = totalSent;
    }

    public Integer getFinalBalance() {
        return finalBalance;
    }

    public void setFinalBalance(Integer finalBalance) {
        this.finalBalance = finalBalance;
    }

    public Integer getGapLimit() {
        return gapLimit;
    }

    public void setGapLimit(Integer gapLimit) {
        this.gapLimit = gapLimit;
    }

    public Integer getChangeIndex() {
        return changeIndex;
    }

    public void setChangeIndex(Integer changeIndex) {
        this.changeIndex = changeIndex;
    }

    public Integer getAccountIndex() {
        return accountIndex;
    }

    public void setAccountIndex(Integer accountIndex) {
        this.accountIndex = accountIndex;
    }

}
