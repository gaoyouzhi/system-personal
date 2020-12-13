package com.haochang.spring.test;

import com.haochang.spring.mapper.BaseMapper;
import org.apache.commons.codec.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisMain {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = Resources.getInputStream("mybatis-config.xml");
        SqlSessionFactory sqlsessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlsessionFactory.openSession();
        BaseMapper mapper = sqlSession.getMapper(BaseMapper.class);
        System.out.println(mapper.get());
        sqlSession.close();
    }
}
