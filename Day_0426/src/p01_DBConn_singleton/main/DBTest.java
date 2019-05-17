package p01_DBConn_singleton.main;

import p01_DBConn_singleton.dao.DeptDAO;

public class DBTest {

	public static void main(String[] args) throws Exception{
		
		//DBManager manager = DBManager.getInstance();
		//manager.getConnection();
		
		DeptDAO test = new DeptDAO();
		test.deptList();
		
	}

}
