package Ex02_selftest_interface;

/*���� ���
 * oracle DB���� �˻�
 * oracle DB�� ����
 * oracle DB�� ����
 * oracle DB���� ����
 * 
 * mysql DB���� �˻�
 * mysql DB�� ����
 * mysql DB�� ����
 * mysql DB���� ����
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
				System.out.println("���� ����");
				
			}@Override
			public void insert() {
				System.out.println("���� ����");
				
			}@Override
			public void select() {
				System.out.println("���� ����");
				
			}@Override
			public void update() {
				System.out.println("���� ����");
				
			}
		};
		
		dbWork(dao);
		
	}

}

