package p03_selfTest.oracleSQL;

public class OracleExam_01 {

	public static void main(String[] args) throws Exception {
		
		OracleSql oracle = new OracleSql();
		
		oracle.makeConn();
		
		int row = oracle.deptInsert();
		if(row != 0)
			System.out.println("insert ����");
		else
			System.out.println("��Ͻ���");
		
		oracle.takeDown();
		oracle.cleanUp();

	}

}
