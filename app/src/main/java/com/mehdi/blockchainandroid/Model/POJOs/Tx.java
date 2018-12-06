
package com.mehdi.blockchainandroid.Model.POJOs;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tx {

    @SerializedName("hash")
    @Expose
    private String hash;
    @SerializedName("ver")
    @Expose
    private Integer ver;
    @SerializedName("vin_sz")
    @Expose
    private Integer vinSz;
    @SerializedName("vout_sz")
    @Expose
    private Integer voutSz;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("weight")
    @Expose
    private Integer weight;
    @SerializedName("fee")
    @Expose
    private Integer fee;
    @SerializedName("relayed_by")
    @Expose
    private String relayedBy;
    @SerializedName("lock_time")
    @Expose
    private Integer lockTime;
    @SerializedName("tx_index")
    @Expose
    private Integer txIndex;
    @SerializedName("double_spend")
    @Expose
    private Boolean doubleSpend;
    @SerializedName("result")
    @Expose
    private Integer result;
    @SerializedName("balance")
    @Expose
    private Integer balance;
    @SerializedName("time")
    @Expose
    private double time;
    @SerializedName("block_height")
    @Expose
    private Integer blockHeight;
    @SerializedName("inputs")
    @Expose
    private List<Input> inputs = null;
    @SerializedName("out")
    @Expose
    private List<Out> out = null;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Integer getVer() {
        return ver;
    }

    public void setVer(Integer ver) {
        this.ver = ver;
    }

    public Integer getVinSz() {
        return vinSz;
    }

    public void setVinSz(Integer vinSz) {
        this.vinSz = vinSz;
    }

    public Integer getVoutSz() {
        return voutSz;
    }

    public void setVoutSz(Integer voutSz) {
        this.voutSz = voutSz;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public String getRelayedBy() {
        return relayedBy;
    }

    public void setRelayedBy(String relayedBy) {
        this.relayedBy = relayedBy;
    }

    public Integer getLockTime() {
        return lockTime;
    }

    public void setLockTime(Integer lockTime) {
        this.lockTime = lockTime;
    }

    public Integer getTxIndex() {
        return txIndex;
    }

    public void setTxIndex(Integer txIndex) {
        this.txIndex = txIndex;
    }

    public Boolean getDoubleSpend() {
        return doubleSpend;
    }

    public void setDoubleSpend(Boolean doubleSpend) {
        this.doubleSpend = doubleSpend;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Integer getBlockHeight() {
        return blockHeight;
    }

    public void setBlockHeight(Integer blockHeight) {
        this.blockHeight = blockHeight;
    }

    public List<Input> getInputs() {
        return inputs;
    }

    public void setInputs(List<Input> inputs) {
        this.inputs = inputs;
    }

    public List<Out> getOut() {
        return out;
    }

    public void setOut(List<Out> out) {
        this.out = out;
    }

}
