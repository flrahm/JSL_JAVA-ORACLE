package p03_selfTest.oracleSQL;

public class OracleExam_01 {

	public static void main(String[] args) throws Exception {
		
		OracleSql oracle = new OracleSql();
		
		oracle.makeConn();
		
		int row = oracle.deptInsert();
		if(row != 0)
			System.out.println("insert 성공");
		else
			System.out.println("등록실패");
		
		oracle.takeDown();
		oracle.cleanUp();

	}

}
