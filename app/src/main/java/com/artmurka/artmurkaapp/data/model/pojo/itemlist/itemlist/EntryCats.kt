package com.artmurka.artmurkaapp.data.model.pojo.itemlist.itemlist

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class EntryCats {

    @SerializedName("cats")
    @Expose
    var cats: List<Cat>? = null
    @SerializedName("num_cats")
    @Expose
    var numCats: Int = 0

}
