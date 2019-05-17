package member.ui;

import java.util.List;
import java.util.Scanner;

import member.db.MemberVO;

public class MemberView {

	// 회원 전체 리스트 ( 5개씩 끊어서 )
	public void memberList(List<MemberVO> mList, Scanner scan) {
		System.out.println("** 회원 전체 리스트 **");
		if (mList.isEmpty()) {
			System.out.println("등록된 자료가 없습니다");
		} else {
			System.out.println("회원수 : " + mList.size());
			System.out.println("id\t이름\t국적\t이메일\t등록일"); // 주소랑 나이는 출력안함

			for (int i = 0; i < mList.size(); i++) {
				System.out.print(mList.get(i).getId() + "\t");
				System.out.print(mList.get(i).getName() + "\t");
				// System.out.print(mList.get(i).getAddr() + "\t");
				System.out.print(mList.get(i).getNation() + "\t");
				System.out.print(mList.get(i).getEmail() + "\t");
				// System.out.print(mList.get(i).getAge() + "\t");
				System.out.print(mList.get(i).getRegdate() + "\t");
				System.out.println();

				if ((i + 1) % 5 == 0) {
					System.out.println("다음 목록을 보시겠습니까? [y]");
					String check = scan.nextLine();
					if (!check.equalsIgnoreCase("y"))
						break;
				}
			}
		}
	}

	// 회원 등록
	public MemberVO memberInsert(Scanner scan) {
		System.out.println("** 회원 등록 **");
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("주소 : ");
		String addr = scan.nextLine();
		System.out.print("국적 : ");
		String nation = scan.nextLine();
		System.out.print("email : ");
		String email = scan.nextLine();
		System.out.print("나이 : ");
		String age = scan.nextLine();

		MemberVO mvo = new MemberVO();
		mvo.setName(name);
		mvo.setAddr(addr);
		mvo.setNation(nation);
		mvo.setEmail(email);
		mvo.setAge(Integer.parseInt(age));

		return mvo;
	}

	// 회원 검색 출력
	public int memberSearch_output(List<MemberVO> mList, Scanner scan) {
		if (mList.size() == 0) {
			System.out.println("해당 정보에 맞는 회원이 없습니다");
			return 0;
		}
		MemberVO mvo = null;
		for (int i = 0; i < mList.size(); i++) {
			mvo = mList.get(i);
			System.out.println("-----------------------------------");
			System.out.println("ID : " + mvo.getId());
			System.out.println("Name : " + mvo.getName());
			System.out.println("Addr : " + mvo.getAddr());
			System.out.println("Nation : " + mvo.getNation());
			System.out.println("E-mail : " + mvo.getEmail());
			System.out.println("Age : " + mvo.getAge());
			System.out.println("Regdate : " + mvo.getRegdate());
			System.out.println("----------------------------------");

		}

		return 0;
	}

	// 회원 검색 입력
	public String memberSearch_input(Scanner scan) {
		System.out.println("** 회원 검색 **");
		System.out.print("검색할 회원 번호 또는 ID를 입력하세요 : ");
		String str = scan.nextLine();
		return str;
	}

	// 회원 수정.... 입력
	public MemberVO memberUpdate_input(Scanner scan, MemberVO inMvo) {
		System.out.println("** 회원 정보 수정 **");
		System.out.println("아이디 : " + inMvo.getId());
		System.out.print("이름(" + inMvo.getName() + "): ");
		String name = scan.nextLine();
		System.out.print("주소(" + inMvo.getAddr() + "): ");
		String addr = scan.nextLine();
		System.out.print("국적(" + inMvo.getNation() + "): ");
		String nation = scan.nextLine();
		System.out.print("email(" + inMvo.getEmail() + "): ");
		String email = scan.nextLine();
		System.out.print("나이(" + inMvo.getAge() + "): ");
		String age = scan.nextLine();

		MemberVO mvo = new MemberVO();
		
		mvo.setId(inMvo.getId());
		
		if (!name.equals(""))
			mvo.setName(name);
		else
			mvo.setName(inMvo.getName());
		
		if (!addr.equals(""))
			mvo.setAddr(addr);
		else
			mvo.setAddr(inMvo.getAddr());
		
		if (!nation.equals(""))
			mvo.setNation(nation);
		else
			mvo.setNation(inMvo.getNation());
		
		if (!email.equals(""))
			mvo.setEmail(email);
		else
			mvo.setEmail(inMvo.getEmail());
		
		if (!age.equals(""))
			mvo.setAge(Integer.parseInt(age));
		else
			mvo.setAge(inMvo.getAge());
		

		return mvo;
	}

	// 회원 수정 ....검색
	public int memberUpdate_search(Scanner scan) {
		System.out.println("** 회원 수정 **");
		System.out.print("수정할 회원 ID를 입력하세요 : ");
		while (true) {
			String str = scan.nextLine();

			if (isString(str))
				System.out.println("잘못된 입력입니다");
			else
				return Integer.parseInt(str);

		}
	}

	// 회원 삭제
	public void memberDelete(Scanner scan) {
		System.out.println("** 회원 삭제 **");

	}

	// 문자열인지 검사
	private boolean isString(String str) {

		if (str.length() != 4)
			return true;

		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				return false;

		return true;

	}

}
