abstract class AbsClass{	// Ŭ���� ���� �ϳ��� �߻�޼ҵ尡 ������ �߻�Ŭ������ �Ǿ�� �� 
							// ��ü�� ������ �� ����
							// ���� ����� ������ �޾ƾ� ��
	
	public void add(int a , int b) {
		System.out.println("a + b = "+ (a+b));
	}
	
	public abstract void mul(int a, int b);	// �߻�޼ҵ� . ��ü�� ����
}

class Achild extends AbsClass {	// �߻�޼ҵ带 ��ӹ����� �߻�޼ҵ带 ������ �����ؾ���.  
	// ������Ʈ ������ �߻�Ŭ������ �����ؼ� ���������� �����ִ� ��
	
	@Override		// ctrl + space ������ �ڵ����� ������ �� �͵��� ����. @Override �̰� ��� ��
	public void mul(int a, int b) {
		
	}
	

}

public class AbstractClass {

	public static void main(String[] args) {
		
		//AbsClass a = new AbsClass();     // �Ұ���

	}

}
