// ������ �л��� �����͸� ���� �ٷ�� �޼ҵ尡 ��� Ŭ����

package p01_school;

import java.util.ArrayList;
import java.util.List;

public class SchoolModel {

	// �л��� ��米�縦 ���� ����Ʈ���� ã�Ƽ� ���
	static void printTeacherByStudentTno(List<Teacher> tList, Student student) {
		if (student != null) {
			for (int i = 0; i < tList.size(); i++) {
				if (tList.get(i).getTno() == student.getTno()) {
					String say = student.getName() + " �� ��� ����� " + tList.get(i).getName() + " �Դϴ�";
					System.out.println(say);
					return;
				}
			}
			System.out.println("�ش� �л��� ����ϴ� ���簡 �����ϴ� ");
		} else {
			System.out.println("�߸��� �л� �Է��Դϴ� ");
		}

	}

	//////// ���� ��ȣ(Tno)�� ���� �ش� �л� ����Ʈ ��ȯ
	static List<Student> sListByTno(List<Student> sList, Teacher teacher) {
		try {

			System.out.println(teacher.getName() + " �� ����ϴ� �л� ���");
			List<Student> returnList = new ArrayList<Student>();

			for (int i = 0; i < sList.size(); i++)
				if (teacher.getTno() == sList.get(i).getTno())
					returnList.add(sList.get(i));

			return returnList;
		} catch (NullPointerException e) {
			System.out.println("��ϵ��� ���� �����ȣ�Դϴ�");
			return null;
		}
	}

	///////////

	///// �л� ����Ʈ ���
	static void printSList(List<Student> list) {
		if (list != null)
			for (int i = 0; i < list.size(); i++)
				System.out.println(list.get(i));
	}

	/// ���� ����Ʈ ���
	static void printTList(List<Teacher> list) {

		if (list != null)
			for (int i = 0; i < list.size(); i++)
				System.out.println(list.get(i));
	}

}
