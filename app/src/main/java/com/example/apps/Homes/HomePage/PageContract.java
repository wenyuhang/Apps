package com.example.apps.homes.homepage;


import com.example.apps.base.BasePresenter;
import com.example.apps.base.BaseView;
import com.example.apps.model.datebean.PageBean;

/**
 * Created by 联想 on 2017/7/12.
 */

public interface PageContract {
    /**
     * view接口
     */
    interface View extends BaseView<Presenter> {
        /**
         * 显示进度dialog
         */
        void showProgressDialog();
        /**
         * 关闭进度dialog
         */
        void dismissDialog();

        /**
         * 返回网络数据
         * @param netBean
         */
        void setResult(PageBean netBean);

        /**
         * 显示返回信息（成功或失败）
         * @param msg
         */
        void showMessage(String msg);
    }

    /**
     * presenter接口
     */
    interface Presenter extends BasePresenter {

    }
}
