package member.service;

import member.db.MemberDAO;

public class MemberDeleteService {

	public boolean memberDelete(int id) {
		MemberDAO dao = new MemberDAO();
		
		return dao.MemberDelete(id);
	}
}
