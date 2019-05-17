package P02_selftest_insa;

import java.util.ArrayList;
import java.util.List;

public class InsaData {

	List<Insa> list = new ArrayList<Insa>();	// 인사 어레이리스트를 선언 

	public InsaData() {	// 디폴트 생성자
	}

	public InsaData(List<Insa> list) { // 생성자
		this.list = list;
	}

	void printTitle() {	// 타이틀 출력용 메소드
		System.out.println("***급여 관리 프로그램***");
		System.out.print("부서명\t");
		System.out.print("사번\t");
		System.out.print("이름\t");
		System.out.print("급여\t");
		System.out.println();
	}

	String printPay(int pay) {	// 급여에 "," 를 찍어주는 메소드. 어제꺼 그대로 쓰면됨 

		String str = Integer.toString(pay);
		int len = str.length();
		int start = len % 3;
		int iter = len / 3;
		String str2 = "";
		//
		if (start != 0)
			str2 = str.substring(0, start) + ",";
		//
		for (int i = 0; i < iter; i++) {
			if (i == 0)
				str2 = str2 + str.substring(start + i * 3, start + 3 + i * 3);
			else
				str2 = str2 + "," + str.substring(start + i * 3, start + 3 + i * 3);
		}
		//
		if (len > 3)
			return str2;
		else
			return str;

	}

	void printBody() {	// 실질적인 내용을 다루는 메소드. 여기가 중요
		int cnt = 0;	// 갯수를 세는 용도
		boolean sw = true;	// 부서명을 찍을 것 인가를 결정하는 스위치. 기본값은 온
		String part = list.get(0).getPart();	// 부서명을 저장하는 변수. 기본값은 맨 처음 입력되는 부서명

		int partSum = 0;	// 부서별 급여의 합을 계산
		int totSum = 0;		// 리스트 전체의 합을 계산

		while (cnt < list.size()) {	// 리스트의 갯수만큼 반복

			// 부서명이 바뀌었을때
			if (list.get(cnt).getPart().equals(part) != true) { // 부서명이 바뀌었을때
				part = list.get(cnt).getPart();	// 새로 바뀐 부서명으로 갱신 
				sw = true;	// 부서명을 찍는 스위치를 온
				System.out.println("합계 : \t\t\t" + printPay(partSum)); // 해당 부서의 급여 총액을 출력
				partSum = 0;	// 부서 총액의 합을 0으로 초기화
			}
			//
			if (sw == true) { // 만약  스위치가 온이면
				System.out.print(list.get(cnt).getPart());	// 부서명을 출력하고
				sw = false;	// 스위치를 꺼줌 
			}
			//
			System.out.print("\t");
			System.out.print(list.get(cnt).getSabun());	// 나머지 요소들 출력 
			System.out.print("\t");
			System.out.print(list.get(cnt).getName());
			System.out.print("\t");
			System.out.print(printPay(list.get(cnt).getPay()));
			System.out.println("");
			//
			partSum += list.get(cnt).getPay();	// 부서별 급여 누적
			totSum += list.get(cnt).getPay();	// 총 급여 누적
			cnt++; // 카운트 증가
			
			if(cnt == list.size())
				System.out.println("합계 : \t\t\t" + printPay(partSum));
		}

		System.out.println("총 합계 : \t\t\t" + printPay(totSum));	// while 문이 끝나고 마지막에 총액 출력

	}

}
