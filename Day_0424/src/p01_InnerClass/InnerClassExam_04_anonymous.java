// �͸���ø : �޼ҵ带 �������̵� �ϰ���� ��. �������̽��� �͸�����ü�� ��������.

package p01_InnerClass;

public class InnerClassExam_04_anonymous {

	public static void main(String[] args) {

		Outer4 out = new Outer4();
		out.aaa();
		out.bbb();
		
		
		Outer4 anonymous = new Outer4() {	// �������̽��� �͸�����ü�� ���. ���ο� �޼ҵ� �߰��� �Ұ�����
			@Override
			public void aaa() {
				// TODO Auto-generated method stub
				System.out.println("�������̵�aaaaaaaaaa");
			}@Override
			public void bbb() {
				// TODO Auto-generated method stub
				System.out.println("�������̵�bbbbbbbbbb");
				ccc();
			}
			
			public void ccc() {
				System.out.println("�ۿ��� �ܵ�ȣ���� �Ұ��� ccccccc");
			}
		};
		
		anonymous.aaa();
		anonymous.bbb();
		//anonymous.ccc();	 //���ο� �޼ҵ�� �Ұ��� 
	}

}

class Outer4 {
	
	public void aaa() {
		System.out.println("aaaaaaa");
	}
	public void bbb() {
		System.out.println("bbbbbbb");
	}


}