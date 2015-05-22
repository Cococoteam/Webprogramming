package com.maple.community.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import com.maple.community.model.MemberModel;
//DAO(Data Access Object)
//데이터베이스와 연동해서 데이터를 가져오거나 입력수정
@Repository
public class MemberDaoImpl implements MemberDao{
	
	String resource = "mybatis-config-test.xml";
	InputStream inputStream = Resources.getResourceAsStream(resource);
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	SqlSession session = sqlSessionFactory.openSession();
	
	@Override
	public void insertMember(MemberModel model) {
		
	}

}
