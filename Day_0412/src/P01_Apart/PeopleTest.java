// peopleTest

package P01_Apart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	// 스캐너 객체 생성
		List<People> pList = new ArrayList<People>();	// People 어레이 리스트 생성

		while (true) { //
			try {	// 예외처리문
				System.out.println("동, 성명, 나이를 입력하세요");
				String inStr = scan.next();	// 문자열로 받아서
				inStr.trim();	// 공백제거하고
				String[] str = inStr.split(",");	// , 를 기준으로 쪼갠것을 문자열 배열로 받아줌 
				int dong = Integer.parseInt(str[0]);	// 첫번째꺼는 동
				if (dong == 0)	// 만약 동이 0이면 
					break;	// 종료
				String name = str[1];	// 두번째 조각은 이름
				int age = Integer.parseInt(str[2]);	// 세번째 조각은 나이
				pList.add(new People(dong, name, age));	 // 어레이리스트에 객체생성해서 추가해줌

			} catch (Exception e) {	// 예외처리문
				System.out.println("잘못된 입력입니다");
			}
		}//
		scan.close();	
		PeopleData pTest = new PeopleData(pList);	// 정보를 처리하는 클래스에 전달 
		pTest.body();	// 정보를 처리하는 클래스에서 메소드를 불러줌
	}
	
	


}
