package selfTest;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("10���� ���� �Է��ϼ��� : ");
			int decimal = scan.nextInt();
			System.out.println("��ȯ�� ������ �Է��ϼ���(0�̸� ����) : ");
			int jinsu = scan.nextInt();
			if (jinsu == 0)
				break;
			else if (jinsu >= 1 && jinsu <= 16)
				decimalConversion(decimal, jinsu);
			else
				System.out.println("�߸��� �Է��Դϴ�");
		}
		scan.close();

	}

	static void decimalConversion(int input, int digit) {

		String str = "";
		int num = input;

		if (digit < 10) {	// ��ȯ�� ������ 10���� ������ ������ �״�� ����
			while (num > 0) {
				str = num % digit + str;
				num /= digit;

			}
		} else {	// ��ȯ�� ������ 10���� ũ��
			while (num > 0) {	

				int remain = num % digit;	// �ϴ� ������ ���
				if (remain > 10)	// �������� 10���� ũ��
					str = (char) (remain + 'a'-10) + str;	// ���ڷ� �ٲپ� ���
				else
					str = remain + str;

				num /= digit;
			}

		}

		if(input == 0)
			str = "0";
		
		System.out.println("10���� : " + input);
		System.out.println(digit + "���� : " + str);
	}

	
}
