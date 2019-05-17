package member.ui;

import java.util.List;
import java.util.Scanner;

import member.db.MemberVO;

public class MemberView {

	// ȸ�� ��ü ����Ʈ ( 5���� ��� )
	public void memberList(List<MemberVO> mList, Scanner scan) {
		System.out.println("** ȸ�� ��ü ����Ʈ **");
		if (mList.isEmpty()) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�");
		} else {
			System.out.println("ȸ���� : " + mList.size());
			System.out.println("id\t�̸�\t����\t�̸���\t�����"); // �ּҶ� ���̴� ��¾���

			for (int i = 0; i < mList.size(); i++) {
				System.out.print(mList.get(i).getId() + "\t");
				System.out.print(mList.get(i).getName() + "\t");
				// System.out.print(mList.get(i).getAddr() + "\t");
				System.out.print(mList.get(i).getNation() + "\t");
				System.out.print(mList.get(i).getEmail() + "\t");
				// System.out.print(mList.get(i).getAge() + "\t");
				System.out.print(mList.get(i).getRegdate() + "\t");
				System.out.println();

				if ((i + 1) % 5 == 0) {
					System.out.println("���� ����� ���ðڽ��ϱ�? [y]");
					String check = scan.nextLine();
					if (!check.equalsIgnoreCase("y"))
						break;
				}
			}
		}
	}

	// ȸ�� ���
	public MemberVO memberInsert(Scanner scan) {
		System.out.println("** ȸ�� ��� **");
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		System.out.print("�ּ� : ");
		String addr = scan.nextLine();
		System.out.print("���� : ");
		String nation = scan.nextLine();
		System.out.print("email : ");
		String email = scan.nextLine();
		System.out.print("���� : ");
		String age = scan.nextLine();

		MemberVO mvo = new MemberVO();
		mvo.setName(name);
		mvo.setAddr(addr);
		mvo.setNation(nation);
		mvo.setEmail(email);
		mvo.setAge(Integer.parseInt(age));

		return mvo;
	}

	// ȸ�� �˻� ���
	public int memberSearch_output(List<MemberVO> mList, Scanner scan) {
		if (mList.size() == 0) {
			System.out.println("�ش� ������ �´� ȸ���� �����ϴ�");
			return 0;
		}
		MemberVO mvo = null;
		for (int i = 0; i < mList.size(); i++) {
			mvo = mList.get(i);
			System.out.println("-----------------------------------");
			System.out.println("ID : " + mvo.getId());
			System.out.println("Name : " + mvo.getName());
			System.out.println("Addr : " + mvo.getAddr());
			System.out.println("Nation : " + mvo.getNation());
			System.out.println("E-mail : " + mvo.getEmail());
			System.out.println("Age : " + mvo.getAge());
			System.out.println("Regdate : " + mvo.getRegdate());
			System.out.println("----------------------------------");

		}

		return 0;
	}

	// ȸ�� �˻� �Է�
	public String memberSearch_input(Scanner scan) {
		System.out.println("** ȸ�� �˻� **");
		System.out.print("�˻��� ȸ�� ��ȣ �Ǵ� ID�� �Է��ϼ��� : ");
		String str = scan.nextLine();
		return str;
	}

	// ȸ�� ����.... �Է�
	public MemberVO memberUpdate_input(Scanner scan, MemberVO inMvo) {
		System.out.println("** ȸ�� ���� ���� **");
		System.out.println("���̵� : " + inMvo.getId());
		System.out.print("�̸�(" + inMvo.getName() + "): ");
		String name = scan.nextLine();
		System.out.print("�ּ�(" + inMvo.getAddr() + "): ");
		String addr = scan.nextLine();
		System.out.print("����(" + inMvo.getNation() + "): ");
		String nation = scan.nextLine();
		System.out.print("email(" + inMvo.getEmail() + "): ");
		String email = scan.nextLine();
		System.out.print("����(" + inMvo.getAge() + "): ");
		String age = scan.nextLine();

		MemberVO mvo = new MemberVO();
		
		mvo.setId(inMvo.getId());
		
		if (!name.equals(""))
			mvo.setName(name);
		else
			mvo.setName(inMvo.getName());
		
		if (!addr.equals(""))
			mvo.setAddr(addr);
		else
			mvo.setAddr(inMvo.getAddr());
		
		if (!nation.equals(""))
			mvo.setNation(nation);
		else
			mvo.setNation(inMvo.getNation());
		
		if (!email.equals(""))
			mvo.setEmail(email);
		else
			mvo.setEmail(inMvo.getEmail());
		
		if (!age.equals(""))
			mvo.setAge(Integer.parseInt(age));
		else
			mvo.setAge(inMvo.getAge());
		

		return mvo;
	}

	// ȸ�� ���� ....�˻�
	public int memberUpdate_search(Scanner scan) {
		System.out.println("** ȸ�� ���� **");
		System.out.print("������ ȸ�� ID�� �Է��ϼ��� : ");
		while (true) {
			String str = scan.nextLine();

			if (isString(str))
				System.out.println("�߸��� �Է��Դϴ�");
			else
				return Integer.parseInt(str);

		}
	}

	// ȸ�� ����
	public void memberDelete(Scanner scan) {
		System.out.println("** ȸ�� ���� **");

	}

	// ���ڿ����� �˻�
	private boolean isString(String str) {

		if (str.length() != 4)
			return true;

		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				return false;

		return true;

	}

}
