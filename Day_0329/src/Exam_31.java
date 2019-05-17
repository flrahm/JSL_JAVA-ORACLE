// 배열에서 최대 최소를 뺀 나머지의 합계 출력

public class Exam_31 {

	public static void main(String[] args) {
		
		int[] arr = {9,8,7,5,3,7,8};
		
		mildSum(arr);

	}

	static void mildSum(int[] arr) {
		
		int max = arr[0];	// 최대값을 저장하기 위한 변수. 초기값은 arr[0] 
		int min = arr[0];	// 최소값을 저장하기 위한 변수. 초기값은 arr[0]
		int sum = 0;		// 합계를 저장하기 위한 변수. 0으로 초기화
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			sum += arr[i];	// 합계에 각 배열 요소들을 더해줌
			
			if(arr[i] > max)	
				max = arr[i];	// 최대값 구하기
			
			if(arr[i] < min)	//	최소값 구하기 
				min = arr[i];
			
		}
		
		sum = sum - max - min;	// 총 합계에서 최대값과 최소값을 빼줌
		
		System.out.println("최대값과 최소값을 뺀 나머지 값들의 합은 : " + sum );
	}
}
