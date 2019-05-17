package P02_SawonPay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SawonPayExam {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	// 스캐너 객체 생성
		List<SawonPay> sList = new ArrayList<SawonPay>();	// 사원 어레이리스트 생성

		while (true) {
			try {	// 예외처리문. 없어도됨 
				System.out.print("사원정보 : ");	
				String[] str = scan.next().split(","); // 사원정보를 한줄로 입력받아 , 를 기준으로 분리
				String id = str[0];	// 첫번째 조각을 id 에 저장
				if (id.equalsIgnoreCase("end"))	 // 만약 id 가 end 일 경우 종료
					break;

				int grade = Integer.parseInt(str[1]);	// 사원등급에 두번째 조각을 저장
				int workTime = Integer.parseInt(str[2]);	// 일한시간에 세번째 조각을 저장

				sList.add(new SawonPay(id, grade, workTime));	// 세 개를 가지고 SawonPay 객체를 생성해 어레이리스트에 추가
			} catch (Exception e) {
				System.out.println("입력과정에서 문제가 생겼습니다");
			};

		}

		
		System.out.println();
		SawonPay.printTitle();	// 아이디 등급 ~~ 맨 윗줄 타이틀 출력

		int timeSum = 0;	// 일한 시간 합계 저장용
		int paySum = 0;	// 주간급여 합 저장용
		for (int i = 0; i < sList.size(); i++) { // 어레이 리스트 사이즈(인원수) 만큼 반복
			System.out.println(sList.get(i));	// 오버라이딩 되어있는 요소들을 출력
			timeSum += sList.get(i).getWorkTime();	// 일한시간 합계에 추가
			paySum += sList.get(i).getW_pay();	// 주간급여 합계에 추가
		}
		System.out.println("합계\t\t\t" + timeSum + "\t" + paySum); // 마지막에 합계 출력

		scan.close();

	}

}
