package p01_student;

import java.io.File;
import java.util.Scanner;

public class FileReadTest {

	public static void main(String[] args) throws Exception{
		String fileName = "E:\\라이브러리\\문서\\eclipse-workspace\\text\\Day_0417\\data.txt";

		Scanner scan = new Scanner(new File(fileName));
		
		System.out.println(scan.next());
		System.out.println(scan.next());
		System.out.println(scan.next());
		System.out.println(scan.next());
		scan.close();
	}

}
