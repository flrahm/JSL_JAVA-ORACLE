package Ex02_selftest_interface;

/*실행 결과
 * oracle DB에서 검색
 * oracle DB에 삽입
 * oracle DB를 수정
 * oracle DB에서 삭제
 * 
 * mysql DB에서 검색
 * mysql DB에 삽입
 * mysql DB를 수정
 * mysql DB에서 삭제
 */
public class DaoExam {

	private static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
	public static void main(String[] args) {

	
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
		////////////////////////////////
		System.out.println();
	
		DataAccessObject dao = new DataAccessObject() {
			@Override
			public void delete() {
				System.out.println("삭제 종료");
				
			}@Override
			public void insert() {
				System.out.println("삽입 종료");
				
			}@Override
			public void select() {
				System.out.println("선택 종료");
				
			}@Override
			public void update() {
				System.out.println("수정 종료");
				
			}
		};
		
		dbWork(dao);
		
	}

}

