/*
* MainCustomView.java
* Created on  2016/11/9 16:26
* 版本        修改时间        作者      修改内容        邮箱
* V1.0.1      2016/11/9        Mark  初始版本        mark.gu@tdlbs.com
*
* Copyright (c) 2014 南京淘点网络科技有限公司 版权所有
* NANJING TAODIAN TECHNOLOGY CO.,LTD. All Rights Reserved.
*/
package com.tdlbs.android.easymvpsample.main;

import android.content.Context;
import android.view.View;
import easymvp.annotation.CustomView;
import easymvp.annotation.Presenter;

/**
 * Created by Mark on 2016/11/9.
 */
@CustomView(presenter = MainPresent.class)
public class MainCustomView extends View implements MainView{

    @Presenter
    MainPresent mainPresent;
    public MainCustomView(Context context) {
        super(context);
    }

    @Override public void showErrorDialog() {

    }

    @Override public void showInformationDialog() {

    }

    @Override public void showProgressDialog() {

    }
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
