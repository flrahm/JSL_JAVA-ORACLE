/* 
  		��ü���� 3�ܰ�
 1. ��ü �𵨸� : �߻�ȭ�ܰ�(��ɰ� �Ӽ����� �и�)
 	ex) ���콺�� ��� : ����(��Ŭ��) , ����(����Ŭ��), Ŀ�� �̵�, �巡�� �� 
 		���콺�� �Ӽ� : ��ư ��, ����-�����콺 , ����, ���� ����
 		��� : �޼ҵ�� ���� / �Ӽ� : ������ ����
 2. Ŭ���� ���� : Mouse.java
 3. ��ü ���� �� ��� : 
*/

public class OOP_introduction {

	public static void main(String[] args) {
		
		Mouse m;	// Mouse Ŭ������ ���� �������� m ����
		m = new Mouse();	// ��ü ����. ��ü�� ����Ǵ� �޸� ���� : heap 
		
		Mouse m2 = new Mouse();
		
		System.out.println(m);
		System.out.println(m2);
		
		m2.color = "blue";
		m2.button = 2;
		
		m.color = "red";
		m.button = 3;
		
		m.check();
		m2.check();
		System.out.println(m.button);
		System.out.println(m2.button);
		
		m2 = m;
		m.check();
		m2.check();
		System.out.println(m.button);
		System.out.println(m2.button);

		
	}

}
