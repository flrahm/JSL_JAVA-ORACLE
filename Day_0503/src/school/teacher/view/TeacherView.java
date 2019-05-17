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

	// 교직원 등록 ...2
	
	public void addNewTeacher() {
		
		System.out.println("** 새로운 교직원 등록 **");
		System.out.print("교직원 이름 : ");
		String name = scan.nextLine();
		System.out.print("교직원 전화번호 : ");
		String tel = io.inputTel(1);
		System.out.print("담당 과목 : ");
		String part = scan.nextLine();
		System.out.println("생일 : ");
		String birthday = io.inputDate(2);
		System.out.println("등록일 : ");
		String regdate = io.inputDate(1);
		
		int insertOk = tDAO.insertTeacher(name, tel, part, birthday, regdate);
		
		if(insertOk != 0)
			System.out.println("등록 성공");
		else
			System.out.println("등록 실패");
	}
	
	// 교직원 전체 목록 출력...1
	public void printAllTeacher() {

		System.out.println("** 전체 교직원 목록 출력 **");
		List<TeacherVO> tList = tDAO.selectAllTeacher();
		if (tList.size() > 0)
			TeacherPrint.printTList(tList);
		else
			System.out.println("교직원 목록이 비어있습니다");
	}
}
