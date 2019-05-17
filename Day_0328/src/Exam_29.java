import java.util.Scanner;

public class Exam_29 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("값을 입력하세요 : ");
		int num = scan.nextInt();
		int cnt = 0;					// 소수 갯수를 세기 위한 변수
	
		for (int i = 2; i <= num; i++) {	// 2부터 입력값까지 for문을 실행함

			if (isPrime(i) == true) {		// isPrime 은 소수면 true, 소수가 아니면 false 를 반환함
				System.out.print(i + "\t");	// 소수일 경우 소수를 출력하고 카운트를 1 증가시킴
				cnt++;
				
				if(cnt % 5 == 0)			// 5개단위로 줄바꿈
					System.out.println();
			}
		}

		System.out.println();
		System.out.printf("2 부터 %d 까지 소수의 총 갯수는 %d 입니다", num, cnt);
		scan.close();
	}

	static boolean isPrime(int num) {

		boolean b = true;		// 디폴트값은 트루로 높음

		if (num == 1)			// 1인경우는 소수가 아님
			b = false;
		else if (num == 2)		// 2인경우는 소수임
			b = true;
		else {
			for (int i = 2; i <= num - 1; i++) {		// 자기 자신 전까지 나눠서 나눠지는게 있으면 소수가 아닌것

				if (num % i == 0)
					b = false;		// 자기 자신을 제외한 수로 나눠지면 소수가 아님
			}
		}

		return b;			// true false 값중 하나를 반환 
	}
}
