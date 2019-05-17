package student;

import java.io.File;
import java.util.Scanner;

/* 번호,이름,점수1,점수2,점수3,점수4,점수5
 * 
 * 출력은 번호순으로
 * 번호 이름 총점 평균 석차
 */

public class StudentExam {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(new File("E:\\라이브러리\\문서\\eclipse-workspace\\text//student.txt"));
		// 스캐너객체 생성해서 파일경로 설정
		int cnt = 0; // 입력된 줄이 몇줄인지 세기 위한 카운터 변수
		while (scan.hasNext()) { // 파일이 끝날때까지 돌림
			scan.next(); // 한줄넘김
			cnt++; // 한줄 넘어갈 때 마다 카운터를 증가시킴
		}
		System.out.println("학생 수는 " + cnt + "명입니다");

		Student[] std = new Student[cnt]; // 학생클래스 배열을 위에서 구한 학생 수에 맞게 생성
		String[] inData = new String[cnt]; // 텍스트파일에서 한줄한줄 읽어서 저장할 문자열 배열을 학생 수에 맞게 선언

		scan = new Scanner(new File("E:\\라이브러리\\문서\\eclipse-workspace\\text//student.txt"));
		// 다시 파일포인터를 처음으로
		for (int i = 0; i < cnt; i++) { // 지정된 줄만큼 읽어서
			inData[i] = scan.next(); // 문자열 배열에 저장
			std[i] = new Student(); // 학생클래스를 생성
			std[i].getData(inData[i]); // 학생 클래스의 getData 함수에 해당 문자열을 넣어줌
		}

		ranking(std, cnt); // 학생 클래스배열과 학생 명수를 넣어줘서 평균을 기준으로 랭킹을 매김
		sorting(std, cnt); // 학생 클래스배열과 학생 명수를 넣어줘서 번호순에 의해 정렬
		Student.printTitle(); // 스테틱메소드인 타이틀을 출력

		for (int i = 0; i < cnt; i++) { // 학생 명수만큼(학생 클래스 갯수만큼)
			std[i].printStd(); // 클래스 요소들을 출력해줌
		}

		scan.close();
	}

	static void ranking(Student[] std, int cnt) { // 평균에 의한 랭킹을 구하는 메소드
		for (int i = 0; i < cnt; i++) {
			int a = 1; // 등수매기는 용도
			for (int j = 0; j < cnt; j++) {
				if (std[i].getAve() < std[j].getAve()) // getAve 를 사용해 평균을 비교하여 순위 결정
					a++;
			}
			std[i].setRank(a);
		}

	}

	static void sorting(Student[] std, int cnt) { // 번호순으로 정렬하는 메소드

		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt - 1 - i; j++) {

				if (std[j + 1].getBun() < std[j].getBun()) { // getBun 을 사용하여 클래스 요소들간의 번호를 비교하여

					Student temp = new Student(); // 스왑해줌
					temp = std[j];
					std[j] = std[j + 1];
					std[j + 1] = temp;
				}

			}
		}

	}

}
