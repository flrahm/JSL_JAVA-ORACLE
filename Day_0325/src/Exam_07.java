import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 영어 수학점수 입력 : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int mat = scan.nextInt();
		int sum = kor + eng + mat;
		double ave = (int)(sum/3.0*100+0.5)/100.0;
		
		System.out.println("국어점수 : " + kor );
		System.out.println("영어점수 : " + eng );
		System.out.println("수학점수 : " + mat );
		System.out.println("평균 : " + ave );
		
		scan.close();
	}

}
