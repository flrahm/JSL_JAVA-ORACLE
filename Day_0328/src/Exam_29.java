import java.util.Scanner;

public class Exam_29 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int num = scan.nextInt();
		int cnt = 0;					// �Ҽ� ������ ���� ���� ����
	
		for (int i = 2; i <= num; i++) {	// 2���� �Է°����� for���� ������

			if (isPrime(i) == true) {		// isPrime �� �Ҽ��� true, �Ҽ��� �ƴϸ� false �� ��ȯ��
				System.out.print(i + "\t");	// �Ҽ��� ��� �Ҽ��� ����ϰ� ī��Ʈ�� 1 ������Ŵ
				cnt++;
				
				if(cnt % 5 == 0)			// 5�������� �ٹٲ�
					System.out.println();
			}
		}

		System.out.println();
		System.out.printf("2 ���� %d ���� �Ҽ��� �� ������ %d �Դϴ�", num, cnt);
		scan.close();
	}

	static boolean isPrime(int num) {

		boolean b = true;		// ����Ʈ���� Ʈ��� ����

		if (num == 1)			// 1�ΰ��� �Ҽ��� �ƴ�
			b = false;
		else if (num == 2)		// 2�ΰ��� �Ҽ���
			b = true;
		else {
			for (int i = 2; i <= num - 1; i++) {		// �ڱ� �ڽ� ������ ������ �������°� ������ �Ҽ��� �ƴѰ�

				if (num % i == 0)
					b = false;		// �ڱ� �ڽ��� ������ ���� �������� �Ҽ��� �ƴ�
			}
		}

		return b;			// true false ���� �ϳ��� ��ȯ 
	}
}
