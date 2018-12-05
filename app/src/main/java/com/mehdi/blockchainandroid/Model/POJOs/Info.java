
package com.mehdi.blockchainandroid.Model.POJOs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("nconnected")
    @Expose
    private Integer nconnected;
    @SerializedName("conversion")
    @Expose
    private Double conversion;
    @SerializedName("symbol_local")
    @Expose
    private SymbolLocal symbolLocal;
    @SerializedName("symbol_btc")
    @Expose
    private SymbolBtc symbolBtc;
    @SerializedName("latest_block")
    @Expose
    private LatestBlock latestBlock;

    public Integer getNconnected() {
        return nconnected;
    }

    public void setNconnected(Integer nconnected) {
        this.nconnected = nconnected;
    }

    public Double getConversion() {
        return conversion;
    }

    public void setConversion(Double conversion) {
        this.conversion = conversion;
    }

    public SymbolLocal getSymbolLocal() {
        return symbolLocal;
    }

    public void setSymbolLocal(SymbolLocal symbolLocal) {
        this.symbolLocal = symbolLocal;
    }

    public SymbolBtc getSymbolBtc() {
        return symbolBtc;
    }

    public void setSymbolBtc(SymbolBtc symbolBtc) {
        this.symbolBtc = symbolBtc;
    }

    public LatestBlock getLatestBlock() {
        return latestBlock;
    }

    public void setLatestBlock(LatestBlock latestBlock) {
        this.latestBlock = latestBlock;
    }

}
