
public class Exam_25 {

	public static void main(String[] args) {
		
		forSum();
		
	}

	static void forSum() {
		
		int sum = 0;
		for(int i = 1; i <=10 ; i++) {
			System.out.print(i + " ");
			sum += i;
		}
		System.out.print(" = " + sum);
		
	}
}
