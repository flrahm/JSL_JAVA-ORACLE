import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		
	int num = scan2();
	
	System.out.println("�� : " + num);
	
	if(num>400)
		System.out.println("�հ�");
	else
		System.out.println("���հ�");
		
		
	}
	
	static int scan() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("5���� �������� �Է��ϼ��� : ");
		
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
		System.out.print("5���� �������� �Է��ϼ��� : ");
		
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
