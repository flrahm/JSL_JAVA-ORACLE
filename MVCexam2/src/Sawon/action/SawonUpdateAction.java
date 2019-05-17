package Sawon.action;

import java.util.List;
import java.util.Scanner;

import Sawon.service.DeptListService;
import Sawon.service.SawonSearchService;
import Sawon.service.SawonUpdateService;
import Sawon.ui.SawonView;
import Sawon.vo.DeptVO;
import Sawon.vo.SawonVO;

public class SawonUpdateAction implements Action {

	@Override
	public void execute(Scanner scan) throws Exception {
		String work = "수정";
		SawonSearchService searchSvc = new SawonSearchService();
		SawonUpdateService updateSvc = new SawonUpdateService();
		SawonView view = new SawonView();
		DeptListService deptService = new DeptListService();

		List<DeptVO> dList = deptService.deptList();	// 1. 부서 리스트를 받아옴 - 서비스
		int eno = view.getEno(scan);	// 2. eno를 입력받음 - 뷰
		List<SawonVO> sList = searchSvc.searchByEno(eno);	// 3. eno를 통해 사원을 검색해옴 - 서비스
		if (sList.size() != 0) {
			SawonVO svo = sList.get(0);	
			svo = view.updateSawonInput(scan, svo, dList);	// 4. 업데이트 할 내용을 받아옴 - 뷰
			if(view.insureWork(work, scan)) {	// 5. 확인을 누르면 실행(Y/N)	- 뷰
				int updateOk = updateSvc.sawonUpdate(svo);	// 6. 업데이트를 실행함	- 서비스
				view.printOk(work, updateOk); // 7. 실행 결과를 출력함 - 뷰
			}
		}else
			view.printSawonList(sList);
			

	}

}
