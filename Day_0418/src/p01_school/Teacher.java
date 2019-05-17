///// 선생 개개인의 데이터를 저장하는 클래스

package p01_school;

public class Teacher {

	private int tno;
	private String name;
	private String tel;
	private String part;
	private int age;
	
	public Teacher(int tno, String name, String tel, String part, int age) {
		
		this.tno = tno;
		this.name = name;
		this.tel = tel;
		this.part = part;
		this.age = age;
	}
	

	
	
	@Override
	public String toString() {
		return "선생 번호 : " + tno + " 선생 이름: " + name + " 전화번호 : " + tel + " 담당과목 : " + part + "나이 : " + age;
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
