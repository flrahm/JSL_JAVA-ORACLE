import java.util.Arrays;

public class Sorting {

	static void swap(int[] arr, int a, int b) {

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

	public static void main(String[] args) {

		int[] arr = { 4, 3, 1, 7, 6, 8, 11, 10, 2, 12, 9, 5 };
		System.out.println(Arrays.toString(arr));

		// bouble(arr);
		// selection(arr);
		// insertion(arr);
		// mergeSort(arr,0 9, arr.length-1);
		// quickSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}

	

	static void mergeSort(int[] arr, int start, int end) {
		int mid;
		if (start < end) {
			mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);

		}
	}

	static void merge(int[] arr, int start, int mid, int end) {

		int[] temp = new int[arr.length];
		int index = start;
		int left_index = start;
		int right_index = mid + 1;

		while (left_index <= mid && right_index <= end) {

			if (arr[left_index] > arr[right_index])
				temp[index] = arr[right_index++];
			else
				temp[index] = arr[left_index++];

			index++;
		}

		while (left_index <= mid)
			temp[index++] = arr[left_index++];

		while (right_index <= end)
			temp[index++] = arr[right_index++];

		for (int i = start; i <= end; i++)
			arr[i] = temp[i];

	}

	static void insertion(int[] arr) {
		int j;
		int temp;

		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];

			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}

			arr[j + 1] = temp;

		}
	}

	static void selection(int[] arr) {

		int minIndex;
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j])
					minIndex = j;
			}

			swap(arr, i, minIndex);

		}

	}

	static void bouble(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1])
					swap(arr, j + 1, j);
			}

		}

	}
}
