// StudentSearch 
package P03;

public class Student {

	private int bun;
	private String name;
	private int score;
	
	public Student() {}
	
	public Student(int bun) {
		this.bun = bun;
	}
	
	public Student(int bun, String name) {
		this.bun = bun;
		this.name = name;
	}
	public Student(int bun, String name, int score) {
		this.bun = bun;
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "번호 : " + bun + "    이름 : " + name + "    점수 : " + score;
	}
	
	public int getBun() {
		return bun;
	}

	public void setBun(int bun) {
		this.bun = bun;
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
