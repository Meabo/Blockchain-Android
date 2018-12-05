
package com.mehdi.blockchainandroid.Model.POJOs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Out {

    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("tx_index")
    @Expose
    private Integer txIndex;
    @SerializedName("n")
    @Expose
    private Integer n;
    @SerializedName("spent")
    @Expose
    private Boolean spent;
    @SerializedName("script")
    @Expose
    private String script;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("addr")
    @Expose
    private String addr;
    @SerializedName("xpub")
    @Expose
    private Xpub_ xpub;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getTxIndex() {
        return txIndex;
    }

    public void setTxIndex(Integer txIndex) {
        this.txIndex = txIndex;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public Boolean getSpent() {
        return spent;
    }

    public void setSpent(Boolean spent) {
        this.spent = spent;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Xpub_ getXpub() {
        return xpub;
    }

    public void setXpub(Xpub_ xpub) {
        this.xpub = xpub;
    }

}
