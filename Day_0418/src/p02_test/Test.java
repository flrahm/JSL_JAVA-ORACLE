package p02_test;

import java.util.Random;

public class Test {

	public static void main(String[] args) {

		int[] score = new int[100];
		Random r = new Random();
		for (int i = 0; i < 100; i++)
			score[i] = r.nextInt(100) + 1;


		System.out.println("Â¦¼ö °¹¼ö : " + test(score));

	}

	static int test(int[] arr) {

		int cnt = 0;

		for (int i = 0; i < arr.length; i++) 
			if (arr[i] % 2 == 0) {
				cnt++;
				System.out.print(arr[i] + "\t");
				if(cnt%5 == 0 && cnt!= 0)
					System.out.println();
			}
		
		System.out.println();
		return cnt;
	}

}
