// teacher 개개인의 정보를 저장하는 클래스

package p01_School.teacher;

public class Teacher {
	private int tno;
	private String name;
	private String tel;
	private String part;
	private int age;
	private String regDate;

	public Teacher(int tno, String name, String tel, String part, int age, String regDate) {

		this.tno = tno;
		this.name = name;
		this.tel = tel;
		this.part = part;
		this.age = age;
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return tno + "\t" + name + "\t" + tel + "\t" + part + "\t" + age + "\t" + regDate;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
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

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
