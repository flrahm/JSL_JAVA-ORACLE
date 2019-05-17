package Sawon.service;

import java.util.List;

import Sawon.dao.SawonDAO;
import Sawon.vo.SawonVO;

public class SawonListService {

	public List<SawonVO> allSawonList() {
		SawonDAO dao = new SawonDAO();
		return dao.selectAllSawon();
	}
}
