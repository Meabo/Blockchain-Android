
package com.mehdi.blockchainandroid.Model.POJOs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SymbolBtc {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("symbol")
    @Expose
    private String symbol;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("conversion")
    @Expose
    private Double conversion;
    @SerializedName("symbolAppearsAfter")
    @Expose
    private Boolean symbolAppearsAfter;
    @SerializedName("local")
    @Expose
    private Boolean local;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getConversion() {
        return conversion;
    }

    public void setConversion(Double conversion) {
        this.conversion = conversion;
    }

    public Boolean getSymbolAppearsAfter() {
        return symbolAppearsAfter;
    }

    public void setSymbolAppearsAfter(Boolean symbolAppearsAfter) {
        this.symbolAppearsAfter = symbolAppearsAfter;
    }

    public Boolean getLocal() {
        return local;
    }

    public void setLocal(Boolean local) {
        this.local = local;
    }

}
