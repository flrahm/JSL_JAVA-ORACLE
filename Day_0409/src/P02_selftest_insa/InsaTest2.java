package P02_selftest_insa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsaTest2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	// 스캐너 객체 생성
		List<Insa> insaList = new ArrayList<Insa>();	 // 어레이 리스트 생성 


		while (true) {	
			System.out.println("사원 정보를 입력하세요 : ");
			String inStr = scan.next();	// 한줄 전체를 키보드로 입력받음
			inStr.trim();
			try {
			String[] str = inStr.split(",");	// "," 를 기준으로 잘라서 스트링 배열로 저장
			String part = str[0];	// 스트링 배열의 첫번째 조각을 부서명
			if (part.equalsIgnoreCase("end"))	// 만약 부서명이 대소문자를 무시하고 end 와 같으면
				break;	// 종료함

			int sabun = Integer.parseInt(str[1]);	// 두번째 조각을 스트링에서 인트로 변환하여 저장
			System.out.println(sabun); // 잘 되나 테스트용. 없어도됨
			String name = str[2];	// 세번째 조각을 이름으로
			int pay = Integer.parseInt(str[3]);// 네번째 조각을 인트형으로 바꾸어 저장
			
			insaList.add(new Insa(part, sabun, name, pay));	// 위의 것들을 어레이리스트에 추가
			}
			catch(Exception e) {
				System.out.println("입력 과정에서 문제가 생겼습니다");
			};

		}
		scan.close();
		InsaData insaData = new InsaData(insaList);

		insaData.printTitle();
		insaData.printBody();
	}
	
	
	
	

}
