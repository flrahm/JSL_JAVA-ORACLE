// ���. ��Ģ������ ���߻�� �ȵ�. ��ӿ� ����� �Ͽ� ������� ����

class EE {
	int x = 10;
	int y = 20;

	public void printEE() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println();
	}

}

class EEa extends EE { // extends : ��� Ű����
	// int x = 10;
	// int y = 20; ��� �޴� ���� �̰͵��� ���� ������
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
