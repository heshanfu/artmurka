
package com.artmurka.artmurkaapp.Model.Pojo.ItemList.Orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class _1 {

    @SerializedName("dig")
    @Expose
    private Long dig;
    @SerializedName("expand")
    @Expose
    private Long expand;
    @SerializedName("pos")
    @Expose
    private Long pos;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("required")
    @Expose
    private Long required;

    public Long getDig() {
        return dig;
    }

    public void setDig(Long dig) {
        this.dig = dig;
    }

    public Long getExpand() {
        return expand;
    }

    public void setExpand(Long expand) {
        this.expand = expand;
    }

    public Long getPos() {
        return pos;
    }

    public void setPos(Long pos) {
        this.pos = pos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getRequired() {
        return required;
    }

    public void setRequired(Long required) {
        this.required = required;
    }

}
