public class Exam_16 {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
				
		
		swap(100,200);
		System.out.printf("���� �޼ҵ忡�� ����Ǿ����ϴ� %d    %d" , a , b);
	}



	static void swap(int x, int y) {	// java : call by value 

		int t = x;
		x = y;
		y = t;
		
		System.out.printf("swap �޼ҵ忡�� ����Ǿ����ϴ�  %d    %d \n" , x , y);

	}

}
