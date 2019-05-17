package member.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

	DBManager dbm = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 회원 정보 삭제
	public boolean MemberDelete(int id) {

		boolean deleteOk = false;

		String sql = "delete from member where id = " + id;

		try {
			conn = dbm.getConnection();
			pstmt = conn.prepareStatement(sql);
			if (pstmt.executeUpdate() != 0)
				deleteOk = true;

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

		return deleteOk;
	}
	
	// 회원 정보 수정
	public boolean MemberUpdate(MemberVO mvo) {

		boolean updateOk = false;

		String sql = "update member set name =?, addr = ?, nation =?, email=?,age=? ";
				sql+= "where id = " + mvo.getId();

		try {
			conn = dbm.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mvo.getName());
			pstmt.setString(2, mvo.getAddr());
			pstmt.setString(3, mvo.getNation());
			pstmt.setString(4, mvo.getEmail());
			pstmt.setInt(5, mvo.getAge());

			if (pstmt.executeUpdate() != 0)
				updateOk = true;

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

		return updateOk;
	}

	// 신규 회원 등록
	public boolean MemberInsert(MemberVO mvo) {

		boolean insertOk = false;

		String sql = "insert into member(id,name,addr,nation,email,age) ";
		sql += "values(member_id_seq.nextval,?,?,?,?,?)";

		try {
			conn = dbm.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mvo.getName());
			pstmt.setString(2, mvo.getAddr());
			pstmt.setString(3, mvo.getNation());
			pstmt.setString(4, mvo.getEmail());
			pstmt.setInt(5, mvo.getAge());

			if (pstmt.executeUpdate() != 0)
				insertOk = true;

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

		return insertOk;
	}

	// 회원 전체 목록
	public List<MemberVO> MemberList() {
		List<MemberVO> mList = new ArrayList<MemberVO>();
		String sql = "select * from member order by id desc";

		try {
			conn = dbm.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			MemberVO mvo = null;

			while (rs.next()) {
				mvo = new MemberVO();
				mvo.setId(rs.getInt("id"));
				mvo.setName(rs.getString("name"));
				mvo.setAddr(rs.getString("addr"));
				mvo.setNation(rs.getString("nation"));
				mvo.setEmail(rs.getString("email"));
				mvo.setAge(rs.getInt("age"));
				mvo.setRegdate(rs.getString("regdate"));

				mList.add(mvo);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

		return mList;
	}

	// ID로 검색
	public List<MemberVO> MemberSearch(int id) {
		List<MemberVO> mList = new ArrayList<MemberVO>();
		String sql = "select * from member ";
		sql += "where id =? ";
		sql += "order by id desc";

		try {
			conn = dbm.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			MemberVO mvo = null;

			while (rs.next()) {
				mvo = new MemberVO();
				mvo.setId(rs.getInt("id"));
				mvo.setName(rs.getString("name"));
				mvo.setAddr(rs.getString("addr"));
				mvo.setNation(rs.getString("nation"));
				mvo.setEmail(rs.getString("email"));
				mvo.setAge(rs.getInt("age"));
				mvo.setRegdate(rs.getString("regdate"));

				mList.add(mvo);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

		return mList;
	}

	// 이름으로 검색
	public List<MemberVO> MemberSearch(String name) {
		List<MemberVO> mList = new ArrayList<MemberVO>();
		String sql = "select * from member ";
		sql += "where name =? ";
		sql += "order by id desc";

		try {
			conn = dbm.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			MemberVO mvo = null;

			while (rs.next()) {
				mvo = new MemberVO();
				mvo.setId(rs.getInt("id"));
				mvo.setName(rs.getString("name"));
				mvo.setAddr(rs.getString("addr"));
				mvo.setNation(rs.getString("nation"));
				mvo.setEmail(rs.getString("email"));
				mvo.setAge(rs.getInt("age"));
				mvo.setRegdate(rs.getString("regdate"));

				mList.add(mvo);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

		return mList;
	}

	// close all
	private void closeAll() {
		try {
			if (conn != null)
				conn.close();
			if (pstmt != null)
				pstmt.close();
			if (rs != null)
				rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
