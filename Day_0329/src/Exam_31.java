// �迭���� �ִ� �ּҸ� �� �������� �հ� ���

public class Exam_31 {

	public static void main(String[] args) {
		
		int[] arr = {9,8,7,5,3,7,8};
		
		mildSum(arr);

	}

	static void mildSum(int[] arr) {
		
		int max = arr[0];	// �ִ밪�� �����ϱ� ���� ����. �ʱⰪ�� arr[0] 
		int min = arr[0];	// �ּҰ��� �����ϱ� ���� ����. �ʱⰪ�� arr[0]
		int sum = 0;		// �հ踦 �����ϱ� ���� ����. 0���� �ʱ�ȭ
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			sum += arr[i];	// �հ迡 �� �迭 ��ҵ��� ������
			
			if(arr[i] > max)	
				max = arr[i];	// �ִ밪 ���ϱ�
			
			if(arr[i] < min)	//	�ּҰ� ���ϱ� 
				min = arr[i];
			
		}
		
		sum = sum - max - min;	// �� �հ迡�� �ִ밪�� �ּҰ��� ����
		
		System.out.println("�ִ밪�� �ּҰ��� �� ������ ������ ���� : " + sum );
	}
}
