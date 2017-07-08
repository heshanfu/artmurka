
package com.artmurka.artmurkaapp.Model.Pojo.ItemList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EntryRating {

    @SerializedName("rating_num_float")
    @Expose
    private int ratingNumFloat;
    @SerializedName("rating_num")
    @Expose
    private String ratingNum;
    @SerializedName("rated")
    @Expose
    private String rated;
    @SerializedName("rating")
    @Expose
    private String rating;

    public int getRatingNumFloat() {
        return ratingNumFloat;
    }

    public void setRatingNumFloat(int ratingNumFloat) {
        this.ratingNumFloat = ratingNumFloat;
    }

    public String getRatingNum() {
        return ratingNum;
    }

    public void setRatingNum(String ratingNum) {
        this.ratingNum = ratingNum;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}
