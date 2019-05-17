// (����) ��ø
// �޽��� ��� ���

package p01_InnerClass;

public class InnerClassExam_01 {

	public static void main(String[] args) {
		
		Outer out = new Outer(15);
		
		Outer.Inner inner = out.new Inner(); // �ܺΰ�ü�� ������ �� ��ü�� ���ΰ�ü�� ����
		inner.disp_in();
	
		System.out.println("-----------------");
		Outer.Inner inner2 = new Outer().new Inner();	// �ܺΰ�ü�� �������� �ʰ� ���ΰ�ü�� ����
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
	
	class Inner{	// ��ø Ŭ����. static ���� �Ұ�
		private int x = 100;
		private int z = 100;
		public void disp_in() {
	
			System.out.println("X = " + x);
			System.out.println("y = " + y);
			System.out.println("z = " + z);
		}
	}
}