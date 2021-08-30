package com.ckcj.mapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MybatisDbHelper<sqlSession, SqlSessionFactory> {

    //得到连接方法
    public <SqlSession, SqlSessionFactoryBuilder> SqlSession getSession(Object Resources) {
        SqlSession sqlSession = null;
        try {
            //1.创建一个工厂的构建器
            SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
            //2.拿到工厂实例
            String fpath = null;
            String fpath = "mybatis-config.xml";
            SqlSessionFactory sf = sfb.(new FileInputStream(new File(fpath)));
            SqlSessionFactory sf = sfb.(Resources.getResourceAsStream(fpath));
            //3.由工厂实例获得一个连接
            sqlSession = sf.openSession();build

            boolean sqlsession;
            System.out.println(sqlsession);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        //关系连接方法


    }
        Catch(Exception;Throwable e);{
                e.printStackTrace();
            }
            return sqlSession;
        }
