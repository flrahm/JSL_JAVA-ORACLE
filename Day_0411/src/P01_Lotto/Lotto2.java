package P01_Lotto;

import java.util.Scanner;

public class Lotto2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	// ��ĳ�� ��ü ����

		System.out.println("���� ���� �Է��ϼ��� : ");	// ���� ���� ���� �Է¹���
		int gameNum = scan.nextInt();	// ���Ӽ��� ��ĳ�ʸ� ���� �Է¹���
		int cnt = 0;	// ������ ���� ���� ����

		int[][] arr = new int[gameNum][6];	// ���� Ƚ�� & �ζ� ��ȣ�� �����ϱ� ���� ������ �����迭

		while (cnt < gameNum) {	// ���� �� ��ŭ �ݺ�

			System.out.print((cnt + 1) + " : ");	// �� ��° �Է����� ����ֱ� ���� cnt+1 ������. cnt�� 0���� �����ϴϱ�
			String inStr = scan.next();	// �� �� ��ü�� ���ڿ��� �����ؼ� �Է¹��� 
			inStr.trim();	// ��������
			String[] str = inStr.split(",");  // "," �� �������� �и�

			for (int i = 0; i < 6; i++) {
				arr[cnt][i] = Integer.parseInt(str[i]);	// ���ڿ��� ������ ��ȯ�ؼ� �迭�� ����
			}
			cnt++;	// ���� ����
		}

		int[] win = winGenerate();	// ��÷��ȣ�� ��Ʈ�� �迭�� ����. �޼ҵ� �ؿ� ���� ����
		sortArr(win);	// ��÷ ��ȣ�� ������
		System.out.println("��÷ ���");
		System.out.print("��÷ ��ȣ : ");
		for(int i = 0; i < win.length ; i++) {	// ��÷��ȣ ��¿�
			System.out.print(win[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < gameNum ; i++) {	// �ؿ� ���. ���� ����ŭ �ݺ�
			
			System.out.print((i+1)+": " );	// ���°���� ���
			
			for(int j=0; j < arr[i].length ; j++) {	// ���� ������ ��ȣ ����� �����, 6�� ���
				System.out.print(arr[i][j] + " ");
			}
			
			//������� �����ϴ� �޼ҵ忡 �迭�� �Ѱ��ֱ� ���� �ӽ� �迭�� ���� ���� ������ �������� ����
			int[] temp = new int[arr[i].length];
			
			for(int j = 0; j < arr[i].length;j++)
				temp[j] = arr[i][j];
			//
			
			System.out.println(lottoCheck(win,temp));	
			// ��÷��ȣ�� ����ִ� �迭�� ���� ������ ���� ��ȣ�� �Ѱ��� �������ϴ� �޼ҵ�
		}


		scan.close();
	}

	static void sortArr(int[] arr) {	// �迭�� �޾Ƽ� �����ϴ� �޼ҵ�. ���� �ѰŴϱ� �ּ��ȴްԿ�
		
		for(int i = 0; i < arr.length ; i++) 
			for(int j = 0; j < arr.length -1 - i ; j++) 
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

	}
	
	static int[] winGenerate() {	// ��÷��ȣ�� �������� �������ִ� �޼ҵ�. ���� �ѰŴϱ� �ּ��ȴްԿ�

		int[] win = new int[7];
		int cnt = 0;

		while (cnt < win.length) {

			win[cnt] = (int) (Math.random() * 45) + 1;

			for (int i = 0; i < cnt; i++) {
				if (win[cnt] == win[i]) {
					cnt--;
					break;
				}
			}
			cnt++;
		}

		return win;
	}

	static String lottoCheck(int[] win, int[] str) {	// �ζ� ����� �������ִ� �޼ҵ�
														// ��÷��ȣ �迭�� ���� �Է��� ��ȣ�� ����ִ� �迭�� ����

		boolean bonus = false;	// ���ʽ� ��ȣ�� ���� �ٷ�� ���� ����ġ
		int score = 0;	// � �¾ҳ� üũ�ϴ� ����
		String rank = "";	// 1��, 2�� ���� �������� ���ڿ��� �������

		for (int i = 0; i < str.length; i++) {	// �Է� ��ȣ ����ŭ �ݺ�
			for (int j = 0; j < win.length - 1; j++) {	// ��÷��ȣ �迭���� ���������� �����ϰ� ����. ���������� ���ʽ���ȣ�� �̵��� �����Ҳ���

				if (str[i] == win[j])	// ��ġ�ϴ°� ã�Ƽ�
					score++;	// ã������ ���ھ� �÷���
			}
		}
		
		// ���ʽ���ȣ�� ���� üũ
		for (int i = 0; i < str.length; i++)	// �Է� ��ȣ ����ŭ �ݺ�
			if (str[i] == win[win.length-1])	// win[6] �� ��÷��ȣ�� ��������ϱ� �̰Ŷ��� ���ؼ�
				bonus = true;	// ��ġ�ϴ°� ������ ����ġ�� ����

		////////////////////////////

		switch (score) {	// � ��ġ�ϴ°� �ֳ� �� ��������
		case 6:	// 6�� �ٸ¾����� 1��
			rank = "1��";
			break;
		case 5:	// 5���¾Ҵµ�
			if (bonus == true)	// ���ʽ���ȣ�� �������� 2��	
				rank = "2��";	
			else	// ���ʽ���ȣ ���������� 3��
				rank = "3��";
			break;
		case 4:	// �������� �ƽð���?
			rank = "4��";
			break;
		case 3:
			rank = "5��";
			break;
		default:
			rank = "��";
		}

		return rank;	// ���ڿ� ��ȯ

	}
}
