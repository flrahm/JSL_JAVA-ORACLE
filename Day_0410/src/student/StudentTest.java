package student;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import student.dao.StudentData;
import student.vo.Student;

public class StudentTest {

	public static void main(String[] args) throws Exception{

	
		Scanner scan = new Scanner(new File("E:\\���̺귯��\\����\\eclipse-workspace\\text\\Day_0410\\studentData.txt"));
		
		List<Student> sList = new ArrayList<Student>();

		String ans;	// ����ǥ�� ������ ��Ʈ��
		ans = scan.next();	// ��ù��°���� ���信 ����
		while (scan.hasNext()) {	// ����������
			sList.add(new Student(scan.next()));	// ���� ������ �о �л� Ŭ������ inData�� ����. �����ں����� �������
		}
		scan.close();
		
		StudentData sData = new StudentData(sList,ans);	// StudentData Ŭ������ ����Ʈ ����
		sData.body();	// ����

	}

}
