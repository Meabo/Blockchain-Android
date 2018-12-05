
package com.mehdi.blockchainandroid.Model.POJOs;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Transaction {

    @SerializedName("recommend_include_fee")
    @Expose
    private Boolean recommendIncludeFee;
    @SerializedName("info")
    @Expose
    private Info info;
    @SerializedName("wallet")
    @Expose
    private Wallet wallet;
    @SerializedName("addresses")
    @Expose
    private List<Address> addresses = null;
    @SerializedName("txs")
    @Expose
    private List<Tx> txs = null;

    public Boolean getRecommendIncludeFee() {
        return recommendIncludeFee;
    }

    public void setRecommendIncludeFee(Boolean recommendIncludeFee) {
        this.recommendIncludeFee = recommendIncludeFee;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Tx> getTxs() {
        return txs;
    }

    public void setTxs(List<Tx> txs) {
        this.txs = txs;
    }

}
