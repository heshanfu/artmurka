
package com.artmurka.artmurkaapp.Model.Pojo.ItemList.WishList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EntryPriceVatEval {

    @SerializedName("price_raw")
    @Expose
    private Long priceRaw;
    @SerializedName("price")
    @Expose
    private String price;

    public Long getPriceRaw() {
        return priceRaw;
    }

    public void setPriceRaw(Long priceRaw) {
        this.priceRaw = priceRaw;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
