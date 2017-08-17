package com.chandrasaha.makanyukmvp.feature.home;


import android.app.Activity;
import android.content.Intent;

import com.chandrasaha.makanyukmvp.model.place.Place;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Chandra Saha on 8/7/2017.
 */

public interface MainView {
    void showLoading();

    void hideLoading();

    void getDataSuccess(Place model);

    void getDataFail(String message);

    void moveToDetail(Intent intent);

}
