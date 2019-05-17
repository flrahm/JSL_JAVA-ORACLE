package student;

import java.io.File;
import java.util.Scanner;

/* ��ȣ,�̸�,����1,����2,����3,����4,����5
 * 
 * ����� ��ȣ������
 * ��ȣ �̸� ���� ��� ����
 */

public class StudentExam {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(new File("E:\\���̺귯��\\����\\eclipse-workspace\\text//student.txt"));
		// ��ĳ�ʰ�ü �����ؼ� ���ϰ�� ����
		int cnt = 0; // �Էµ� ���� �������� ���� ���� ī���� ����
		while (scan.hasNext()) { // ������ ���������� ����
			scan.next(); // ���ٳѱ�
			cnt++; // ���� �Ѿ �� ���� ī���͸� ������Ŵ
		}
		System.out.println("�л� ���� " + cnt + "���Դϴ�");

		Student[] std = new Student[cnt]; // �л�Ŭ���� �迭�� ������ ���� �л� ���� �°� ����
		String[] inData = new String[cnt]; // �ؽ�Ʈ���Ͽ��� �������� �о ������ ���ڿ� �迭�� �л� ���� �°� ����

		scan = new Scanner(new File("E:\\���̺귯��\\����\\eclipse-workspace\\text//student.txt"));
		// �ٽ� ���������͸� ó������
		for (int i = 0; i < cnt; i++) { // ������ �ٸ�ŭ �о
			inData[i] = scan.next(); // ���ڿ� �迭�� ����
			std[i] = new Student(); // �л�Ŭ������ ����
			std[i].getData(inData[i]); // �л� Ŭ������ getData �Լ��� �ش� ���ڿ��� �־���
		}

		ranking(std, cnt); // �л� Ŭ�����迭�� �л� ����� �־��༭ ����� �������� ��ŷ�� �ű�
		sorting(std, cnt); // �л� Ŭ�����迭�� �л� ����� �־��༭ ��ȣ���� ���� ����
		Student.printTitle(); // ����ƽ�޼ҵ��� Ÿ��Ʋ�� ���

		for (int i = 0; i < cnt; i++) { // �л� �����ŭ(�л� Ŭ���� ������ŭ)
			std[i].printStd(); // Ŭ���� ��ҵ��� �������
		}

		scan.close();
	}

	static void ranking(Student[] std, int cnt) { // ��տ� ���� ��ŷ�� ���ϴ� �޼ҵ�
		for (int i = 0; i < cnt; i++) {
			int a = 1; // ����ű�� �뵵
			for (int j = 0; j < cnt; j++) {
				if (std[i].getAve() < std[j].getAve()) // getAve �� ����� ����� ���Ͽ� ���� ����
					a++;
			}
			std[i].setRank(a);
		}

	}

	static void sorting(Student[] std, int cnt) { // ��ȣ������ �����ϴ� �޼ҵ�

		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt - 1 - i; j++) {

				if (std[j + 1].getBun() < std[j].getBun()) { // getBun �� ����Ͽ� Ŭ���� ��ҵ鰣�� ��ȣ�� ���Ͽ�

					Student temp = new Student(); // ��������
					temp = std[j];
					std[j] = std[j + 1];
					std[j + 1] = temp;
				}

			}
		}

	}

}
