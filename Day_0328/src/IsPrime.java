
//�Ҽ� �Ǻ�

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		System.out.println(isPrime(num));
		scan.close();
	}

	static String isPrime(int num) {

		String str = "�Ҽ��Դϴ�";

		if (num == 1)
			str = "�Ҽ��� �ƴմϴ�";
		else if (num == 2)
			str = "�Ҽ��Դϴ�";
		else {
			for (int i = 2; i <= num - 1; i++) {

				if (num % i == 0)
					str = "�Ҽ��� �ƴմϴ�";

			}
		}

		return str;
	}
}
