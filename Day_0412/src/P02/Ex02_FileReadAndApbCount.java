// 파일읽기 & 알파벳 갯수
package P02;

import java.io.File;
import java.util.Scanner;

public class Ex02_FileReadAndApbCount {

	public static void main(String[] args) throws Exception {

		//String fileName = "E:\\\\라이브러리\\\\문서\\\\eclipse-workspace\\\\text\\\\Day_0412//test.txt";
		String fileName = "C:\\Windows//win.ini";	
		Scanner scan = new Scanner(new File(fileName)); // 스캐너 객체 생성
		int cnt = 0; // 파일이 몇줄인지 카운트
		while (scan.hasNext()) { // 다음줄이 있을때까지
			scan.next(); // 한줄씩 넘김
			cnt++; // 갯수 증가
		}

		String[] str = new String[cnt]; // 파일이 몇줄인지 카운트
		int[] apb = new int[26 + 2]; // 알파뱃 갯수 + 알파벳 총합 + 전체 입력

		scan = new Scanner(new File(fileName)); // 파일 포인터를 맨처음으로 돌림

		for (int i = 0; i < cnt; i++) { // 파일 줄 수 만큼
			str[i] = scan.next(); // 문자열 배열에 받고
			str[i] = str[i].trim(); // 공백 없애고
			str[i] = str[i].toUpperCase(); // 대문자로 바꾼다음에

			for (int j = 0; j < str[i].length(); j++) { // 입력받은 줄을 검사함

				if (str[i].charAt(j) >= 'A' && str[i].charAt(j) <= 'Z') { // 만약 입력이 대문자 A~Z 까지면
					apb[str[i].charAt(j) - 65]++; // 해당 알파벳 갯수를 증가시켜주고
					apb[apb.length - 2]++; // 알파벳 총합 갯수를 늘려주고
				} // 두번째 포문을 벗어나고

				apb[apb.length - 1]++; // 문자 전체 갯수를 증가시켜줌
			}
		} //

		for (int i = 0; i < apb.length - 2; i++) { // A~Z 중 값이 있는것만 출력
			if (apb[i] != 0)
				System.out.print((char) (i + 'A') + "\t");
		}
		System.out.println("알파벳갯수\t총 입력갯수");

		for (int i = 0; i < apb.length; i++) { // 갯수 출력
			if (apb[i] != 0)
				System.out.print(apb[i] + "\t");
		}

		scan.close();
	}

}