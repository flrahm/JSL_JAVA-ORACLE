import java.io.File;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) throws Exception{
		
		//Scanner scan = new Scanner(new File("D://text//indata.txt"));
		Scanner scan = new Scanner(new File("E:\\���̺귯��\\����\\eclipse-workspace\\text//indata.txt"));

		while(scan.hasNext()) {	// haxNext : ���� �����Ͱ� ������ true, ������ false 
			//String str = scan.nextLine();	// �� ������ �б�
			int s = scan.nextInt();
			System.out.println(s);
		}
		
		scan = new Scanner(new File("E:\\���̺귯��\\����\\eclipse-workspace\\text//indata.txt"));
		//�ѹ� �� ������ �а������ ���� ��ü�� �ѹ� �� �����������. ���������� ���� �����Ͱ� ������ ���� ���̻� ���� ���� ���⶧��
		
		scan.close();
		
	}

}
