package random;

import java.util.Random;

public class SelfTest01_deviation {

	public static void main(String[] args) {

		//Random r = new Random(System.currentTimeMillis());
		Random r = new Random(System.currentTimeMillis());
		
		int num = 1000;
		int[] arr = new int[num];
		int sum = 0;
		double deviation = 0;
		
		

		for (int i = 0; i < num; i++) {
			int a = r.nextInt(100);
			sum = sum + a;
			arr[i] = a;
		}
		double ave = 1.0 * sum / num;

		for (int i = 0; i < num; i++) {
			double a = Math.abs(ave - arr[i]);
			a = a * a;
			deviation += a;
		}
		
		deviation = Math.sqrt(deviation/num-1);

		
		System.out.println("평균 : " + ave);
		System.out.println("표준편차 : " + Math.round(deviation));
	}

}
