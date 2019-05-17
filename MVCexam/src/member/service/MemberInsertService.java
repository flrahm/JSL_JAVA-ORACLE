package member.service;

import member.db.MemberDAO;
import member.db.MemberVO;

public class MemberInsertService {


	public void memberInsert(MemberVO mvo) {
		MemberDAO dao = new MemberDAO();
		boolean insertOk = dao.MemberInsert(mvo);
		if(insertOk)
			System.out.println("등록 성공");
		else
			System.out.println("등록 실패");

	}
}
