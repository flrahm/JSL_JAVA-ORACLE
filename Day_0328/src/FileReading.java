import java.io.File;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws Exception{
		
		//Scanner scan = new Scanner(new File("D://text//indata.txt"));
		Scanner scan = new Scanner(new File("E:\\라이브러리\\문서\\eclipse-workspace\\text//indata.txt"));

		while(scan.hasNext()) {	// haxNext : 다음 데이터가 있으면 true, 없으면 false 
			//String str = scan.nextLine();	// 줄 단위로 읽기
			int s = scan.nextInt();
			System.out.println(s);
		}
		
		scan = new Scanner(new File("E:\\라이브러리\\문서\\eclipse-workspace\\text//indata.txt"));
		//한번 더 파일을 읽고싶으면 파일 객체를 한번 더 선언해줘야함. 파일읽을때 파일 포인터가 끝까지 가서 더이상 읽을 것이 없기때문
		
		scan.close();
		
	}

}
