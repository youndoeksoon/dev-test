package com.test.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.test.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.test.mapper.memberMapper";
	
	@Override
	public List<MemberVO> selectMember() throws Exception {
		// TODO Auto-generated method stub
		
		//namespace�� ������ mapper�� ã�Ƽ� .selectMember��� ������ ������ List�� ��´�.
		return sqlSession.selectList(namespace + ".selectMember");
	}

	
	
}
