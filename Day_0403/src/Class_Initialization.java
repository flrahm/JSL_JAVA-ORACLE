class DD {
	int x;
	int y;
	{
		x = 10;		// �ʱ�ȭ �ڵ� ��
		y = 0;		
	}
	
	static int a;
	static int b;
	static {
		a = 1000;	// ���� �ʱ�ȭ �ڵ� ��
		b = 500;
	}

	public DD(int x, int y) {	// �����ڸ� �̿��� �ʱ�ȭ
		this.x = x;
		this.y = y;
	}
	
	public void test(int a) {
		
	}
	
	
}

public class Class_Initialization {

	public static void main(String[] args) {

	}

}
