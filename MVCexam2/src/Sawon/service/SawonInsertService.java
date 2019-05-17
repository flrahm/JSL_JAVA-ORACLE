package Sawon.service;

import Sawon.dao.SawonDAO;
import Sawon.vo.SawonVO;

public class SawonInsertService {

	public int SawonInsert(SawonVO svo) {
		SawonDAO dao = new SawonDAO();
		
		return dao.insertNewSawon(svo);
	}
}
