package customer.view;

import java.util.List;
import java.util.Scanner;

import customer.dao.CustomerDAO;
import customer.vo.CustomerVO;

public class CustomerView {

	Scanner scan = new Scanner(System.in);
	CustomerDAO dao = new CustomerDAO();

	// �� ��ü ���
	public void selectAllCustomer_01() {
		System.out.println("\t\t** �� ��ü ��� **");
		List<CustomerVO> cList = dao.selectAllCustomer();
		if (!cList.isEmpty())
			CustomerPrint.printCList(cList);
		else
			System.out.println("�� ����Ʈ�� ������ϴ�");
	}

	// �ű� �� ���
	public void insertNewCustomer_02() {
		System.out.println("\t\t** �ű� �� ���� ��� **");
		System.out.print("�� �� ��	: ");
		String name = "";
		while (true) {
			name = scan.nextLine();
			if(name.equals(""))
				System.out.println("�̸��� �ʼ� �Է��Դϴ�");
			else
				break;
		}
		System.out.print("�� �� ó	: ");

		String tel = "";
		while (true) {
			tel = scan.nextLine();
			if(tel.equals(""))
				System.out.println("��ȭ��ȣ�� �ʼ� �Է��Դϴ�");
			else
				break;
		}

		System.out.print("�� 	��	: ");
		String addr = "";
		while (true) {
			addr = scan.nextLine();
			if(addr.equals(""))
				System.out.println("�ּҴ� �ʼ� �Է��Դϴ�");
			else
				break;
		}
		
		System.out.print("�� �� ��(����)	: ");
		String office = scan.nextLine();
		if (office.equals(""))
			office = null;
		System.out.print("��	��(����)	:");
		String birthDay = scan.nextLine();
		if (birthDay.length() != 10)
			birthDay = null;

		System.out.print("��	�� 	:");
		String gender;
		while (true) {
			gender = scan.nextLine();
			if(gender.equals(""))
				System.out.println("������ �ʼ� �Է��Դϴ�");
			else
				break;
		}

		CustomerVO cvo = new CustomerVO();
		cvo.setName(name);
		cvo.setTel(tel);
		cvo.setAddr(addr);
		cvo.setOffice(office);
		cvo.setBirthDay(birthDay);
		cvo.setGender(gender);

		System.out.println("����Ͻðڽ��ϱ�? [Y]");
		String confirm = scan.nextLine();
		if (confirm.equalsIgnoreCase("y")) {
			int insertOK = dao.insertNewCustomer(cvo);
			if (insertOK != 0)
				System.out.println("���������� ��ϵǾ����ϴ�");
			else
				System.out.println("��Ͽ� �����Ͽ����ϴ�");
		} else
			System.out.println("����� ����Ͽ����ϴ�");
	}

	// �� ���� �˻�(�̸�����)
	public void selectByName_03() {
		System.out.println("\t\t** �� ���� �˻� **");
		System.out.print("ã���� �� ���� �Է��ϼ��� : ");
		String name = scan.nextLine();
		CustomerVO cvo = dao.selectByName(name);

		System.out.println();
		if (cvo != null)
			CustomerPrint.printCVO(cvo);
		else
			System.out.println("�ش� �̸����� ��ϵ� ���� �����ϴ�");
	}

	// �� ���� ����
	public void updateByNum_04() {
		System.out.println("\t\t** �� ���� ���� **");
		System.out.print("������ ���� ��ȣ�� �Է��ϼ��� : ");
		int num = scan.nextInt();
		CustomerVO cvo = dao.selectByNum(num);
		if (cvo != null) {
			System.out.print("�� �� ��	:  ");
			System.out.println(cvo.getName());
			System.out.print("���ο� ����ó�� �Է��ϼ��� : ");
			String tel = scan.nextLine();
			if (tel.equals(""))
				cvo.setTel(tel);
			System.out.print("���ο� ������� �Է��ϼ��� : ");
			String addr = scan.nextLine();
			if (addr.equals(""))
				cvo.setAddr(addr);

			System.out.println("������Ʈ �Ͻðڽ��ϱ�? [Y]");
			String confirm = scan.nextLine();
			if (confirm.equalsIgnoreCase("y")) {
				int updateOK = dao.updateByNum(cvo);
				if (updateOK != 0)
					System.out.println("��� ����");
			} else
				System.out.println("����� ����մϴ�");

		} else
			System.out.println("�ش� ��ȣ�� �´� ���� �����ϴ�");
	}

	// �� ���� ����
	public void deleteByNum_05() {
		System.out.println("\t\t** �� ���� ���� **");
		System.out.print("������ ���� ��ȣ�� �Է��ϼ��� : ");
		int deleteOK = 0;
		//String str = scan.nextLine();
		//int num = Integer.parseInt(str);
		int num = scan.nextInt();
		CustomerVO cvo = dao.selectByNum(num);
		if (cvo != null) {
			CustomerPrint.printCVO(cvo);

			System.out.println("�����Ͻðڽ��ϱ�? [1]");
			
			//String confirm = scan.nextLine();
			int confirm = scan.nextInt();
			
			//if (confirm.equalsIgnoreCase("Y")) {
			if(confirm == 1) {
				deleteOK = dao.deleteByNum(cvo);
				if (deleteOK != 0)
					System.out.println("�����Ǿ����ϴ�");
				else
					System.out.println("������ �����߽��ϴ�");
			} else
				System.out.println("������ ��ҵǾ����ϴ�");

		} else
			System.out.println("�ش� ��ȣ�� �´� ���� �����ϴ�");
	}

}
