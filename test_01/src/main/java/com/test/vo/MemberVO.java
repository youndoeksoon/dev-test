package com.test.vo;

public class MemberVO {
	
	private String id; //db�� TEST ���̺� id
	private String pw; //db�� TEST ���̺� pw
	private String name; //db�� TEST ���̺� name
	
	//memberVO�� getter, setter
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
	
	//LogȮ���� ���� toString
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
		
}
