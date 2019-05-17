package Ex04_StringExam;

public class Ex04 {

	public static void main(String[] args) {

		String str = "aaa-bbb-ccc-ddd-eee-111-222-333";

		String[] splitStr = str.split("-");

		for (int i = 0; i < splitStr.length; i++)
			System.out.print(splitStr[i] + " ");
		
		
		
		//String str2 = "aaa bbb-ccc dddd 111-222";
	
	}

}
