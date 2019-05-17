package member.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import member.db.MemberVO;
import member.service.MemberDeleteService;
import member.service.MemberSearchService;
import member.ui.MemberView;

public class MemberDeleteAction implements Action {

	@Override
	public void execute(Scanner scan) throws Exception {

		List<MemberVO> mList = new ArrayList<MemberVO>(); // ���VO ����Ʈ ����
		MemberView mView = new MemberView(); // �� ��ü ����
		MemberSearchService mSearchSvc = new MemberSearchService(); // �˻� ���� ��ü ����
		MemberDeleteService mDeleteSvc = new MemberDeleteService();	

		int id = mView.memberUpdate_search(scan); // �˻��� id�� �信�� �Է¹޾ƿ�
		mList = mSearchSvc.memberSearch(id); // id�� ã�ƿ�
		if (mList.size() != 0) {	// �˻��� ������
			mView.memberSearch_output(mList, scan);	// ȸ�� ���� ���
			System.out.println("�����Ͻðڽ��ϱ�? [y]");	
			String check = scan.nextLine();
			if (check.equalsIgnoreCase("y")) {	// y�� ������
				boolean deleteOk = mDeleteSvc.memberDelete(mList.get(0).getId()); // ���� ����
				if (deleteOk)
					System.out.println("���� �Ϸ�");
				else
					System.out.println("���� ����");
			} else
				System.out.println("���� ���");

		} else
			System.out.println("�ش� ID �� ���� ���� �����ϴ�");
	}

}
