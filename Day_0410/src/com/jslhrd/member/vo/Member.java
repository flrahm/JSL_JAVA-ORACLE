package com.jslhrd.member.vo;

//import java.security.Timestamp;

public class Member {

	private int idx;
	private String name;
	// Timestamp birth; // Timestamp : �����ͺ��̽��� �����ؼ� ���� ����
	private String birth;
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}



}
