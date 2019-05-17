// 학생 정보 클래스

package p01_student;

public class StudentInfo {

	int answerSize = 10;	// 문제 갯수
	private int stuNum;	// 학생 번호
	private String stuName;	// 학생 이름
	private int score;	// 점수
	private int[] stuAnswer = new int[answerSize];	// 학생 답안
	private char[] errata = new char[answerSize];	// 학생 정오표
	

	
	public StudentInfo(String inData) {	// 생성자에서 작업

		String[] str = inData.split(",");	// , 로 쪼개서
		stuNum = Integer.parseInt(str[0]);	// 첫번째는 번호
		stuName = str[1];	// 두번째는 이름
		for (int i = 2; i < str.length; i++) {	// 나머지는 학생이 쓴 정답표에 저장
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
