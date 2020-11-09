package com.haochang.spring.test;

import com.haochang.spring.config.AppConfig;
import com.haochang.spring.mapper.BaseMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 描述：mybatis测试
 * @author: youzhi.gao
 * @date: 2020-11-09 15:49
 */
public class SqlSessionTest {
    public static void main(String[] args) throws Exception {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) annotationConfigApplicationContext.getBean("sqlSessionFactory");
        SqlSession session = sqlSessionFactory.openSession();
        BaseMapper mapper = session.getMapper(BaseMapper.class);
        Long aLong = mapper.get();
        System.out.println(aLong);
    }
}
