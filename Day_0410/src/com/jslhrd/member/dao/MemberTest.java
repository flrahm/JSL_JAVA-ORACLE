package com.jslhrd.member.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jslhrd.member.vo.Member;

public class MemberTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// int cnt = 0; // �Է� ���� ī����

		List<Member> memList = new ArrayList<Member>();

		while (true) {
			System.out.println("�ڷ� �Է�:");
			String name = scan.next();
			if (name.equalsIgnoreCase("end"))
				break;
			int idx = scan.nextInt();

			String birth = scan.next();

			Member mem = new Member();
			mem.setIdx(idx);
			mem.setBirth(birth);
			mem.setName(name);
			memList.add(mem);
		}
		scan.close();
		
		for (int i = 0; i < memList.size(); i++)
			System.out.println(memList.get(i).getBirth());
		

	}

}
