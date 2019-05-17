package P03_selftest_sawon;

public class Sawon {
	
	private int sabun;
	private String name;
	private int pay;
	
	
	public Sawon() {}
	
	public Sawon (int sabun , String name, int pay ) {
		
		this.sabun = sabun;
		this.name = name;
		this.pay = pay;
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

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	

}
