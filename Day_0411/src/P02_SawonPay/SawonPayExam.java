package P02_SawonPay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SawonPayExam {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	// ��ĳ�� ��ü ����
		List<SawonPay> sList = new ArrayList<SawonPay>();	// ��� ��̸���Ʈ ����

		while (true) {
			try {	// ����ó����. ����� 
				System.out.print("������� : ");	
				String[] str = scan.next().split(","); // ��������� ���ٷ� �Է¹޾� , �� �������� �и�
				String id = str[0];	// ù��° ������ id �� ����
				if (id.equalsIgnoreCase("end"))	 // ���� id �� end �� ��� ����
					break;

				int grade = Integer.parseInt(str[1]);	// �����޿� �ι�° ������ ����
				int workTime = Integer.parseInt(str[2]);	// ���ѽð��� ����° ������ ����

				sList.add(new SawonPay(id, grade, workTime));	// �� ���� ������ SawonPay ��ü�� ������ ��̸���Ʈ�� �߰�
			} catch (Exception e) {
				System.out.println("�Է°������� ������ ������ϴ�");
			};

		}

		
		System.out.println();
		SawonPay.printTitle();	// ���̵� ��� ~~ �� ���� Ÿ��Ʋ ���

		int timeSum = 0;	// ���� �ð� �հ� �����
		int paySum = 0;	// �ְ��޿� �� �����
		for (int i = 0; i < sList.size(); i++) { // ��� ����Ʈ ������(�ο���) ��ŭ �ݺ�
			System.out.println(sList.get(i));	// �������̵� �Ǿ��ִ� ��ҵ��� ���
			timeSum += sList.get(i).getWorkTime();	// ���ѽð� �հ迡 �߰�
			paySum += sList.get(i).getW_pay();	// �ְ��޿� �հ迡 �߰�
		}
		System.out.println("�հ�\t\t\t" + timeSum + "\t" + paySum); // �������� �հ� ���

		scan.close();

	}

}
