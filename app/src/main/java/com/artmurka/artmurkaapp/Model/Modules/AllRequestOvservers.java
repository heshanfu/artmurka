package com.artmurka.artmurkaapp.Model.Modules;

import com.artmurka.artmurkaapp.BuildConfig;
import com.artmurka.artmurkaapp.Model.InterfacesModel.IAllRequestObservers;
import com.artmurka.artmurkaapp.Model.Pojo.ItemList.Categories.Example;
import com.artmurka.artmurkaapp.Model.Pojo.ItemList.Categories.Success;
import com.artmurka.artmurkaapp.Model.Pojo.ItemList.Categories.SuccessDeserelised;
import com.artmurka.artmurkaapp.Model.Retrofit.ApiRetrofit;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class AllRequestOvservers implements IAllRequestObservers {

    @Override
    public Observable<Example> getCategories() {
        UcozApiModule ucoz = new UcozApiModule();
        HashMap<String, String> mapForUcozModule = new HashMap<String, String>();
        mapForUcozModule.put("page", "categories");
        HashMap<String, String> confForRequest = ucoz.get("GET","uapi/shop/request", mapForUcozModule);
        Gson gson = new GsonBuilder().registerTypeAdapter(Success.class, new SuccessDeserelised()).create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        ApiRetrofit apiRetrofit = retrofit.create(ApiRetrofit.class);

        return apiRetrofit.getShopCategories(confForRequest)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
