package random;

import java.util.Random;

public class Exam_08_random1 {

	public static void main(String[] args) {
		Random r = new Random();// 난수생성클래스 //값에 따라서 난수가 발생되는 걸 알 수 있음
		for (int i = 0; i < 10; i++) {
			// r=new Random(System.currentTimeMillis());//안전하게 만드는 방법-> 더 안전하게 하려면 초단위를 넣어주면
			// 됨
			System.out.println(r.nextInt(45) + 1);// int형 난수 생성10 밑의 숫자가 나옴
		}
	}
	
	
	

}
