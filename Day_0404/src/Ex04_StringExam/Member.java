package Ex04_StringExam;

public class Member {

	String name; // �̸��� ����
	String tel; // ��ȭ��ȣ�� ����
	String gender; // ������ ����
	int age; // ���̸� ����
	int ager; // ���̸� �����Ҷ� ������ ����

	public static void printTitle() { // Ÿ��Ʋ�� ����ϴ� �޼ҵ�. �����̹Ƿ� ����ƽ ������ �Ͽ���
		System.out.print("�̸�\t��ȭ\t\t����\t����");
		System.out.println();
	}

	void printMember() { // ����� �̸� ��ȭ��ȣ ���� ���̸� ����ϴ� �޼ҵ�
		System.out.print(name + "\t");
		System.out.print(tel + "\t");
		System.out.print(gender + "\t");
		System.out.println(age);
	}

	void inputData(String str) { // �Է°��� ���޹޾� ó���ϴ� �޼ҵ�
		str = str.trim(); // ������ ������

		String[] temp = str.split(","); // "," �� �������� �ɰ���
		name = temp[0]; // ù��° ���ڿ������� �̸��� ����

		String forGender = temp[1].substring(7, 8); // �ι�° ���ڿ� �������� �� �ںκи� �߶�...1
		String forAge = temp[1].substring(0, 2); // �ι�° ���ڿ� �������� ���� �α��ڸ� ����....2
		makeAger(forGender);
		gender = chooseGender(forGender); // ������ �����ϴ� �޼ҵ忡�� 1�� ���ڿ��� ������ ���� ����
		age = chooseAge(forAge); // ���̸� �����ϴ� �޼ҵ忡�� 2�����ڿ��� ������ ���� ����
		tel = temp[2]; // ����° ���ڿ� ������ ��ȭ��ȣ�� ����
	}

	void makeAger(String str) {	// �ֹι�ȣ ���ڸ��� ����
		if (str.equals("1"))	// 1 �̸� 00��� ���� ������ ����
			ager = 1;

		if (str.equals("2"))	// 2 �̸� 00��� ���� ������ ����
			ager = 1;

		if (str.equals("3"))	// 3�̸� 00��� ���� ������ ����
			ager = 2;

		if (str.equals("4"))	// 4�� 00��� ���� ������ ����
			ager = 2;

	}

	String chooseGender(String str) { // ������ �����ϴ� �޼ҵ�

        if(str.equals("2")||str.equals("4"))   // ���� �Է°��� ���ڿ� "2" �̸� ����
            return "����";
         else
            return "����";   // �ƴϸ� ����

	}

	int chooseAge(String str) { // ���̸� �����ϴ� �޼ҵ�
		int a = Integer.parseInt(str); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		int age = 0; // ���̸� ������ ����
		if (ager == 1) { // ���� 00����� �ƴ϶��
			age = 19 + (100 - a) + 1; // ���� 1
		} else // ���� 00�� ���ĳ���̶��
			age = 19 - a; // ���� 2

		return age; // ���� ��ȯ
	}

}
