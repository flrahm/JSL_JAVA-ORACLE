package P02_insa;

public class Sawon2 {

	private int sabun;
	private String name;



	public Sawon2() {
	}

	public Sawon2(int sabun, String name) {
		this.sabun = sabun;
		this.name = name;
	}

	public void sPrint() {
		System.out.print(sabun + "\t");
		System.out.println(name);
	}
	
	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
