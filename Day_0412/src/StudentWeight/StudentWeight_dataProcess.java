// �л�ü�� ������ ó�� Ŭ����

package StudentWeight;

import java.util.ArrayList;
import java.util.List;

public class StudentWeight_dataProcess {

	List<StudentWeight> sList = new ArrayList<StudentWeight>();
	int maxWeight;
	int minWeight;

	public StudentWeight_dataProcess(List<StudentWeight> sList) {
		this.sList = sList;
	}

	void body() {

		sortByBan(); // ���� �������� ����
		calMinAndMax(); // �ִ�ü�� �ּ�ü�� ���
		printTitle(); // Ÿ��Ʋ ���
		printBody(); // ������ ���
	}

	void printBody() {

		int nowBan = sList.get(0).getBan();	// ���� ���� �� ó�� �迭�� ������ ����
		boolean sw = true;	// ���� ���� ����ġ.

		for (int i = 0; i < sList.size(); i++) {

			if (sw == true) {	// ����ġ�� ����������
				System.out.print(nowBan + "\t");	// ���� ���
				sw = false;	// ����ġ�� ��
			} else
				System.out.print("\t");	// ���������� �׳� �Ǹ� ����

			System.out.print(sList.get(i).getStdNum() + "\t");	// ��ȣ�� ����
			System.out.print(sList.get(i).getWeight() + "\t");	// ü���� ����

			if (i < sList.size() - 1 && sList.get(i + 1).getBan() != nowBan) {
				// i-1 ��°�̰� ���� ���̶� �� ���� ���̶� �ٸ��� (���� �ٲ��)
				nowBan = sList.get(i + 1).getBan();	// ����Ʈ�� ���� ���� �ٲ�� ������ �ٲ���
				sw = true;	// ����ġ�� ��
			}

			System.out.println();

		}
		System.out.println("�ִ� ü�� : " + maxWeight);		// �ִ�ü�����
		System.out.println("�ּ� ü�� : " + minWeight);		// �ּ�ü�� ���

	}

	void sortByBan() {	// ���� �������� ����

		for (int i = 0; i < sList.size(); i++)
			for (int j = 0; j < sList.size() - i - 1; j++)
				if (sList.get(j).getBan() > sList.get(j + 1).getBan()) {
					StudentWeight temp = sList.get(j);
					sList.set(j, sList.get(j + 1));
					sList.set(j + 1, temp);
				}

	}

	void printTitle() {	// Ÿ��Ʋ ���
		System.out.println("��\t��ȣ\tü��");
	}

	void calMinAndMax() {	// �ִ� �ּ�ü�� ���ϴ� �޼ҵ�
		maxWeight = sList.get(0).getWeight();
		minWeight = sList.get(0).getWeight();

		for (int i = 0; i < sList.size(); i++) {
			if (maxWeight < sList.get(i).getWeight())
				maxWeight = sList.get(i).getWeight();

			if (minWeight > sList.get(i).getWeight())
				minWeight = sList.get(i).getWeight();
		}

	}

}
