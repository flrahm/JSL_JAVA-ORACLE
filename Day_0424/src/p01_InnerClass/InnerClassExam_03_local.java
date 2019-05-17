// ������ø : �޼ҵ� ���ο��� Ŭ������ ������ �� ���. �ش� �޼ҵ� �ܿ��� ��� �Ұ���

package p01_InnerClass;

public class InnerClassExam_03_local {

	public static void main(String[] args) {

		Outer3 out = new Outer3();
		out.disp();
	
	}

}

class Outer3 {
	private int x = 20;
	private static int y = 50;

	public Outer3() {}

	public void disp() {
		
		class Inner{	
			private int a = 100;
			private int b = 200;
			public void disp_in() {
				System.out.println("a = " + a);
				System.out.println("b = " + b);
			}
		}
		
		Inner inner = new Inner();
		inner.disp_in();
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}


}