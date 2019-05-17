package member.service;

import member.db.MemberDAO;
import member.db.MemberVO;

public class MemberUpdateService {

	
	public boolean memberUpdate(MemberVO mvo) {
		MemberDAO dao = new MemberDAO();
		return dao.MemberUpdate(mvo);
		
	}
}
