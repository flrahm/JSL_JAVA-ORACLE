package P02_selftest_insa;

public class Insa {

	private String part;
	private int sabun;
	private String name;
	private int pay;
	
	public Insa() {}
	public Insa(String part, int sabun, String name, int pay) {
		
		this.part = part;
		this.sabun = sabun;
		this.name = name;
		this.pay = pay;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
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
