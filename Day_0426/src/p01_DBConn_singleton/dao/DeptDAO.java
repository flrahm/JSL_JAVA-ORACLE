package p01_DBConn_singleton.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import p01_DBConn_singleton.oracle.vo.DepartmentVO;
import p01_DBConn_singleton.orcle.db.DBManager;

public class DeptDAO {

	DBManager manager = DBManager.getInstance();
	Connection myConn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public List<DepartmentVO> deptSelectAll() throws Exception {
		String query = "select * from department";

		try {
			myConn = manager.getConnection();
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(query);
			
			List<DepartmentVO> dvoList = new ArrayList<DepartmentVO>();
		
			while(rs.next()) {
				DepartmentVO dvo = new DepartmentVO();
				dvo.setDno(rs.getInt(1));
				dvo.setDname(rs.getString(2));
				dvo.setLoc(rs.getString(3));
				dvoList.add(dvo);
			}
			
			return dvoList;
			

		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (myConn != null)
				myConn.close();
		}
	}
	
	public DepartmentVO deptSelect(int dno) throws Exception {
		String query = "select * from department where dno =" + dno;

		try {
			myConn = manager.getConnection();
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(query);
			
			
			if(rs.next()) {
				DepartmentVO dvo = new DepartmentVO();
				dvo.setDno(rs.getInt(1));
				dvo.setDname(rs.getString(2));
				dvo.setLoc(rs.getString(3));
				return dvo;
			}else
				return null;
				
			
			

		} catch (Exception e) {
			System.out.println(e);
			return null;
		} finally {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (myConn != null)
				myConn.close();
		}
	}
	
	public void deptList() throws Exception {
		String query = "select * from department where dno = 10";

		try {
			myConn = manager.getConnection();
			stmt = myConn.createStatement();
			rs = stmt.executeQuery(query);
			
			
			while(rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.println(rs.getString(3) + "\t");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (myConn != null)
				myConn.close();

		}
	}
	

}
