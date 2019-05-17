
public abstract class Member {

	int idx;
	String name;
	int age;

	public void Mprint() {
		System.out.println(idx + "\t" + name + "\t" + age);
	}

	public abstract int result(int money);
	// ���ϴ°Ŵ�

	public abstract void update(int idx, int age);
}

//////////////////////////////////////////////////////////

class MemberExam extends Member {

	public MemberExam(int idx, String name, int age) {
		this.idx = idx;
		this.name = name;
		this.age = age;
	}

	@Override
	public int result(int money) {
		return age * money;
	}

	@Override
	public void update(int idx, int age) {

		if (idx == this.idx) {
			this.age = age;
			Mprint();
		} else
			System.out.println(idx + " ��(��) �������� ����");
	}

}
