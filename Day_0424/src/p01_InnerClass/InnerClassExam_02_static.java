// 정적 충첩

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

	static class Inner { // 정적 중첩. 외부 클래스의 정적 요소만 사용 가능

		private int z = 100;
		private static int a = 99;

		public void disp_in() {


			System.out.println("y = " + y);
			System.out.println("z = " + z);
			System.out.println("a = " + a);
		}
	}
}