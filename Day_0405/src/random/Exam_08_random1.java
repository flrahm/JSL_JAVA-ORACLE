package random;

import java.util.Random;

public class Exam_08_random1 {

	public static void main(String[] args) {
		Random r = new Random();// ��������Ŭ���� //���� ���� ������ �߻��Ǵ� �� �� �� ����
		for (int i = 0; i < 10; i++) {
			// r=new Random(System.currentTimeMillis());//�����ϰ� ����� ���-> �� �����ϰ� �Ϸ��� �ʴ����� �־��ָ�
			// ��
			System.out.println(r.nextInt(45) + 1);// int�� ���� ����10 ���� ���ڰ� ����
		}
	}
	
	
	

}
