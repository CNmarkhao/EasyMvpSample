/*
* ActivityComponent.java
* Created on  2016/11/9 18:18
* 版本        修改时间        作者      修改内容        邮箱
* V1.0.1      2016/11/9        Mark  初始版本        mark.gu@tdlbs.com
*
* Copyright (c) 2014 南京淘点网络科技有限公司 版权所有
* NANJING TAODIAN TECHNOLOGY CO.,LTD. All Rights Reserved.
*/
package com.tdlbs.android.easymvpsample.dagger;

import dagger.Component;

/**
 * Created by Mark on 2016/11/9.
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(DaggerActivity daggerActivity);
}