//self test : 

import java.util.Scanner;

public class Exam_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է�\n" + "��ȣ : ");
		int num = scan.nextInt();
		
		System.out.println("�̸� : ");
		String name = scan.next();
		
		System.out.print("�������� : ");
		int kor = scan.nextInt();
		System.out.print("�������� : ");
		int mat = scan.nextInt();
		System.out.print("�������� : ");
		int eng = scan.nextInt();
		
		int sum = kor + mat + eng;
		//double ave = sum/3.0;
		double ave2 = ((int)(sum/3.0*100+0.5))/100.0;	// �Ҽ� ��°�ڸ����� �ݿø�
		
		System.out.println("\t\t **���� �϶�ǥ**");
		System.out.print("��ȣ\t");
		System.out.print("�׸�\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.print("����\t");
		System.out.println("���");
		
		System.out.print(num+"\t");
		System.out.print(name+"\t");
		System.out.print(kor+"\t");
		System.out.print(mat+"\t");
		System.out.print(eng+"\t");
		System.out.print(sum+"\t");
		System.out.println(ave2);
		
		scan.close();

	}

}
