package Ex04_StringExam;

import java.util.Scanner;

/*
 * �Է�����
 * �ڷ��Է� 1:ȫ�浿,900206-1,010-2242-3810
 * �ڷ��Է� 2:���ڹ�,070102-2,010-4232-2938
 * �ڷ��Է� 3:�ھ���,890232-1,010-3423-5123
 * �ڷ��Է� 4:end
 * 
 * �������
 * �̸�	��ȭ	4t			����	����
 * ȫ�浿	010-2242-3810	����	30
 * ���ڹ�	010-4232-2938	��	12
 * 
 * ó������
 * 1���ξ� Ű�����, "," �� ����. 
 * end �Է½� �����
 * �Է��ο� �ִ� 10�� 
 */
public class MemberExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// ��ĳ�� ��ü ����
		Member[] mem = new Member[10];	// �ɹ� �ν��Ͻ� �迭 10�� ����
		
		int cnt = 0;	// �Է� ������ ī��Ʈ�� ����
		
		while(cnt < 10) {	// �Է°����� 10���� ����
			
			System.out.print("�ڷ� �Է� " + (cnt+1) + " : ");
			String str = scan.nextLine();	// ���� �Է¹���
			
		
			if(str.equalsIgnoreCase("end"))	// ���� ��ҹ��ڿ� ������� end�� �Է¹����� ��������
				break;
			
			mem[cnt] = new Member();	// ��� �ν��Ͻ��� �����ϰ�
			mem[cnt].inputData(str);	// �Է¹��� ���ڿ��� �Ѱ���
			cnt++;	// �Է°��� ����
		}
		
		Member.printTitle();	// Ÿ��Ʋ ���
		for(int i = 0; i < cnt ; i++) {	// �Է¹��� ������ŭ 
			mem[i].printMember();	// �������
		}
		
		scan.close();
		
		
	}

}


