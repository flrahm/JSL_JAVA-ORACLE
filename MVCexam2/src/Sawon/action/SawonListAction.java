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
		
		List<SawonVO> sList = svc.allSawonList();	// 1. ��� ��� ����Ʈ �޾ƿ� - ����
		view.printAllSawonList(sList);	// 2. ����Ʈ�� ��� - ��

	}

}
