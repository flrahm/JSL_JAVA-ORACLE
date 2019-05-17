package Ex04_StringExam;

public class Ex02 {

	public static void main(String[] args) {

		String str = "korea-daejeon-2019/04/04";

		
		char ch = str.charAt(0);
		System.out.println(ch);

		char ch2 = "abcde".charAt(2);
		System.out.println(ch2);
		
		System.out.println(str.length());
		
		try {
			System.out.println(str.charAt(1111));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("오류입니다");
		}
		
		
		for(int i = 0; i < str.length();i++) 
			System.out.print(str.charAt(i) + " ");

	}

}
