package Ex04_StringExam;

public class Member {

	String name; // 이름을 저장
	String tel; // 전화번호를 저장
	String gender; // 성별을 저장
	int age; // 나이를 저장
	int ager; // 나이를 결정할때 쓰려고 만듬

	public static void printTitle() { // 타이틀을 출력하는 메소드. 공용이므로 스테틱 선언을 하였음
		System.out.print("이름\t전화\t\t성별\t나이");
		System.out.println();
	}

	void printMember() { // 저장된 이름 전화번호 성별 나이를 출력하는 메소드
		System.out.print(name + "\t");
		System.out.print(tel + "\t");
		System.out.print(gender + "\t");
		System.out.println(age);
	}

	void inputData(String str) { // 입력값을 전달받아 처리하는 메소드
		str = str.trim(); // 공백을 없애줌

		String[] temp = str.split(","); // "," 를 기준으로 쪼개줌
		name = temp[0]; // 첫번째 문자열조각을 이름에 저장

		String forGender = temp[1].substring(7, 8); // 두번째 문자열 조각에서 맨 뒤부분만 잘라냄...1
		String forAge = temp[1].substring(0, 2); // 두번째 문자열 조각에서 앞의 두글자만 따냄....2
		makeAger(forGender);
		gender = chooseGender(forGender); // 성별을 결정하는 메소드에게 1번 문자열을 전해줘 값을 받음
		age = chooseAge(forAge); // 나이를 결정하는 메소드에게 2번문자열을 전해줘 값을 받음
		tel = temp[2]; // 세번째 문자열 조각을 전화번호에 저장
	}

	void makeAger(String str) {	// 주민번호 뒷자리를 받음
		if (str.equals("1"))	// 1 이면 00년생 이전 내국인 남성
			ager = 1;

		if (str.equals("2"))	// 2 이면 00년생 이전 내국인 여성
			ager = 1;

		if (str.equals("3"))	// 3이면 00년생 이후 내국인 남성
			ager = 2;

		if (str.equals("4"))	// 4면 00년생 이후 내국인 여성
			ager = 2;

	}

	String chooseGender(String str) { // 성별을 결정하는 메소드

        if(str.equals("2")||str.equals("4"))   // 만약 입력값이 문자열 "2" 이면 여성
            return "여성";
         else
            return "남성";   // 아니면 남성

	}

	int chooseAge(String str) { // 나이를 결정하는 메소드
		int a = Integer.parseInt(str); // 입력받은 문자열을 숫자로 변환
		int age = 0; // 나이를 저장할 변수
		if (ager == 1) { // 만약 00년생이 아니라면
			age = 19 + (100 - a) + 1; // 계산식 1
		} else // 만약 00년 이후년생이라면
			age = 19 - a; // 계산식 2

		return age; // 나이 반환
	}

}
