package com.test.dao;

import java.util.List;

import com.test.vo.MemberVO;

public interface MemberDAO {
	
	public List<MemberVO> selectMember() throws Exception;

}
