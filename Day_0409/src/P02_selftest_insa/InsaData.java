package P02_selftest_insa;

import java.util.ArrayList;
import java.util.List;

public class InsaData {

	List<Insa> list = new ArrayList<Insa>();	// �λ� ��̸���Ʈ�� ���� 

	public InsaData() {	// ����Ʈ ������
	}

	public InsaData(List<Insa> list) { // ������
		this.list = list;
	}

	void printTitle() {	// Ÿ��Ʋ ��¿� �޼ҵ�
		System.out.println("***�޿� ���� ���α׷�***");
		System.out.print("�μ���\t");
		System.out.print("���\t");
		System.out.print("�̸�\t");
		System.out.print("�޿�\t");
		System.out.println();
	}

	String printPay(int pay) {	// �޿��� "," �� ����ִ� �޼ҵ�. ������ �״�� ����� 

		String str = Integer.toString(pay);
		int len = str.length();
		int start = len % 3;
		int iter = len / 3;
		String str2 = "";
		//
		if (start != 0)
			str2 = str.substring(0, start) + ",";
		//
		for (int i = 0; i < iter; i++) {
			if (i == 0)
				str2 = str2 + str.substring(start + i * 3, start + 3 + i * 3);
			else
				str2 = str2 + "," + str.substring(start + i * 3, start + 3 + i * 3);
		}
		//
		if (len > 3)
			return str2;
		else
			return str;

	}

	void printBody() {	// �������� ������ �ٷ�� �޼ҵ�. ���Ⱑ �߿�
		int cnt = 0;	// ������ ���� �뵵
		boolean sw = true;	// �μ����� ���� �� �ΰ��� �����ϴ� ����ġ. �⺻���� ��
		String part = list.get(0).getPart();	// �μ����� �����ϴ� ����. �⺻���� �� ó�� �ԷµǴ� �μ���

		int partSum = 0;	// �μ��� �޿��� ���� ���
		int totSum = 0;		// ����Ʈ ��ü�� ���� ���

		while (cnt < list.size()) {	// ����Ʈ�� ������ŭ �ݺ�

			// �μ����� �ٲ������
			if (list.get(cnt).getPart().equals(part) != true) { // �μ����� �ٲ������
				part = list.get(cnt).getPart();	// ���� �ٲ� �μ������� ���� 
				sw = true;	// �μ����� ��� ����ġ�� ��
				System.out.println("�հ� : \t\t\t" + printPay(partSum)); // �ش� �μ��� �޿� �Ѿ��� ���
				partSum = 0;	// �μ� �Ѿ��� ���� 0���� �ʱ�ȭ
			}
			//
			if (sw == true) { // ����  ����ġ�� ���̸�
				System.out.print(list.get(cnt).getPart());	// �μ����� ����ϰ�
				sw = false;	// ����ġ�� ���� 
			}
			//
			System.out.print("\t");
			System.out.print(list.get(cnt).getSabun());	// ������ ��ҵ� ��� 
			System.out.print("\t");
			System.out.print(list.get(cnt).getName());
			System.out.print("\t");
			System.out.print(printPay(list.get(cnt).getPay()));
			System.out.println("");
			//
			partSum += list.get(cnt).getPay();	// �μ��� �޿� ����
			totSum += list.get(cnt).getPay();	// �� �޿� ����
			cnt++; // ī��Ʈ ����
			
			if(cnt == list.size())
				System.out.println("�հ� : \t\t\t" + printPay(partSum));
		}

		System.out.println("�� �հ� : \t\t\t" + printPay(totSum));	// while ���� ������ �������� �Ѿ� ���

	}

}
