import java.util.Scanner;

public class Exam_21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� 1: ");
		int a = scan.nextInt();
		System.out.print("���� 2: ");
		int b = scan.nextInt();
		System.out.print("���� 3: ");
		int c = scan.nextInt();
		
		int min = minScore(a,b,c);	
		System.out.printf("%d %d %d �� ���� ���� ���� %d �Դϴ�", a,b,c,min);
		
		scan.close();

	}

	
	static int minScore(int a, int b, int c) {
		int min = 0;
		
		if(a<b)
			min = a;
		else
			min = b;
	
		if (min > c)
			min = c;

		return min;
	}
}
