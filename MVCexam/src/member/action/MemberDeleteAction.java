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

		List<MemberVO> mList = new ArrayList<MemberVO>(); // 멤버VO 리스트 생성
		MemberView mView = new MemberView(); // 뷰 객체 생성
		MemberSearchService mSearchSvc = new MemberSearchService(); // 검색 서비스 객체 생성
		MemberDeleteService mDeleteSvc = new MemberDeleteService();	

		int id = mView.memberUpdate_search(scan); // 검색할 id를 뷰에서 입력받아옴
		mList = mSearchSvc.memberSearch(id); // id로 찾아옴
		if (mList.size() != 0) {	// 검색이 됬으면
			mView.memberSearch_output(mList, scan);	// 회원 정보 출력
			System.out.println("삭제하시겠습니까? [y]");	
			String check = scan.nextLine();
			if (check.equalsIgnoreCase("y")) {	// y를 누르면
				boolean deleteOk = mDeleteSvc.memberDelete(mList.get(0).getId()); // 삭제 실행
				if (deleteOk)
					System.out.println("삭제 완료");
				else
					System.out.println("삭제 실패");
			} else
				System.out.println("삭제 취소");

		} else
			System.out.println("해당 ID 를 가진 고객이 없습니다");
	}

}
