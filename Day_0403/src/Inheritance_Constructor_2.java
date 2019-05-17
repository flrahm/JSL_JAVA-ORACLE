class H_parent {

	int x;

	public H_parent(int x) { // 부모클래스에 디폴트 생성자가 없으면 자식클래스 인스턴스 생성시 오류가남
		this.x = x; // 아니면 자식클래스에서 super(10); 이런식으로 호출해줌
	}
}

class H_child extends H_parent { // 자식객체를 생성하면 부모객체도 자동으로 생성되고 생성자역시 호출됨

	int y;
	int c = 100;
	
	public H_child(int y) {
		super(12);	// 부모클래스에 디폴트 생성자를 호출하지 않으려면 이런식으로 할 수 도 있음
		System.out.println("H_child 생성자 호출");
		this.y = y;
	}

	public void print() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}

public class Inheritance_Constructor_2 {

	public static void main(String[] args) {

		// H_parent gp1 = new H_parent();

		// H_parent parent = new H_child();
		H_child hc = new H_child(12);

		hc.print();

	}

}
