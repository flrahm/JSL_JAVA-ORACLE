package student;

// �� ��ȣ �̸�   ����   ����
import java.io.File;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(
				new File("E:\\\\���̺귯��\\\\����\\\\eclipse-workspace\\\\text\\\\Day_0410\\\\studentData.txt")); // ���Ϸκ���
																											// �����͸� �о��

		// ������ �Է��Ͽ� �迭�� �и�

		String[] jDap = scn.nextLine().split(","); // Split�� ��������
		/*
		 * or String str = scn.nextLine(); // "1,2,3,4,3,2" String[] jDap =
		 * str.split(",");
		 */
		while (scn.hasNext()) {
			String[] hDap = scn.nextLine().split(","); // ��, �̸�, ������ ����
			String ban = hDap[0]; // ��
			String bun = hDap[0]; // ��ȣ
			String name = hDap[0]; // ����
			int tot = 0; // ��������
			// �� , ��ȣ , �̸� ���
			System.out.print(ban + "\t" + bun + "\t" + name + "\t");
			// ä��

			for (int i = 0; i < jDap.length; i++) {
				if (jDap[i].equals(hDap[i + 3])) {
					System.out.print("O	");
					tot += 5;
				} else {
					System.out.print("X	");

				}
				
			}
			System.out.println();
			System.out.println(tot + "\n");
		}
		scn.close();

	}
}
// 1�ܰ�