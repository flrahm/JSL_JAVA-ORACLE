package sawon.main;

import java.util.Scanner;

import sawon.ui.SawonPrint;
import sawon.ui.SawonView;

public class SawonMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		SawonView sView = new SawonView();
		boolean flag = true;

		while (flag) {

			SawonPrint.printMain();
			String sw = scan.nextLine();
			System.out.println("----------------------------------");

			switch (sw) {
			case "0":
				System.out.println("종료합니다");
				flag = false;
				break;
			case "1":
				sView.selectAllSawon_01();
				break;
			case "2":
				sView.insertNewSawon_02();
				break;
			case "3":
				sView.selectByName_03();
				break;
			case "4":
				sView.updateByName_04();
				break;
			case "5":
				sView.deleteByName_05();
				break;
			default:
				System.out.println("잘못된 입력입니다");
				break;
				
			}
		}
		scan.close();
	}

}
