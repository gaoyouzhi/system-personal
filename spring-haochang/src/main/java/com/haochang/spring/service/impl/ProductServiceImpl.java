package com.haochang.spring.service.impl;

import com.haochang.spring.mapper.TProductMapper;
import com.haochang.spring.model.TProduct;
import com.haochang.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: 描述：产品服务实现
 * @author: youzhi.gao
 * @date: 2020-12-17 18:17
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private TProductMapper tProductMapper;


    @Override
    public int deleteByPrimaryKey(Long id) {
        return tProductMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TProduct record) {
        return tProductMapper.insert(record);
    }

    @Override
    public TProduct selectByPrimaryKey(Long id) {
        return tProductMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<TProduct> selectAll() {
        return tProductMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(TProduct record) {
        return 0;
    }
}
