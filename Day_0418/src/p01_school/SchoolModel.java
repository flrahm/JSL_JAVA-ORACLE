// 선생과 학생의 데이터를 같이 다루는 메소드가 담긴 클래스

package p01_school;

import java.util.ArrayList;
import java.util.List;

public class SchoolModel {

	// 학생의 담당교사를 선생 리스트에서 찾아서 출력
	static void printTeacherByStudentTno(List<Teacher> tList, Student student) {
		if (student != null) {
			for (int i = 0; i < tList.size(); i++) {
				if (tList.get(i).getTno() == student.getTno()) {
					String say = student.getName() + " 의 담당 교사는 " + tList.get(i).getName() + " 입니다";
					System.out.println(say);
					return;
				}
			}
			System.out.println("해당 학생을 담당하는 교사가 없습니다 ");
		} else {
			System.out.println("잘못된 학생 입력입니다 ");
		}

	}

	//////// 선생 번호(Tno)를 가진 해당 학생 리스트 반환
	static List<Student> sListByTno(List<Student> sList, Teacher teacher) {
		try {

			System.out.println(teacher.getName() + " 가 당담하는 학생 목록");
			List<Student> returnList = new ArrayList<Student>();

			for (int i = 0; i < sList.size(); i++)
				if (teacher.getTno() == sList.get(i).getTno())
					returnList.add(sList.get(i));

			return returnList;
		} catch (NullPointerException e) {
			System.out.println("등록되지 않은 교사번호입니다");
			return null;
		}
	}

	///////////

	///// 학생 리스트 출력
	static void printSList(List<Student> list) {
		if (list != null)
			for (int i = 0; i < list.size(); i++)
				System.out.println(list.get(i));
	}

	/// 선생 리스트 출력
	static void printTList(List<Teacher> list) {

		if (list != null)
			for (int i = 0; i < list.size(); i++)
				System.out.println(list.get(i));
	}

}
