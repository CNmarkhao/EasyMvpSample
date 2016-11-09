/*
* MainFragment.java
* Created on  2016/11/9 16:22
* 版本        修改时间        作者      修改内容        邮箱
* V1.0.1      2016/11/9        Mark  初始版本        mark.gu@tdlbs.com
*
* Copyright (c) 2014 南京淘点网络科技有限公司 版权所有
* NANJING TAODIAN TECHNOLOGY CO.,LTD. All Rights Reserved.
*/
package com.tdlbs.android.easymvpsample.main;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tdlbs.android.easymvpsample.R;
import easymvp.annotation.FragmentView;
import easymvp.annotation.Presenter;

/**
 * Created by Mark on 2016/11/9.
 */

@FragmentView(presenter = MainPresent.class)
public class MainFragment extends Fragment implements MainView{
    @Presenter
    MainPresent mainPresent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
        Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main, container, false);
    }
    @Override public void showErrorDialog() {

    }

    @Override public void showInformationDialog() {

    }

    @Override public void showProgressDialog() {

    }
}
