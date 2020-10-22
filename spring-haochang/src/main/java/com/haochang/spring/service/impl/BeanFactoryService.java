package com.haochang.spring.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.haochang.spring.service.AliasNameService;
import com.haochang.spring.service.BaseService;

/**
 * @description: 描述：bean工厂service
 * @author: youzhi.gao
 * @date: 2020-10-21 14:57
 */
public class BeanFactoryService implements BaseService,AliasNameService {
    private String beanName;
    @Override
    public void setAlias(String beanName) {
        this.beanName = beanName.toUpperCase();
    }


}
