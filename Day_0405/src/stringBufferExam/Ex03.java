package stringBufferExam;

public class Ex03 {

	public static void main(String[] args) {

		StringBuffer bf1 = new StringBuffer(); // ��ü�� �����ؼ� ���
		// 16�ڰ� ����� �� �ִ� ���۰� �޸𸮻� ������
		System.out.println("������ũ�� : " + bf1.capacity()); // capacity : ���� ũ�� ���
		System.out.println("���ڿ��� ���� : " + bf1.length());
		System.out.println();

		StringBuffer bf2 = new StringBuffer("ABC");
		// ABC �� �����ϴ� ���� 3 + �⺻ 16 = 19�� ũ���� ���۰� ������
		System.out.println("������ũ�� : " + bf2.capacity());
		System.out.println("���ڿ��� ���� : " + bf2.length());
		System.out.println();
		
		
		bf2.append("abcasasasasasasasasasaasdasdasdasdasdasdasdasdasdasdasdde");
		System.out.println("������ũ�� : " + bf2.capacity());
		System.out.println("���ڿ��� ���� : " + bf2.length());

	}

}
