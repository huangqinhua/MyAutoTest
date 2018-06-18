package com.huang.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resources;
import java.io.IOException;
import java.io.Reader;

//获取数据库中的数据的类
public class DataBaseUtils {

    public static SqlSession getSqlSession() throws IOException {

        //获取配置的资源文件
        Reader reader = org.apache.ibatis.io.Resources.getResourceAsReader("databaseconfig.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

        //sqlsession执行配置文件中的SQL语句
        SqlSession session =factory.openSession();

        return session ;


    }



}
