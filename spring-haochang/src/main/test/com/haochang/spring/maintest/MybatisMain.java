package com.haochang.spring.maintest;

import com.haochang.spring.mapper.BaseMapper;
import org.apache.commons.codec.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.File;
import java.io.InputStream;

public class MybatisMain {
    public static void main(String[] args) throws Exception {
//        InputStream inputStream = Resources.getInputStream("mybatis-config.xml");
//        SqlSessionFactory sqlsessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlsessionFactory.openSession();
//        BaseMapper mapper = sqlSession.getMapper(BaseMapper.class);
//        System.out.println("查询库存 === " + mapper.getStock());
//        System.out.println("查询库存 === " + mapper.getStock());
//        sqlSession.commit();
//        System.out.println("查询库存 2222=== " + mapper.getStock());
//
//        sqlSession.close();

        File file = new File("spring-delete.xml");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsolutePath());
    }
}
