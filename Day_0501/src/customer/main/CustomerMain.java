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
					System.out.println("종료합니다");
					flag = false;
					break;
				case "1": // 고객 전체 목록
					cView.selectAllCustomer_01();
					break;
				case "2": // 신규 고객 등록
					cView.insertNewCustomer_02();
					break;
				case "3": // 고객 검색
					cView.selectByName_03();
					break;
				case "4": // 고객 정보 수정
					cView.updateByNum_04();
					break;
				case "5": // 고객 정보 삭제
					cView.deleteByNum_05();
					break;
				default:
					System.out.println("잘못된 입력입니다");
					break;

				
			}


		}

		scan.close();
	}

}
