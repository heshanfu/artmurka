
package com.artmurka.artmurkaapp.Model.Pojo.ItemList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class _1 {

    @SerializedName("small")
    @Expose
    private String small;
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("thumb")
    @Expose
    private String thumb;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

}