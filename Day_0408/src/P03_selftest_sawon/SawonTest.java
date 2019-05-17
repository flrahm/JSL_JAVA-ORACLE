package P03_selftest_sawon;

import java.util.*;

public class SawonTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<Sawon> sList = new ArrayList<Sawon>();

		int[][] moneyArr = new int[10][10];
		int[] moneySum = new int[10];
		int[] moneyList = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int cnt = 0;

		// 입력
		while (sList.size() < 10) {
			System.out.println("사원 정보 입력 : ");

			int sabun = scan.nextInt();

			if (sabun == 0)
				break;

			String name = scan.next();
			int pay = scan.nextInt();
			moneyCal(moneyArr, moneyList, moneySum, pay, cnt);

			sList.add(new Sawon(sabun, name, pay));

			cnt++;
		}
		scan.close();
		//

		/// 출력
		System.out.println("\t\t\t\t\t **급여현황표**");
		System.out.print("사번\t" + "이름\t" + "급여\t\t");
		printArr(moneyList);

		for (int i = 0; i < sList.size(); i++) {

			Sawon sa = sList.get(i);
			System.out.print(sa.getSabun() + "\t");
			System.out.print(sa.getName() + "\t");
			System.out.print(printPay2(sa.getPay()) + "\t");

			System.out.print("\t");
			for (int j = 0; j < 10; j++) {
				System.out.print(moneyArr[i][j] + "\t");
			}
			System.out.println();
		}
		/////////////
		System.out.print("\t\t\t\t");
		printArr(moneySum);

	}

	static String printPay2(int pay) {

		String str = Integer.toString(pay);
		int len = str.length();
		int start = len % 3;
		int iter = len / 3;
		String str2 = "";
		
		
		if (start != 0)
			str2 = str.substring(0, start) + ",";

		for (int i = 0; i < iter; i++) {
			if (i == 0)
				str2 = str2 + str.substring(start + i * 3, start + 3 + i * 3);
			else
				str2 = str2 + "," + str.substring(start + i * 3, start + 3 + i * 3);
		}
		
		if(len > 3)
			return str2;
		else
			return str;

	}

	static String printPay(int pay) {

		String str = Integer.toString(pay);
		int len = str.length();
		String str2 = "";
		if (len < 3)
			str2 = str;
		else {
			for (int i = len % 3; i <= len; i += 3) {
				int temp = 0;
				if (i == 0)
					i += 3;
				if (i >= 3)
					temp = i - 3;
				str2 += str.substring(temp, i);
				if (i != len)
					str2 += ",";
			}
		}
		return str2;

	}

	static void printArr(int[] arr) {

		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}

	static void moneyCal(int[][] moneyArr, int[] moneyList, int[] moneySum, int pay, int cnt) {

		while (pay > 0) {

			for (int i = 0; i < moneyList.length; i++) {
				moneyArr[cnt][i] = pay / moneyList[i];
				moneySum[i] += moneyArr[cnt][i];
				pay = pay - moneyArr[cnt][i] * moneyList[i]; // pay = pay % moneyArr[i]
			}
		}

	}

}
