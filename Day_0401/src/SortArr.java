public class SortArr {

	public static void main(String[] args) {

		int[][] arr = { { 5, 100, 100, 99, 0 }, { 2, 89, 65, 34, 0 }, { 1, 78, 52, 23, 0 }, { 3, 34, 12, 93, 0 },
				{ 4, 12, 12, 13, 0 } };
		// 2차원 배열 초기화
		String[] name = { "aaa", "bbb", "ccc", "ddd", "eee" };

		calSum(arr); // 총점 계산 메소드
		linkedPrint(arr, name); // 번호&점수들 과 이름을 같이 출력하는 메소드
		System.out.println();

		sort(arr, name); // 정렬 수행

		System.out.println();
		linkedPrint(arr, name); // 정렬 후 출력

	}

	static void sort(int[][] arr, String[] name) {
		sortName(arr, name); // 번호에 맞게 이름을 정렬
		sortArr(arr); // 번호에 맞게 점수배열을 정렬
						// ㄴ 위에 둘 순서 바뀌면 안됨

	}

	static void linkedPrint(int[][] arr, String[] name) { // 출력용 메소드
		System.out.print("번호\t");
		System.out.print("이름\t");
		System.out.print("국어\t");
		System.out.print("영어\t");
		System.out.print("수학\t");
		System.out.println("총점\t");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i][0] + "\t");
			System.out.print(name[i] + "\t");

			for (int j = 1; j < arr[i].length; j++)
				System.out.print(arr[i][j] + "\t");

			System.out.println();

		}

	}

	static void sortName(int[][] arr, String[] name) {	// 이름을 번호에 따라 정렬하는 메소드
		int[] temp = new int[arr.length];		// 임시 배열을 생성. 길이는 학생의 인원수로
		for (int i = 0; i < arr.length; i++) {	// 임시로 생성한 배열에 번호들을 불러와 저장해줌
			temp[i] = arr[i][0];	
					//       ㄴ 이 0번째 요소에 번호가 저장되어있음
		}

		for (int i = 0; i < arr.length; i++) {				// 정렬하는 방법은 bouble sort 를 이용하였음
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
