import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int a =scan.nextInt();	// ���� �Է�
		System.out.print("������ �Է��ϼ��� : ");
		int b =scan.nextInt();	// ���� �Է�
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = scan.next();	// ���ڿ� �Է�
		//scan.nextLine();	// �� �� ��ü �Է�. �ܵ����θ� ����
		
		System.out.println("a" + a);
		System.out.println("b" + b);
		System.out.println("str" + str);
		
		
		scan.close();
	
		
	}

}
