// ���� ��ø

package p01_InnerClass;

public class InnerClassExam_02_static {

	public static void main(String[] args) {

		Outer2.Inner inner = new Outer2.Inner();
		inner.disp_in();
		
		

	}

}

class Outer2 {
	private int x = 20;
	private static int y = 50;

	public Outer2() {
	}


	public void disp() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

	static class Inner { // ���� ��ø. �ܺ� Ŭ������ ���� ��Ҹ� ��� ����

		private int z = 100;
		private static int a = 99;

		public void disp_in() {


			System.out.println("y = " + y);
			System.out.println("z = " + z);
			System.out.println("a = " + a);
		}
	}
}