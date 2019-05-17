package member.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import member.db.MemberVO;
import member.service.MemberSearchService;
import member.service.MemberUpdateService;
import member.ui.MemberView;

public class MemberUpdateAction implements Action {

	@Override
	public void execute(Scanner scan) throws Exception {
		List<MemberVO> mList = new ArrayList<MemberVO>(); // ���VO ����Ʈ ����
		MemberView mView = new MemberView(); // �� ��ü ����
		MemberSearchService mSearchSvc = new MemberSearchService(); // �˻� ���� ��ü ����
		MemberUpdateService mUpdateSvc = new MemberUpdateService(); // ������Ʈ ���� ��ü ����

		int id = mView.memberUpdate_search(scan); // �˻��� id�� �信�� �Է¹޾ƿ�
		mList = mSearchSvc.memberSearch(id); // �˻� ���� ��ü�� �̿��Ͽ� id�� ȸ������ �˻�

		if (mList.size() != 0) { // ���� �˻��� �Ǿ�����
			MemberVO mvo = mView.memberUpdate_input(scan, mList.get(0)); // �� ��ü�� �̿��ؼ� ������Ʈ ��ų ������ �޾ƿ�

			System.out.println("�����Ͻðڽ��ϱ�? [y]");
			String check = scan.nextLine();
			if (check.equalsIgnoreCase("y")) {
				boolean updateOk = mUpdateSvc.memberUpdate(mvo); // ������Ʈ ���� ��ü�� �̿��Ͽ� ������Ʈ�� ��Ŵ
				
				if (updateOk)
					System.out.println("������Ʈ ����");
				else
					System.out.println("������Ʈ ����");
			} else
				System.out.println("���� ���");
		} else
			System.out.println("�ش� ID�� ���� ȸ���� �����ϴ�");
	}

}
