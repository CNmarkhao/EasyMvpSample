/*
* DaggerActivity.java
* Created on  2016/11/9 18:16
* 版本        修改时间        作者      修改内容        邮箱
* V1.0.1      2016/11/9        Mark  初始版本        mark.gu@tdlbs.com
*
* Copyright (c) 2014 南京淘点网络科技有限公司 版权所有
* NANJING TAODIAN TECHNOLOGY CO.,LTD. All Rights Reserved.
*/
package com.tdlbs.android.easymvpsample.dagger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import javax.inject.Inject;

/**
 * Created by Mark on 2016/11/9.
 */
public class DaggerActivity extends AppCompatActivity{
    @Inject DaggerPresenter presenter;
    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerActivityComponent.builder().activityModule(new ActivityModule(this)).build().inject(this);
    }
}
