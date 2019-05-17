package p01_DBConn_singleton.main;

import java.util.ArrayList;
import java.util.List;

import p01_DBConn_singleton.dao.DeptDAO;
import p01_DBConn_singleton.oracle.vo.DepartmentVO;

public class DeptMain2 {

	public static void main(String[] args)  throws Exception{
		
		DeptDAO dept = new DeptDAO();
		List<DepartmentVO> dvoList = new ArrayList<DepartmentVO>();
		
		dvoList = dept.deptSelectAll();
		
		if(dvoList.size() != 0)
			for(int i = 0; i <dvoList.size() ; i++) {
				System.out.print(dvoList.get(i).getDno() + "\t");
				System.out.print(dvoList.get(i).getDname() + "\t");
				if(dvoList.get(i).getDname().length() < 8)
					System.out.print("\t");
				System.out.println(dvoList.get(i).getLoc() + "\t");
			}
	}

}
