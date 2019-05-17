package customer.view;

import java.util.List;

import customer.vo.CustomerVO;

public class CustomerPrint {

	// ���� ���
	public static void printMain() {
		System.out.println("==================================");
		System.out.println("=         ������ ���α׷�                    =");
		System.out.println("==================================");
		System.out.println("	[1] �� ��ü ���");
		System.out.println("	[2] �ű� �� ���");
		System.out.println("	[3] �� �˻�");
		System.out.println("	[4] �� ���� ����");
		System.out.println("	[5] �� ���� ����");
		System.out.println("	[0] ���α׷� ����");
		System.out.println("----------------------------------");
		System.out.println("���Ͻô� �׸��� �����ϼ��� : ");
	}
	
	// ����Ʈ ���
	public static void printCList(List<CustomerVO> cList) {
		
		System.out.print("����ȣ\t");
		System.out.print("�̸�\t");
		System.out.print("����ó\t");
		System.out.print("\t");
		System.out.print("�����\t");
		System.out.print("�������\t");
		System.out.print("\t");
		System.out.print("����\t");
		System.out.print("�������\t");
		System.out.println();
		
		for(int i = 0; i < cList.size() ; i++) {
			CustomerVO cvo = cList.get(i);
			System.out.print(cvo.getNum()+"\t");
			System.out.print(cvo.getName()+"\t");
			System.out.print(cvo.getTel()+"\t");
			System.out.print(cvo.getOffice()+"\t");
			System.out.print(cvo.getBirthDay()+"\t");
			System.out.print(cvo.getGender()+"\t");
			System.out.print(cvo.getIndate()+"\t");
			System.out.println();
		}
	}
	
	// �� �Ѹ� ��� 
	public static void printCVO(CustomerVO cvo) {
		System.out.print("�� �� ��	:  ");
		System.out.println(cvo.getName());
		System.out.print("�� �� ó	:  ");
		System.out.println(cvo.getTel());
		System.out.print("��     ��	:  ");
		System.out.println(cvo.getAddr());
		System.out.print("�� �� ��	:  ");
		System.out.println(cvo.getOffice());
		System.out.print("��     ��	:  ");
		System.out.println(cvo.getBirthDay());
		System.out.print("��     ��	:  ");
		System.out.println(cvo.getGender());
		System.out.print("������� :" );
		System.out.println(cvo.getIndate());
		
	}
}
