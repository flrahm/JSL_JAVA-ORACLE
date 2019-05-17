package student;

// 반 번호 이름   점수   순위
import java.io.File;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(
				new File("E:\\\\라이브러리\\\\문서\\\\eclipse-workspace\\\\text\\\\Day_0410\\\\studentData.txt")); // 파일로부터
																											// 데이터를 읽어옴

		// 정답을 입력하여 배열로 분리

		String[] jDap = scn.nextLine().split(","); // Split을 쓰는이유
		/*
		 * or String str = scn.nextLine(); // "1,2,3,4,3,2" String[] jDap =
		 * str.split(",");
		 */
		while (scn.hasNext()) {
			String[] hDap = scn.nextLine().split(","); // 반, 이름, 점수가 들어옴
			String ban = hDap[0]; // 반
			String bun = hDap[0]; // 번호
			String name = hDap[0]; // 네임
			int tot = 0; // 점수계산용
			// 반 , 번호 , 이름 출력
			System.out.print(ban + "\t" + bun + "\t" + name + "\t");
			// 채점

			for (int i = 0; i < jDap.length; i++) {
				if (jDap[i].equals(hDap[i + 3])) {
					System.out.print("O	");
					tot += 5;
				} else {
					System.out.print("X	");

				}
				
			}
			System.out.println();
			System.out.println(tot + "\n");
		}
		scn.close();

	}
}
// 1단계