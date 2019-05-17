package P02;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 10, 1, 4, 3, 9, 6, 2, 5, 8, 7 };

		Scanner scan = new Scanner(System.in);

		System.out.println("찾는 정수 : ");
		int num = scan.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println(num + " 은 배열의 " + (i + 1) + " 번 째에 있습니다");
				break;
			}
			
			if(i == (arr.length-1))
				System.out.println(num + " 은 배열에 없습니다");
		}
		scan.close();

	}

}
