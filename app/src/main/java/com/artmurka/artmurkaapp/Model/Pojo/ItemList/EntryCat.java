
package com.artmurka.artmurkaapp.Model.Pojo.ItemList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EntryCat {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("pid")
    @Expose
    private String pid;
    @SerializedName("purl")
    @Expose
    private Object purl;
    @SerializedName("pname")
    @Expose
    private String pname;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("id")
    @Expose
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Object getPurl() {
        return purl;
    }

    public void setPurl(Object purl) {
        this.purl = purl;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
