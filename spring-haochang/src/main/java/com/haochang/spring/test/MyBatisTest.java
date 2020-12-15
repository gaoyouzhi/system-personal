package com.haochang.spring.test;

import com.haochang.spring.mapper.BaseMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试mybatis
 *
 */
public class MyBatisTest {
    public static void main(String[] args) throws Exception{
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        SqlSessionFactory sqlSessionFactory = configApplicationContext.getBean("sqlSessionFactory", SqlSessionFactory.class);
        SqlSession session = sqlSessionFactory.openSession();
        BaseMapper mapper = session.getMapper(BaseMapper.class);
        System.out.println(mapper.get());
        session.close();
    }
}
