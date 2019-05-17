package p01_DBConn_singleton.main;

import p01_DBConn_singleton.dao.EmployeeDAO;

public class EmployeeMain {

	public static void main(String[] args) throws Exception {

		int a = 2;

	  EmployeeDAO dao = new EmployeeDAO();
	  
	  System.out.println(dao.select(a));
		

	}

}
