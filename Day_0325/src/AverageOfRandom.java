
public class AverageOfRandom {

	public static void main(String[] args) {

		int arrSize = 10000;
		int randSize = 100000;
		int[] arr = new int[arrSize];
		long sum = 0;
		
		for (int i = 0 ; i < arrSize ; i++) {
			arr[i] = (int)(Math.random()*randSize);

		}
		
		for (int i = 0; i < arrSize ; i ++) {
			sum += arr[i];
		}
		
		double ave = sum/arrSize;
		System.out.print("Æò±ÕÀº " + ave);
		
	}

}
