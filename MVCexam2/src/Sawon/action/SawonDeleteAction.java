package Sawon.action;

import java.util.List;
import java.util.Scanner;

import Sawon.service.SawonDeleteService;
import Sawon.service.SawonSearchService;
import Sawon.ui.SawonView;
import Sawon.vo.SawonVO;

public class SawonDeleteAction implements Action {

	@Override
	public void execute(Scanner scan) throws Exception {
		String work = "삭제";
		SawonView view = new SawonView();
		SawonSearchService searchSvc = new SawonSearchService();
		SawonDeleteService deleteSvc = new SawonDeleteService();
		
		int eno = view.getEno(scan);	// 1. 사원번호를 입력받음	- 뷰
		List<SawonVO> sList = searchSvc.searchByEno(eno);	// 2. 입력받은 번호로 검색함 - 서비스
		
		for (int i = 0; i < sList.size(); i++) {	// 3. 매니저 이름 찾아주기 - 서비스
			searchSvc.searchMname(sList.get(i));
		}
		view.printSawonList(sList);	// 4. 검색한 결과를 출력함 - 뷰
		if(sList.size() != 0) {
			if(view.insureWork(work, scan)) {	// 5. 검색이 되었으면 삭제여부를 물어봄 - 뷰
				int deleteOk = deleteSvc.SawonDelete(eno);	//6. 삭제를 실행시킴	 - 서비스
				view.printOk(work, deleteOk);	// 7. 실행한 결과를 표시 - 뷰
			}
				
		}
		
	}

}
