package com.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.bean.User;
import com.mybatis.dao.UserMapper;

public class TestUserSQL {

	public static void main(String[] args) {
		InputStream inputStream;
		SqlSession session = null;
		try {
			String resource = "config/mybatis-config.xml";
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session= sqlSessionFactory.openSession();
			/**第一种*/
			//User user = session.selectOne("test.findUserById", 3);
			/**第二种*/
			UserMapper userMapper = session.getMapper(UserMapper.class);//创建Mapper对象
			User user = userMapper.findUserById(3);
			System.out.println(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(session!=null){
				session.close();
			}
		}
		
	}

}
