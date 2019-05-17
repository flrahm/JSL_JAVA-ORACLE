package member.action;

import java.util.List;
import java.util.Scanner;

import member.db.MemberVO;
import member.service.MemberSearchService;
import member.ui.MemberView;

public class MemberSearchAction implements Action {

	@Override
	public void execute(Scanner scan) throws Exception {

		MemberView view = new MemberView();
		MemberSearchService msvc = new MemberSearchService();
		String str = view.memberSearch_input(scan);
		List<MemberVO> mList = null;
		
		if (isString(str))
			mList = msvc.memberSearch(str);
		else
			mList = msvc.memberSearch(Integer.parseInt(str));
		
		view.memberSearch_output(mList, scan);

	}

	private boolean isString(String str) {

		if (str.length() != 4)
			return true;

		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
				return false;

		return true;

	}
}
