// string seperation

public class Exam_08_stringSeperation {
	public static void main(String[] args) {
		
		
		// �����Ͱ� �Ѱ��� ����� ���� �и��Ǿ����� �� : ,
		String str = "111,222,333,444,555,666";		
		String[] aa = str.split(",");
		for(int i = 0; i < 6 ; i ++)
			System.out.println(aa[i]);
		
		System.out.println("");
		String aa2 = str.substring(0,3);	// str[0] ���� 3���� �ҷ���. str[0]~str[2]
		System.out.println(aa2);
		
		
		
		
	}
}
