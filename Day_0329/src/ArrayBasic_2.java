
public class ArrayBasic_2 {

	public static void main(String[] args) {
		
		int[] score = {10, 20, 30, 40, 50, 60 , 0};	// �迭 ����� ���ÿ� �ʱ�ȭ. ������ 0�� �հ� ����
		
		int[] num;
		num = new int[] {10, 20, 30, 40, 50, 60};	// �迭 �ʱ�ȭ ��� 2 
			//	�� �ݵ�� �� ��

		String[] name = {"aaa" , "bbb" , "ccc" , "dddd"};
		
		
		for(int i = 0; i < score.length-1 ; i ++)
			score[score.length-1] += score[i];
		
		System.out.println(score[score.length-1]);
	}

}
