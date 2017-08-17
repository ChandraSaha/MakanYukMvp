package com.chandrasaha.makanyukmvp.base.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.chandrasaha.makanyukmvp.base.ui.BaseActivity;
import com.chandrasaha.makanyukmvp.base.ui.BasePresenter;

/**
 * Created by Chandra Saha on 8/7/2017.
 */

public abstract class MvpActivity<P extends BasePresenter> extends BaseActivity {
    protected P presenter;
    protected abstract P createPresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        presenter = createPresenter();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(presenter!=null){
            presenter.detachView();
        }
    }
}
