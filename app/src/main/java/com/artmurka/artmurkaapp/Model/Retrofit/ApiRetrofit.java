package com.artmurka.artmurkaapp.Model.Retrofit;


import com.artmurka.artmurkaapp.Model.FormOrder.AdrAndEmail;
import com.artmurka.artmurkaapp.Model.FormOrder.FormOrder;
import com.artmurka.artmurkaapp.Model.Pojo.ItemList.*;
import com.artmurka.artmurkaapp.Model.Pojo.ItemList.AboutGoods.AboutGood;
import com.artmurka.artmurkaapp.Model.Pojo.ItemList.Checkout.CheckoutAllGoods;
import com.artmurka.artmurkaapp.Model.Pojo.ItemList.ItemBasket.BasketItems;
import com.artmurka.artmurkaapp.Model.Pojo.ItemList.Orders.Orders;
import com.artmurka.artmurkaapp.Model.Retrofit.Success;

import com.artmurka.artmurkaapp.Model.Pojo.ItemList.WishList.WishList;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.QueryMap;

public interface ApiRetrofit {

    @GET("uapi/shop/request")
    Observable<Example> getShopCategories(@QueryMap HashMap<String, String> map);

    //oauth_signature oauth_signature_method oauth_version oauth_consumer_key oauth_token oauth_nonce oauth_timestamp page
    @GET("uapi/shop/cat")
    Observable<SuccessExample> getItemList(@QueryMap HashMap<String, String> map);

    //add to item to BASKET
    @FormUrlEncoded
    @POST("uapi/shop/basket")
    Observable<BasketItems> addToBasket(@FieldMap HashMap<String, String> map);

    @GET("uapi/shop/basket/")
    Observable<BasketItems> getGoodsInBasket(@QueryMap HashMap<String, String> map);

    @DELETE("uapi/shop/basket/")
    Call<BasketItems> deleteItemInBasket(@QueryMap HashMap<String, String> map);

    @GET("uapi/shop/request")
    Call<AboutGood> getGoodDescription(@QueryMap HashMap<String, String> map);

    //add to item to BASKET
    @FormUrlEncoded
    @POST("uapi/shop/wishlisth")
    Call<WishList> addToWishList(@FieldMap HashMap<String, String> map);

    @GET("uapi/shop/request")
    Call<WishList> getWishList(@QueryMap HashMap<String, String> map);

    @GET("uapi/shop/checkout/")
    Call<CheckoutAllGoods> getCheckout(@QueryMap HashMap<String, String> param);

    @FormUrlEncoded
    @PUT("uapi/shop/checkout/")
    Call<CheckoutAllGoods> recountCheckoutData(@FieldMap HashMap<String, String> param);

    @GET("uapi/shop/invoices/")
    Call<Orders> getInvoises(@QueryMap HashMap<String, String> param);

  //  @Headers("Content-Type: application/json")
    @Multipart
    @POST("uapi/shop/checkout/")
    Call<Success> postCheckout(@PartMap HashMap<String, RequestBody> map, @Part("fld2") RequestBody fld2, @Part("fld3") RequestBody fld3);
}
