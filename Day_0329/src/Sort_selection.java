import java.util.Arrays;

/*
 * ����. ��������, ��������
 */

public class Sort_selection {

	public static void main(String[] args) {
		
		int[] arr = {1,3,2,6,8,4,5,6,7,23,98,22,52};
		int[] arr2 = {1,3,2,6,8,4,5,6,7,23,98,22,52};
		System.out.println("���� ��  ");
		System.out.println(Arrays.toString(arr));
		selection_asc(arr);
		selection_dsc(arr2);
		
		System.out.println("\n���� ��");
		System.out.println(Arrays.toString(arr));	//�������� ����
		System.out.println(Arrays.toString(arr2));	// �������� ����

	}

	static void selection_asc(int[] arr) {
		
		for(int i = 0; i < arr.length ; i ++) {
			int minIndex = i;	
			for(int j = i+1; j < arr.length ; j++) {
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}
		
	}
	
	static void selection_dsc(int[] arr) {
		
		for(int i = 0; i < arr.length ; i ++) {
			int maxIndex = i;
			for(int j = i+1; j < arr.length ; j++) {
				if(arr[j] > arr[maxIndex])
					maxIndex = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[maxIndex];
			arr[maxIndex] = temp;
			
		}
		
	}
}
