// ���θ޼ҵ�

package p01_school;

public class SchoolMain {

	public static void main(String[] args) {
		
		String sFileName = "E:\\���̺귯��\\����\\eclipse-workspace\\text\\Day_0418//student.txt";
		String tFileName = "E:\\���̺귯��\\����\\eclipse-workspace\\text\\Day_0418//teacher.txt";
		
		StudentData sData = new StudentData(sFileName);
		TeacherData tData = new TeacherData(tFileName);

		/*
		// ��ü ����Ʈ ���
		System.out.println("��ü ����Ʈ ���");
		SchoolModel.printSList(sData.getsList());
		System.out.println();
		SchoolModel.printTList(tData.gettList());
		System.out.println("------------------------------");
		System.out.println();
		*/
		// �����ȣ�� �Է��Ͽ� �ش� ���簡 ����ϴ� �л� ��� ��� 
		int tno = 13;
		SchoolModel.printSList(SchoolModel.sListByTno(sData.getsList(), tData.teacherByTno(tno)));
		System.out.println();
		int tno2 = 15;
		SchoolModel.printSList(SchoolModel.sListByTno(sData.getsList(), tData.teacherByTno(tno2)));
		System.out.println();
		System.out.println("------------------------------");
		// �Է� ���� �̻��� ���� �л� ��� ���
		SchoolModel.printSList(sData.upScore(70));
		System.out.println();
		System.out.println("------------------------------");
		// �Է� �г⿡ �ش��ϴ� �л� ��� ���
		SchoolModel.printSList(sData.listOfYear("1"));
		System.out.println();
		System.out.println("------------------------------");
		// �Է� ���� �̻��� ���� ���� ��� ���
		int age = 30;
		SchoolModel.printTList(tData.upAge(age));
		System.out.println();
		System.out.println("------------------------------");
		// �л� ��ȣ�� �Է��ؼ� ��� ���縦 ���
		String bun = "2123";
		SchoolModel.printTeacherByStudentTno(tData.gettList(), sData.studentByBun(bun));
		String bun2 = "9999";
		SchoolModel.printTeacherByStudentTno(tData.gettList(), sData.studentByBun(bun2));
	}

}
