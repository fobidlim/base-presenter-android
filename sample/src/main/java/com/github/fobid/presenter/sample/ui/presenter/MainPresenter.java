package com.github.fobid.presenter.sample.ui.presenter;

import android.support.annotation.NonNull;

import com.github.fobid.presenter.base.BasePresenter;

/**
 * Created by partner on 2016-11-08.
 */

public class MainPresenter extends BasePresenter {

    private final View mView;

    public MainPresenter(@NonNull View view) {
        mView = view;
    }

    public void onClickFinish() {
        mView.finish();
    }

    public interface View extends BasePresenter.View {

    }
}
