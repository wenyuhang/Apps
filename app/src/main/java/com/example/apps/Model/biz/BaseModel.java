package com.example.apps.Model.biz;

import com.example.apps.NetWorks.HttpFactroy;
import com.example.apps.NetWorks.IHttp;

/**
 * Created by 联想 on 2017/7/12.
 */

public interface BaseModel {
    public static IHttp ihttp= HttpFactroy.createOkhttp();
}
