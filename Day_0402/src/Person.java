public class Person {

	int num;	//��ȣ�� ����
	String name;	// �̸��� ����
	String regDate;	// �Ի����� ����
	int salary;	// ������ ����
	
	
	int rank;	// ���� ������ ����. �̰� �����ڷ� �Է¹޴°� �ƴ϶� �޼ҵ带 ������ ����
	
	public Person() {}
	public Person(int num, String name, String regDate, int salary) {	//������
		this.num = num;	
		this.name = name;
		this.regDate = regDate;
		this.salary = salary;
	}
	
	public static void printTitle() {
		System.out.println("��ȣ\t�̸�\t�Ի���\t\t�⺻��\t��������");		// Ÿ��Ʋ�� ��� �޼ҵ� 
	}
	
	public void printPerson() {	// Ŭ���� ��ҵ��� �Ϸķ� ����ϴ� �޼ҵ�
		
		System.out.print(num + "\t");
		System.out.print(name + "\t");
		System.out.print(regDate + "\t");
		System.out.print(salary + "\t");
		System.out.print(rank + "\t");
		System.out.println();
	}
}
