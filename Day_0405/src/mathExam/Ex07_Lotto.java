package mathExam;

import java.util.Arrays;
import java.util.Random;

public class Ex07_Lotto {

	public static void main(String[] args) {
		
		Random r = new Random(System.currentTimeMillis());	// ����Ŭ���� �����ϰ� �õ带 ���� �ð����� 
		
		int[] lotto = new int[6];	// ������ �ζ� ��ȣ�� ������ �迭
		int cnt = 0;	// ������ ī����
		while(cnt<6) {	// 6���� �迭�� �� �������� ����
			int a = r.nextInt(45+1);	// 1~46�� ���� ��ȣ ����
			if(isOverlap(lotto,a)) {	// ���࿡ ���� ������ ��ȣ�� ���� ��ȣ�� ��ġ�� ������
				lotto[cnt] = a;	// �迭�� �߰���
				cnt++;	// ���� ������Ŵ
			}
			
		}
		
		sortArr(lotto);	// ������������ ����
		
		System.out.println(Arrays.toString(lotto)); // ��� ���
		
	}
	
	static void sortArr(int[] arr) {	// �迭�� �������ִ� �޼ҵ�
		
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr.length - 1 - i ; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	static boolean isOverlap(int[] arr, int a) {	// �迭�� �Է°��� �޾Ƽ� �迭 �ȿ� �Է°��� �ִ��� �Ǵ��Ͽ�
													// �ߺ��Ǵ� ��Ұ� ������ true , ������ false�� ��ȯ
		boolean b = true;	// �⺻���� Ʈ��� ����
		for(int i = 0; i < arr.length ; i++) {	// �迭 ũ�⸸ŭ �ݺ��Ͽ�
			if(arr[i] == a)	// ���� �Էµ� ���� ������ ��ҵ�� ��ġ�°� ������
				b = false;	// false �� �ٲ���
		}
		return b;	// �� ��ȯ
	}
	
}
