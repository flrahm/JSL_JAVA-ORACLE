package member.action;

import java.util.Scanner;

import member.db.MemberVO;
import member.service.MemberInsertService;
import member.ui.MemberView;

public class MemberInsertAction implements Action {

	@Override
	public void execute(Scanner scan) throws Exception {
		
		
		MemberView view = new MemberView();
		MemberInsertService msvc = new MemberInsertService();
		boolean flag = true;
		
		while(flag) {
		
		MemberVO mvo = view.memberInsert(scan);
		msvc.memberInsert(mvo);
		
		System.out.println("계속해서 등록하시겠습니까? [y]");
		if(!scan.nextLine().equalsIgnoreCase("y"))
			flag = false;
		}
	}

}
