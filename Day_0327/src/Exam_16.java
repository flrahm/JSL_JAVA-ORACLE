public class Exam_16 {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
				
		
		swap(100,200);
		System.out.printf("메인 메소드에서 실행되었습니다 %d    %d" , a , b);
	}



	static void swap(int x, int y) {	// java : call by value 

		int t = x;
		x = y;
		y = t;
		
		System.out.printf("swap 메소드에서 실행되었습니다  %d    %d \n" , x , y);

	}

}
