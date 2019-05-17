// Student main �޼ҵ尡 ���Ե� Ŭ����
package p01_School.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String fileName = "E:\\���̺귯��\\����\\eclipse-workspace\\text\\Day_0419//student.txt";
		StudentData sData = new StudentData(fileName);
		
		int button;
		while(true) {
			
			System.out.println("�޴��� ������ : ");
			System.out.println("[1] ���� ���");
			System.out.println("[2] �й� �˻�");
			System.out.println("[3] �̸����� �˻�");
			System.out.println("[4] �г� �� ��ȣ������ �����ؼ� ���");
			System.out.println("[0] ����");
			button = scan.nextInt();
			
			if(button == 0)	// 0�̸� ��������
				break;
			
			switch (button) {	// �Է� ���ڿ� ���� �ش�Ǵ� �޼ҵ带 ����
			case 1: information(sData); break;
			case 2:{
				System.out.println("�л� ��ȣ�� �Է��ϼ��� : ");
				String num = scan.next();
				searchByNum(sData,num); 
				break;
				}
			case 3:{
				System.out.println("�˻��� �̸��� �Է��ϼ���  : ");
				String name = scan.next();
				searchByName(sData,name);
				break;
			}
			case 4:{
				sortedInformation(sData);break;
			}
			default: System.out.println("�߸��� �Է��Դϴ�");
			}
			
		}
		scan.close();
	

	}
	
	static void sortedInformation(StudentData sData) {
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\t\t**���ĵ� �л� ���**\n");
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
		System.out.println("\t\t**��ü �л� ���**\n");
		StudentData.printSList(sData.allStudentInfo());
		System.out.println("-----------------------------------------------------------------");
	}
	
	static void searchByNum(StudentData sData,String num) {
		
		
		System.out.println("-----------------------------------------------------------------");
		StudentData.printStudent(sData.searchStudentByNum(num));
		System.out.println("-----------------------------------------------------------------");
		
	}

}
