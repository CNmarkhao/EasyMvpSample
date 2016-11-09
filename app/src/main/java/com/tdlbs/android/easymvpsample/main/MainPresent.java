/*
* MainPresent.java
* Created on  2016/11/9 15:57
* 版本        修改时间        作者      修改内容        邮箱
* V1.0.1      2016/11/9        Mark  初始版本        mark.gu@tdlbs.com
*
* Copyright (c) 2014 南京淘点网络科技有限公司 版权所有
* NANJING TAODIAN TECHNOLOGY CO.,LTD. All Rights Reserved.
*/
package com.tdlbs.android.easymvpsample.main;

import android.util.Log;
import easymvp.AbstractPresenter;

/**
 * Created by Mark on 2016/11/9.
 */
public class MainPresent extends AbstractPresenter<MainView> {
    private boolean isOnViewAttachedCalled = false;
    private boolean isOnViewDetachedCalled = false;

    @Override public void onViewAttached(MainView view) {
        super.onViewAttached(view);
        isOnViewAttachedCalled = true;
    }

    @Override public void onViewDetached() {
        super.onViewDetached();
        isOnViewDetachedCalled = true;
    }

    @Override public void onDestroyed() {
        super.onDestroyed();
        Log.d("TestPresenter","OnDestroyed Called");
    }

    public boolean isOnViewAttachedCalled() {
        return isOnViewAttachedCalled;
    }

    public boolean isOnViewDetachedCalled() {
        return isOnViewDetachedCalled;
    }
}
