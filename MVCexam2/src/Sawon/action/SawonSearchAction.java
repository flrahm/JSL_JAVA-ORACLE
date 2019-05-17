package Sawon.action;

import java.util.List;
import java.util.Scanner;

import Sawon.service.SawonSearchService;
import Sawon.ui.SawonView;
import Sawon.vo.SawonVO;

public class SawonSearchAction implements Action {

	@Override
	public void execute(Scanner scan) throws Exception {
		SawonView view = new SawonView();
		SawonSearchService svc = new SawonSearchService();

		String name = view.getName(scan); // 1. �̸��� �Է¹��� - ��
		List<SawonVO> sList = svc.searchByName(name); // 2. �̸��� ������ �˻� - ����
		for (int i = 0; i < sList.size(); i++) {	// 3. �Ŵ��� �̸� ã���ֱ� - ����
			svc.searchMname(sList.get(i));
		}
		view.printSawonList(sList); // 4. �˻��� ����� ��� - ��

	}

}
