package test;

public class testClass {

	
	int b = 5;
	void test() {
		System.out.println("�θ� Ŭ���� �Դϴ�");
	}
}


class childClass extends testClass{
	
	int a;
	
	@Override
	void test() {
		//super.test();
		System.out.printf("%d + %d = %d" , a , b , a+b);
		System.out.println("�ڽ� Ŭ���� �Դϴ�");
	}
	
}
