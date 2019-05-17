// 상속. 원칙상으로 다중상속 안됨. 상속에 상속을 하여 편법으로 가능

class EE {
	int x = 10;
	int y = 20;

	public void printEE() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println();
	}

}

class EEa extends EE { // extends : 상속 키워드
	// int x = 10;
	// int y = 20; 상속 받는 순간 이것들이 같이 존재함
	int z = 30;

	public void printEEa() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println();
	}
}

class EEEa extends EEa {
	int a = 40;

	public void printEEEa() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("a = " + a);
		System.out.println();
	}
}

public class Inheritance {

	public static void main(String[] args) {

		EE ee = new EE();
		EEa eea = new EEa();
		EEEa eeea = new EEEa();

		ee.printEE();
		System.out.println("---------------------");

		ee.printEE();
		eea.printEEa();
		System.out.println("---------------------");

		ee.printEE();
		eea.printEEa();
		eeea.printEEEa();

	}

}
