// 실질적인 데이터를 처리하는 클래스
package p01_School.student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentData {

	private List<Student> sList = new ArrayList<Student>();

	public StudentData(String fileName) {
		sFileRead(fileName);
	}

	List<Student> sotedStudentInfo() { // 반 번호 이름순으로 정렬한 리스트 반환
		List<Student> returnList = sList;

		int jnum;
		int jpnum;
		///
		for (int i = 0; i < returnList.size(); i++)
			for (int j = 0; j < returnList.size() - 1 - i; j++) {
				jnum = Integer.parseInt(returnList.get(j).getBun());
				jpnum = Integer.parseInt(returnList.get(j+1).getBun());
				if (jnum > jpnum) {
					Student temp = returnList.get(j);
					returnList.set(j, returnList.get(j + 1));
					returnList.set(j+1, temp);
				}
			}
		////
		
		return returnList;
	}

	List<Student> searchByName(String str) { // 이름으로 검색
		List<Student> returnList = new ArrayList<Student>();

		String name; // 이름을 하나씩 불러와서 저장해줄 용도
		boolean sw; // 스위치용
		for (int i = 0; i < sList.size(); i++) { // 전체 리스트만큼 검색

			// indexOf 를 쓰면 더 빠름
			/*
			 * if(str.indexOf(name)>=0) returnList.add(sList.get(i));
			 */

			sw = true; // 스위치를 기본으로 켜줌
			name = sList.get(i).getName(); // i번째 리스트에서 학생 이름을 가져와 저장

			if (str.length() <= name.length()) { // 비교할 값이 학생 이름보다 작을때만 실행. 아니면 스위치 끔
				for (int j = 0; j < str.length(); j++) // 비교할 값 길이만큼 반복
					if (str.charAt(j) != name.charAt(j)) // 만약 이름이 불일치하면
						sw = false; // 스위치를 끔
			} else
				sw = false;

			if (sw) // 스위치가 켜져있으면
				returnList.add(sList.get(i)); // 리턴리스트에 추가

		}

		return returnList; // 리스트 반환
	}

	Student searchStudentByNum(String num) { // 학번으로 검색해서 학생객체 반환
		Student returnStudent = null; // 반환용 객체 생성

		for (int i = 0; i < sList.size(); i++) // 리스트 갯수만큼 반복
			if (sList.get(i).getBun().equals(num)) { // 번호를 비교해서 일치하면
				returnStudent = sList.get(i); // 저장해주고
				break; // 나와서
			}
		return returnStudent; // 반환
	}

	List<Student> allStudentInfo() {// 전체 학생 목록 전달
		return sList;
	}

	static void printSTitle() { // 타이틀을 찍는 스테틱 메소드
		System.out.print("학번\t");
		System.out.print("이름\t");
		System.out.print("전화\t\t");
		System.out.print("점수\t");
		System.out.print("담당교사\t");
		System.out.println();
	}

	static void printStudent(Student std) { // 학생 객체를 출력하는 스테틱 메소드
		if (std != null) {
			printSTitle();
			System.out.println(std);
		} else
			System.out.println("해당 정보에 맞는 학생이 없습니다");

	}

	static void printSList(List<Student> list) { // 리스트 요소들을 출력해주는 스테틱 메소드
		printSTitle();
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}

	void sFileRead(String fileName) { // 생성자에서 호출할꺼. 파일 읽어서 리스트를 만들어줌

		try {
			Scanner scan = new Scanner(new File(fileName));

			while (scan.hasNext()) {

				String[] str = scan.next().split(",");
				String bun = str[0];
				String name = str[1];
				String tel = str[2];
				int score = Integer.parseInt(str[3]);
				int tno = Integer.parseInt(str[4]);
				sList.add(new Student(bun, name, tel, score, tno));

			}

			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		}
	}

	public List<Student> getsList() {
		return sList;
	}

	public void setsList(List<Student> sList) {
		this.sList = sList;
	}
}
