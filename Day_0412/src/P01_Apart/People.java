// apart people

package P01_Apart;

public class People {

	private int dong;
	private String name;
	private int age;
	
	public People() {}
	public People(int dong, String name, int age ) {
		this.dong = dong;
		this.name = name;
		this.age = age;
		
	}
	public int getDong() {
		return dong;
	}
	public void setDong(int dong) {
		this.dong = dong;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
