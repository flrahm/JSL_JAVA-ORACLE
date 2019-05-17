package test;

public class testClass {

	
	int b = 5;
	void test() {
		System.out.println("부모 클래스 입니다");
	}
}


class childClass extends testClass{
	
	int a;
	
	@Override
	void test() {
		//super.test();
		System.out.printf("%d + %d = %d" , a , b , a+b);
		System.out.println("자식 클래스 입니다");
	}
	
}
