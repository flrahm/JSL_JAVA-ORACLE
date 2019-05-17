
class Person {

	private String sno;
	private String name;
	private String addr;
	private int age;

	
	
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}


public class Exam_01 {

	public static void main(String[] args) {

		Person p1 = new Person();
		
		p1.setSno("12");
		p1.setName("hong");
		p1.setAddr("Daejeon");
		p1.setAge(28);
		
		System.out.println(p1.getSno());
		System.out.println(p1.getName());
		System.out.println(p1.getAddr());
		System.out.println(p1.getAge());

	}

}
