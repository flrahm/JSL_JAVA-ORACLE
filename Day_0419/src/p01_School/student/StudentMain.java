// Student main 메소드가 포함된 클래스
package p01_School.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String fileName = "E:\\라이브러리\\문서\\eclipse-workspace\\text\\Day_0419//student.txt";
		StudentData sData = new StudentData(fileName);
		
		int button;
		while(true) {
			
			System.out.println("메뉴를 고르세요 : ");
			System.out.println("[1] 정보 출력");
			System.out.println("[2] 학번 검색");
			System.out.println("[3] 이름으로 검색");
			System.out.println("[4] 학년 반 번호순으로 정렬해서 출력");
			System.out.println("[0] 종료");
			button = scan.nextInt();
			
			if(button == 0)	// 0이면 빠져나옴
				break;
			
			switch (button) {	// 입력 숫자에 따라서 해당되는 메소드를 실행
			case 1: information(sData); break;
			case 2:{
				System.out.println("학생 번호를 입력하세요 : ");
				String num = scan.next();
				searchByNum(sData,num); 
				break;
				}
			case 3:{
				System.out.println("검색할 이름을 입력하세요  : ");
				String name = scan.next();
				searchByName(sData,name);
				break;
			}
			case 4:{
				sortedInformation(sData);break;
			}
			default: System.out.println("잘못된 입력입니다");
			}
			
		}
		scan.close();
	

	}
	
	static void sortedInformation(StudentData sData) {
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\t\t**정렬된 학생 목록**\n");
		StudentData.printSList(sData.sotedStudentInfo());
		System.out.println("-----------------------------------------------------------------");
	}
	
	static void searchByName(StudentData sData,String name) {
		System.out.println("-----------------------------------------------------------------");
	
		StudentData.printSList(sData.searchByName(name));
		
		System.out.println("-----------------------------------------------------------------");
	}
	
	static void information(StudentData sData) {
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\t\t**전체 학생 목록**\n");
		StudentData.printSList(sData.allStudentInfo());
		System.out.println("-----------------------------------------------------------------");
	}
	
	static void searchByNum(StudentData sData,String num) {
		
		
		System.out.println("-----------------------------------------------------------------");
		StudentData.printStudent(sData.searchStudentByNum(num));
		System.out.println("-----------------------------------------------------------------");
		
	}

}
