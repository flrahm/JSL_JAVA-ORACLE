import java.io.File;
import java.util.Scanner;

/*
 * �Է� : indata.txt
 * ������ : 1 2 3 4 5 6 7 8 9 10
 * ��ü �������� �� : 10
 * ��ü ��� : xx.xx
 * ����̻� data : 5 6 7 8 9 10
 * ��� �̻� data �� : 6
 */

public class Test_readFile {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(new File("E:\\���̺귯��\\����\\eclipse-workspace\\text//indata.txt"));
		
		int cnt = 0;
		int sum = 0;

		System.out.print("��ü ������ ��� : ");
		while(scan.hasNext()) {
			
			int a = scan.nextInt();
			System.out.print(a + " ");
			cnt ++;
			sum += a;
		}
		
		double ave = 1.0 * sum /cnt;
		ave = ((int)(ave*100+0.5))/100.0;
		System.out.println("��ü ������ ���� = " + cnt);
		System.out.println("��ü ��� = " + ave);
		System.out.println("");
		
		scan = new Scanner(new File("E:\\���̺귯��\\����\\eclipse-workspace\\text//indata.txt"));
		
		int cnt_upAve = 0;
		
		System.out.print("��� �̻� ������ ��� : ");
		while(scan.hasNext()) {
			
			int a = scan.nextInt();
			if(a >= ave) {
				System.out.print(a + " ");
				cnt_upAve ++;
			}
		}
		
		System.out.println("");
		System.out.println("��� �̻� ������ ���� = " + cnt_upAve);
		
		
		scan.close();
	}

}
