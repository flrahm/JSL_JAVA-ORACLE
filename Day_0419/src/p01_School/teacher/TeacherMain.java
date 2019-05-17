// Teacher 메인 함수 부분
package p01_School.teacher;

import java.util.Scanner;

public class TeacherMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fileName = "E:\\라이브러리\\문서\\eclipse-workspace\\text\\Day_0419//teacher.txt";
		TeacherData tData = new TeacherData(fileName);
		
		int button;
		while(true) {
			
			System.out.println("메뉴를 고르세요 : ");
			System.out.println("[1] 정보 출력");
			System.out.println("[2] 교사번호 검색");
			System.out.println("[3] 이름으로 검색");
			System.out.println("[4] 담당과목으로 검색");
			System.out.println("[0] 종료");
			button = scan.nextInt();
			
			if(button == 0)	// 0이면 빠져나옴
				break;
			
			switch (button) {	// 입력 숫자에 따라서 해당되는 메소드를 실행
			case 1: information(tData); break;
			case 2:{
				System.out.println("교사 번호를 입력하세요 : ");
				int num = Integer.parseInt(scan.next());
				searchByNum(tData,num); 
				break;
				}
			case 3:{
				System.out.println("검색할 이름을 입력하세요  : ");
				String name = scan.next();
				searchByName(tData,name);
				break;
			}
			case 4:{
				System.out.println("검색할 교과목을 입력하세요  : ");
				String part = scan.next();
				searchByPart(tData,part);
				break;
			}
			default: System.out.println("잘못된 입력입니다");
			}
			
		}
		scan.close();


	}
	
	
	static void searchByName(TeacherData tData,String name) {	//3. 이름으로 검색
		System.out.println("-----------------------------------------------------------------");
		
		TeacherData.printTTitle();
		TeacherData.printTList(tData.searchByName(name));
		
		System.out.println("-----------------------------------------------------------------");
	}
	
	static void information(TeacherData tData) {	//  1.정렬해서 출력 
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\t\t**전체 교사 목록**\n");
		TeacherData.printTTitle();
		TeacherData.printTList(tData.allTeacherInfo());
		System.out.println("-----------------------------------------------------------------");
	}
	
	static void searchByNum(TeacherData tData,int num) { // 2. 교사번호 검색
		
		
		System.out.println("-----------------------------------------------------------------");
		TeacherData.printTTitle();
		TeacherData.printTList(tData.searchByNum(num));
		System.out.println("-----------------------------------------------------------------");
		
	}

static void searchByPart(TeacherData tData,String part) { // 4. 교과목으로 검색
		
		
		System.out.println("-----------------------------------------------------------------");
		TeacherData.printTTitle();
		TeacherData.printTList(tData.searchByPart(part));
		System.out.println("-----------------------------------------------------------------");
		
	}
}
