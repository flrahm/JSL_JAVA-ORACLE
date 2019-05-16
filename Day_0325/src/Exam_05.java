//self test : 

import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력\n" + "번호 : ");
		int num = scan.nextInt();
		
		System.out.println("이름 : ");
		String name = scan.next();
		
		System.out.print("국어점수 : ");
		int kor = scan.nextInt();
		System.out.print("수학점수 : ");
		int mat = scan.nextInt();
		System.out.print("영어점수 : ");
		int eng = scan.nextInt();
		
		int sum = kor + mat + eng;
		//double ave = sum/3.0;
		double ave2 = ((int)(sum/3.0*100+0.5))/100.0;	// 소수 셋째자리에서 반올림
		
		System.out.println("\t\t **성적 일람표**");
		System.out.print("번호\t");
		System.out.print("잉름\t");
		System.out.print("국어\t");
		System.out.print("수학\t");
		System.out.print("영어\t");
		System.out.print("총점\t");
		System.out.println("평균");
		
		System.out.print(num+"\t");
		System.out.print(name+"\t");
		System.out.print(kor+"\t");
		System.out.print(mat+"\t");
		System.out.print(eng+"\t");
		System.out.print(sum+"\t");
		System.out.println(ave2);
		
		scan.close();

	}

}
