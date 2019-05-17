package p01_DBConn_singleton.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import p01_DBConn_singleton.orcle.db.DBManager;

public class EmployeeDAO {

	DBManager manager = DBManager.getInstance();
	Connection myConn = null;
	ResultSet rs = null;

	public int select(int flag) throws Exception {
		int count;
		myConn = manager.getConnection();
		Statement stmt = myConn.createStatement();
		String sql = "";

		if (flag == 1)
			sql = "select count(*) from employee";
		else
			sql = "select count(*) from employee where dno = 30";

		rs = stmt.executeQuery(sql);
		if (rs.next())
			count = rs.getInt(1);
		else
			count = 0;

		if (myConn != null)	// commit ¿ëµµ
			myConn.close();
		if (stmt != null)
			stmt.close();
		if (rs != null)
			rs.close();

		return count;
	}

}
