package P01_sawon;

import java.time.LocalDate;

public class Sawon {

	private int sabun;	// �����ȣ
	private String name;	// �̸�
	private String part;	// �μ�
	private LocalDate regdate;	// �Ի���
	
	public Sawon() {}
	public Sawon(int sabun, String name, String part , LocalDate regdate) {
		
		this.sabun = sabun;
		this.name = name;
		this.part = part;
		this.regdate = regdate;
	}
	
	
	
	@Override
	public String toString() {
		return "Sawon [sabun=" + sabun + ", name=" + name + ", part=" + part + ", regdate=" + regdate + "]";
	}
	// setter & getter
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
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public LocalDate getRegdate() {
		return regdate;
	}
	public void setRegdate(LocalDate regdate) {
		this.regdate = regdate;
	}
	////
}
