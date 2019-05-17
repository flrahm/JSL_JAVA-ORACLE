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
			System.out.println("== ȸ�� ���� ���α׷� ==");
			System.out.println("[1] ��ü ȸ�� ���� ���");
			System.out.println("[2] �ű� ȸ�� ���");
			System.out.println("[3] ȸ�� �˻�");
			System.out.println("[4] ȸ�� ���� ����");
			System.out.println("[5] ȸ�� ���� ����");
			System.out.println("[0] ����");
			System.out.println("-------------------");
			System.out.print("���Ͻô� �׸��� �����ϼ��� : ");
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
				System.out.println("�����մϴ�");
				isStop = true;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�");
				break;
			}
			
			
			if(action != null)
				mController.processRequest(action, scan);
		} while (!isStop);

		scan.close();
	}

}
