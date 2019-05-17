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
		String work = "����";
		SawonSearchService searchSvc = new SawonSearchService();
		SawonUpdateService updateSvc = new SawonUpdateService();
		SawonView view = new SawonView();
		DeptListService deptService = new DeptListService();

		List<DeptVO> dList = deptService.deptList();	// 1. �μ� ����Ʈ�� �޾ƿ� - ����
		int eno = view.getEno(scan);	// 2. eno�� �Է¹��� - ��
		List<SawonVO> sList = searchSvc.searchByEno(eno);	// 3. eno�� ���� ����� �˻��ؿ� - ����
		if (sList.size() != 0) {
			SawonVO svo = sList.get(0);	
			svo = view.updateSawonInput(scan, svo, dList);	// 4. ������Ʈ �� ������ �޾ƿ� - ��
			if(view.insureWork(work, scan)) {	// 5. Ȯ���� ������ ����(Y/N)	- ��
				int updateOk = updateSvc.sawonUpdate(svo);	// 6. ������Ʈ�� ������	- ����
				view.printOk(work, updateOk); // 7. ���� ����� ����� - ��
			}
		}else
			view.printSawonList(sList);
			

	}

}
