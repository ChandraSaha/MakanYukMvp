package com.chandrasaha.makanyukmvp.base.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.chandrasaha.makanyukmvp.base.ui.BaseFragment;
import com.chandrasaha.makanyukmvp.base.ui.BasePresenter;

/**
 * Created by Chandra Saha on 8/7/2017.
 */

public abstract class MvpFragment<P extends BasePresenter> extends BaseFragment {
    protected P presenter;

    protected abstract P createPresenter();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        presenter = createPresenter();
        super.onViewCreated(view, savedInstanceState);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if(presenter!=null){
            presenter.detachView();
        }
    }
}
