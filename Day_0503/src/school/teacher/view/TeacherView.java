package school.teacher.view;

import java.util.List;
import java.util.Scanner;

import school.db.IO;
import school.teacher.dao.TeacherDAO;
import school.teacher.vo.TeacherVO;

public class TeacherView {

	IO io = new IO();
	TeacherDAO tDAO = new TeacherDAO();
	Scanner scan = new Scanner(System.in);

	// ������ ��� ...2
	
	public void addNewTeacher() {
		
		System.out.println("** ���ο� ������ ��� **");
		System.out.print("������ �̸� : ");
		String name = scan.nextLine();
		System.out.print("������ ��ȭ��ȣ : ");
		String tel = io.inputTel(1);
		System.out.print("��� ���� : ");
		String part = scan.nextLine();
		System.out.println("���� : ");
		String birthday = io.inputDate(2);
		System.out.println("����� : ");
		String regdate = io.inputDate(1);
		
		int insertOk = tDAO.insertTeacher(name, tel, part, birthday, regdate);
		
		if(insertOk != 0)
			System.out.println("��� ����");
		else
			System.out.println("��� ����");
	}
	
	// ������ ��ü ��� ���...1
	public void printAllTeacher() {

		System.out.println("** ��ü ������ ��� ��� **");
		List<TeacherVO> tList = tDAO.selectAllTeacher();
		if (tList.size() > 0)
			TeacherPrint.printTList(tList);
		else
			System.out.println("������ ����� ����ֽ��ϴ�");
	}
}
