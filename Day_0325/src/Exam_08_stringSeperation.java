// string seperation

public class Exam_08_stringSeperation {
	public static void main(String[] args) {
		
		
		// 데이터가 한가지 방법에 의해 분리되어있을 때 : ,
		String str = "111,222,333,444,555,666";		
		String[] aa = str.split(",");
		for(int i = 0; i < 6 ; i ++)
			System.out.println(aa[i]);
		
		System.out.println("");
		String aa2 = str.substring(0,3);	// str[0] 부터 3개를 불러옴. str[0]~str[2]
		System.out.println(aa2);
		
		
		
		
	}
}
