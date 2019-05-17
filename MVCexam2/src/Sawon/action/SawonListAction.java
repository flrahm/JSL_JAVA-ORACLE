package Sawon.action;

import java.util.List;
import java.util.Scanner;

import Sawon.service.SawonListService;
import Sawon.ui.SawonView;
import Sawon.vo.SawonVO;

public class SawonListAction implements Action {

	@Override
	public void execute(Scanner scan) throws Exception {
		SawonListService svc = new SawonListService();
		SawonView view = new SawonView();
		
		List<SawonVO> sList = svc.allSawonList();	// 1. 모든 사원 리스트 받아옴 - 서비스
		view.printAllSawonList(sList);	// 2. 리스트를 출력 - 뷰

	}

}
