package sawon.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sawon.dao.SawonDAO;
import sawon.vo.DeptVO;
import sawon.vo.SawonVO;

public class SawonView {

	SawonDAO sDao = new SawonDAO();
	Scanner scan = new Scanner(System.in);
	List<DeptVO> dList = sDao.selectAllDepartment();
	// �μ� ����Ʈ ��ȯ

	// ���ڸ� �Է¹޴� �޼ҵ�
	public String inputNum() {
		String returnStr = null;
		boolean flag = true;
		while (flag) {
			String inStr = scan.nextLine();
			if (!inStr.equals("")) {
				for (int i = 0; i < inStr.length(); i++) {
					if (!(inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9')) {
						System.out.println("�߸��� �Է��Դϴ�. ���� �Ǵ� ��ĭ�� �Է��ϼ���");
						break;
					}

					if (i == inStr.length() - 1) {
						returnStr = inStr;
						flag = false;
					}
				}

			} else {
				returnStr = null;
				flag = false;
			}
		}

		return returnStr;
	}

	// ��¥�� �Է¹޴� �޼ҵ�
	public String inputHireDate() {
		LocalDate myDate = null;
		LocalDate nowDate = LocalDate.now();
		String hireDate = "";
		String inputStr;
		int year;
		int month;
		int day;

		while (true) {
			inputStr = scan.nextLine();
			if (!inputStr.equals("")) { // ��ĭ�Է��� �ƴϸ�
				try {
					String[] input = inputStr.split("/");
					year = Integer.parseInt(input[0]);
					month = Integer.parseInt(input[1]);
					day = Integer.parseInt(input[2]);
					myDate = LocalDate.of(year, month, day);
					hireDate = "" + myDate.getYear() + "/" + myDate.getMonthValue() + "/" + myDate.getDayOfMonth();
					break;
				} catch (Exception e) {
					System.out.println("�߸��� ������ �Է��Դϴ�");
				}
			} else {
				hireDate = "" + nowDate.getYear() + "/" + nowDate.getMonthValue() + "/" + nowDate.getDayOfMonth();
				break;
			}
		}

		return hireDate;
	}

	// 5. �̸����� �˻� �� ����
	public void deleteByName_05() {
		System.out.println("\t\t** ��� ���� ���� **");

		System.out.println("������ ����� �Է��ϼ��� : ");
		// �̸� �Է�
		String name;
		int deleteOk = 0;
		while (true) {
			name = scan.nextLine();
			if (name.equals(""))
				System.out.println("�̸��� �Է��ϼ���");
			else
				break;
		}
		//
		List<SawonVO> sList = sDao.selectByName(name);

		if (sList.size() > 0) {
			for (int i = 0; i < sList.size(); i++) {
				sDao.findManager(sList.get(i));
				SawonPrint.printSVO(sList.get(i));
			}

			System.out.println("�����Ͻðڽ��ϱ� [Y]");
			String check = scan.nextLine();
			if (check.equalsIgnoreCase("y")) {
				deleteOk = sDao.deleteByName(sList.get(0));
				if (deleteOk != 0)
					System.out.println("���� �Ϸ�");
				else
					System.out.println("���� ����");
			}
		} else
			System.out.println("�ش� �̸��� �´� ����� �����ϴ�");

	}

	// 4. ������Ʈ
	public void updateByName_04() {
		System.out.println("\t\t** ��� ���� ���� **");
		System.out.println("������ ����� ��ȣ�� �Է��ϼ��� : ");
		String eno = inputNum();
		SawonVO svo = sDao.selectByEno(eno);
		int updateOk = 0;
		if (svo != null) {
			System.out.println("�����ȣ\t: " + svo.getEno());
			System.out.print("����̸�(" + svo.getEname() + "): ");
			String name = scan.nextLine();
			if (name.equals(""))
				name = svo.getEname();

			if (svo.getJob() != null)
				System.out.print("������(" + svo.getJob() + "): ");
			else
				System.out.print("������(" + "����" + "): ");

			String job = scan.nextLine();
			if (job.equals(""))
				job = svo.getJob();

			if (svo.getManager() != -1)
				System.out.print("����ȣ(" + svo.getManager() + "): ");
			else
				System.out.print("����ȣ(" + "����" + "): ");

			String manager = inputNum();
			if (manager == null)
				manager = "" + svo.getManager();

			System.out.print("�Ի�����(" + svo.getHireDate() + "): ");
			String hireDate = inputHireDate();
			if (hireDate.equals("")) {
				String[] dStr = svo.getHireDate().split("-");
				hireDate = dStr[0] + dStr[1] + dStr[2];
			}
			System.out.print("�޿�(" + svo.getSalary() + "): ");
			String salary = inputNum();
			if (salary == null)
				salary = "" + svo.getSalary();

			if (svo.getCommission() != -1)
				System.out.print("Ŀ�̼�(" + svo.getCommission() + "): ");
			else
				System.out.print("Ŀ�̼�(" + "����" + "): ");
			String commission = inputNum();
			if (commission == null)
				commission = "" + svo.getCommission();

			System.out.print("�μ�����");
			SawonPrint.printDnoList(dList);
			System.out.println();
			System.out.print("�μ���ȣ(" + svo.getDno() + "): ");
			String dno = "10";
			boolean flag = true;
			while (flag) {/////
				dno = inputNum();
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
			} /////

			System.out.println("�����Ͻðڽ��ϱ�? [y]");
			String check = scan.nextLine();
			if (check.equalsIgnoreCase("y")) {
				updateOk = sDao.updateSawon(name, job, manager, hireDate, salary, commission, dno, svo.getEno());
				if (updateOk != 0)
					System.out.println("������Ʈ ����");
				else
					System.out.println("������Ʈ ����");
			} else
				System.out.println("������ ����մϴ�");
		} else
			System.out.println("�ش� ��ȣ�� ���� ����� �����ϴ�");

	}

	// 3. �̸����� ��� �˻�
	public void selectByName_03() {

		System.out.println("\t\t** ��� ���� �˻� **");
		while (true) {
			System.out.println("�˻��� ����� �Է��ϼ��� : ");
			// �̸� �Է�
			String name;
			while (true) {
				name = scan.nextLine();
				if (name.equals(""))
					System.out.println("�̸��� �Է��ϼ���");
				else
					break;
			}
			//
			List<SawonVO> sList = sDao.selectByName(name);

			if (sList.size() > 0) {
				for (int i = 0; i < sList.size(); i++) {
					sDao.findManager(sList.get(i));
					SawonPrint.printSVO(sList.get(i));
				}
			} else
				System.out.println("�ش� �̸��� �´� ����� �����ϴ�");

			System.out.println("��� �˻��Ͻðڽ��ϱ� [Y]");
			String check = scan.nextLine();
			if (!check.equalsIgnoreCase("y"))
				break;
		}
	}

	// 2. �ű� ������
	public void insertNewSawon_02() {
		System.out.println("\t\t** �ű� ��� ��� **");
		// ����̸�
		String ename;
		System.out.print("����̸�	\t: ");
		while (true) {
			ename = scan.nextLine();
			if (!ename.equals("")) {
				if (ename.length() <= 10)
					break;
				else
					System.out.println("10�� �̳��� �Է��ϼ���");
			} else
				System.out.println("�̸��� �ʼ� �Է��Դϴ�");
		}
		// ������
		System.out.print("������\t: ");
		String job = scan.nextLine();
		if (job.equals(""))
			job = null;
		// ����ȣ
		System.out.println("����ȣ\t: ");
		String manager = inputNum();
		// �Ի�����
		System.out.print("�Ի����� (" + LocalDate.now() + ") : ");
		String hireDate = inputHireDate();
		// �޿�
		System.out.println("�޿�\t: ");
		String pay = inputNum();

		// Ŀ�̼�
		System.out.println("Ŀ�̼�\t: ");
		String commission = inputNum();
		// �μ���ȣ

		System.out.print("�μ���ȣ");
		SawonPrint.printDnoList(dList);
		System.out.println(" : ");
		String dno = "10";
		boolean flag = true;

		while (flag) {
			dno = inputNum();
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
		System.out.println("����Ͻðڽ��ϱ�? [y]");
		String check = scan.nextLine();

		if (check.equalsIgnoreCase("y")) {
			int insertOk = sDao.insertNewSawon(ename, job, manager, hireDate, pay, commission, dno);
			if (insertOk != 0)
				System.out.println("��� ����");
			else
				System.out.println("��� ����");
		} else
			System.out.println("����� ��ҵǾ����ϴ�");
	}

	// 1.��� ��ü ��� ���
	public void selectAllSawon_01() {
		System.out.println("\t\t** ��� ��ü ��� **");
		List<SawonVO> sList = new ArrayList<SawonVO>();
		sList = sDao.selectAllSawon();
		if (sList.size() > 0)
			SawonPrint.printSList(sList);
		else
			System.out.println("��� ����Ʈ�� ����ֽ��ϴ�");

		System.out.println("���� �޴��� �̵��մϴ� [enter]");
		String check;
		while (true) {
			check = scan.nextLine();
			if (check.equals(""))
				break;
		}

	}

}
