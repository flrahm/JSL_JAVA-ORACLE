import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
		int[] arr;	// 배열 변수 선언
		arr = new int[5];	// 할당(메모리 확보)
		
		System.out.println(arr.length); // 배열의 길이를 출력
		
		int[] arr2 = new int[5];	// 선언과 할당을 동시에
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2]	= 30;
		arr2[3] = 40;
		arr2[4] = 50;
		//arr2[5] = 60;	 //인코딩시 에러가 안나지만 실행시 오류가 남(runtime error)
		
		// 두 방법 모두 숙지할 것.

		System.out.println(arr);	// arr 가상 주소값 출력
		System.out.println(Arrays.toString(arr));	// 인트형 배열의 디폴트값 = 0;
		System.out.println(Arrays.toString(arr2));	//	Arrays.toString() : 배열에 있는 것 모두 출력
													// import java.util.Arrays; 을 해야 사용 가능
		
		for(int i = 0; i < arr.length ; i++)
			System.out.print(arr2[i] + " ");
		
		System.out.println();
		String str = Arrays.toString(arr);
		str = "1 2 3 4" + str;
		System.out.println(str);
	}

}
