//// �л� �������� �����͸� �����ϴ� Ŭ����

package p01_school;

public class Student {

	private String bun;
	private String name;
	private String tel;
	private int score;
	private int tno;
	

	
	@Override
	public String toString() {
		return "�л���ȣ : " + bun + " �л� �̸� : " + name + " ��ȭ��ȣ : " + tel +  " ���� : " + score + " ��� ���� ��ȣ " + tno;
	}

	public Student(String bun, String name, String tel, int score, int tno) {
		
		this.bun = bun;
		this.name = name;
		this.tel = tel;
		this.score = score;
		this.tno = tno;
	}

	public String getBun() {
		return bun;
	}

	public void setBun(String bun) {
		this.bun = bun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}
	
	
	
	
}
