package Sawon.ui;

import java.util.List;

import Sawon.vo.DeptVO;
import Sawon.vo.SawonVO;

public class SawonPrint {
	// ���� ���
	public static void printMain() {
		System.out.println("==================================");
		System.out.println("=        ��� & �μ����� ���α׷�            =");
		System.out.println("==================================");
		System.out.println("	[1] ��� ��ü ���");
		System.out.println("	[2] �ű� ��� ���");
		System.out.println("	[3] ��� �˻�");
		System.out.println("	[4] ��� ���� ����");
		System.out.println("	[5] ��� ���� ����");
		System.out.println("	[0] ���α׷� ����");
		System.out.println("----------------------------------");
		System.out.println("���Ͻô� �׸��� �����ϼ��� : ");
	}

	// ����Ʈ ���
	public static void printSList(List<SawonVO> sList) {

		System.out.print("�����ȣ\t");
		System.out.print("�̸�\t");
		System.out.print("\t");
		System.out.print("������\t");
		System.out.print("\t");
		System.out.print("����ȣ\t");
		System.out.print("�Ի�����\t");
		System.out.print("\t");
		System.out.print("�޿�\t");
		System.out.print("Ŀ�̼�\t");
		System.out.print("�μ���\t");
		System.out.println();

		for (int i = 0; i < sList.size(); i++) {
			SawonVO cvo = sList.get(i);
			// ���
			System.out.print(cvo.getEno() + "\t");
			// �̸�
			System.out.print(cvo.getEname() + "\t");
			if(cvo.getEname().length() < 8)
				System.out.print("\t");
			// ������
			if (cvo.getJob() != null) {
				System.out.print(cvo.getJob() + "\t");
				if (cvo.getJob().length() < 8)
					System.out.print("\t");
			} else
				System.out.print("\t\t");

			// ����ȣ
			if (cvo.getManager() != -1)
				System.out.print(cvo.getManager() + "\t");
			else
				System.out.print("\t");
			// �Ի�����
			if(cvo.getHireDate() != null)
			System.out.print(cvo.getHireDate() + "\t");
			else
				System.out.print("\t\t");
			// �޿�
			System.out.print(cvo.getSalary() + "\t");

			// Ŀ�̼�
			if (cvo.getCommission() != -1)
				System.out.print(cvo.getCommission() + "\t");
			else
				System.out.print("\t");

			// �μ���
			System.out.println(cvo.getDname());

		}
	}

	// �μ� ��ȣ ��� ��� (10,20,30,40)
	public static void printDnoList(List<DeptVO> dList) {
		System.out.print("(");
		for(int i = 0; i < dList.size() ; i++) {
			System.out.print(dList.get(i).getDno()+" " + dList.get(i).getDname());
			if(i != (dList.size()-1))
				System.out.print(" / ");
		}
		System.out.print(")");
	}
	
	// ��� �Ѹ� ���
	public static void printSVO(SawonVO svo) {
		
		System.out.println("------------------------------");
		System.out.print("�����ȣ\t: ");
		System.out.print(svo.getEno());
		System.out.print("\t\t");
		System.out.print("����̸�\t: ");
		System.out.print(svo.getEname());
		System.out.println();
		
		System.out.print("������\t: ");
		if(svo.getJob() != null) {
			System.out.print(svo.getJob());
		if(svo.getJob().length() < 7)
			System.out.print("\t");
		}else
			System.out.print("����\t");
		System.out.print("\t");
		System.out.print("����̸�\t: ");
		if(svo.getMname() != null)
		System.out.print(svo.getMname());
		else
			System.out.print("����");
		System.out.println();
		
		System.out.print("�Ի�����\t: ");
		System.out.print(svo.getHireDate());
		System.out.print("\t");
		System.out.print("�޿�\t: ");
		System.out.print(svo.getSalary());
		System.out.println();
		
		System.out.print("Ŀ�̼�\t: ");
		if(svo.getCommission() != -1)
		System.out.print(svo.getCommission());
		else
			System.out.print("����");
		System.out.print("\t\t");
		System.out.print("�μ���\t: ");
		System.out.print(svo.getDname());
		System.out.println();
		System.out.println("-----------------------------");
	}
}
