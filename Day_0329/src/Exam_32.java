import java.util.Scanner;

/*
 * data[] 배열에는 임의의 데이터
 * 찾고자 하는 데이터를 키보드에 입력하여
 * 데이터가 존재하면 몇 번째에 있는지를 출력하는 메소드를 작성
 * 못찾으면 계속 반복
 */

public class Exam_32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("찾고자 하는 값을 입력하세요 : ");
			int num = scan.nextInt();	// 값을 입력받음
			int ans = searchNum(num);	// 메소드 실행. 찾지 못했으면 -1을 리턴, 찾았으면 인덱스값을 리턴

			if (ans == -1) {	// 못찾았으면 계속 실행
				System.out.println("찾고자 하는 값이 없습니다");
			} else {	// 찾았으면 이를 출력하고 빠져나감
				System.out.printf("찾고자 하는 값은 %d 번 째에 있습니다", ans + 1);
				break;
			}

		}
		
		scan.close();

	}

	static int searchNum(int num) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int findIndex = -1;	// 찾고자 하는 값이 몇번째에 있는지 저장하기 위한 변수
							// 못찾으면 -1을 반환할 수 있도록 초기값을 설정

		for (int i = 0; i < data.length; i++) {

			if (data[i] == num)	{	// 만약 입력값과 일치하는 값이 있으면
				findIndex = i;		// 그 배열값의 인덱스를 저장
				break;
			}
		}

		return findIndex;		// 찾았으면 배열의 인덱스값, 못찾으면 -1을 리턴해줌
	}
}
