
package com.artmurka.artmurkaapp.data.model.pojo.itemlist.good;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EntryOthers {

    @SerializedName("other1")
    @Expose
    private String other1;
    @SerializedName("other2")
    @Expose
    private String other2;
    @SerializedName("other3")
    @Expose
    private String other3;

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2;
    }

    public String getOther3() {
        return other3;
    }

    public void setOther3(String other3) {
        this.other3 = other3;
    }

}