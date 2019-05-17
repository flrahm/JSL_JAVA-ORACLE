
public class Operator {

	char oper;
	int a;
	int b;

	public void operation(int oper) {

		switch (oper) {
		case '+':
			sum();
			break;

		case '-':
			sub();
			break;
		}
	}

	private void sum() {
		System.out.println("a + b = " + (a + b));
	}

	private void sub() {
		System.out.println("a - b = " + (a - b));
	}
}
