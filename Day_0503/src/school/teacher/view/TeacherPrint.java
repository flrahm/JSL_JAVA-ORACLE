package school.teacher.view;

import java.util.List;

import school.teacher.vo.TeacherVO;

public class TeacherPrint {
	
	// ������ ���� ���
	public static void printMain() {
		System.out.println("==================================");
		System.out.println("=        ������ ���� ���α׷�                  =");
		System.out.println("==================================");
		System.out.println("	[1] ������ ��ü ���");
		System.out.println("	[2] �ű� ������ ���");
		System.out.println("	[3] ������ �˻�");
		System.out.println("	[4] ������ ���� ����");
		System.out.println("	[5] ������ ���� ����");
		System.out.println("	[0] ���α׷� ����");
		System.out.println("----------------------------------");
		System.out.println("���Ͻô� �׸��� �����ϼ��� : ");
	}

	// ������ ����Ʈ ���
	public static void printTList(List<TeacherVO> tList) {		
		System.out.print("�����ȣ\t");
		System.out.print("�̸�\t");
		System.out.print("��ȭ\t\t");
		System.out.print("������\t");
		System.out.print("�������\t\t");
		System.out.print("�����");
		System.out.println();
		
		for(int i = 0; i < tList.size(); i++) {
			
			System.out.print(tList.get(i).getTno());
			System.out.print("\t");
			System.out.print(tList.get(i).getName());
			System.out.print("\t");
			
			System.out.print(tList.get(i).getTel());
			System.out.print("\t");
			
			System.out.print(tList.get(i).getPart());
			System.out.print("\t");
			
			System.out.print(tList.get(i).getBirthday());
			System.out.print("\t");
			
			System.out.print(tList.get(i).getRegdate());
			System.out.print("\t");
			System.out.println();
		}
		
		
	}
}
