package random;

import java.util.Random;

public class Exam_09_random2 {

	public static void main(String[] args) {
		// Random r = new Random(2);
		// Random(a); a�� ���ڰ� �޶�����
		// ���� �ٸ� �̰ɷ� ��Ģ ã���� �־
		Random r;
		for (int i = 0; i < 10; i++) {
			r = new Random(System.currentTimeMillis());
			for (int j = 0; j < 10; j++) {
				// �׷��� �̷��� �ٲ���ָ� ��
				System.out.println(r.nextInt(10) + 1);
				// ������ �߻��ϴ� ��
			}
		}
	}

}
