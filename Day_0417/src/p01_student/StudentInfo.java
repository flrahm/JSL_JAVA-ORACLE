// �л� ���� Ŭ����

package p01_student;

public class StudentInfo {

	int answerSize = 10;	// ���� ����
	private int stuNum;	// �л� ��ȣ
	private String stuName;	// �л� �̸�
	private int score;	// ����
	private int[] stuAnswer = new int[answerSize];	// �л� ���
	private char[] errata = new char[answerSize];	// �л� ����ǥ
	

	
	public StudentInfo(String inData) {	// �����ڿ��� �۾�

		String[] str = inData.split(",");	// , �� �ɰ���
		stuNum = Integer.parseInt(str[0]);	// ù��°�� ��ȣ
		stuName = str[1];	// �ι�°�� �̸�
		for (int i = 2; i < str.length; i++) {	// �������� �л��� �� ����ǥ�� ����
			stuAnswer[i-2] = Integer.parseInt(str[i]);
		}
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int[] getStuAnswer() {
		return stuAnswer;
	}

	public void setStuAnswer(int[] stuAnswer) {
		this.stuAnswer = stuAnswer;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public char[] getErrata() {
		return errata;
	}

	public void setErrata(char[] errata) {
		this.errata = errata;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	
	
}
