
public class Exam_18 {

	public static void main(String[] args) {
		
		int x = 100;
		int y = 100;
		
		String irum = "홍길동";
		int nai = 15;
		
		int z = add(x,y);
		System.out.println(z);
		System.out.println(add(300,500));
		
		
		
		String str = addString(irum , nai);
		System.out.println(str);
	}
	
	
	static int add(int a , int b) {
	
		return a+b;
	}

	static String addString(String name, int age) {
		
		return ("이름은 " + name + " 나이는 " + age);
		
	}
}
