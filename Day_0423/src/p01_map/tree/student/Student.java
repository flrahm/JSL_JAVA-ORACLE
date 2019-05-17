package p01_map.tree.student;

public class Student implements Comparable<Student> {
	private int num;
	private String name;
	private int score;

	public Student(int num, String name, int score) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
	}

	@Override	//// TreeSet �� ���� compareTo �޼ҵ� �������̵�
	public int compareTo(Student arg0) {	//��������
		
		if(arg0.getNum() > num)
			return -1;
		else if (arg0.getNum() == num)
			return 0;
		else
			return 1;
	}

	@Override	// contains �� ���� �������̵�
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}

	@Override	// contains �� ���� �������̵�
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (num != other.num)
			return false;
		return true;
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
