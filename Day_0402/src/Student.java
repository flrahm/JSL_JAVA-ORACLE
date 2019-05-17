
public class Student {

	int num;	// �л� ��ȣ�� ����
	String name;	// �л� �̸��� ����
	int score;	// �л� ������ ���
	String graph = "";	// ����� �� ���ڿ��� ����
	
	Student(){}	// ����Ʈ ������ 
	Student(int num, String name, int score){	// ������. ��ȣ �̸� ������ ���� 
		this.num = num;
		this.name = name;
		this.score = score;
		makeGraph();	// ���׷��� ����� 
		
	}
	
	
	void makeGraph() {		// �� �׷����� ����� ���� �޼ҵ� 
		String temp = "";
			// ������ 5�� ����� �� ���� ������ ����
		
		for(int i = 1 ; i <= (score/5) ; i ++)	// �� ���� ������ŭ * �� ������
			temp += "*";
		
		graph = temp;	// temp �� ����ؼ� �������� ��������� �Ǽ��� ������ ȣ���ϴ��� ����� ����
	}
	
	static void printTitle() {	// Ÿ��Ʋ�� ����ϱ� ���� �޼ҵ�
		System.out.println("��ȣ\t�̸�\t����\t�׷���");
	}
	
	void printStd() {	// ���� ����� ���� �޼ҵ�

		System.out.print(num+"\t");	// ���
		System.out.print(name+"\t");
		System.out.print(score+"\t");
		System.out.println(graph+"\t");
	}
	
}
