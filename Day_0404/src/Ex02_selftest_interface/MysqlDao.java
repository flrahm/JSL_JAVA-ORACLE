package Ex02_selftest_interface;

public class MysqlDao implements DataAccessObject {

	public void select() {
		System.out.println("mySql DB ���� �˻�");
	}
	
	public void insert() {
		System.out.println("mySql DB �� ����");
	}

	public void update() {
		System.out.println("mySql DB �� ����");
	}
	
	public void delete() {
		System.out.println("mySql DB ���� ����");
	}
}
