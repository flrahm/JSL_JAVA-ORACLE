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
		List<MemberVO> mList = new ArrayList<MemberVO>(); // 멤버VO 리스트 생성
		MemberView mView = new MemberView(); // 뷰 객체 생성
		MemberSearchService mSearchSvc = new MemberSearchService(); // 검색 서비스 객체 생성
		MemberUpdateService mUpdateSvc = new MemberUpdateService(); // 업데이트 서비스 객체 생성

		int id = mView.memberUpdate_search(scan); // 검색할 id를 뷰에서 입력받아옴
		mList = mSearchSvc.memberSearch(id); // 검색 서비스 객체를 이용하여 id로 회원정보 검색

		if (mList.size() != 0) { // 만약 검색이 되었으면
			MemberVO mvo = mView.memberUpdate_input(scan, mList.get(0)); // 뷰 객체를 이용해서 업데이트 시킬 정보를 받아옴

			System.out.println("수정하시겠습니까? [y]");
			String check = scan.nextLine();
			if (check.equalsIgnoreCase("y")) {
				boolean updateOk = mUpdateSvc.memberUpdate(mvo); // 업데이트 서비스 객체를 이용하여 업데이트를 시킴
				
				if (updateOk)
					System.out.println("업데이트 성공");
				else
					System.out.println("업데이트 실패");
			} else
				System.out.println("수정 취소");
		} else
			System.out.println("해당 ID를 가진 회원이 없습니다");
	}

}
