// 학생체중 클래스

package StudentWeight;

public class StudentWeight {

	private int ban;
	private int stdNum;
	private int weight;
	
	
	
	public StudentWeight(int ban, int stdNum, int weight) {
		this.ban = ban;
		this.stdNum = stdNum;
		this.weight = weight;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getStdNum() {
		return stdNum;
	}

	public void setStdNum(int stdNum) {
		this.stdNum = stdNum;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
}
