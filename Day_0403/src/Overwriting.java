// ���. ��Ģ������ ���߻�� �ȵ�. ��ӿ� ����� �Ͽ� ������� ����

class GG {
	int x = 10;
	int y = 20;

	public void print() {
		
		System.out.println("�θ� Ŭ������ print() �޼ҵ� �Դϴ�");
		System.out.println();
	}

}

class GGa extends GG { // extends : ��� Ű����
	// int x = 10;
	// int y = 20; ��� �޴� ���� �̰͵��� ���� ������
	int x = 30;

	public void print() {	// �������̵�(������).  �����ε��� �������� �ʵ���
		
		super.print(); // ���� Ŭ������ ����Ʈ��� �޼ҵ带 ȣ��	// this. ���� ���
		
		System.out.println("�ڽ� Ŭ������ print() �޼ҵ� �Դϴ�");
		System.out.println(x +"   " +  super.x);
		System.out.println();
	}
}



public class Overwriting {

	public static void main(String[] args) {

		GG GG = new GG();
		GGa GGa = new GGa();


		GG.print();
		System.out.println("---------------------");
		GGa.print();
		System.out.println("---------------------");



	}

}
