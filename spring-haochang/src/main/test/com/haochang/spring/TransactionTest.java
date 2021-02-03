package com.haochang.spring;

import com.haochang.spring.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


/**
 * @description: 描述：测试事务
 * @author: youzhi.gao
 * @date: 2020-12-17 17:38
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TransactionTest {

    @Autowired
    private ProductService productService;

    @Test
    public void update(){
        productService.selectByPrimaryKey(1L);
        Date date = new Date();
    }


}
