package com.artmurka.artmurkaapp.domain.usecase.basket

import com.artmurka.artmurkaapp.data.model.modules.UcozApiModule
import com.artmurka.artmurkaapp.data.model.pojo.itemlist.itembasket.Basket
import com.artmurka.artmurkaapp.data.model.pojo.itemlist.itembasket.BasketItems
import com.artmurka.artmurkaapp.data.model.retrofit.ApiRetrofit
import com.artmurka.artmurkaapp.domain.usecase.base.AbsUseCaseObs
import io.reactivex.Observable
import java.util.HashMap
import javax.inject.Inject

class DeleteFromBasketUseCase @Inject constructor(val apiModule: ApiRetrofit, val ucoz: UcozApiModule) : AbsUseCaseObs<Basket, DeleteFromBasketUseCase.Params>() {

    override fun buildUseCaseObservable(params: Params): Observable<Basket> {
        val mapForUcozModule = HashMap<String, String>()
        mapForUcozModule["goodId"] = params.goodId
        val confForRequest = ucoz.get("DELETE", "uapi/shop/basket/", mapForUcozModule)

        return apiModule.deleteItemInBasket(confForRequest)
                .map { t: BasketItems -> t.success?.basket }

    }
    class Params(val goodId: String)
}