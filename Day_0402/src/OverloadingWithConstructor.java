class AA{
	int x;
	int y;
	
	AA(){	// �����ε�
		this(100);	// �ڱ� �ڽ��� �����ڸ� ȣ��.1
		System.out.println("1111");
		
	}	
	AA(int x){
		this(x,30);	// �׷� ����� ��.2
		this.x = x;	// �� ������ �ٲ�� �ȵ�.
		System.out.println("2222");
	}
	AA(int x, int y){
		this.x = x;	// �̰� �ٽ� ����� ��.3
		this.y = y;
		System.out.println("3333");
	}
	
	
	
	void add(int a) {
		System.out.println(a);
	}
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void add(int ... x) { // ���� ����. x �� �ڵ������� �迭�� ��
		int sum = 0;
		
		for(int i = 0; i < x.length ; i++)
			sum += x[i];
		
		System.out.println(sum);
	}
}


public class OverloadingWithConstructor {

	public static void main(String[] args) {
		
		AA a = new AA();
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println();
		
		a.add(1);
		a.add(1,2);
		a.add(1,2,3);
		a.add(1,2,3,4,5,6,7,8,9,10);
	}

}
