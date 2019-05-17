package school.teacher.main;

import java.util.Scanner;

import school.teacher.view.TeacherPrint;
import school.teacher.view.TeacherView;

public class TeacherMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		TeacherView tView = new TeacherView();
		
		boolean flag = true;

		while (flag) {

			TeacherPrint.printMain();
			String sw = scan.nextLine();
			System.out.println("----------------------------------");

			switch (sw) {
			case "0":
				System.out.println("종료합니다");
				flag = false;
				break;
			case "1":
				tView.printAllTeacher();
				break;
			case "2":
				tView.addNewTeacher();
				break;
			case "3":
				
				break;
			case "4":
				
				break;
			case "5":
				
				break;
			default:
				System.out.println("잘못된 입력입니다");
				break;
				
			}
		}
		scan.close();

	}

}
