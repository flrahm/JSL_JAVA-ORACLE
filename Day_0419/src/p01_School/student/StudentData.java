// �������� �����͸� ó���ϴ� Ŭ����
package p01_School.student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentData {

	private List<Student> sList = new ArrayList<Student>();

	public StudentData(String fileName) {
		sFileRead(fileName);
	}

	List<Student> sotedStudentInfo() { // �� ��ȣ �̸������� ������ ����Ʈ ��ȯ
		List<Student> returnList = sList;

		int jnum;
		int jpnum;
		///
		for (int i = 0; i < returnList.size(); i++)
			for (int j = 0; j < returnList.size() - 1 - i; j++) {
				jnum = Integer.parseInt(returnList.get(j).getBun());
				jpnum = Integer.parseInt(returnList.get(j+1).getBun());
				if (jnum > jpnum) {
					Student temp = returnList.get(j);
					returnList.set(j, returnList.get(j + 1));
					returnList.set(j+1, temp);
				}
			}
		////
		
		return returnList;
	}

	List<Student> searchByName(String str) { // �̸����� �˻�
		List<Student> returnList = new ArrayList<Student>();

		String name; // �̸��� �ϳ��� �ҷ��ͼ� �������� �뵵
		boolean sw; // ����ġ��
		for (int i = 0; i < sList.size(); i++) { // ��ü ����Ʈ��ŭ �˻�

			// indexOf �� ���� �� ����
			/*
			 * if(str.indexOf(name)>=0) returnList.add(sList.get(i));
			 */

			sw = true; // ����ġ�� �⺻���� ����
			name = sList.get(i).getName(); // i��° ����Ʈ���� �л� �̸��� ������ ����

			if (str.length() <= name.length()) { // ���� ���� �л� �̸����� �������� ����. �ƴϸ� ����ġ ��
				for (int j = 0; j < str.length(); j++) // ���� �� ���̸�ŭ �ݺ�
					if (str.charAt(j) != name.charAt(j)) // ���� �̸��� ����ġ�ϸ�
						sw = false; // ����ġ�� ��
			} else
				sw = false;

			if (sw) // ����ġ�� ����������
				returnList.add(sList.get(i)); // ���ϸ���Ʈ�� �߰�

		}

		return returnList; // ����Ʈ ��ȯ
	}

	Student searchStudentByNum(String num) { // �й����� �˻��ؼ� �л���ü ��ȯ
		Student returnStudent = null; // ��ȯ�� ��ü ����

		for (int i = 0; i < sList.size(); i++) // ����Ʈ ������ŭ �ݺ�
			if (sList.get(i).getBun().equals(num)) { // ��ȣ�� ���ؼ� ��ġ�ϸ�
				returnStudent = sList.get(i); // �������ְ�
				break; // ���ͼ�
			}
		return returnStudent; // ��ȯ
	}

	List<Student> allStudentInfo() {// ��ü �л� ��� ����
		return sList;
	}

	static void printSTitle() { // Ÿ��Ʋ�� ��� ����ƽ �޼ҵ�
		System.out.print("�й�\t");
		System.out.print("�̸�\t");
		System.out.print("��ȭ\t\t");
		System.out.print("����\t");
		System.out.print("��米��\t");
		System.out.println();
	}

	static void printStudent(Student std) { // �л� ��ü�� ����ϴ� ����ƽ �޼ҵ�
		if (std != null) {
			printSTitle();
			System.out.println(std);
		} else
			System.out.println("�ش� ������ �´� �л��� �����ϴ�");

	}

	static void printSList(List<Student> list) { // ����Ʈ ��ҵ��� ������ִ� ����ƽ �޼ҵ�
		printSTitle();
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}

	void sFileRead(String fileName) { // �����ڿ��� ȣ���Ҳ�. ���� �о ����Ʈ�� �������

		try {
			Scanner scan = new Scanner(new File(fileName));

			while (scan.hasNext()) {

				String[] str = scan.next().split(",");
				String bun = str[0];
				String name = str[1];
				String tel = str[2];
				int score = Integer.parseInt(str[3]);
				int tno = Integer.parseInt(str[4]);
				sList.add(new Student(bun, name, tel, score, tno));

			}

			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�");
		}
	}

	public List<Student> getsList() {
		return sList;
	}

	public void setsList(List<Student> sList) {
		this.sList = sList;
	}
}
