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

	@Override	// contains 를 쓰기 위한 오버라이딩. false 일때  리스트에 추가할꺼
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {	// 만약 입력값이 Student 클래스의 객체일때만 실행
			if(((Student) obj).getName().equalsIgnoreCase(name)&&((Student) obj).getNum()== num) {
				System.out.println("중복된 입력입니다");
				return true;	// 만약 이름과 번호가 중복이면 true 를 반환
			}
			else
				return false;	// 중복값이 없으면 false 를 반환.
		}else {	// Student 객체가 아니면 실행하지 않음
			System.out.println("Student 객체가 아닙니다");
			return true;	// true 를 반환
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
