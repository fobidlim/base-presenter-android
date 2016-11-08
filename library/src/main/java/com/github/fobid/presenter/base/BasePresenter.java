package com.github.fobid.presenter.base;

import android.support.annotation.StringRes;

/**
 * Created by partner on 2016-11-08.
 */

public class BasePresenter {

    public interface View {
        void showToast(@StringRes int resourceId);

        void showLoading();

        void hideLoading();

        void finish();
    }
}
