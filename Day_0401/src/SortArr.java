public class SortArr {

	public static void main(String[] args) {

		int[][] arr = { { 5, 100, 100, 99, 0 }, { 2, 89, 65, 34, 0 }, { 1, 78, 52, 23, 0 }, { 3, 34, 12, 93, 0 },
				{ 4, 12, 12, 13, 0 } };
		// 2���� �迭 �ʱ�ȭ
		String[] name = { "aaa", "bbb", "ccc", "ddd", "eee" };

		calSum(arr); // ���� ��� �޼ҵ�
		linkedPrint(arr, name); // ��ȣ&������ �� �̸��� ���� ����ϴ� �޼ҵ�
		System.out.println();

		sort(arr, name); // ���� ����

		System.out.println();
		linkedPrint(arr, name); // ���� �� ���

	}

	static void sort(int[][] arr, String[] name) {
		sortName(arr, name); // ��ȣ�� �°� �̸��� ����
		sortArr(arr); // ��ȣ�� �°� �����迭�� ����
						// �� ���� �� ���� �ٲ�� �ȵ�

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

	static void sortName(int[][] arr, String[] name) {	// �̸��� ��ȣ�� ���� �����ϴ� �޼ҵ�
		int[] temp = new int[arr.length];		// �ӽ� �迭�� ����. ���̴� �л��� �ο�����
		for (int i = 0; i < arr.length; i++) {	// �ӽ÷� ������ �迭�� ��ȣ���� �ҷ��� ��������
			temp[i] = arr[i][0];	
					//       �� �� 0��° ��ҿ� ��ȣ�� ����Ǿ�����
		}

		for (int i = 0; i < arr.length; i++) {				// �����ϴ� ����� bouble sort �� �̿��Ͽ���
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (temp[j] > temp[j + 1]) {

					int t = temp[j];
					temp[j] = temp[j + 1];
					temp[j + 1] = t;

					String tt = name[j];
					name[j] = name[j + 1];
					name[j + 1] = tt;

				}

			}

		}

	}

	static void swapArr(int[][] arr, int a, int b) {

		int[] temp = new int[arr[a].length];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[a][i];
		}

		for (int i = 0; i < temp.length; i++) {
			arr[a][i] = arr[b][i];
		}

		for (int i = 0; i < temp.length; i++) {
			arr[b][i] = temp[i];
		}

	}

	static void sortArr(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j][0] > arr[j + 1][0])
					swapArr(arr, j + 1, j);
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
