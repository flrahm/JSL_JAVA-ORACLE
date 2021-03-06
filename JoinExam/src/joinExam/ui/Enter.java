package joinExam.ui;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Enter { // 입력에 관련된 메소드 모음

	// 이름의 유효성을 검사하는 메소드. 영어면 쭉 영어로, 한글이면 쭉 한글로, 영문자와 숫자만
	public static boolean nameValidate(String str) {
		String namePattern = "^[a-zA-Z가-힣]*$";
		return Pattern.matches(namePattern, str);
			
	}
	
	// 이메일의 유효성을 검사하는 메소드
	public static boolean emailValidate(String str) {
		String emailPattern = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z]{2,6}$";
		return Pattern.matches(emailPattern, str);
	}
	
	// 비밀번호의 유효성을 검사하는 메소드
	public static boolean pwValidate(String str) {
		boolean flag = false;

		boolean isCapital = false;
		boolean isSmall = false;
		boolean isNum = false;
		boolean isSpecial = false;

		for (int i = 0; i < str.length(); i++) {
			char test = str.charAt(i);
			if (test >= 'a' && test <= 'z')
				isSmall = true;
			if (test >= 'A' && test <= 'Z')
				isCapital = true;
			if (test >= '0' && test <= '9')
				isNum = true;
			if (!((test >= 'a' && test <= 'z') || (test >= 'A' && test <= 'Z') || (test >= '0' && test <= '9')))
				isSpecial = true;
		}
		if (isCapital && isSmall && isNum && isSpecial)
			flag = true;

		return flag;
	}

	// 아이디의 유효성을 검사하는 메소드
	public static boolean idValidate(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			char test = str.charAt(i);
			if(i == 0 && !(test >='a' && test <= 'z')) {
				System.err.println("아이디는 반드시 영어 소문자로 시작해야 합니다");
				return false;
			}
			if (!((test >= 'a' && test <= 'z') || (test >= '0' && test <= '9'))) {
				System.err.println("아이디는 영어 소문자와 숫자만 사용 가능합니다");
				return false;
			}
		}

		return true;
	}

	// 글자수를 세는 메소드
	private static int countStrNum(String str) {

		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char test = str.charAt(i);

			if ((test >= 'a' && test <= 'z') || (test >= 'A' && test <= 'Z') || (test >= '0' && test <= '9'))
				cnt++;
			else
				cnt += 2;
		}

		return cnt;
	}

	// DB로부터 날짜를 가져옴. 스트링으로 받아서 스트링으로 반환
	public static String getDateFromDB(String inStr) {

		if (inStr != null) {
			return inStr.substring(0, 11);
		} else {
			return null;
		}

	}

	// 문자를 입력받는 메소드. 자릿수 미만으로
	public static String inputStr(Scanner scan, int maxNum, int option) {// 옵션이 0이면 빈칸 입력시 null 반환, 1이면 필수 입력
		boolean flag = true;
		String inStr = "";
		while (flag) {
			inStr = scan.nextLine();

			if (inStr.equals("")) {
				if (option == 0)
					return null;
				else
					System.err.println("값을 입력하세요");

			} else {
				if (countStrNum(inStr) <= maxNum || maxNum == 0)
					flag = false;
				else
					System.err.println("입력 범위를 초과하였습니다 (실제 : " + countStrNum(inStr) + "/최대값 : " + maxNum + ")");
			}
		}

		return inStr;
	}

	// 숫자를 입력받는 메소드. 스트링
	public static String inputNum(Scanner scan, int maxNum) { // 0이면 제한없음, 자릿수

		String returnStr = null;
		String inStr;
		boolean flag = true;
		while (flag) {
			inStr = scan.nextLine();

			if (inStr.length() <= maxNum || maxNum == 0) {
				if (!inStr.equals("")) {
					for (int i = 0; i < inStr.length(); i++) {
						if (!(inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9')) {
							System.err.println("잘못된 입력입니다. 숫자 또는 빈칸을 입력하세요");
							break;
						}

						if (i == inStr.length() - 1) {
							returnStr = inStr;
							flag = false;
						}
					}

				} else {
					returnStr = null;
					flag = false;
				}

			} else
				System.err.println("입력 범위를 초과하였습니다 (" + maxNum + ")");
		}

		return returnStr;
	}

}
