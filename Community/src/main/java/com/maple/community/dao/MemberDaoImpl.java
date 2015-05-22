package com.maple.community.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.maple.community.model.MemberModel;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.type.Alias;
//DAO(Data Access Object)
//데이터베이스와 연동해서 데이터를 가져오거나 입력수정
//component-scan 자동 자바빈즈 생성(Repository)
//
@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public void insertMember(MemberModel model) {
		
	}

}
