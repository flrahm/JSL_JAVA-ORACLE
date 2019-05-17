package Ex02_selftest_interface;

public class MysqlDao implements DataAccessObject {

	public void select() {
		System.out.println("mySql DB 에서 검색");
	}
	
	public void insert() {
		System.out.println("mySql DB 에 삽입");
	}

	public void update() {
		System.out.println("mySql DB 를 수정");
	}
	
	public void delete() {
		System.out.println("mySql DB 에서 삭제");
	}
}
