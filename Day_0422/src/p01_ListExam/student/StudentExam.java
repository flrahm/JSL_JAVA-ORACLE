package p01_ListExam.student;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class StudentExam {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Student> sList = new Vector<Student>();
		
		System.out.println("�л� �ڷḦ �Է��ϼ���");
		while (sList.size() < 5) {	// 5�� �����϶��� ����
			String[] str = scan.next().split(",");	// �Է¹޾Ƽ� "," �� �������� �ɰ�

			if (str.length == 3) {	// ��ȣ �̸� ���� 3���� ����� �Է��� �Ǿ�����
				int num = Integer.parseInt(str[0]);	// ù��°�� ��ȣ
				String name = str[1];	// �ι�°�� �̸�
				int score = Integer.parseInt(str[2]);	// ����°�� ����

				//��������. ��ȣ�� 0�̸� ����
				if (num == 0)
					break;
				
				Student s = new Student(num, name, score);// �Էµ� ������ ��ü�� �����ؼ�
				if (sList.contains(s) == false) { // �ߺ��� ������ ��ü ����
					sList.add(s);
					System.out.println("��ϵǾ����ϴ�");
				}
			}else
				System.out.println("�߸��� �Է��Դϴ�");
		}
		scan.close();
		
		//�ݺ��ڸ� �̿��� ����Ʈ ���
		System.out.println("��ȣ\t�̸�\t����");
		Iterator<Student> iter = sList.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
