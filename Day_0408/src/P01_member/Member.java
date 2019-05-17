package P01_member;

public class Member {

	private int idx;
	private String userid;
	private String userpw;
	private String name;
	private int age;

	public Member() {
	}

	public Member(int idx, String userid, String userpw, String name, int age) {
		this.idx = idx;
		this.userid = userid;
		this.userpw = userpw;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		String str = idx + "\t" + userid + "\t" + name + "\t" + age;
		return str;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
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
