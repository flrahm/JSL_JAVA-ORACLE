package p01_ListExam.student;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class StudentExam {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Student> sList = new Vector<Student>();
		
		System.out.println("학생 자료를 입력하세요");
		while (sList.size() < 5) {	// 5명 이하일때만 실행
			String[] str = scan.next().split(",");	// 입력받아서 "," 를 기준으로 쪼갬

			if (str.length == 3) {	// 번호 이름 점수 3개만 제대로 입력이 되었으면
				int num = Integer.parseInt(str[0]);	// 첫번째에 번호
				String name = str[1];	// 두번째에 이름
				int score = Integer.parseInt(str[2]);	// 세번째에 점수

				//종료조건. 번호가 0이면 종료
				if (num == 0)
					break;
				
				Student s = new Student(num, name, score);// 입력된 값으로 객체를 생성해서
				if (sList.contains(s) == false) { // 중복이 없으면 객체 생성
					sList.add(s);
					System.out.println("등록되었습니다");
				}
			}else
				System.out.println("잘못된 입력입니다");
		}
		scan.close();
		
		//반복자를 이용한 리스트 출력
		System.out.println("번호\t이름\t점수");
		Iterator<Student> iter = sList.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
