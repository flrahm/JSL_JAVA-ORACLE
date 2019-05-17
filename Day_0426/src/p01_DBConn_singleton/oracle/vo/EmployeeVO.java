// oracle textbook p29;
// java bean  또는 java pojo

package p01_DBConn_singleton.oracle.vo;

public class EmployeeVO {

	private int eno;	// 사원번호
	private String ename;	// 이름
	private String job;	// 직무
	private int manager;	// 담당 매니저
	private String hireDate;	// 입사일
	private int salary;	// 급여	
	private int commission;	// 커미션
	private int dno;	// 부서번호
	
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	
	
	
}
