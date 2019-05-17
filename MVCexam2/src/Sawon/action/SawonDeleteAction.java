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
		String work = "����";
		SawonView view = new SawonView();
		SawonSearchService searchSvc = new SawonSearchService();
		SawonDeleteService deleteSvc = new SawonDeleteService();
		
		int eno = view.getEno(scan);	// 1. �����ȣ�� �Է¹���	- ��
		List<SawonVO> sList = searchSvc.searchByEno(eno);	// 2. �Է¹��� ��ȣ�� �˻��� - ����
		
		for (int i = 0; i < sList.size(); i++) {	// 3. �Ŵ��� �̸� ã���ֱ� - ����
			searchSvc.searchMname(sList.get(i));
		}
		view.printSawonList(sList);	// 4. �˻��� ����� ����� - ��
		if(sList.size() != 0) {
			if(view.insureWork(work, scan)) {	// 5. �˻��� �Ǿ����� �������θ� ��� - ��
				int deleteOk = deleteSvc.SawonDelete(eno);	//6. ������ �����Ŵ	 - ����
				view.printOk(work, deleteOk);	// 7. ������ ����� ǥ�� - ��
			}
				
		}
		
	}

}
