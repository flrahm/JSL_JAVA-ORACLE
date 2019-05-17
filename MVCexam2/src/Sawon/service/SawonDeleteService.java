package Sawon.service;

import Sawon.dao.SawonDAO;

public class SawonDeleteService {

	public int SawonDelete(int eno) {
		SawonDAO dao = new SawonDAO();
		return dao.deleteByEno(eno);
		
	}
}
