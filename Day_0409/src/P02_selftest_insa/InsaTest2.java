package P02_selftest_insa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsaTest2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	// ��ĳ�� ��ü ����
		List<Insa> insaList = new ArrayList<Insa>();	 // ��� ����Ʈ ���� 


		while (true) {	
			System.out.println("��� ������ �Է��ϼ��� : ");
			String inStr = scan.next();	// ���� ��ü�� Ű����� �Է¹���
			inStr.trim();
			try {
			String[] str = inStr.split(",");	// "," �� �������� �߶� ��Ʈ�� �迭�� ����
			String part = str[0];	// ��Ʈ�� �迭�� ù��° ������ �μ���
			if (part.equalsIgnoreCase("end"))	// ���� �μ����� ��ҹ��ڸ� �����ϰ� end �� ������
				break;	// ������

			int sabun = Integer.parseInt(str[1]);	// �ι�° ������ ��Ʈ������ ��Ʈ�� ��ȯ�Ͽ� ����
			System.out.println(sabun); // �� �ǳ� �׽�Ʈ��. �����
			String name = str[2];	// ����° ������ �̸�����
			int pay = Integer.parseInt(str[3]);// �׹�° ������ ��Ʈ������ �ٲپ� ����
			
			insaList.add(new Insa(part, sabun, name, pay));	// ���� �͵��� ��̸���Ʈ�� �߰�
			}
			catch(Exception e) {
				System.out.println("�Է� �������� ������ ������ϴ�");
			};

		}
		scan.close();
		InsaData insaData = new InsaData(insaList);

		insaData.printTitle();
		insaData.printBody();
	}
	
	
	
	

}
