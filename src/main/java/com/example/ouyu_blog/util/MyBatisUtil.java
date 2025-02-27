package com.example.ouyu_blog.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @FileName MyBatisUtil
 * @Description
 * @Author ouyu
 * @Date 2025-02-26
 **/
public class MyBatisUtil {
    // 单例 SqlSessionFactory（线程安全）
    private static  SqlSessionFactory sqlSessionFactory;

    static {
        try {
            // 使用静态块初始化（只执行一次）
            String resource = "MybatisConfig.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("初始化 MyBatis 失败", e);
        }
    }

    // 获取新会话（线程安全）
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }

    // 关闭会话（带自动提交控制）
    public static void closeSession(SqlSession session) {
        if (session != null) {
            session.commit();  // 根据业务需求决定是否自动提交
            session.close();
        }
    }
}
