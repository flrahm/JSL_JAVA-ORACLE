class F{
	int x = 10;
	int y = 100;
	
	static int a = 1000;
	void print() {
		System.out.println("�θ� �ν��Ͻ��Դϴ�");
	}
}

class Fa extends F{
	int x = 20;
	int z = 30;

	
	static int a = 2000;
	
	@Override
	void print() {
		System.out.println("�ڽ� �ν��Ͻ��Դϴ�");
	}
}

class Fb extends F{
	int k = 40;
	void print() {
		System.out.println("�ڽ� �ν��Ͻ��Դϴ�");
	}
}

public class Inheritance_2 {

	public static void main(String[] args) {
		
		F f = new F();
		Fa fa = new Fa();
		Fb fb = new Fb();
		
		
		
		System.out.println(f.x);
		f.print();
		
			// ���� Ŭ������ �̿��Ͽ� �ڽ�Ŭ������ ���� ����
		F test = new Fa();	// ����
		//Fa test2 = new F();	 �Ұ���
		f = fa;	// �θ��ν��Ͻ��� �ڽ��ν��Ͻ� ���� ����
		//Fa = f; // �Ұ���
			

		System.out.println(f.x);
		f.print();
	}

}
