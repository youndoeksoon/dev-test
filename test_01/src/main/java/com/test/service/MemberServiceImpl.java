package com.test.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.test.dao.MemberDAO;
import com.test.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Inject
	private MemberDAO dao;

	@Override
	public List<MemberVO> selectMember() throws Exception {
		// TODO Auto-generated method stub
		
		return dao.selectMember();
	}

}
