import java.util.Scanner;

/*
 * 	�Է� ����
 * ��ȣ :	(1~10)
 * �̸� :
 * �Ի��� :	(2019/01/01)
 * �⺻�� :	(100 ~ 300)
 *
 * 	��� ����
 * ��ȣ	 �̸�	 �Ի����� 	�⺻��	��������
 * 
 * 
*/

public class PersonTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	// ��ĳ�� ��ü ����
		Person[] psArr = new Person[10];	// person �ν��Ͻ� 10�� ����
		int cnt = 0;	// person �ν��Ͻ� ������ ���� ���� ����
		while(cnt < 10) {	// 10���� �Ǹ� ����
			System.out.println("���� �Է��ϼ���");
			System.out.println("��ȣ �̸� �Ի��� �⺻��");
			int num = scan.nextInt();	// ��ȣ�� ����
			
			if(num == 0)	// ���� ��ȣ�� 0�̸� ����
				break;
			
			String name = scan.next();	// �̸��� ����
			String regDate = scan.next();	// �Ի����� ����
			int salary = scan.nextInt();	// ������ ����
			
			psArr[cnt] = new Person(num,name,regDate,salary);	// ��ȣ �̸� �Ի��� ������ ����
			cnt++;	// ������ ����
		}

		ranking(psArr,cnt);	// ���� ��ŷ �ű��
		sortByNum(psArr,cnt);	// ��ȣ�� ����
		printClass(psArr,cnt);	// ���
		
		sortByRank(psArr,cnt);	// ���޼� ����
		printClass(psArr,cnt);	// ���
		
		scan.close();
	}
	
	static void sortByRank(Person[] psArr , int cnt) {	// ������ �������� ����
		for(int i = 0; i < cnt ; i++) {
			for(int j = 0; j < cnt - 1 - i ; j++) {
				if(psArr[j].rank > psArr[j+1].rank) {	// ��������� ���� �˰���
					
					Person temp = psArr[j];		// ���� ������ swap �ϴ� �ڵ�
					psArr[j] = psArr[j+1];
					psArr[j+1] = temp;
				}
			}
		}
		
	}

	static void sortByNum(Person[] psArr , int cnt) {	// ��ȣ�� ���� �����ϴ� �޼ҵ�
		
		for(int i = 0; i < cnt ; i++) {
			for(int j = 0; j < cnt - 1 - i ; j++) {
				if(psArr[j].num > psArr[j+1].num) {	// ��������� ���� �˰���
					
					Person temp = psArr[j];	 //  ���� ������ swap �ϴ� �ڵ�
					psArr[j] = psArr[j+1];
					psArr[j+1] = temp;
				}
			}
		}
		
	}
	
	static void ranking(Person[] psArr, int cnt) {	// ���޼����� ��ŷ�� �ű�� �޼ҵ�
		
		for(int i = 0; i < cnt ; i++) {
			int add = 1;
			for(int j = 0; j < cnt ; j++) {
				if (psArr[i].salary < psArr[j].salary) {
					add++;
				}
			}
			
			psArr[i].rank = add;
		}
		
	}
	
	static void printClass(Person[] psArr,int cnt) {	// ����ϴ� �޼ҵ�
		
		Person.printTitle();
		
		for(int i = 0; i < cnt ; i++) {
			psArr[i].printPerson();
		}
		System.out.println();
	}
	
	
}
