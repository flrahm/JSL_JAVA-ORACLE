package P03;

import java.util.Scanner;

public class AlphabetCounter2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	// ��ĳ�ʰ�ü ����
		int[] apbCnt = new int[26];	// ���ĺ� ������ ī��Ʈ
		// String str = "ABCdefgabcsdf";
		System.out.println(" 0000 �� ġ�� �����մϴ�");
		while (true) {
			String str = scan.next();	// ���ڿ��� �Է¹���
			str = str.toUpperCase();	// ��� �빮�ڷ�
			if (str.equalsIgnoreCase("0000"))	// ���� �Է°��� 0000 �̸�
				break;	// ����

			for (int i = 0; i < str.length(); i++) {	// ���ڿ� ������ŭ �ݺ��ؼ�
				if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')	// ���ĺ��ϰ�쿡��
					apbCnt[str.charAt(i) - 65]++;	// �ش� ���ĺ� ������ ī�����ϴ� �迭�� ���� 1�� ������Ŵ
			}

		}	// �ݺ��� ���������� ���� �����

		for (int i = 0; i < apbCnt.length; i++)	// ���ĺ� �迭�� ������ŭ 
			if (apbCnt[i] != 0)	// ���� 0�� �ƴѰ�쿡
				System.out.print((char) (i + 65) + "\t");	// �ش� ���ĺ��� �����Ƿ� �� ���ĺ��� ����ϰ� ������

		System.out.println();

		for (int i = 0; i < apbCnt.length; i++)	// ���ĺ� �迭�� ������ŭ
			if (apbCnt[i] != 0)	// ���� 0�� �ƴѰ�쿡
				System.out.print(apbCnt[i] + "\t");	// �� ������ ������ְ� ������. 

		scan.close();
	}

}
