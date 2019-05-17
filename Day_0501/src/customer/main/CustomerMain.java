package customer.main;

import java.util.Scanner;

import customer.view.CustomerPrint;
import customer.view.CustomerView;

public class CustomerMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		CustomerView cView = new CustomerView();

		boolean flag = true;
		while (flag) {

			CustomerPrint.printMain();

			String sw = scan.next();

				switch (sw) {

				case "0":
					System.out.println("�����մϴ�");
					flag = false;
					break;
				case "1": // �� ��ü ���
					cView.selectAllCustomer_01();
					break;
				case "2": // �ű� �� ���
					cView.insertNewCustomer_02();
					break;
				case "3": // �� �˻�
					cView.selectByName_03();
					break;
				case "4": // �� ���� ����
					cView.updateByNum_04();
					break;
				case "5": // �� ���� ����
					cView.deleteByNum_05();
					break;
				default:
					System.out.println("�߸��� �Է��Դϴ�");
					break;

				
			}


		}

		scan.close();
	}

}
