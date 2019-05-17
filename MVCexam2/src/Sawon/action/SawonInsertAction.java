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
		String work = "���";
		DeptListService dsvc = new DeptListService();
		SawonView view = new SawonView();
		SawonInsertService ssvc = new SawonInsertService();

		List<DeptVO> dList = dsvc.deptList();	// 1.�信 �μ� ������ ����ϱ����� �μ������� �޾ƿ� - ����
		SawonVO svo = view.insertNewSawon(scan, dList);	// 2. ����� ��� ������ �Է¹޾ƿ� - �� 
		
		if(view.insureWork(work, scan)) {	// 3. ����� ���� �Է¹��� - ��
		int insertOk = ssvc.SawonInsert(svo);	// 4. db�� ����� ���� - ����
		view.printOk(work, insertOk);	// 5. ���� ����� ��� - ��
		}
	}

}
