package com.maple.community.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maple.community.dao.MemberDao;
import com.maple.community.model.MemberModel;


@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDao memberdao;

	@Override
	public boolean join(MemberModel model) { //회원가입
		int result = memberdao.selectMemberById(model.getId());
		
		//같은 아이디가 하나라도 있으면 false, 아니면 회원가입 insert
		if(result >0){ 
			return false;
		} else{
			memberdao.insertMember(model);
		}
		return true;
	}

	@Override
	public int selectMemberById(String id) {
		return memberdao.selectMemberById(id);
	}
	
	
	
	
}
