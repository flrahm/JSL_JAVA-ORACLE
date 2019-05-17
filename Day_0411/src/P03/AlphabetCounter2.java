package P03;

import java.util.Scanner;

public class AlphabetCounter2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	// 스캐너객체 생성
		int[] apbCnt = new int[26];	// 알파벳 갯수를 카운트
		// String str = "ABCdefgabcsdf";
		System.out.println(" 0000 을 치면 종료합니다");
		while (true) {
			String str = scan.next();	// 문자열을 입력받음
			str = str.toUpperCase();	// 모두 대문자로
			if (str.equalsIgnoreCase("0000"))	// 만약 입력값이 0000 이면
				break;	// 종료

			for (int i = 0; i < str.length(); i++) {	// 문자열 갯수만큼 반복해서
				if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')	// 알파벳일경우에만
					apbCnt[str.charAt(i) - 65]++;	// 해당 알파벳 갯수를 카운팅하는 배열로 가서 1개 증가시킴
			}

		}	// 반복문 빠져나오고 이제 출력함

		for (int i = 0; i < apbCnt.length; i++)	// 알파벳 배열의 갯수만큼 
			if (apbCnt[i] != 0)	// 만약 0이 아닌경우에
				System.out.print((char) (i + 65) + "\t");	// 해당 알파벳이 있으므로 그 알파벳을 출력하고 탭해줌

		System.out.println();

		for (int i = 0; i < apbCnt.length; i++)	// 알파벳 배열의 갯수만큼
			if (apbCnt[i] != 0)	// 만약 0이 아닌경우에
				System.out.print(apbCnt[i] + "\t");	// 그 갯수를 출력해주고 탭해줌. 

		scan.close();
	}

}
