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

		String name = view.getName(scan); // 1. 이름을 입력받음 - 뷰
		List<SawonVO> sList = svc.searchByName(name); // 2. 이름을 가지고 검색 - 서비스
		for (int i = 0; i < sList.size(); i++) {	// 3. 매니저 이름 찾아주기 - 서비스
			svc.searchMname(sList.get(i));
		}
		view.printSawonList(sList); // 4. 검색한 결과를 출력 - 뷰

	}

}
