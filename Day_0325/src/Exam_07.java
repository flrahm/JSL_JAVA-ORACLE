import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �������� �Է� : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int mat = scan.nextInt();
		int sum = kor + eng + mat;
		double ave = (int)(sum/3.0*100+0.5)/100.0;
		
		System.out.println("�������� : " + kor );
		System.out.println("�������� : " + eng );
		System.out.println("�������� : " + mat );
		System.out.println("��� : " + ave );
		
		scan.close();
	}

}
