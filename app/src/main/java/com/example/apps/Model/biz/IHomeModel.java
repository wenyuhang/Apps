package com.example.apps.Model.biz;

import com.example.apps.Model.DateBean.PageBean;
import com.example.apps.NetWorks.MyCallBacks.NetCallbacks;

/**
 * Created by 联想 on 2017/7/12.
 */

public interface IHomeModel extends BaseModel{
   void getHomePageBean(NetCallbacks<PageBean> callbacks);
}
