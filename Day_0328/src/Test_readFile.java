import java.io.File;
import java.util.Scanner;

/*
 * 입력 : indata.txt
 * 데이터 : 1 2 3 4 5 6 7 8 9 10
 * 전체 데이터의 수 : 10
 * 전체 평균 : xx.xx
 * 평균이상 data : 5 6 7 8 9 10
 * 평균 이상 data 수 : 6
 */

public class Test_readFile {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(new File("E:\\라이브러리\\문서\\eclipse-workspace\\text//indata.txt"));
		
		int cnt = 0;
		int sum = 0;

		System.out.print("전체 데이터 목록 : ");
		while(scan.hasNext()) {
			
			int a = scan.nextInt();
			System.out.print(a + " ");
			cnt ++;
			sum += a;
		}
		
		double ave = 1.0 * sum /cnt;
		ave = ((int)(ave*100+0.5))/100.0;
		System.out.println("전체 데이터 갯수 = " + cnt);
		System.out.println("전체 평균 = " + ave);
		System.out.println("");
		
		scan = new Scanner(new File("E:\\라이브러리\\문서\\eclipse-workspace\\text//indata.txt"));
		
		int cnt_upAve = 0;
		
		System.out.print("평균 이상 데이터 목록 : ");
		while(scan.hasNext()) {
			
			int a = scan.nextInt();
			if(a >= ave) {
				System.out.print(a + " ");
				cnt_upAve ++;
			}
		}
		
		System.out.println("");
		System.out.println("평균 이상 데이터 갯수 = " + cnt_upAve);
		
		
		scan.close();
	}

}
