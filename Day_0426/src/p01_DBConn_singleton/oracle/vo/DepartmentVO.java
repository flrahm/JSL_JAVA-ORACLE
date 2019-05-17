package p01_DBConn_singleton.oracle.vo;

public class DepartmentVO {

	private int dno; // �μ���ȣ
	private String dname; // �μ��̸�
	private String loc; // ����

	@Override
	public String toString() {

		if (dname.length() < 8)
			return dno + "\t" + dname + "\t\t" + loc;
		else
			return dno + "\t" + dname + "\t" + loc;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

}
