package p01_ListExam.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// �̸��� Ű����� �Է¹޾Ƽ� List �� �߰� �� ���
// �̸��� end �� ����
// ������ �̸� �ߺ� �ȵ�

public class ListTest01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in); //
		String name; // �̸��� �Է¹޾Ƽ� ������ ����
		boolean flag = true; // �ߺ��Ǵ°��� �ִ��� �˻��ϴ� �÷���. true �̸� �ߺ��� ����, false �̸� �ߺ������� �Ҳ�

		System.out.println("�̸��� �Է��ϼ���");
		while (true) {

			flag = true; // �÷��׸� true �� �ʱ�ȭ
			name = scan.next(); // �̸��� �Է¹���

			if (name.equals("end")) { // end�� �ԷµǸ� ����
				System.out.println("�����մϴ�");
				break;
			}

			///// �ߺ��Ǵ� ��Ұ� �ִ��� �˻�
			for (int i = 0; i < list.size(); i++) // ����Ʈ�� �����ŭ �ݺ�
				if (name.equals(list.get(i))) { // ���� �Էµ� �̸��� ����� �̸��� �� �������� �߰ߵǸ�
					System.out.println("�ߺ��Դϴ�");
					flag = false; // �÷��׸� false �� ����
					break; // �� �� �ʿ䰡 �����Ƿ� ��������
				}
			
			// flag = list.contains(name);		// ���� ��ü ����
			
			/////////////////////
			if (flag) // ���� ���� �˻縦 ����ϸ�(�ߺ����� ������)
				list.add(name); // �Էµ� �̸��� ����Ʈ�� �߰�

		}
		scan.close();

		// �ݺ��ڸ� �̿��Ͽ� ���
		System.out.println("=======================");
		Iterator<String> iter = list.iterator();

		while (iter.hasNext())
			System.out.println(iter.next());

	}

}
