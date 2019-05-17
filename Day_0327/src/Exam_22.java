
public class Exam_22 {

	public static void main(String[] args) {

		testMethod(1);
		testMethod(2);
		testMethod(3);
		testMethod(4);
		testMethod(5);
		System.out.println("------------------------");
		testMethod2(1);
		testMethod2(2);
		testMethod2(3);
		testMethod2(4);
		testMethod2(5);

	}

	// check 1 : +
	// check 2 : -
	// check 2 : *
	// check 2 : /
	static void testMethod(int check) {
		int a = 100;
		int b = 20;

		if (check == 1)
			System.out.println(a + b);
		else if (check == 2)
			System.out.println(a - b);
		else if (check == 3)
			System.out.println(a * b);
		else if (check == 4)
			System.out.println(a / b);
		else
			System.out.println("입력 오류");

	}
	
	static void testMethod2(int check) {
		
		int a = 90;
		int b = 9;
		
		switch (check) {
		
		case 1 : 
			System.out.println(a+b);
			break;
		case 2 : 
			System.out.println(a-b);
			break;
		case 3 : 
			System.out.println(a*b);
			break;
		case 4 : 
			System.out.println(a/b);
			break;
		default :
			System.out.println("잘못된 입력입니다");
		
		}
		
	}

}
