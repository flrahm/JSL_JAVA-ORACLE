
public class Exam_03 {

	public static void main(String[] args) throws Exception {

		char a = (char) System.in.read();
		char b = (char) System.in.read();
		char c = (char) System.in.read();
		char d = (char) System.in.read();
		char e = (char) System.in.read(); // int값 1개 . throws Exception 해줘야 함
		
		
		String str = ""+a+b+c+d+e+"^^"+7;
		
		System.out.println("-------------------");
		System.out.print("a = " + str);

	}

}
