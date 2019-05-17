package member.service;

import java.util.List;

import member.db.MemberDAO;
import member.db.MemberVO;

public class MemberListService {

	public List<MemberVO> memberList(){
		MemberDAO dao = new MemberDAO();
		List<MemberVO> mList = dao.MemberList();
		
		return mList;
	}
	
}
