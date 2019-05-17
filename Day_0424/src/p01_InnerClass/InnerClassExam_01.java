// (내부) 중첩
// 메신저 등에서 사용

package p01_InnerClass;

public class InnerClassExam_01 {

	public static void main(String[] args) {
		
		Outer out = new Outer(15);
		
		Outer.Inner inner = out.new Inner(); // 외부객체를 생성해 그 객체로 내부객체를 생성
		inner.disp_in();
	
		System.out.println("-----------------");
		Outer.Inner inner2 = new Outer().new Inner();	// 외부객체를 생성하지 않고 내부객체만 생성
		inner2.disp_in();
		

	}

}



class Outer{
	private int x = 20;
	private int y = 10000;
	
	public Outer() {	
	}
public Outer(int y) {
		this.y = y;
	}
	
	public void disp() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	
	class Inner{	// 중첩 클래스. static 선언 불가
		private int x = 100;
		private int z = 100;
		public void disp_in() {
	
			System.out.println("X = " + x);
			System.out.println("y = " + y);
			System.out.println("z = " + z);
		}
	}
}