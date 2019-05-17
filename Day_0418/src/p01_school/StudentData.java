// �л��� ��ϰ� �л��� ��ϸ��� ó���ϴ� �޼ҵ尡 ��� Ŭ����

package p01_school;

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

	Student studentByBun(String bun) {	// ��ȣ�� �Է��ؼ� �ش� ��ȣ�� �´� �л� ��ȯ
		Student returnStu = null;

		for (int i = 0; i < sList.size(); i++)
			if (sList.get(i).getBun().equals(bun)) {
				returnStu = sList.get(i);
				break;
			}
		
		return returnStu;
	}

	// �Է��� �г⿡ �ش��ϴ� �л� ����Ʈ ��ȯ
	List<Student> listOfYear(String year) {
		List<Student> returnList = new ArrayList<Student>();
		System.out.println(year + " �г� �л� ���");

		for (int i = 0; i < sList.size(); i++)
			if (sList.get(i).getBun().substring(0, 1).equals(year))
				returnList.add(sList.get(i));

		return returnList;
	}

	List<Student> upScore(int score) { // score �̻��� ������ ���� �л� ����Ʈ ��ȯ
		List<Student> returnList = new ArrayList<Student>();

		System.out.println(score + " �� �̻��� �л� ���");
		for (int i = 0; i < sList.size(); i++)
			if (sList.get(i).getScore() >= score)
				returnList.add(sList.get(i));

		return returnList;
	}

	void sFileRead(String fileName) {

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
