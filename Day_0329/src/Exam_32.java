import java.util.Scanner;

/*
 * data[] �迭���� ������ ������
 * ã���� �ϴ� �����͸� Ű���忡 �Է��Ͽ�
 * �����Ͱ� �����ϸ� �� ��°�� �ִ����� ����ϴ� �޼ҵ带 �ۼ�
 * ��ã���� ��� �ݺ�
 */

public class Exam_32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("ã���� �ϴ� ���� �Է��ϼ��� : ");
			int num = scan.nextInt();	// ���� �Է¹���
			int ans = searchNum(num);	// �޼ҵ� ����. ã�� �������� -1�� ����, ã������ �ε������� ����

			if (ans == -1) {	// ��ã������ ��� ����
				System.out.println("ã���� �ϴ� ���� �����ϴ�");
			} else {	// ã������ �̸� ����ϰ� ��������
				System.out.printf("ã���� �ϴ� ���� %d �� °�� �ֽ��ϴ�", ans + 1);
				break;
			}

		}
		
		scan.close();

	}

	static int searchNum(int num) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int findIndex = -1;	// ã���� �ϴ� ���� ���°�� �ִ��� �����ϱ� ���� ����
							// ��ã���� -1�� ��ȯ�� �� �ֵ��� �ʱⰪ�� ����

		for (int i = 0; i < data.length; i++) {

			if (data[i] == num)	{	// ���� �Է°��� ��ġ�ϴ� ���� ������
				findIndex = i;		// �� �迭���� �ε����� ����
				break;
			}
		}

		return findIndex;		// ã������ �迭�� �ε�����, ��ã���� -1�� ��������
	}
}
