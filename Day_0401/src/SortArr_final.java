public class SortArr_final {

	public static void main(String[] args) {

		int[][] arr = { { 5, 100, 100, 99, 0 }, { 2, 89, 65, 34, 0 }, { 1, 78, 52, 23, 0 }, { 3, 34, 12, 93, 0 },
				{ 4, 12, 12, 13, 0 } };
		// 2���� �迭 �ʱ�ȭ
		String[] name = { "aaa", "bbb", "ccc", "ddd", "eee" };

		calSum(arr); // ���� ��� �޼ҵ�
		linkedPrint(arr, name); // ��ȣ&������ �� �̸��� ���� ����ϴ� �޼ҵ�
		System.out.println();

		sortArr(arr, name); // ���� ����

		System.out.println();
		linkedPrint(arr, name); // ���� �� ���

	}

	static void linkedPrint(int[][] arr, String[] name) { // ��¿� �޼ҵ�
		System.out.print("��ȣ\t");
		System.out.print("�̸�\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.println("����\t");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i][0] + "\t");
			System.out.print(name[i] + "\t");

			for (int j = 1; j < arr[i].length; j++)
				System.out.print(arr[i][j] + "\t");

			System.out.println();

		}

	}

	static void swapArr(int[][] arr, int a, int b) {	// �迭�� �ٲٴ� �޼ҵ�
														// int a int b �� �ٲ� ��ȣ�� �����Ǿ��ִ� �ε���

		int[] temp = new int[arr[a].length];	

		for (int i = 0; i < temp.length; i++) {	// temp = a		// �迭 ��ü�� �����ϱ⿡ for ���� ������
			temp[i] = arr[a][i];				//  �� �����δ� �׳� �̷� �����ΰ���
		}

		for (int i = 0; i < temp.length; i++) {	// a = b
			arr[a][i] = arr[b][i];
		}

		for (int i = 0; i < temp.length; i++) {	// b = temp
			arr[b][i] = temp[i];
		}

	}

	static void sortArr(int[][] arr, String[] name) {	// �迭�� �������� 

		for (int i = 0; i < arr.length; i++) {		// ���� ���� �˰��� 

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j][0] > arr[j + 1][0]) {	// ��ȣ�� �������� ���� ����
					
						// way 1
					//swapArr(arr, j + 1, j);		// ���� �κ��� ��� ��ü�� �ٲ�
												// �����ϱ⶧���� �޼ҵ�� ���� ����
					
						// way 2	: �ڹٸ��� ����� �̿�.
					int[] tt = arr[j];	// ��ü �迭�� �������� �ٲٸ� �迭 ��ü�� ���ҵ�
					arr[j] = arr[j+1];
					arr[j+1] = tt;
					
					
					//////////////////////

					String temp = name[j + 1];	// �̸� �κ��� �ٲ�
					name[j + 1] = name[j];
					name[j] = temp;

				}
			}

		}

	}

	static void calSum(int[][] arr) {
		for (int i = 0; i < arr.length; i++)
			for (int j = 1; j < arr[i].length - 1; j++) {
				arr[i][arr[i].length - 1] += arr[i][j];
			}
	}

}
