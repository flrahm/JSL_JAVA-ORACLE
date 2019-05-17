package Ex04_StringExam;

public class Ex01_StringClass {

	public static void main(String[] args) {

		String str1 = "aaa";
		String str2 = "aaa"; // 동일한 문자열을 생성하면 새로운 객체가 만들어지지않고 기존의 것을 같이 참조
		String str3 = new String("aaa"); // new 생성자를 이용하면 새로운 객체를 만듬
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();

		System.out.println("str1 == str2 : " + (str1 == str2));	// 참조값 비교
		System.out.println("str1 == str3 : " + (str1 == str3));	// 
		System.out.println("------------------");
		System.out.println("str1.equals(str2) : " + str1.equals(str2));	// 값을 비교
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		
		
	}

}
