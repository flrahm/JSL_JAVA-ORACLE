import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		
	int num = scan2();
	
	System.out.println("값 : " + num);
	
	if(num>400)
		System.out.println("합격");
	else
		System.out.println("불합격");
		
		
	}
	
	static int scan() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("5개의 정수값을 입력하세요 : ");
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		int n5 = scan.nextInt();
		
		scan.close();
		return n1 + n2 + n3 + n4 + n5;
		
	}
	
	static int scan2() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("5개의 정수값을 입력하세요 : ");
		
		int cnt = 0;
		int sum = 0;
		
		while(true) {
			int a = scan.nextInt();
			sum += a;
			cnt ++;
			if (cnt ==5)
				break;
		}
		
		scan.close();
		return sum;
		
	}
	
}
