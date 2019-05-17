package member.action;

import java.util.List;
import java.util.Scanner;

import member.db.MemberVO;
import member.service.MemberListService;
import member.ui.MemberView;

public class MemberListAction implements Action {

	@Override
	public void execute(Scanner scan) throws Exception {
		MemberView view = new MemberView();
		MemberListService msvc = new MemberListService();
		List<MemberVO> mList = msvc.memberList();
		
		view.memberList(mList,scan);

	}

}
