package random;

import java.util.Random;

public class Exam_09_random2 {

	public static void main(String[] args) {
		// Random r = new Random(2);
		// Random(a); a에 숫자가 달라지면
		// 값도 다름 이걸로 규칙 찾을수 있어서
		Random r;
		for (int i = 0; i < 10; i++) {
			r = new Random(System.currentTimeMillis());
			for (int j = 0; j < 10; j++) {
				// 그래서 이렇게 바꿔ㅓ주면 모름
				System.out.println(r.nextInt(10) + 1);
				// 정수만 발생하는 법
			}
		}
	}

}
