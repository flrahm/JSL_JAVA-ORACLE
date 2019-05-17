// peopleTest

package P01_Apart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	// ��ĳ�� ��ü ����
		List<People> pList = new ArrayList<People>();	// People ��� ����Ʈ ����

		while (true) { //
			try {	// ����ó����
				System.out.println("��, ����, ���̸� �Է��ϼ���");
				String inStr = scan.next();	// ���ڿ��� �޾Ƽ�
				inStr.trim();	// ���������ϰ�
				String[] str = inStr.split(",");	// , �� �������� �ɰ����� ���ڿ� �迭�� �޾��� 
				int dong = Integer.parseInt(str[0]);	// ù��°���� ��
				if (dong == 0)	// ���� ���� 0�̸� 
					break;	// ����
				String name = str[1];	// �ι�° ������ �̸�
				int age = Integer.parseInt(str[2]);	// ����° ������ ����
				pList.add(new People(dong, name, age));	 // ��̸���Ʈ�� ��ü�����ؼ� �߰�����

			} catch (Exception e) {	// ����ó����
				System.out.println("�߸��� �Է��Դϴ�");
			}
		}//
		scan.close();	
		PeopleData pTest = new PeopleData(pList);	// ������ ó���ϴ� Ŭ������ ���� 
		pTest.body();	// ������ ó���ϴ� Ŭ�������� �޼ҵ带 �ҷ���
	}
	
	


}
