package Sawon.main;

import java.util.Scanner;

import Sawon.view.SawonView;

// ����Ʈ ���
// ���� ���
// ���� ����
// ���� ����
// ���� �˻�

public class SawonMain02 {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		SawonView sView = new SawonView();

		boolean flag = true;
		while (flag) {

			System.out.println("������ �����ұ��");
			System.out.println("[1] ��� ����Ʈ ���");
			System.out.println("[2] ���� ���");
			System.out.println("[3] ���� ����");
			System.out.println("[4] ���� ����");
			System.out.println("[5] ���� �˻�");
			System.out.println("[0] ����");

			int sw = scan.nextInt();
			switch (sw) {
				case 0: 
					System.out.println("�����մϴ�");
					scan.close();
					flag = false;
					break;
				case 1:
					sView.printAll_1();
					break;
				case 2:
					sView.insert_2();
					break;
				case 3:
					sView.update_3();
					break;
				case 4:
					sView.delete_4();
					break;
				case 5:
					sView.search_5();
					break;

			}

		}

	}
}
