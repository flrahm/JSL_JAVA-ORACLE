package member.service;

import java.util.List;

import member.db.MemberDAO;
import member.db.MemberVO;

public class MemberSearchService {

	public List<MemberVO> memberSearch(int id) {
		MemberDAO dao = new MemberDAO();
		return dao.MemberSearch(id);
	}
	
	public List<MemberVO> memberSearch(String name) {
		MemberDAO dao = new MemberDAO();
		return dao.MemberSearch(name);
	}
}
