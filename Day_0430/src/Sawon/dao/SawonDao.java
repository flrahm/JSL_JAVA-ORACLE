package Sawon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Sawon.Connect.DBManager;
import Sawon.vo.SawonVO;

public class SawonDao {

	DBManager manager = DBManager.getInstance();

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	
	// 3. 수정
	public int sawonUpdate(SawonVO sawon) throws Exception {
		String query = "update sawon set tel =? , pay = " + sawon.getPay() + " where sno = " + sawon.getSno();
		int updateOK = 0;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, sawon.getTel());
			updateOK = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conn != null)
				conn.close();
			if (pstmt != null)
				pstmt.close();
			if (rs != null)
				rs.close();
		}

		return updateOK;
	}
	
	// 4. 삭제
	public int sawonDelete(SawonVO sawon) throws Exception {
		String query = "delete sawon where sno = " + sawon.getSno();
		int deleteOK = 0;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			deleteOK = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conn != null)
				conn.close();
			if (pstmt != null)
				pstmt.close();
			if (rs != null)
				rs.close();
		}

		return deleteOK;
	}
	
	
	// 5. 검색
	public SawonVO select(int sw, String str) throws Exception {
		String query = "select * from Sawon where ";

		if (sw == 1) {
			query += "sno = " + str;
		} else {
			query += "name =" + "'" + str + "'";
		}

		SawonVO sa = new SawonVO();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);

			rs = pstmt.executeQuery();


				if(rs.next()) {
					sa.setSno(rs.getInt(1));
					sa.setName(rs.getString(2));
					sa.setTel(rs.getString(3));
					sa.setPay(rs.getInt(4));
					sa.setIndate(rs.getString(5));
					return sa;
				}
			else
				return null;

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conn != null)
				conn.close();
			if (pstmt != null)
				pstmt.close();
			if (rs != null)
				rs.close();
		}

		return sa;
	}

	// 1. 리스트 출력
	public List<SawonVO> selectAll() throws Exception {
		String query = "select * from Sawon";
		List<SawonVO> sList = new ArrayList<SawonVO>();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				SawonVO sa = new SawonVO();
				sa.setSno(rs.getInt(1));
				sa.setName(rs.getString(2));
				sa.setTel(rs.getString(3));
				sa.setPay(rs.getInt(4));
				sa.setIndate(rs.getString(5));
				sList.add(sa);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conn != null)
				conn.close();
			if (pstmt != null)
				pstmt.close();
			if (rs != null)
				rs.close();
		}

		return sList;
	}

	// 2. 정보 등록
	public int sawonInsert(SawonVO sawon) throws Exception {
		String query = "insert into SAWON values(?,?,?,?,sysdate)";
		int InsertOK = 0;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, sawon.getSno());
			pstmt.setString(2, sawon.getName());
			pstmt.setString(3, sawon.getTel());
			pstmt.setInt(4, sawon.getPay());

			InsertOK = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (conn != null)
				conn.close();
			if (pstmt != null)
				pstmt.close();
			if (rs != null)
				rs.close();
		}

		return InsertOK;
	}

}
