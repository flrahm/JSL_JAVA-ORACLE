package Sawon.main;

import java.util.Scanner;

import Sawon.action.Action;
import Sawon.action.SawonDeleteAction;
import Sawon.action.SawonInsertAction;
import Sawon.action.SawonListAction;
import Sawon.action.SawonSearchAction;
import Sawon.action.SawonUpdateAction;
import Sawon.controller.SawonController;
import Sawon.ui.SawonPrint;

public class SawonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SawonController sController = new SawonController();
		//SawonView ui = new SawonView();
		Scanner scan = new Scanner(System.in);

		boolean isStop = false;
		do {
			SawonPrint.printMain();
			String menu = scan.nextLine();
			Action action = null;
			switch (menu) {
			case "1":
				action = new SawonListAction();
				break;
			case "2":
				action = new SawonInsertAction();
				break;
			case "3":
				action = new SawonSearchAction();
				break;
			case "4":
				action = new SawonUpdateAction();
				break;
			case "5":
				action = new SawonDeleteAction();
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
				sController.processRequest(action, scan);
		} while (!isStop);

		scan.close();
	}

}
