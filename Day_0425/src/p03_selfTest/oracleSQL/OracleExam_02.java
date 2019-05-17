package p03_selfTest.oracleSQL;

public class OracleExam_02 {

	public static void main(String[] args) throws Exception {
		
		OracleSql oracle = new OracleSql();
		
		oracle.makeConn();
		oracle.deptSelect();
		
		
		oracle.takeDown();
		oracle.cleanUp();

	}

}
