
public class Exam_26 {

	// n ~ m ������ �հ踦  ���
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
		
		System.out.printf("%d ���� %d ������ ���� %d �Դϴ�" , start , end ,sum);
	}
	
	public static void main(String[] args) {
	
		forSum(200,300);
		
	}

}
