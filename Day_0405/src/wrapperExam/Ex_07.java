package wrapperExam;

public class Ex_07 {

	public static void main(String[] args) {

		int a = 10;
		Integer b = new Integer(10);
		Integer c = a;	// auto boxing. 자동 객체화
		Integer d = 20;

		int e = b;	// auto unboxing 

			System.out.println(b+c+d+e);
		
		String s = "10" + 5;	// 5가 자동으로 문자열로 바뀜. 문자화 -> "105"
		//	int tot = a + s;	// 그 반대는 안됨. 문자열을 숫자로 바꿀때 사용한다.
		int tot = a + Integer.parseInt(s);
		double tot2 = a + Double.parseDouble(s);
		
		System.out.println(tot);
		System.out.println(tot2);
		
		int g = 10;
		Integer sg = Integer.valueOf(g);
		System.out.println(sg);
		
		
		
		
		
	}

}
