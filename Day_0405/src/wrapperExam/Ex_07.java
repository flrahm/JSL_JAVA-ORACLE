package wrapperExam;

public class Ex_07 {

	public static void main(String[] args) {

		int a = 10;
		Integer b = new Integer(10);
		Integer c = a;	// auto boxing. �ڵ� ��üȭ
		Integer d = 20;

		int e = b;	// auto unboxing 

			System.out.println(b+c+d+e);
		
		String s = "10" + 5;	// 5�� �ڵ����� ���ڿ��� �ٲ�. ����ȭ -> "105"
		//	int tot = a + s;	// �� �ݴ�� �ȵ�. ���ڿ��� ���ڷ� �ٲܶ� ����Ѵ�.
		int tot = a + Integer.parseInt(s);
		double tot2 = a + Double.parseDouble(s);
		
		System.out.println(tot);
		System.out.println(tot2);
		
		int g = 10;
		Integer sg = Integer.valueOf(g);
		System.out.println(sg);
		
		
		
		
		
	}

}
