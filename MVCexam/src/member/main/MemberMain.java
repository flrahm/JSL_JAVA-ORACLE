package member.main;

import java.util.Scanner;

import member.action.Action;
import member.action.MemberDeleteAction;
import member.action.MemberInsertAction;
import member.action.MemberListAction;
import member.action.MemberSearchAction;
import member.action.MemberUpdateAction;
import member.controller.MemberController;
//import member.ui.MemberView;

public class MemberMain {

	public static void main(String[] args) {

		MemberController mController = new MemberController();
		//MemberView ui = new MemberView();
		Scanner scan = new Scanner(System.in);

		boolean isStop = false;
		do {
			System.out.println("-------------------");
			System.out.println("== 회원 관리 프로그램 ==");
			System.out.println("[1] 전체 회원 정보 출력");
			System.out.println("[2] 신규 회원 등록");
			System.out.println("[3] 회원 검색");
			System.out.println("[4] 회원 정보 수정");
			System.out.println("[5] 회원 정보 삭제");
			System.out.println("[0] 종료");
			System.out.println("-------------------");
			System.out.print("원하시는 항목을 선택하세요 : ");
			String menu = scan.nextLine();
			Action action = null;
			switch (menu) {
			case "1":
				//ui.memberList(scan);
				action = new MemberListAction();
				break;
			case "2":
				action = new MemberInsertAction();
				//ui.memberInsert(scan);
				break;
			case "3":
				action = new MemberSearchAction();
				//ui.memberSearch(scan);
				break;
			case "4":
				action = new MemberUpdateAction();
				//ui.memberUpdate(scan);
				break;
			case "5":
				action = new MemberDeleteAction();
					
				//ui.memberDelete(scan);
				break;
			case "0":
				System.out.println("종료합니다");
				isStop = true;
				break;
			default:
				System.out.println("잘못된 입력입니다");
				break;
			}
			
			
			if(action != null)
				mController.processRequest(action, scan);
		} while (!isStop);

		scan.close();
	}

}
