
public class Exam_26 {

	// n ~ m 까지의 합계를  출력
	static void forSum(int n, int m) {
		int start;
		int end;
		
		if (n>m) {
			start = m;
			end = n;
		}
		else {
			start = n;
			end = m;
		}
		
		int sum = 0;
		
		for (int i = start ; i <= end ; i++ )
			sum = sum + i;
		
		System.out.printf("%d 부터 %d 까지의 합은 %d 입니다" , start , end ,sum);
	}
	
	public static void main(String[] args) {
	
		forSum(200,300);
		
	}

}
