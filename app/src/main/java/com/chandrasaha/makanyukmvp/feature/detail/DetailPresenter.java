package com.chandrasaha.makanyukmvp.feature.detail;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

import com.chandrasaha.makanyukmvp.base.ui.BasePresenter;
import com.chandrasaha.makanyukmvp.model.detail.Detail;
import com.chandrasaha.makanyukmvp.model.place.Item;
import com.chandrasaha.makanyukmvp.network.NetworkCallback;

/**
 * Created by Chandra Saha on 8/11/2017.
 */

public class DetailPresenter extends BasePresenter<DetailView> {
    String clientId = "E5KI0OVUNGJ4VEUC2IOMADRSSZ5RPN4UEJPG32CVNFBPE3X3";
    String clinetSecret = "XZ12EESN54I4ZH1PPU0AHAZM4XWMJPYI5SLBVYWPJS1EDYFX";
    String v = "20141011";
    String venuePhotos = "1";
    String section = "food";
    String radius = "10000";

    DetailPresenter(DetailView view){
        super.attachView(view);
    }

    void loadDetail(String id){
        view.showLoading();
        addSubscribe(apiStores.getDetail(id, clientId, clinetSecret, v), new NetworkCallback<Detail>() {
            @Override
            public void onSuccess(Detail model) {
                view.getDataSuccess(model);
            }

            @Override
            public void onFailure(String message) {
                view.getDataFail(message);
            }

            @Override
            public void onFinish() {
                view.hideLoading();
            }
        });
    }

}
