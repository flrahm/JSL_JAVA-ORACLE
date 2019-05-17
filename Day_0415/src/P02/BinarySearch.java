package P02;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 1, 4, 3, 9, 6, 2, 5, 8, 7 };

		int num = 8;

		sortArr(arr);

		System.out.println(Arrays.toString(arr));

		int a = binSearch(arr, 0, arr.length - 1, num);
		int b = binSearch2(arr, num);
		System.out.println(a + 1);
		System.out.println(b + 1);

	}

	static int binSearch2(int[] arr, int num) {
		int mid;
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			mid = (start + end) / 2;

			if (arr[mid] == num) {
				return mid;
			} else if (arr[mid] < num)
				start = mid + 1;
			else
				end = mid - 1;
		}

		return -1;
	}

	static int binSearch(int[] arr, int start, int end, int num) {	// recursive

		int mid = (start + end) / 2;

		// 종료조건
		if (start == end) {
			if (arr[mid] == num)
				return mid;
			else
				return -1;
		}

		// 재귀
		if (arr[mid] == num)
			return mid;
		else if (arr[mid] < num)
			return binSearch(arr, mid + 1, end, num);
		else
			return binSearch(arr, start, mid - 1, num);

	}

	static void sortArr(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr.length - 1 - i; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

}
