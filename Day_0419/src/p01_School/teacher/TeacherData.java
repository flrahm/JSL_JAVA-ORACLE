// Teacher Data Ŭ����

package p01_School.teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherData {

	private List<Teacher> tList = new ArrayList<Teacher>();

	public TeacherData(String fileName) {
		tFileRead(fileName);
	}

	
	List<Teacher> searchByNum(int num) { // ��ȣ�� �˻�
		List<Teacher> returnList = new ArrayList<Teacher>();

		for (int i = 0; i < tList.size(); i++) {
			if (num == tList.get(i).getTno()) {
				returnList.add(tList.get(i));
			}
		}

		return returnList;
	}
	
	List<Teacher> searchByPart(String str) { // ���������� �˻�
		List<Teacher> returnList = new ArrayList<Teacher>();

		for (int i = 0; i < tList.size(); i++) {
			if (tList.get(i).getPart().indexOf(str) != -1) {
				returnList.add(tList.get(i));
			}
		}

		return returnList;
	}
	


	List<Teacher> searchByName(String str) { // �̸����� �˻�
		List<Teacher> returnList = new ArrayList<Teacher>();

		for (int i = 0; i < tList.size(); i++) {
			if (tList.get(i).getName().indexOf(str) != -1) {
				returnList.add(tList.get(i));
			}
		}

		return returnList;
	}

	List<Teacher> allTeacherInfo() {// ��ü ���� ��� ����
		sortList();	// ������ ��
		return tList;	// ������
	}
	
	void sortList() {	// ����Ʈ �Ի����ڷ� ����

		int jNum, jpNum;
		String tempStr;
		String[] tempStrArr;
		for(int i = 0; i < tList.size() ; i++)
			for(int j = 0 ; j < tList.size() - 1 - i ; j++) {	// �������� �˰���
				
				tempStrArr = tList.get(j).getRegDate().split("/");	// ��¥�� �ҷ��ͼ� ���ø� �� ������
				tempStr = tempStrArr[0]+tempStrArr[1]+tempStrArr[2];	// �ϳ��� ���ļ�
				jNum = Integer.parseInt(tempStr);	//��Ʈ�� �����ͷ� ��ȯ
				
				tempStrArr = tList.get(j+1).getRegDate().split("/");	// ���������� ����
				tempStr = tempStrArr[0]+tempStrArr[1]+tempStrArr[2];
				jpNum = Integer.parseInt(tempStr);
				
				if(jNum > jpNum) {	// ���ؼ� ����
					Teacher temp = tList.get(j);
					tList.set(j, tList.get(j+1));
					tList.set(j+1, temp);
				}
			}
	}
	
	static void printTTitle() { // Ÿ��Ʋ�� ��� ����ƽ �޼ҵ�
		System.out.print("��ȣ\t");
		System.out.print("�̸�\t");
		System.out.print("��ȭ\t\t");
		System.out.print("������\t");
		System.out.print("����\t");
		System.out.print("�Ի�����\t");
		System.out.println();
	}
	
	static void printTList(List<Teacher> list) {	// ����Ʈ ���

			for (int i = 0; i < list.size(); i++)
				System.out.println(list.get(i));

	}

	void tFileRead(String fileName) {	// ���� �б�

		try {
			Scanner scan = new Scanner(new File(fileName));

			while (scan.hasNext()) {

				String[] str = scan.next().split(",");
				int tno = Integer.parseInt(str[0]);
				String name = str[1];
				String tel = str[2];
				String part = str[3];
				int age = Integer.parseInt(str[4]);
				String regDate = str[5];
				tList.add(new Teacher(tno, name, tel, part, age,regDate));

			}

			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�");
		}
	}

	public List<Teacher> gettList() {
		return tList;
	}

	public void settList(List<Teacher> tList) {
		this.tList = tList;
	}
}
