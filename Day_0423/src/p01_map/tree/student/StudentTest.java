package p01_map.tree.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Student> sList = new ArrayList<Student>();	// �Է¼� ����� ���� ��� ����Ʈ
		Set<Student> sSet = new TreeSet<Student>();	// ��ȣ�� ���� ����� ���� Ʈ����

		while (true) {
			
			String inStr = scan.next();	// ������ �Է¹���
			
			if(inStr.equals("0"))	// ���� 0�̸� ����
				break;	
			
			String[] str = inStr.split(",");	// "," �� �������� �ɰ��� ���ڿ� �迭�� �޾���

			if (str.length == 3) {	// ���� 3���� ������
				if (str[0] != null && str[1] != null && str[2] != null) {	// ����� �ԷµǾ�����

					int num = Integer.parseInt(str[0]);	// ù��°�� ��ȣ��
					if (num == 0)	// ���� 0���̸� ����
						break;	
					String name = str[1];	// �ι�°�� �̸�����
					int score = Integer.parseInt(str[2]);	// ����°�� ������ 
					
					Student temp = new Student(num,name,score);	// ���� 3 ��ҵ�� ��ü ����
					if(!sList.contains(temp)) {	// ���� �ߺ��� �ƴϸ�
						sList.add(temp);	// ����Ʈ�� �߰�
						sSet.add(temp);	// Ʈ���¿� �߰�
					}
					

				} else
					System.out.println("�߸��� �Է��Դϴ�");
			} else
				System.out.println("�߸��� �Է��Դϴ�");

		}	// �ݺ��� ����
		scan.close();

		// ����Ʈ ���
		System.out.println("���� ��");
		System.out.println("��ȣ\t�̸�\t����");
		for(int i = 0; i < sList.size();i++)
			System.out.println(sList.get(i));
		
		// Ʈ���� ���
		System.out.println("-------------------------------------");
		System.out.println("��ȣ������ ���� ��");
		System.out.println("��ȣ\t�̸�\t����");
		Iterator<Student> iter = sSet.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
