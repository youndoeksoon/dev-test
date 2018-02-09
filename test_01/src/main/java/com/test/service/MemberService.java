package com.test.service;

import java.util.List;

import com.test.vo.MemberVO;

public interface MemberService {
	
	public List<MemberVO> selectMember() throws Exception;

}
