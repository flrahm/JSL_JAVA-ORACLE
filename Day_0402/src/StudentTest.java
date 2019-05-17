import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);	// ��ĳ�� ��ü ����
		
		Student[] std = new Student[10];	// Student �ν���Ʈ �迭 10 �� ����
		
		int cnt = 0;	// �Է� ������ ī����
		while(cnt < 10) {	// �ִ� 10���̹Ƿ� 10�� ���� ����

			System.out.println("��ȣ �̸� ������ �Է��ϼ���. 0���̸� ����, �ִ� 10��");
			int num = scan.nextInt();	// ��ȣ�� Ű����� �Է¹���
			if(num == 0)	// ���� ��ȣ�� 0�̸� ����
				break;
			String name = scan.next();	// �̸��� �Է�
			int score = scan.nextInt();	// ������ �Է�
			
			std[cnt] = new Student(num,name,score);	// 3��Ҹ� ��� �Է¹޾����� �ν���Ʈ �迭��ü�� ����
			cnt ++;	// �Է� ������ ����������
		}
		
		Student.printTitle();	// Ÿ��Ʋ ���. static ���� ��������
	
		for(int i = 0; i < cnt; i++) {	// �ν��Ͻ� �迭�� ó������(0) ~ �Է¹��� ������ŭ ���
			std[i].printStd();	// �����
		}
		
		scan.close();
	}
	
	
}
