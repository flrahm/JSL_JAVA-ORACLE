
//소수 판별

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		System.out.println(isPrime(num));
		scan.close();
	}

	static String isPrime(int num) {

		String str = "소수입니다";

		if (num == 1)
			str = "소수가 아닙니다";
		else if (num == 2)
			str = "소수입니다";
		else {
			for (int i = 2; i <= num - 1; i++) {

				if (num % i == 0)
					str = "소수가 아닙니다";

			}
		}

		return str;
	}
}
