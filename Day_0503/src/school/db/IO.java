package school.db;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

public class IO {
	Scanner scan = new Scanner(System.in);

	// DB로부터 날짜를 가져옴. 스트링으로 받아서 스트링으로 반환
	public String getDateFromDB(String inStr) {

		if (inStr != null) {
			return inStr.substring(0, 11);
		} else {
			return null;
		}

	}

	// 전화번호 형식이 매치하는지 판단. 스트링을 받아서 불리언 타입으로 반환
	public boolean matchTel(String inStr) {

		String telPattern = "(02|010|042)-\\d{3,4}-\\d{4}";
		String telPattern2 = "(02|010|042)\\d{3,4}\\d{4}";
		boolean bool = Pattern.matches(telPattern, inStr);
		boolean bool2 = Pattern.matches(telPattern2, inStr);

		return bool || bool2;
	}

	// 숫자를 입력받는 메소드. 스트링
	public String inputNum() {

		String returnStr = null;
		String inStr;
		boolean flag = true;
		while (flag) {
			inStr = scan.nextLine();
			if (!inStr.equals("")) {
				for (int i = 0; i < inStr.length(); i++) {
					if (!(inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9')) {
						System.out.println("잘못된 입력입니다. 숫자 또는 빈칸을 입력하세요");
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
		}

		return returnStr;
	}

	// 전화번호에 - 를 붙여주는 메소드
	private String insertDashMarkInTel(String str) {

		boolean flag = true;

		for(int i = 0; i < str.length()-1 ; i++) {
			if(!(str.charAt(i) >= '0' && str.charAt(i) <='9'))
				flag = false;
		}
		
		if (flag) {
			int length = str.length();
			switch (length) {
			case 9:
				str = str.substring(0, 2) + "-" + str.substring(2, 5) + "-" + str.substring(5, 9);
				break;
			case 10:
				str = str.substring(0, 3) + "-" + str.substring(3, 6) + "-" + str.substring(6, 10);
				break;
			case 11:
				str = str.substring(0, 3) + "-" + str.substring(3, 7) + "-" + str.substring(7, 11);
				break;
			}
		}
		
		return str;
	}

	// 전화번호를 입력받는 메소드
	public String inputTel(int sw) { // sw 가 1이면 전화번호에 - 를 붙여줌

		String returnStr = null;
		String tel;
		boolean flag = true;
		while (flag) {

			tel = scan.nextLine();

			if (!tel.equals("")) {

				for (int i = 0; i < tel.length(); i++) {

					if (!((tel.charAt(i) >= '0' && tel.charAt(i) <= '9') || tel.charAt(i) == '-')) {
						System.out.println("잘못된 입력입니다. 숫자 또는 - 을 입력하세요");
						break;
					}

					if (i == tel.length() - 1) {
						if (matchTel(tel)) {
							returnStr = tel;
							flag = false;
						} else
							System.out.println("잘못된 형식의 입력입니다");
					}

				}

			} else {
				break;
			}

		}
		if(sw == 1) {
			return insertDashMarkInTel(returnStr);
		}else
			return returnStr;	
	}

	// 날짜를 입력받는 메소드. 스트링
	public String inputDate(int sw) { // sw = 1이면 디폴드로 sysdate, // 2면 무조건 입력 // 나머지면 null

		LocalDate myDate = null;
		LocalDate nowDate = LocalDate.now();
		String returnDate = "";
		String inputStr;
		int year;
		int month;
		int day;

		while (true) {
			inputStr = scan.nextLine();
			if (!inputStr.equals("")) { // 빈칸입력이 아니면
				try {
					String[] input = inputStr.split("/");
					year = Integer.parseInt(input[0]);
					month = Integer.parseInt(input[1]);
					day = Integer.parseInt(input[2]);
					myDate = LocalDate.of(year, month, day);
					returnDate = "" + myDate.getYear() + "/" + myDate.getMonthValue() + "/" + myDate.getDayOfMonth();
					break;
				} catch (Exception e) {
					System.out.println("잘못된 형식의 입력입니다");
				}
			} else {
				if (sw == 1) {
					returnDate = "" + nowDate.getYear() + "/" + nowDate.getMonthValue() + "/" + nowDate.getDayOfMonth();
					break;
				} else if (sw == 2) {
					System.out.println("필수 입력입니다");
				} else {
					returnDate = null;
					break;

				}
			}
		}

		return returnDate;
	}
}
