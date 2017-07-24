
package com.artmurka.artmurkaapp.Model.Pojo.ItemList.Checkout;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderTopay {

    @SerializedName("topay")
    @Expose
    private String topay;
    @SerializedName("topay_curr")
    @Expose
    private String topayCurr;
    @SerializedName("topay_raw")
    @Expose
    private Long topayRaw;

    public String getTopay() {
        return topay;
    }

    public void setTopay(String topay) {
        this.topay = topay;
    }

    public String getTopayCurr() {
        return topayCurr;
    }

    public void setTopayCurr(String topayCurr) {
        this.topayCurr = topayCurr;
    }

    public Long getTopayRaw() {
        return topayRaw;
    }

    public void setTopayRaw(Long topayRaw) {
        this.topayRaw = topayRaw;
    }

}