package P03_member;

public class Member {
	
	private String name;
	private String userid;
	private String passwd;
	private int age;
	
	public Member() {}
	public Member(String name, String userid, String passwd , int age) {
		this.name = name;
		this.userid = userid;
		this.passwd = passwd;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name = " + name + "\t userid = " + userid + "\t passwd = " + passwd + "\t age = " + age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
