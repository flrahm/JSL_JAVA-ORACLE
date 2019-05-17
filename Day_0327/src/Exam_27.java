import java.util.Scanner;

public class Exam_27 {

	public static void main(String[] args) {

		select();

	}

	static void select() {

		Scanner scan = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("값을 입력하세요");
			int a = scan.nextInt();
			

			switch (a) {
			case 1:
				add1();
				break;
			case 2:
				add2();
				break;
			case 3:
				add3();
				break;
			case 4:
				add4();
				break;
			case 0:
				System.exit(1);
			}

		}

	}

	static void add1() {

		System.out.println("1부터 10까지의 합을 출력합니다");
		int sum = 0;
		for (int i = 1; i <= 10; i++)
			sum += i;

		System.out.println(sum);
	}

	static void add2() {

		System.out.println("1부터 10까지의 짝수 합을 출력합니다");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				sum += i;
		}

		System.out.println(sum);

	}

	static void add3() {

		System.out.println("1부터 10까지의 홀수 합을 출력합니다");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1)
				sum += i;
		}

		System.out.println(sum);

	}

	static void add4() {

		int oddSum = 0;
		int evenSum = 0;

		System.out.println("1부터 10까지의 홀수 합과 짝수 합을 출력합니다");
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				evenSum += i;
			else
				oddSum += i;

		}
		System.out.printf("홀수들의 합은 %d 이고 짝수들의 합은 %d 입니다", oddSum, evenSum);

	}
}
