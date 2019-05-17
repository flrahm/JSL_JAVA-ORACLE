package selfTest;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("10진수 값을 입력하세요 : ");
			int decimal = scan.nextInt();
			System.out.println("변환할 진수를 입력하세요(0이면 종료) : ");
			int jinsu = scan.nextInt();
			if (jinsu == 0)
				break;
			else if (jinsu >= 1 && jinsu <= 16)
				decimalConversion(decimal, jinsu);
			else
				System.out.println("잘못된 입력입니다");
		}
		scan.close();

	}

	static void decimalConversion(int input, int digit) {

		String str = "";
		int num = input;

		if (digit < 10) {	// 변환할 진수가 10보다 작으면 기존것 그대로 실행
			while (num > 0) {
				str = num % digit + str;
				num /= digit;

			}
		} else {	// 변환할 진수가 10보다 크면
			while (num > 0) {	

				int remain = num % digit;	// 일단 나머지 계산
				if (remain > 10)	// 나머지가 10보다 크면
					str = (char) (remain + 'a'-10) + str;	// 문자로 바꾸어 계산
				else
					str = remain + str;

				num /= digit;
			}

		}

		if(input == 0)
			str = "0";
		
		System.out.println("10진수 : " + input);
		System.out.println(digit + "진수 : " + str);
	}

	
}
