// StudentSearch Data
package P03;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	List<Student> sList = null;
	public StudentList() {
		
		sList = new ArrayList<Student>();
		
		sList.add(new Student(5,"AAA",85));
		sList.add(new Student(9,"BBB",65));
		sList.add(new Student(3,"CCC",99));
		sList.add(new Student(8,"DDD",25));
		sList.add(new Student(4,"EEE",41));
		sList.add(new Student(1,"FFF",95));
		sList.add(new Student(2,"GGG",90));
		sList.add(new Student(7,"HHH",45));
		sList.add(new Student(6,"III",15));
		
	}
	
	public void scoreList(int score) {	// score 이상인 학생들 목록을 출력하는 메소드
		
		int cnt = 0;	// 학생 명수를 세는 변수
		System.out.println("점수가 " + score + " 이상인 학생들 목록 ");
		
		for(int i = 0; i < sList.size() ; i++) {	// 리스트 수 만큼 반복
			
			if(score < sList.get(i).getScore()) {	// score 와 학생 점수를 비교해서
				System.out.println(sList.get(i));	// 지정 점수 이상이면 출력. toString 오버라이딩 되어있음
				cnt++;	// 갯수 증가
			}
		}
		
		System.out.println("점수가 " + score + "이상인 학생 수 : " + cnt + " 명");
		
		
		
	}
	
	public void nameSearch(String name) {	// 입력받은 name 을 기준으로 이름이 일치하는 학생을 찾는 메소드
		
		Student std = null;	// 값을 받을 Student Class 생성 
		for(int i = 0; i < sList.size() ; i++) {	// 리스트 수 만큼 반복해서
			if(name.equals(sList.get(i).getName())) {	// 이름을 불러와 문자열이 일치하면 
				std = sList.get(i);	// std 에 참조값 대입
				break;	// 빠져나옴
			}
		}
			
		if(std == null)	// 만약 null 값이면 ( 일치하는 학생을 찾지 못했을 때)
			System.out.println("해당 이름을 가진 학생이 없습니다 : " + name);
		else	// 아니면 출력. toString 오버라이딩 되어있음
			System.out.println(std);
	}
	
}
