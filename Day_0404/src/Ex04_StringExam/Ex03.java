package Ex04_StringExam;

public class Ex03 {

	public static void main(String[] args) {

		String str1 = "abcdefg";
		String str2 = "";
		if (str1.equals("abcdefg")) {
			str2 = str1.concat("hijklmnop");
		}
		System.out.println(str2);

		
		if (str1.equalsIgnoreCase("ABCDEFG"))
			System.out.println("같습니다");
		
		
		String aa = "abcdaae";
		
		System.out.println(aa.indexOf('3'));
		
		
	}
	
	
	

}
