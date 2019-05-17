// 5~70 사이의 소수의 갯수

package P01;

public class Test2 {

	public static void main(String[] args) {

		int cnt = 0;
		int start = 5;
		int end = 67;

		for (int i = start; i <=end; i++) {

			for (int j = 2; j <= i; j++) {

				if (i % j == 0) {

					if (i == j) {
						System.out.println(i);
						cnt++;
					}
					
					break;

				}

			}

		}
		System.out.println();
		System.out.println(cnt);

	}

}
