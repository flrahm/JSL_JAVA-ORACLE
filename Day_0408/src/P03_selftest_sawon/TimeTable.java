package P03_selftest_sawon;

public class TimeTable {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i = i + 3) {

			for (int j = 1; j <= 9; j++) {

				for (int k = i; k < i + 3; k++)
					if (k < 10)
						System.out.printf("%d x %d = %d\t", k, j, k * j);

				// System.out.printf("%d x %d = %d \t", i, j, i * j);
				// System.out.printf("%d x %d = %d \t", i + 1, j, (i + 1) * j);
				// System.out.printf("%d x %d = %d \t", i + 2, j, (i + 2) * j);

				System.out.println();
			}
			System.out.println();

		}

	}

}
