
public class ArrayBasic_method {

	public static void main(String[] args) {
		int[] var = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		sumNave(var);
		
		
		System.out.println("var[0] = " + var[0]); 	// 메소드에 의한 배열의 호출시 배열의 참조값을 넘겨주기 때문에
													// 메소드에서 배열값을 수정하면 메인에서도 값이 바뀜
	}

	static void sumNave(int[] arr) {

		int sum = 0;
		double ave = 0;

		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		ave = 1.0 * sum / arr.length;

		arr[0] = 100;

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + ave);
	}
}
