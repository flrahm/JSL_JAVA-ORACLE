package p01_ListExam.student;

public class Student {

	private int num;
	private String name;
	private int score;

	public Student(int num, String name, int score) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
	}

	@Override	// contains �� ���� ���� �������̵�. false �϶�  ����Ʈ�� �߰��Ҳ�
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {	// ���� �Է°��� Student Ŭ������ ��ü�϶��� ����
			if(((Student) obj).getName().equalsIgnoreCase(name)&&((Student) obj).getNum()== num) {
				System.out.println("�ߺ��� �Է��Դϴ�");
				return true;	// ���� �̸��� ��ȣ�� �ߺ��̸� true �� ��ȯ
			}
			else
				return false;	// �ߺ����� ������ false �� ��ȯ.
		}else {	// Student ��ü�� �ƴϸ� �������� ����
			System.out.println("Student ��ü�� �ƴմϴ�");
			return true;	// true �� ��ȯ
		}
	}

	@Override
	public String toString() {
		return num + "\t" + name + "\t" + score;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}



}
