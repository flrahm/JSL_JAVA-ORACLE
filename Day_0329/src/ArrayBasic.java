import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
		int[] arr;	// �迭 ���� ����
		arr = new int[5];	// �Ҵ�(�޸� Ȯ��)
		
		System.out.println(arr.length); // �迭�� ���̸� ���
		
		int[] arr2 = new int[5];	// ����� �Ҵ��� ���ÿ�
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2]	= 30;
		arr2[3] = 40;
		arr2[4] = 50;
		//arr2[5] = 60;	 //���ڵ��� ������ �ȳ����� ����� ������ ��(runtime error)
		
		// �� ��� ��� ������ ��.

		System.out.println(arr);	// arr ���� �ּҰ� ���
		System.out.println(Arrays.toString(arr));	// ��Ʈ�� �迭�� ����Ʈ�� = 0;
		System.out.println(Arrays.toString(arr2));	//	Arrays.toString() : �迭�� �ִ� �� ��� ���
													// import java.util.Arrays; �� �ؾ� ��� ����
		
		for(int i = 0; i < arr.length ; i++)
			System.out.print(arr2[i] + " ");
		
		System.out.println();
		String str = Arrays.toString(arr);
		str = "1 2 3 4" + str;
		System.out.println(str);
	}

}
