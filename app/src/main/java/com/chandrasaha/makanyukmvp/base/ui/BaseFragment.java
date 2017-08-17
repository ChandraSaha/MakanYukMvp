package com.chandrasaha.makanyukmvp.base.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import butterknife.ButterKnife;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Chandra Saha on 8/7/2017.
 */

public class BaseFragment extends Fragment {
    public Activity activity;
    public CompositeSubscription compositeSubscription;

    @Override
    public void onViewCreated(View view,@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();
        ButterKnife.bind(activity, view);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        onUnsubscribe();
    }

    private void onUnsubscribe() {
        if(compositeSubscription!=null && compositeSubscription.hasSubscriptions()){
            compositeSubscription.unsubscribe();
        }
    }
}
