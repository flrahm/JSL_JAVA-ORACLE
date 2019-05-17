package Sawon.service;

import Sawon.dao.SawonDAO;
import Sawon.vo.SawonVO;

public class SawonUpdateService {

	public int sawonUpdate(SawonVO svo) {
		SawonDAO dao = new SawonDAO();
		
		return dao.updateSawon(svo);
	}
}
