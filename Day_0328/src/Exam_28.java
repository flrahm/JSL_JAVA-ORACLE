
public class Exam_28 {

	public static void main(String[] args) {
	
		forTest();
		whileTest();
		doWhileTest();
	}

	
	static void forTest() {
		int sum = 0;
		for(int i = 1;i<=10;i++)
			 sum += i;
		
		System.out.println("forTest : sum = " + sum);
	}
	
	static void whileTest() {
		
		int sum = 0;
		int cnt = 0;
		
		while(cnt<10) {
			cnt++;
			sum +=cnt;		
		}
		
		System.out.println("whileTest : sum = " + sum);
	}
	
	static void doWhileTest() {
		
		int sum = 0;
		int cnt = 0;
		
		do {
			cnt ++;
			sum += cnt;
			
		} while(cnt < 10);
		
		System.out.println("doWhileTest : sum = " + sum);
	}
	
}
