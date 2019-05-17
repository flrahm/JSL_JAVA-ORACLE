package Sawon.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Sawon.dao.SawonDao;
import Sawon.vo.SawonVO;

public class SawonView {

	Scanner scan = new Scanner(System.in);
	SawonDao dao = new SawonDao();
	int cnt = 5;

	public void printAll_1() throws Exception {
		List<SawonVO> sList = new ArrayList<SawonVO>();
		sList = dao.selectAll();

		printAttribute();

		if (sList.size() > 0)
			for (int i = 0; i < sList.size(); i++) {
				System.out.print(sList.get(i).getSno() + "\t");
				System.out.print(sList.get(i).getName() + "\t");
				System.out.print(sList.get(i).getTel() + "\t");
				System.out.print(sList.get(i).getPay() + "\t");
				System.out.println(sList.get(i).getIndate() + "\t");
			}
		else
			System.out.println("��ϵ� ����� �����ϴ�");
		// SELECT * FROM SAWON;
	}

	public void insert_2() throws Exception {

		int sno = cnt;
		String name = "���" + cnt;
		String tel = "010-1111-1111";
		int pay = 9000 + cnt;
		cnt++;

		SawonVO sawon = new SawonVO();
		sawon.setSno(sno);
		sawon.setName(name);
		sawon.setTel(tel);
		sawon.setPay(pay);

		if (dao.sawonInsert(sawon) != 0)
			System.out.println("��������� ��ϵǾ����ϴ�");
		else
			System.out.println("��� ����");
	}

	public void update_3() throws Exception{
		SawonVO sawon = searchSawon();
		int updateOK = 0;
		
		if(sawon != null) {
			System.out.println("�����Ͻ÷��� [Y] �� �Է��ϼ���");
			String sw = scan.next();
			if(sw.equalsIgnoreCase("y")) {
				System.out.println("���ο� ����ó�� �Է��ϼ��� : ");
				String tel = scan.next();
				System.out.println("���ο� �޿��� �Է��ϼ��� : ");
				int pay = scan.nextInt();
				sawon.setTel(tel);
				sawon.setPay(pay);
				
				updateOK = dao.sawonUpdate(sawon);
				if(updateOK != 0)
					System.out.println("������Ʈ �Ǿ����ϴ�");
				
			}
		}
	}

	public void delete_4() throws Exception {
		SawonVO sawon = searchSawon();
		int deleteOK = 0;
		if(sawon != null) {
			System.out.println("�����Ͻ÷��� [Y] �� �Է��ϼ���");
			String sw = scan.next();
			if(sw.equalsIgnoreCase("y")) {
				deleteOK = dao.sawonDelete(sawon);
				if(deleteOK != 0)
					System.out.println("�����Ǿ����ϴ�");
			}
				
		}

	}

	public void search_5() throws Exception {
		searchSawon();

		//
	}

	public SawonVO searchSawon() throws Exception {
		String str = "";
		SawonVO sawon = null;
		while (true) {///
			System.out.println("������ �������� �˻��Ͻðڽ��ϱ�?");
			System.out.println("[1] ��� ��ȣ");
			System.out.println("[2] ��� �̸� ");
			System.out.println("[0] ����");
			int sw = scan.nextInt();
			if (sw == 1) {
				System.out.println("�˻��� ��ȣ�� �Է��ϼ��� : ");
				str = scan.next();
				sawon = dao.select(sw, str);
				if (sawon != null) {
					printAttribute();
					printSawon(sawon);
					break;
				}
				else
					System.out.println("�ش� ����� �����ϴ�");
			} else if (sw == 2) {
				System.out.println("�˻��� �̸��� �Է��ϼ��� : ");
				str = scan.next();
				sawon = dao.select(sw, str);
				if (sawon != null) {
					printAttribute();
					printSawon(sawon);
					break;
				}
				else
					System.out.println("�ش� ����� �����ϴ�");
			} else if (sw == 0) {
				System.out.println("�˻��� ����մϴ�");
				break;
			} else
				System.out.println("�߸��� �Է��Դϴ�");
		} ///

		return sawon;
	}

	private void printSawon(SawonVO sawon) {
		System.out.print(sawon.getSno() + "\t");
		System.out.print(sawon.getName() + "\t");
		System.out.print(sawon.getTel() + "\t");
		System.out.print(sawon.getPay() + "\t");
		System.out.println(sawon.getIndate() + "\t");
	}
	
	private void printAttribute() {
		System.out.print("�����ȣ\t");
		System.out.print("�̸�\t");
		System.out.print("��ȭ��ȣ\t\t");
		System.out.print("�ӱ�\t");
		System.out.println("�Ի���\t");
	}
}
