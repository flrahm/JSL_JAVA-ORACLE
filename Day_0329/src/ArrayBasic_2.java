
public class ArrayBasic_2 {

	public static void main(String[] args) {
		
		int[] score = {10, 20, 30, 40, 50, 60 , 0};	// 배열 선언과 동시에 초기화. 마지막 0은 합계 계산용
		
		int[] num;
		num = new int[] {10, 20, 30, 40, 50, 60};	// 배열 초기화 방법 2 
			//	ㄴ 반드시 쓸 것

		String[] name = {"aaa" , "bbb" , "ccc" , "dddd"};
		
		
		for(int i = 0; i < score.length-1 ; i ++)
			score[score.length-1] += score[i];
		
		System.out.println(score[score.length-1]);
	}

}
