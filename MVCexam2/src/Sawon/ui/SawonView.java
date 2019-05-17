package Sawon.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import Sawon.vo.DeptVO;
import Sawon.vo.SawonVO;


public class SawonView {


	
	
	// �۾� ���� Ȯ��
	public boolean insureWork(String work, Scanner scan) {
		System.out.println(work + " �Ͻðڽ��ϱ�? [y/n]");
		
		while (true) {
			String choice = scan.nextLine();
			if (choice.equalsIgnoreCase("y"))
				return true;
			else if (choice.equalsIgnoreCase("n")) {
				System.out.println(work + "��(��) ��ҵǾ����ϴ�");
				return false;
			}
			else
				System.out.println("�߸��� �Է��Դϴ�");
		}
	}

	// ������ ���� ���
	public void printOk(String work, int workOk) {
		if (workOk != 0)
			System.out.println(work + " ����");
		else
			System.out.println(work + " ����");
	}

	// ��� ��ȣ �Է¹ޱ�
	public int getEno(Scanner scan) {
		System.out.println("��� ��ȣ�� �Է��ϼ���");
		System.out.println("��� ��ȣ : ");
		String eno = IO.inputNum(scan,4);
		return Integer.parseInt(eno);
	}
	
	// ��� �̸����� �˻� �Է�
	public String getName(Scanner scan) {
		System.out.println("�˻��� ��� �̸��� �Է��ϼ��� ");
		System.out.print("����̸�	\t: ");
		String ename;
		while (true) {
			ename = IO.inputStr(scan, 10);
			if (!ename.equals("")) {
				if (ename.length() <= 10)
					return ename;
				else
					System.out.println("10�� �̳��� �Է��ϼ���");
			} else
				System.out.println("�̸��� �ʼ� �Է��Դϴ�");
		}
	}

	// ������Ʈ�� ��� ���� �Է�
	public SawonVO updateSawonInput(Scanner scan, SawonVO svo,List<DeptVO> dList) {
		System.out.println("�����ȣ\t: " + svo.getEno());
		// �̸�
		System.out.print("����̸�(" + svo.getEname() + "): ");
		String ename = IO.inputStr(scan, 10);
		if(!ename.equals(""))
			svo.setEname(ename);
		
		//������
		if (svo.getJob() != null)
			System.out.print("������(" + svo.getJob() + "): ");
		else
			System.out.print("������(" + "����" + "): ");
		String job = IO.inputStr(scan, 9);
		if(!job.equals(""))
			svo.setJob(job);
		
		// ��� ��ȣ
		if (svo.getManager() != -1)
			System.out.print("����ȣ(" + svo.getManager() + "): ");
		else
			System.out.print("����ȣ(" + "����" + "): ");
		String manager = IO.inputNum(scan,4);
		if (manager != null)
			svo.setManager(Integer.parseInt(manager));
		
		// �Ի�����
		System.out.print("�Ի�����(" + svo.getHireDate() + "): ");
		String hireDate = IO.inputDate(3, scan);
		if(hireDate != null)
			svo.setHireDate(hireDate);
		
		// �޿�
		System.out.print("�޿�(" + svo.getSalary() + "): ");
		String salary = IO.inputNum(scan,0);
		if(salary != null)
			svo.setSalary(Integer.parseInt(salary));
		
		// Ŀ�̼�
		if (svo.getCommission() != -1)
			System.out.print("Ŀ�̼�(" + svo.getCommission() + "): ");
		else
			System.out.print("Ŀ�̼�(" + "����" + "): ");
		String commission = IO.inputNum(scan,0);
		if(commission != null)
			svo.setCommission(Integer.parseInt(commission));
		
		// �μ���ȣ
		System.out.print("�μ�����");
		SawonPrint.printDnoList(dList);
		System.out.println();
		System.out.print("�μ���ȣ(" + svo.getDno() + "): ");
		String dno = "10";
		boolean flag = true;
		while (flag) {/////
			dno = IO.inputNum(scan,2);
			if (dno != null) {
				for (int i = 0; i < dList.size(); i++) {
					if (Integer.parseInt(dno) == dList.get(i).getDno()) {
						flag = false;
						svo.setDno(Integer.parseInt(dno));
						break;
					}

					if (i == dList.size() - 1)
						System.out.println("�μ���ȣ ��Ͽ� �ִ� ���� �Է��ϼ���");
				}
			} else {
				break;
			}
				
		} /////
		
		return svo;
	
	}
	// �̸����� �˻��� ��� ����Ʈ ��� ... 3
	public void printSawonList(List<SawonVO> sList) {
		System.out.println("** ��� ��� **");
		if (sList.size() != 0) {
			for(int i = 0; i < sList.size(); i++)
				SawonPrint.printSVO(sList.get(i));
		}
		else
			System.out.println("��ϵ� ����� �����ϴ�");

	}
	
	// ��� ��ü ����Ʈ ��� ... 1
	public void printAllSawonList(List<SawonVO> sList) {
		System.out.println("** ��� ��� **");
		if (sList.size() != 0)
			SawonPrint.printSList(sList);
		else
			System.out.println("��ϵ� ����� �����ϴ�");

	}

	// ����� ��� ���� �Է� ...2
	public SawonVO insertNewSawon(Scanner scan, List<DeptVO> dList) {
		System.out.println("** �ű� ��� ��� **");
		// ����̸�
		String ename;
		System.out.print("����̸�	\t: ");
		while (true) {
			ename = IO.inputStr(scan, 10);
			if (!ename.equals("")) {
				break;
			} else
				System.out.println("�̸��� �ʼ� �Է��Դϴ�");
		}
		// ������
		System.out.print("������\t: ");
		String job = IO.inputStr(scan, 9);
		if (job.equals(""))
			job = null;
		// ����ȣ
		System.out.println("����ȣ\t: ");
		String manager = IO.inputNum(scan,4);
		// �Ի�����
		System.out.print("�Ի����� (" + LocalDate.now() + ") : ");
		String hireDate = IO.inputDate(1, scan);
		// �޿�
		System.out.println("�޿�\t: ");
		String salary = IO.inputNum(scan,0);
		if(salary == null)
			salary = "0";
		// Ŀ�̼�
		System.out.println("Ŀ�̼�\t: ");
		String commission = IO.inputNum(scan,0);
		// �μ���ȣ

		System.out.print("�μ���ȣ");
		SawonPrint.printDnoList(dList);
		System.out.println(" : ");
		String dno = "10";
		boolean flag = true;

		while (flag) {
			dno = IO.inputNum(scan,2);
			if (dno != null) {
				for (int i = 0; i < dList.size(); i++) {
					if (Integer.parseInt(dno) == dList.get(i).getDno()) {
						flag = false;
						break;
					}

					if (i == dList.size() - 1)
						System.out.println("�μ���ȣ ��Ͽ� �ִ� ���� �Է��ϼ���");
				}
			} else
				System.out.println("���� �Է��ϼ���");
		}

		///////////////////////////////////
		SawonVO svo = new SawonVO();
		svo.setEname(ename);
		svo.setJob(job);
		if (manager != null)
			svo.setManager(Integer.parseInt(manager));
		else
			svo.setManager(-1);
		svo.setHireDate(hireDate);
		svo.setSalary(Integer.parseInt(salary));

		if (commission != null)
			svo.setCommission(Integer.parseInt(commission));
		else
			svo.setCommission(-1);

		svo.setDno(Integer.parseInt(dno));

		return svo;
	}

}
