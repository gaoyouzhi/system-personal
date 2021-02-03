package com.haochang.spring.service;


import com.haochang.spring.model.TProduct;

import java.util.List;

/**
 * @description: 描述：产品服务
 * @author: youzhi.gao
 * @date: 2020-12-17 18:15
 */
public interface ProductService {

    int deleteByPrimaryKey(Long id);

    int insert(TProduct record);


    TProduct selectByPrimaryKey(Long id);

    List<TProduct> selectAll();


    int updateByPrimaryKey(TProduct record);
}
