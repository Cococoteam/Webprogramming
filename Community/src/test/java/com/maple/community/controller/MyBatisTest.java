package com.maple.community.controller;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.maple.community.model.MemberModel;

public class MyBatisTest {
	private static final Logger log = LoggerFactory.getLogger(MyBatisTest.class);

	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void setup() throws IOException{
		String resource = "mybatis-config-test.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	
	
	@Test
	public void gettingStarted() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			
			MemberModel result = session.selectOne("UserMapper.selectMemberById", "root");
			log.debug("User : {}", result);
		  //Blog blog = session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
		} finally {
		  session.close();
		}
	}
	
	public void insert() throws IOException{
		SqlSession session = sqlSessionFactory.openSession();
		MemberModel model = new MemberModel();
		model.setId("hi");
		model.setName("hi");
		model.setPasswd("hi");
		session.insert("UserMapper.create", model);
		MemberModel result = session.selectOne("UserMapper.selectMemberById", model.getId());
		assertEquals(model, result);
	}
}
