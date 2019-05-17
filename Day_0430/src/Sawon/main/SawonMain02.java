package Sawon.main;

import java.util.Scanner;

import Sawon.view.SawonView;

// 리스트 출력
// 정보 등록
// 정보 수정
// 정보 삭제
// 정보 검색

public class SawonMain02 {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		SawonView sView = new SawonView();

		boolean flag = true;
		while (flag) {

			System.out.println("무엇을 실행할까요");
			System.out.println("[1] 사원 리스트 출력");
			System.out.println("[2] 정보 등록");
			System.out.println("[3] 정보 수정");
			System.out.println("[4] 정보 삭제");
			System.out.println("[5] 정보 검색");
			System.out.println("[0] 종료");

			int sw = scan.nextInt();
			switch (sw) {
				case 0: 
					System.out.println("종료합니다");
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
