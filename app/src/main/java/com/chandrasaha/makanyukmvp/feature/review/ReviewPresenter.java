package com.chandrasaha.makanyukmvp.feature.review;

import android.support.v7.widget.RecyclerView;

import com.chandrasaha.makanyukmvp.base.ui.BasePresenter;

/**
 * Created by Chandra Saha on 8/14/2017.
 */

public class ReviewPresenter extends BasePresenter<ReviewView> {
    ReviewPresenter(ReviewView view){
        super.attachView(view);
    }
}
