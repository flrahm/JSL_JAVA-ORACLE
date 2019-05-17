package Sawon.service;

import java.util.List;

import Sawon.dao.SawonDAO;
import Sawon.vo.DeptVO;

public class DeptListService {

	public List<DeptVO> deptList() {
		SawonDAO dao = new SawonDAO();
		
		return dao.selectAllDepartment();
		
		
	}
}
