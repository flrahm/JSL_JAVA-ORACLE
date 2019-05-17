package P01_member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberTest_memberArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Member> mList = new ArrayList<Member>();
		// Member mem = null;
		// int cnt = 0;
		System.out.println(mList.size());
		while (mList.size() < 10) {
			System.out.println("회원정보입력 : ");
			int idx = scan.nextInt();
			if (idx == 0)
				break;
			String userid = scan.next();
			String userpw = scan.next();
			String name = scan.next();
			int age = scan.nextInt();

			// mem = new Member(idx, userid, userpw, name, age);
			// mList.add(mem);
			mList.add(new Member(idx, userid, userpw, name, age));
			// cnt++;
			System.out.println(mList.size());
		}

		scan.close();

		for (int i = 0; i < mList.size(); i++)
			System.out.println(mList.get(i));

	}

}
