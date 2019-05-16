import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a =scan.nextInt();	// 정수 입력
		System.out.print("정수를 입력하세요 : ");
		int b =scan.nextInt();	// 정수 입력
		System.out.print("문자열을 입력하세요 : ");
		String str = scan.next();	// 문자열 입력
		//scan.nextLine();	// 한 줄 전체 입력. 단독으로만 쓰임
		
		System.out.println("a" + a);
		System.out.println("b" + b);
		System.out.println("str" + str);
		
		
		scan.close();
	
		
	}

}
