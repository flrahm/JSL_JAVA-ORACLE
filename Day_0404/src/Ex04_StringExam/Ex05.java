package Ex04_StringExam;

public class Ex05 {

	public static void main(String[] args) {

		String str = "     921025-1400726    ";
		System.out.println(str);
		str = str.trim();
		System.out.println(str);
		
		
		String forTest = str.substring(7);
		String forAge = str.substring(0,2);	// 0���� 1����
		String forGender = str.substring(7,8);// 7��
		
		
		System.out.println(forTest);
		System.out.println(forAge);
		System.out.println(forGender);
		if(forGender.equals("1")||forGender.equals("3"))
			System.out.println("�����Դϴ�");
		else
			System.out.println("�����Դϴ�");
	}

}
