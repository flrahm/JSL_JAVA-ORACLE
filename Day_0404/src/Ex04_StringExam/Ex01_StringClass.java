package Ex04_StringExam;

public class Ex01_StringClass {

	public static void main(String[] args) {

		String str1 = "aaa";
		String str2 = "aaa"; // ������ ���ڿ��� �����ϸ� ���ο� ��ü�� ����������ʰ� ������ ���� ���� ����
		String str3 = new String("aaa"); // new �����ڸ� �̿��ϸ� ���ο� ��ü�� ����
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();

		System.out.println("str1 == str2 : " + (str1 == str2));	// ������ ��
		System.out.println("str1 == str3 : " + (str1 == str3));	// 
		System.out.println("------------------");
		System.out.println("str1.equals(str2) : " + str1.equals(str2));	// ���� ��
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		
		
	}

}
