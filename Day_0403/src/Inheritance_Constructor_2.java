class H_parent {

	int x;

	public H_parent(int x) { // �θ�Ŭ������ ����Ʈ �����ڰ� ������ �ڽ�Ŭ���� �ν��Ͻ� ������ ��������
		this.x = x; // �ƴϸ� �ڽ�Ŭ�������� super(10); �̷������� ȣ������
	}
}

class H_child extends H_parent { // �ڽİ�ü�� �����ϸ� �θ�ü�� �ڵ����� �����ǰ� �����ڿ��� ȣ���

	int y;
	int c = 100;
	
	public H_child(int y) {
		super(12);	// �θ�Ŭ������ ����Ʈ �����ڸ� ȣ������ �������� �̷������� �� �� �� ����
		System.out.println("H_child ������ ȣ��");
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
