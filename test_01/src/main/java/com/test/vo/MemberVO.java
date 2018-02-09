package com.test.vo;

public class MemberVO {
	
	private String id; //db의 TEST 테이블 id
	private String pw; //db의 TEST 테이블 pw
	private String name; //db의 TEST 테이블 name
	
	//memberVO의 getter, setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Log확인을 위한 toString
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
		
}
