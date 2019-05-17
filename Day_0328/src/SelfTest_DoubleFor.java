import java.util.Scanner;

public class SelfTest_DoubleFor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1   정사각형 출력");
			System.out.println("2   좌 직각삼각형 출력");
			System.out.println("3   우 직각삼각형 출력");
			System.out.println("4   정삼각형 출력 ");
			System.out.println("5   역 정삼각형 출력 출력");
			System.out.println("6   옆 피라미드 출력");
			System.out.println("7   다이아몬드 출력");
			System.out.println("0   종료");
			System.out.print("값을 입력하세요 : ");
			int a = scan.nextInt();

			switch (a) {
			case 1:
				for1();
				break;
			case 2:
				for2();
				break;
			case 3:
				for3();
				break;
			case 4:
				for4();
				break;
			case 5:
				for5();
				break;
			case 6:
				for6();
				break;
			case 7:
				for7();
				break;
			case 8:
				for8();
				break;

			case 0:
				System.exit(1);

			}
		}

	}

	static void for1() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++)
				System.out.print("*");

			System.out.println();
		}
	}

	static void for2() {
		System.out.println("-----------------------");

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++)
				System.out.print("*");

			System.out.println();
		}
	}

	static void for8() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 6 - i; j++)
				System.out.print("*");

			System.out.println();
		}

	}

	static void for4() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5 - i; j++)
				System.out.print(" ");

			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");

			System.out.println();
		}
	}

	static void for5() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i - 1; j++)
				System.out.print(" ");

			for (int j = 1; j <= 11 - 2 * i; j++)
				System.out.print("*");

			System.out.println();
		}

	}

	static void for6() {

		int a = 0;

		for (int i = 1; i <= 10; i++) {

			if (i < 5)
				a = i;
			else
				a = 10 - i;

			for (int j = 1; j <= a; j++)
				System.out.print("*");

			System.out.println();
		}

	}

	static void for7() {
		int a = 0;
		int b = 0;

		for (int i = 1; i <= 10; i++) {
			if (i <= 5) {
				a = 5 - i;
				b = 2 * i - 1;
			} else {
				a = i - 5;
				b = 9 - (i - 5) * 2;
			}
			for (int j = 1; j <= a; j++)
				System.out.print(" ");

			for (int j = 1; j <= b; j++)
				System.out.print("*");

			System.out.println();
		}

	}

	static void for3() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= (5 - i); j++)
				System.out.print(" ");

			for (int j = 1; j <= i; j++)
				System.out.print("*");

			System.out.println();

		}

	}

}


