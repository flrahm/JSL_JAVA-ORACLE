package student;

public class Student {

	private int bun; // ��ȣ�� ����
	private String name; // �̸��� ����
	private int[] jumsu = new int[5]; // ���� 5���� ����
	private int tot; // ������ ����
	private double ave; // ����� ����
	private int rank; // ��� Ȥ�� ������ ���� ������ ����

	public Student() { // ������. ���� �Ƚ���ϴ�
	}

	public void getData(String inStr) { // ���� ���� ��ü�� ��Ʈ������ ����
		inStr.trim(); // ���� ����
		String[] str = inStr.split(","); // "," �� �и���

		bun = Integer.parseInt(str[0]); // ù��° ���ڿ� ������ ��Ƽ�� ������ �ٲپ� ��ȣ�� ����
		name = str[1]; // �ι�° ������ �̸��� ����
		for (int i = 0; i < jumsu.length; i++) { // ���� 5���� ����
			jumsu[i] = Integer.parseInt(str[i + 2]); // �����迭�� 3��° �������� 7��° �������� ����
		}

		makeAve(); // ��հ� ������ ���ϴ� �޼ҵ带 �����Ŵ

	}

	private void makeAve() {
		tot = 0; // ����� ������ ����
		for (int i = 0; i < jumsu.length; i++) { // ������ ����� �迭�� ������ ������ �� ������
			tot += jumsu[i];
		}

		ave = 1.0 * tot / 5; // ����� ������
	}

	public static void printTitle() {
		System.out.println("��ȣ\t�̸�\t����\t���\t����"); // ����ƽ����, Ÿ��Ʋ�� �����
	}

	public void printStd() { // Ŭ���� ��ҵ��� ����ϴ� �޼ҵ�
		System.out.print(bun + "\t");
		System.out.print(name + "\t");
		System.out.print(tot + "\t");
		System.out.print(ave + "\t");
		System.out.print(rank + "\t");
		System.out.println();
	}

	public int getBun() { // �����̺� ������ ��ȣ�� �������� �޼ҵ�. �����ʿ��� ��ȣ �����Ҷ� ������
		return bun;
	}

	public double getAve() { // �����̺� ������ ��ո� �������� �޼ҵ�. �����ʿ��� ��ŷ�� �ű涧 ������
		return ave;
	}

	public void setRank(int rank) { // �����̺� ������ ��ũ���� �����ϴ� �޼ҵ�. �����ʿ��� ��ŷ�� �ű涧 ������
		this.rank = rank;
	}

}
