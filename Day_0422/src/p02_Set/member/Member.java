package p02_Set.member;

public class Member {

	String name;
	int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	/////////////////////////////////////////////////
	// equals , hashCode 둘 다 오버라이딩 해야함
	
	@Override	
	public boolean equals(Object obj) {
		if(obj instanceof Member)
			return ((Member) obj).name.equals(name);
		else
			return false;
	
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}
	/////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return name + "\t" + age;
	}
	
	
}
