package student.vo;

public class Student {

	
	private String ban;
	private String num;
	private String name;
	
	private String inData;
	private String[] dap;
	
	private int score;
	private int rank;

	public Student() {
	}

	public Student(String inData) {
		this.inData = inData;	// 파일에서 줄을 읽어와서 저장하기 위한 생성자
	}

	public Student(String ban, String num, String name) {
		this.ban = ban;
		this.num = num;
		this.name = name;
	}

	public String getInData() {
		return inData;
	}

	public void setInData(String inData) {
		this.inData = inData;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String[] getDap() {
		return dap;
	}

	public void setDap(String[] dap) {
		this.dap = dap;
	}


}
