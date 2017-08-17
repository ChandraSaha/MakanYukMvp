package com.chandrasaha.makanyukmvp.feature.detail;

import android.content.Intent;

import com.chandrasaha.makanyukmvp.model.detail.Detail;

/**
 * Created by Chandra Saha on 8/11/2017.
 */

public interface DetailView {
    void showLoading();

    void hideLoading();

    void getDataSuccess(Detail model);

    void getDataFail(String message);

}
