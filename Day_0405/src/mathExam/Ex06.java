package mathExam;

public class Ex06 {

	public static void main(String[] args) {
		
		int rollNum = 10; // �ֻ����� ��� ������
		int[] cnt = new int[6];	// �� ��ȣ�� ���� Ƚ���� �����ϴ� ����. ���ϰ� �迭�� �������
		
		for(int i = 0; i <rollNum ; i++) {	// 0���� 10���� ����
			
			int a = (int)(Math.random()*6)+1;	// 1~6������ ������ �߻���Ŵ
			System.out.println(a);	// a�� ����غ�. �׽�Ʈ���� �����
			
			cnt[a-1]++;
			
			//adding(cnt,a);	// �ֻ����� ������ �׿� �´� ������ ������Ű�� �޼ҵ�
		}
		
		for(int i =0 ; i <cnt.length ; i++) {	// ���
			System.out.println((i+1)  + " �� ���� Ƚ�� : " + cnt[i]);
		}
	}
	
	/*
	static void adding(int[] cnt , int a) {	// ������ �����ϴ� �迭��  �ֻ������� �޾Ƽ�
		
		switch (a){	// �ֻ������� ����� ����
			case 1 :
				cnt[0]++;	// �ֻ������� 1�̸� 1�� ������Դ��� �����ϴ� ������ 1����
				break;
			case 2 :
				cnt[1]++;	// �ֻ������� 2�� 2�� ������Դ��� �����ϴ� ������ 1����
				break;
			case 3 : 
				cnt[2]++;	// ��������
				break;
			case 4 :
				cnt[3]++;
				break;
			case 5 :
				cnt[4]++;
				break;
			case 6 :
				cnt[5]++;
				break;
		}
		
	}
	*/

}
