package Sawon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Sawon.db.DBManager;
import Sawon.vo.DeptVO;
import Sawon.vo.SawonVO;

public class SawonDAO {

	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 삭제...5
	public int deleteByEno(int eno) {
		String sql = "delete sawon where eno = " + eno;
		int deleteOK = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			deleteOK = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}
		return deleteOK;

	}

	// 매니저 이름 찾기
	public void searchMname(SawonVO svo) {
		String sql = "select s2.ename";
		sql += " from sawon s1, sawon s2";
		sql += " where s1.manager = s2.eno";
		sql += " and s1.ename = ?";

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, svo.getEname());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				svo.setMname(rs.getString(1));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

	}

	// 이름으로 사원 검색...3
	public List<SawonVO> selectByName(String name) {
		List<SawonVO> sList = new ArrayList<SawonVO>();

		String sql = "select s.eno,s.ename,s.job,s.manager,s.hiredate,s.salary,s.commission,s.dno,d.dname";
		sql += " from  sawon s, department d";
		sql += " where s.dno = d.dno";
		sql += " and s.ename = ?";

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				SawonVO svo = new SawonVO();
				svo.setEno(rs.getInt(1));
				svo.setEname(rs.getString(2));
				svo.setJob(rs.getString(3));
				//
				if (rs.getString(4) != null)
					svo.setManager(rs.getInt(4));
				else
					svo.setManager(-1);
				//
				if (rs.getString(5) != null)
					svo.setHireDate(rs.getString(5).substring(0, 11));

				svo.setSalary(rs.getInt(6));

				// 커미션
				if (rs.getString(7) != null)
					svo.setCommission(rs.getInt(7));
				else
					svo.setCommission(-1);
				//
				svo.setDno(rs.getInt(8));
				svo.setDname(rs.getString(9));

				sList.add(svo);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

		return sList;

	}

	// 사원번호로 사원 검색
	public List<SawonVO> selectByEno(int eno) {
		SawonVO svo = null;
		List<SawonVO> sList = new ArrayList<SawonVO>();
		String sql = "select * from sawon where eno = " + eno;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				svo = new SawonVO();
				svo.setEno(rs.getInt(1));
				svo.setEname(rs.getString(2));
				svo.setJob(rs.getString(3));
				//
				if (rs.getString(4) != null)
					svo.setManager(rs.getInt(4));
				else
					svo.setManager(-1);
				//
				if (rs.getString(5) != null)
					svo.setHireDate(rs.getString(5).substring(0, 11));

				svo.setSalary(rs.getInt(6));

				// 커미션
				if (rs.getString(7) != null)
					svo.setCommission(rs.getInt(7));
				else
					svo.setCommission(-1);
				//
				svo.setDno(rs.getInt(8));
				sList.add(svo);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

		return sList;

	}

	// 전체 사원 목록 출력 ..1
	public List<SawonVO> selectAllSawon() {
		List<SawonVO> sList = new ArrayList<SawonVO>();

		String sql = "select eno,ename,job,manager,hiredate,salary,commission,s.dno,d.dname";
		sql += " from  sawon s, department d ";
		sql += " where s.dno = d.dno";
		sql += " order by eno";

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				SawonVO svo = new SawonVO();
				svo.setEno(rs.getInt("eno"));
				svo.setEname(rs.getString("ename"));
				svo.setJob(rs.getString("job"));
				//
				if (rs.getString("manager") != null)
					svo.setManager(rs.getInt("manager"));
				else
					svo.setManager(-1);
				//
				if (rs.getString("hiredate") != null)
					svo.setHireDate(rs.getString("hiredate").substring(0, 11));
				svo.setSalary(rs.getInt("salary"));

				// 커미션
				if (rs.getString("commission") != null)
					svo.setCommission(rs.getInt("commission"));
				else
					svo.setCommission(-1);
				//
				svo.setDno(rs.getInt("dno"));
				svo.setDname(rs.getString("dname"));
				sList.add(svo);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

		return sList;
	}

	// 부서 리스트 반환
	public List<DeptVO> selectAllDepartment() {
		List<DeptVO> dList = new ArrayList<DeptVO>();

		String sql = "select * from department";

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				DeptVO dvo = new DeptVO();
				dvo.setDno(rs.getInt("dno"));
				dvo.setDname(rs.getString("dname"));
				dvo.setLoc(rs.getString("loc"));
				dList.add(dvo);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

		return dList;
	}

	// 업데이트 ...4
	public int updateSawon(SawonVO svo) {
		int updateOk = 0;
		String sql = "update sawon ";
		sql += "set ename = ?, job = ?, manager = ?, hiredate = ?, salary = ?, commission = ? , dno =?  ";
		sql += "where eno = " + svo.getEno();

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, svo.getEname());
			pstmt.setString(2, svo.getJob());
			/////
			if (svo.getManager() == -1)
				pstmt.setString(3, null);
			else
				pstmt.setInt(3, svo.getManager());
			/////
			pstmt.setString(4, svo.getHireDate());

			pstmt.setInt(5, svo.getSalary());

			if (svo.getCommission() == -1)
				pstmt.setString(6, null);
			else
				pstmt.setInt(6, svo.getCommission());

			pstmt.setInt(7, svo.getDno());

			updateOk = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

		return updateOk;
	}

	// 신규 사원 등록 ..2
	public int insertNewSawon(SawonVO svo) {
		String sql = "insert into sawon(eno,ename,job,manager,salary,commission,dno,hiredate) ";
		sql += "values(sawon_eno_seq.nextval,?,?,?,?,?,?,?)";
		int insertOK = 0;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, svo.getEname());
			pstmt.setString(2, svo.getJob());
			/////
			if (svo.getManager() == -1)
				pstmt.setString(3, null);
			else
				pstmt.setInt(3, svo.getManager());
			/////

			pstmt.setInt(4, svo.getSalary());

			if (svo.getCommission() == -1)
				pstmt.setString(5, null);
			else
				pstmt.setInt(5, svo.getCommission());

			pstmt.setInt(6, svo.getDno());
			pstmt.setString(7, svo.getHireDate());

			insertOK = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

		return insertOK;
	}

	private void closeAll() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
