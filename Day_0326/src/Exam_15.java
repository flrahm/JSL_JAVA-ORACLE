import java.util.Scanner;

public class Exam_15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int cnt = 0;
		int i = 0;
		while (true) {

			int a = scan.nextInt();
			if (a >= 80)
				cnt++;

			i++;

			if (cnt == 5 || i == 10)
				break;

		}

		scan.close();

	}

}
