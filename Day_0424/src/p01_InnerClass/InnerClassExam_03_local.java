// 지역중첩 : 메소드 내부에서 클래스를 생성한 후 사용. 해당 메소드 외에선 사용 불가능

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