// Teacher ���� �Լ� �κ�
package p01_School.teacher;

import java.util.Scanner;

public class TeacherMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String fileName = "E:\\���̺귯��\\����\\eclipse-workspace\\text\\Day_0419//teacher.txt";
		TeacherData tData = new TeacherData(fileName);
		
		int button;
		while(true) {
			
			System.out.println("�޴��� ������ : ");
			System.out.println("[1] ���� ���");
			System.out.println("[2] �����ȣ �˻�");
			System.out.println("[3] �̸����� �˻�");
			System.out.println("[4] ���������� �˻�");
			System.out.println("[0] ����");
			button = scan.nextInt();
			
			if(button == 0)	// 0�̸� ��������
				break;
			
			switch (button) {	// �Է� ���ڿ� ���� �ش�Ǵ� �޼ҵ带 ����
			case 1: information(tData); break;
			case 2:{
				System.out.println("���� ��ȣ�� �Է��ϼ��� : ");
				int num = Integer.parseInt(scan.next());
				searchByNum(tData,num); 
				break;
				}
			case 3:{
				System.out.println("�˻��� �̸��� �Է��ϼ���  : ");
				String name = scan.next();
				searchByName(tData,name);
				break;
			}
			case 4:{
				System.out.println("�˻��� �������� �Է��ϼ���  : ");
				String part = scan.next();
				searchByPart(tData,part);
				break;
			}
			default: System.out.println("�߸��� �Է��Դϴ�");
			}
			
		}
		scan.close();


	}
	
	
	static void searchByName(TeacherData tData,String name) {	//3. �̸����� �˻�
		System.out.println("-----------------------------------------------------------------");
		
		TeacherData.printTTitle();
		TeacherData.printTList(tData.searchByName(name));
		
		System.out.println("-----------------------------------------------------------------");
	}
	
	static void information(TeacherData tData) {	//  1.�����ؼ� ��� 
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("\t\t**��ü ���� ���**\n");
		TeacherData.printTTitle();
		TeacherData.printTList(tData.allTeacherInfo());
		System.out.println("-----------------------------------------------------------------");
	}
	
	static void searchByNum(TeacherData tData,int num) { // 2. �����ȣ �˻�
		
		
		System.out.println("-----------------------------------------------------------------");
		TeacherData.printTTitle();
		TeacherData.printTList(tData.searchByNum(num));
		System.out.println("-----------------------------------------------------------------");
		
	}

static void searchByPart(TeacherData tData,String part) { // 4. ���������� �˻�
		
		
		System.out.println("-----------------------------------------------------------------");
		TeacherData.printTTitle();
		TeacherData.printTList(tData.searchByPart(part));
		System.out.println("-----------------------------------------------------------------");
		
	}
}
