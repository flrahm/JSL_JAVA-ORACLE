package p03_selfTest.oracleSQL;

import java.sql.*;

import p03_selfTest.oracleDB.OracleConn;

public class OracleSql extends OracleConn {

	Statement stmt = null;
	ResultSet rs = null;

	public int deptInsert() throws Exception {
		int row = 0;
		String query = "insert into dept values(24,'ddd','fff')";
		stmt = myConn.createStatement();
		row = stmt.executeUpdate(query);
		return row;
	}

	public void deptSelect() throws Exception {
		String query = "select * from dept order by deptno";
		stmt = myConn.createStatement();
		rs = stmt.executeQuery(query);
		
		
		while(rs.next()) {		
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			if(rs.getString(2).length() < 8)
				System.out.print("\t");
			System.out.println(rs.getString(3) + "\t");
			
		}
	}

	@Override
	public void cleanUp() throws Exception {

		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
	}

}
