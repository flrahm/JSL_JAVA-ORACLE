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
				System.out.println("�����մϴ�");
				isStop = true;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�");
				break;
			}
			
			
			if(action != null)
				sController.processRequest(action, scan);
		} while (!isStop);

		scan.close();
	}

}
