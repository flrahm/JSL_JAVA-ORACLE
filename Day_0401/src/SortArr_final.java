public class SortArr_final {

	public static void main(String[] args) {

		int[][] arr = { { 5, 100, 100, 99, 0 }, { 2, 89, 65, 34, 0 }, { 1, 78, 52, 23, 0 }, { 3, 34, 12, 93, 0 },
				{ 4, 12, 12, 13, 0 } };
		// 2차원 배열 초기화
		String[] name = { "aaa", "bbb", "ccc", "ddd", "eee" };

		calSum(arr); // 총점 계산 메소드
		linkedPrint(arr, name); // 번호&점수들 과 이름을 같이 출력하는 메소드
		System.out.println();

		sortArr(arr, name); // 정렬 수행

		System.out.println();
		linkedPrint(arr, name); // 정렬 후 출력

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

	static void swapArr(int[][] arr, int a, int b) {	// 배열을 바꾸는 메소드
														// int a int b 는 바꿀 번호가 지정되어있는 인덱스

		int[] temp = new int[arr[a].length];	

		for (int i = 0; i < temp.length; i++) {	// temp = a		// 배열 전체를 복사하기에 for 문을 돌려줌
			temp[i] = arr[a][i];				//  ㄴ 실제로는 그냥 이런 과정인거임
		}

		for (int i = 0; i < temp.length; i++) {	// a = b
			arr[a][i] = arr[b][i];
		}

		for (int i = 0; i < temp.length; i++) {	// b = temp
			arr[b][i] = temp[i];
		}

	}

	static void sortArr(int[][] arr, String[] name) {	// 배열을 정렬해줌 

		for (int i = 0; i < arr.length; i++) {		// 버블 정렬 알고리즘 

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j][0] > arr[j + 1][0]) {	// 번호를 기준으로 정렬 수행
					
						// way 1
					//swapArr(arr, j + 1, j);		// 점수 부분의 행렬 전체를 바꿈
												// 복잡하기때문에 메소드로 따로 구현
					
						// way 2	: 자바만의 기능을 이용.
					int[] tt = arr[j];	// 전체 배열의 참조값만 바꾸면 배열 전체가 스왑됨
					arr[j] = arr[j+1];
					arr[j+1] = tt;
					
					
					//////////////////////

					String temp = name[j + 1];	// 이름 부분을 바꿈
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
