// �����б� & ���ĺ� ����
package P02;

import java.io.File;
import java.util.Scanner;

public class Ex02_FileReadAndApbCount {

	public static void main(String[] args) throws Exception {

		//String fileName = "E:\\\\���̺귯��\\\\����\\\\eclipse-workspace\\\\text\\\\Day_0412//test.txt";
		String fileName = "C:\\Windows//win.ini";	
		Scanner scan = new Scanner(new File(fileName)); // ��ĳ�� ��ü ����
		int cnt = 0; // ������ �������� ī��Ʈ
		while (scan.hasNext()) { // �������� ����������
			scan.next(); // ���پ� �ѱ�
			cnt++; // ���� ����
		}

		String[] str = new String[cnt]; // ������ �������� ī��Ʈ
		int[] apb = new int[26 + 2]; // ���Ĺ� ���� + ���ĺ� ���� + ��ü �Է�

		scan = new Scanner(new File(fileName)); // ���� �����͸� ��ó������ ����

		for (int i = 0; i < cnt; i++) { // ���� �� �� ��ŭ
			str[i] = scan.next(); // ���ڿ� �迭�� �ް�
			str[i] = str[i].trim(); // ���� ���ְ�
			str[i] = str[i].toUpperCase(); // �빮�ڷ� �ٲ۴�����

			for (int j = 0; j < str[i].length(); j++) { // �Է¹��� ���� �˻���

				if (str[i].charAt(j) >= 'A' && str[i].charAt(j) <= 'Z') { // ���� �Է��� �빮�� A~Z ������
					apb[str[i].charAt(j) - 65]++; // �ش� ���ĺ� ������ ���������ְ�
					apb[apb.length - 2]++; // ���ĺ� ���� ������ �÷��ְ�
				} // �ι�° ������ �����

				apb[apb.length - 1]++; // ���� ��ü ������ ����������
			}
		} //

		for (int i = 0; i < apb.length - 2; i++) { // A~Z �� ���� �ִ°͸� ���
			if (apb[i] != 0)
				System.out.print((char) (i + 'A') + "\t");
		}
		System.out.println("���ĺ�����\t�� �Է°���");

		for (int i = 0; i < apb.length; i++) { // ���� ���
			if (apb[i] != 0)
				System.out.print(apb[i] + "\t");
		}

		scan.close();
	}

}