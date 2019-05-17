package Sawon.action;

import java.util.List;
import java.util.Scanner;

import Sawon.service.DeptListService;
import Sawon.service.SawonInsertService;
import Sawon.ui.SawonView;
import Sawon.vo.DeptVO;
import Sawon.vo.SawonVO;

public class SawonInsertAction implements Action {

	@Override
	public void execute(Scanner scan) throws Exception {
		String work = "등록";
		DeptListService dsvc = new DeptListService();
		SawonView view = new SawonView();
		SawonInsertService ssvc = new SawonInsertService();

		List<DeptVO> dList = dsvc.deptList();	// 1.뷰에 부서 정보를 출력하기위해 부서정보를 받아옴 - 서비스
		SawonVO svo = view.insertNewSawon(scan, dList);	// 2. 등록할 사원 정보를 입력받아옴 - 뷰 
		
		if(view.insureWork(work, scan)) {	// 3. 등록을 할지 입력받음 - 뷰
		int insertOk = ssvc.SawonInsert(svo);	// 4. db에 등록을 실행 - 서비스
		view.printOk(work, insertOk);	// 5. 실행 결과를 출력 - 뷰
		}
	}

}
