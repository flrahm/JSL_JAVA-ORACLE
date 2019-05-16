import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int i = 0;
		
		while(true) {
			
			int a = scan.nextInt();
			i++;
			
			if(a == 0 || i == 5)
				break;	//System.exit(1);    : 프로그램 종료

		}
		
		
		scan.close();
		
	}

}
