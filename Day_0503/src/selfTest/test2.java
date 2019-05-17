package selfTest;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("10���� ���� �Է��ϼ��� : ");
			int decimal = scan.nextInt();
			System.out.println("��ȯ�� ������ �Է��ϼ���(�ִ� 16 , 0�̸� ����) : ");
			int jinsu = scan.nextInt();
			if (jinsu == 0)
				break;
			else if (jinsu >= 1 && jinsu <= 16)
				decimalConversion2(decimal, jinsu);
			else
				System.out.println("�߸��� �Է��Դϴ�");
		}
		scan.close();

	}

	static void decimalConversion2(int input, int digit) {

		String str = "";
		int num = input;

		if (digit < 10) {
			while (num > 0) {
				str = num % digit + str;
				num /= digit;

			}
		} else {
			while (num > 0) {

				int remain = num % digit;
				if (remain > 10)
					str = (char) (remain + 'a'-10) + str;
				else
					str = remain + str;

				num /= digit;
			}

		}

		System.out.println("10���� : " + input);
		System.out.println(digit + "���� : " + str);
	}

	static void decimalConversion(int input, int digit) {

		String str = "";
		int num = input;

		if (digit < 10) {
			while (num > 0) {
				str = num % digit + str;
				num /= digit;

			}
		} else {
			while (num > 0) {

				int remain = num % digit;
				switch (remain) {
				case 10:
					str = 'a' + str;
					break;
				case 11:
					str = 'b' + str;
					break;
				case 12:
					str = 'c' + str;
				case 13:
					str = 'd' + str;
					break;
				case 14:
					str = 'e' + str;
					break;
				case 15:
					str = 'f' + str;
					break;
				default:
					str = remain + str;

				}

				num /= digit;
			}

		}

		System.out.println("10���� : " + input);
		System.out.println(digit + "���� : " + str);
	}

}
