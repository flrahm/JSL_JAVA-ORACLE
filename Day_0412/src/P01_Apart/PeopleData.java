//peopleData

package P01_Apart;

import java.util.ArrayList;
import java.util.List;

public class PeopleData {

	int dongNum = 10;	// �� ����
	int ageNum = 7;	// �ο����� ����
	List<People> pList = new ArrayList<People>();	// ���ο��� �Ѿ���� �迭�� �޾��ֱ� ���� ����
	int[][] arr = new int[dongNum][ageNum];  // �ο� ��Ȳ�� ������ ������ �迭
	int[] ageSum = new int[ageNum];	// �ο��� �հ踦 ����ϱ� ���� ������ �迭
	
	
	public PeopleData(List<People> pList) {	// ������ �����ؼ� ��̸���Ʈ�� �޾���
		this.pList = pList;
	}
	
	public void body() {	// ������ �޼ҵ带 ���������� �����ϰ� �� �޼ҵ常 ���ο��� �ҷ��ٲ�
		printTitle();	// ������¿�
		calPeople();	// �ο���Ȳ ���
		printBody();	// ����Ѱ� ���
	}
	
	static void printTitle() {	// �������
		System.out.println("\t\t����Ʈ �ο� ��Ȳǥ");
		System.out.println("��*����\t0~9\t10~19\t20~20\t30~39\t40~49\t50~59\t60�̻�\t�հ�");
	}
	
	
	void calPeople() {	// �ο��� ���
			
		int dong = 0;	// �߰� ����
		int age = 0;	// �߰� ���� 2
		
		for(int i = 0; i < pList.size() ; i++) {	// ����Ʈ�� ������ŭ �ݺ� 
			dong = pList.get(i).getDong()-1;	// �� ���. �ε����� 0���� �����ϴϱ� 0����
			age = pList.get(i).getAge()/10;	// ���ɰ��. 10���� ������
			if(age>6)	// 60 �̻��ϰ�쿡��
				age = 6;	// 6���� ����
			
			ageSum[age]++;	// �ο��� ���� �����ϴ� �迭���� �ش� �ε����� �� 1 ����
			arr[dong][age]++;	// ������ ���� ���ɿ� �´� �迭��Ҹ� 1 ������Ŵ
		}
	}
	
	void printBody() {	// �������� ������ ��¿� �޼ҵ� 
		
		int dongSum = 0;	// ���� �ο� �հ踦 ����� ����
		
		for(int i = 0; i < dongNum ; i++) {	// �� ������ŭ �ݺ�
			System.out.print((i+1) + "��\t");	// �ε����� 1���̰� ���ϱ� 1 �������� 
			
			for(int j = 0; j < ageNum ; j++) {	// ���ɹ��� ������ŭ �ݺ�
				System.out.print(arr[i][j] + "\t");	//	�ش� ��� ���
				dongSum+=arr[i][j];	// ���� �ο��� ���� ���
			}
			
			System.out.print(dongSum);	// ���� �ο��� ���� ���
			dongSum = 0;	// ���� �ο��� ���� 0���� �ʱ�ȭ
			System.out.println();	// ���� ���
		}
		///////////
		System.out.print("�հ�\t");	// ���ɺ� �ο��� ���� ���
		for(int i = 0; i < ageNum ; i++) {	// �ο����� ������ŭ ���
			System.out.print(ageSum[i]+"\t");	// ����� ���� �������
		}
		System.out.println(pList.size());	// �� �ο��� ���
	}
	
}
