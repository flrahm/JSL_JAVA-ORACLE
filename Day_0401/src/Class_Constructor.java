class C{
	
	String na;
	int n;
	int m;
	
	// ������. ��ü�� ó�� ��������� ȣ��Ǵ� �޼ҵ�
	// Ŭ���� �̸��� �Ȱ��� �̸��� ����.
	C(){}	// ����Ʈ �����ڸ� ������ְ� �ۼ��ϴ°��� ����
	C(String na){	// ������ �����ε�. ������ �̸��� �Ű������� �ٸ� �޼ҵ� ������ �ۼ�
		this.na = na;
	}
	C(String na , int n, int m ){	// ������
		this.na = na;		// this. : �ڱ� �ڽ��� �ǹ�. �������
		this.n = n;
		this.m = m;
	}
	
	public void  sum() {
		System.out.println(" ��� : " + na);
		for(int i =n; i <= m ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
	}
	
}

public class Class_Constructor {

	public static void main(String[] args) {
		
		C c1 = new C("1~10 �� �� ",1,10);
		//			��������.   C()  <- ����Ʈ ������
		
		C c2 = new C("dddddd");
		c1.sum();
		c2.sum();
	}

}
