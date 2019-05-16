// input alphabet with Ternary operator

public class Exam_12 {

	public static void main(String[] args) throws Exception {
	
		
		System.out.print("값을 입력하세요");
		char ch = (char)System.in.read();
		
		String str = (ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')? ""+ch : "Error";
		System.out.println(str);
		

	}

}
