
public class ArrayBasic_method {

	public static void main(String[] args) {
		int[] var = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		sumNave(var);
		
		
		System.out.println("var[0] = " + var[0]); 	// �޼ҵ忡 ���� �迭�� ȣ��� �迭�� �������� �Ѱ��ֱ� ������
													// �޼ҵ忡�� �迭���� �����ϸ� ���ο����� ���� �ٲ�
	}

	static void sumNave(int[] arr) {

		int sum = 0;
		double ave = 0;

		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		ave = 1.0 * sum / arr.length;

		arr[0] = 100;

		System.out.println("���� : " + sum);
		System.out.println("��� : " + ave);
	}
}
