/*
ex) ���콺�� ��� : ����(��Ŭ��) , ����(����Ŭ��), Ŀ�� �̵�, �巡�� �� 
 		���콺�� �Ӽ� : ��ư ��, ����-�����콺 , ����, ���� ����
 		��� : �޼ҵ�� ���� / �Ӽ� : ������ ����
*/
public class Mouse {

	int button;		// ��� ���� ( Ŭ������ �����ִ� ������)
	String color;
	
	void check() {	// ��� �޼ҵ� ( Ŭ������ �����ִ� �޼ҵ��)
		System.out.println(color + " ������ ���콺�� �����մϴ�");
		System.out.println("~ �� ���õǾ����ϴ�");
	}
	
	void execute() {
		System.out.println("~�� �����մϴ�");
	}
	
	void move() {
		System.out.println("~ �� �̵��մϴ�");
	}
}
