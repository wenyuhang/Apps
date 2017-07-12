package com.example.apps.Model.biz;

import com.example.apps.Model.DateBean.PageBean;
import com.example.apps.NetWorks.MyCallBacks.NetCallbacks;
import com.example.apps.config.Urls;

/**
 * Created by 联想 on 2017/7/12.
 */

public class IHomeImpl implements IHomeModel{

    @Override
    public void getHomePageBean(NetCallbacks<PageBean> callbacks) {
        ihttp.get(Urls.CESHI,null,callbacks);
    }
}
