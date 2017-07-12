package com.example.apps.model.biz;

import com.example.apps.networks.HttpFactroy;
import com.example.apps.networks.IHttp;

/**
 * Created by 联想 on 2017/7/12.
 */

public interface BaseModel {
    public static IHttp ihttp= HttpFactroy.createOkhttp();
}
