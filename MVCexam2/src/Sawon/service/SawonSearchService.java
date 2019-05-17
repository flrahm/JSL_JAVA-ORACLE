package Sawon.service;

import java.util.List;

import Sawon.dao.SawonDAO;
import Sawon.vo.SawonVO;

public class SawonSearchService {

	public List<SawonVO> searchByName(String name) {
		SawonDAO dao = new SawonDAO();
		
		return dao.selectByName(name);
	}

	public List<SawonVO> searchByEno(int eno) {
		SawonDAO dao = new SawonDAO();
		
		return dao.selectByEno(eno);		
		
	}
	
	public void searchMname(SawonVO svo) {
		SawonDAO dao = new SawonDAO();
		dao.searchMname(svo);
	}
}
