package P01_member;

import java.util.Scanner;

public class MemberTest2_arrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Member[] mArr = new Member[10];
		int cnt = 0;

		while (cnt < 10) {
			System.out.println("회원정보입력 : ");
			int idx = scan.nextInt();
			if (idx == 0)
				break;
			String userid = scan.next();
			String userpw = scan.next();
			String name = scan.next();
			int age = scan.nextInt();
			mArr[cnt] = new Member(idx, userid, userpw, name, age);
			cnt++;
		}

		scan.close();

		for (int i = 0; i < cnt; i++)
			System.out.println(mArr[i]);	
			// = System.out.println(mArr[i].toString);


	}

}
