package p02_Sawon;

public class Sawon {

	private int sabun;
	private int departmentCode;
	private String department;
	private String name;
	private int pay;

	public Sawon(int sabun, int departmentCode, String name, int pay) {

		this.sabun = sabun;
		this.departmentCode = departmentCode;
		this.name = name;
		this.pay = pay;
		chooseDepartment();
	}

	private void chooseDepartment() {

		switch (departmentCode) {
		case 1:
			department = "�λ�";
			break;
		case 2:
			department = "����";
			break;
		case 3:
			department = "������";
			break;
		case 4:
			department = "����";
			break;
		case 5:
			department = "����";
			break;
		default:
			department = "����";
		}

	}

	@Override
	public String toString() {

		return department + "\t" + sabun + "\t" + name + "\t" + pay;
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public int getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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
