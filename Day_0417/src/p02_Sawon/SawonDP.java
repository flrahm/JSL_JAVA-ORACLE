package p02_Sawon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SawonDP {

	String fileName;
	List<Sawon> sList = new ArrayList<Sawon>();

	public SawonDP() {
	}

	void printByDepartment(int departmentCode) {

		System.out.println("�μ��ڵ� " + departmentCode + " �� �ش��ϴ� ������� ����մϴ�");
		printTitle();
		for (int i = 0; i < sList.size(); i++) {

			if (departmentCode == sList.get(i).getDepartmentCode())
				System.out.println(sList.get(i));

		}

		System.out.println();
	}

	void selectSawon(String name) {

		System.out.println(name + " �� �̸��� ���� ����� ã���ϴ�");
		printTitle();
		Sawon temp = null;
		for (int i = 0; i < sList.size(); i++) {
			if (name.equals(sList.get(i).getName())) {
				temp = sList.get(i);
				break;
			}
		}

		if (temp == null)
			System.out.println("�ش� �̸��� ���� ����� �����ϴ�");
		else
			System.out.println(temp);
		System.out.println();
	}

	void selectSawon(int sabun) {
		
		System.out.println(sabun + " �� ����� ���� ����� ã���ϴ�");
		printTitle();
		Sawon temp = null;
		for (int i = 0; i < sList.size(); i++) {
			if (sabun == sList.get(i).getSabun()) {
				temp = sList.get(i);
				break;
			}
		}

		if (temp == null)
			System.out.println("�ش� �̸��� ���� ����� �����ϴ�");
		else
			System.out.println(temp);
		
		System.out.println();

	}

	void printList() {
		System.out.println("��ü ��� ����� ����մϴ�");
		printTitle();
		for (int i = 0; i < sList.size(); i++)
			System.out.println(sList.get(i));
		System.out.println();
	}

	private void printTitle() {
		System.out.println("�μ�\t���\t�̸�\t����");
	}
	
	void readFile(String fileName) {

		try {
			Scanner scan = new Scanner(new File(fileName));
			while (scan.hasNext()) {
				String[] str = scan.next().split(",");

				int sabun = Integer.parseInt(str[0]);
				int departmentCode = (int) (str[0].charAt(0) - '1' + 1);
				String name = str[1];
				int pay = Integer.parseInt(str[2]);

				boolean flag = sList.add(new Sawon(sabun, departmentCode, name, pay));
				if (flag)
					System.out.println(sList.size() + " �� ° ����� ���������� ��ϵǾ����ϴ�");
			}

			System.out.println();
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�");
		}

	}

}
