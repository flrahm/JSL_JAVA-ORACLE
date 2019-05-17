package stringExam;

public class Ex01_dividingStringAndExtendedFor {

	public static void main(String[] args) {
		
		String str = "010-2242-3810";
		String s1 = str.substring(4,8);
		System.out.println(s1);
		String[] s2 = str.split("-");
		
		for(String ss : s2) {
			System.out.println(ss);	// 배열 특화 확장 for 문
		}
		System.out.println("---------------------");
		for(int i = 0; i < s2.length ; i++)
			System.out.println(s2[i]);	// 위의 코드랑 같음
		
		
	}

}
