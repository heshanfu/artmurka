package com.artmurka.artmurkaapp.Model.Modules;

import com.artmurka.artmurkaapp.Model.InterfacesModel.IAboutGoods;
import com.artmurka.artmurkaapp.Model.Pojo.ItemList.AboutGoods.AboutGood;
import com.artmurka.artmurkaapp.Model.Pojo.ItemList.SuccessExample;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;

public class AboutGoodsRequest implements IAboutGoods {

    @Override
    public Call<AboutGood> getDataAboutGood(String id) {
        UcozApiModule ucoz = new UcozApiModule();

        HashMap<String, String> mapForUcozModule = new HashMap<String, String>();
        mapForUcozModule.put("page", "viewgoods");
        mapForUcozModule.put("method", "GET");
        mapForUcozModule.put("url", "uapi/shop/request");
        mapForUcozModule.put("id", id);

        //Getting all token for autorization.
        HashMap<String, String> confForRequest = ucoz.get(mapForUcozModule);
        confForRequest.put("page", mapForUcozModule.get("page"));

        return ApiModule.getClient().getGoodDescription(confForRequest);
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread());
    }

    @Override
    public Observable<SuccessExample> getItemList(String page, String pageNumber) {
        UcozApiModule ucoz = new UcozApiModule();

        HashMap<String, String> mapForUcozModule = new HashMap<String, String>();
        mapForUcozModule.put("cat_uri", page);
        mapForUcozModule.put("method", "GET");
        mapForUcozModule.put("url", "uapi/shop/cat");
        mapForUcozModule.put("pnum", pageNumber);

        HashMap<String, String> confForRequest = ucoz.get(mapForUcozModule);
        confForRequest.put("cat_uri", page);

        return ApiModule.getClient().getItemList(confForRequest)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }
}