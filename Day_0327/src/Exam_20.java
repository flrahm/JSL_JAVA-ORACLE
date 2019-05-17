import java.util.Scanner;

public class Exam_20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		
		System.out.println(grade(score));
	
	
		scan.close();
	}
	
	
	static String grade(int a) {
		
		String str = "";	// str = null;
		
		if(a >= 90)
			str = "A";
		else if (a>=80)
			str = "B";
		else if (a>=70)
			str = "C";
		else if (a>=60)
			str = "D";
		else
			str = "F";
		
		return str;
	}

}
