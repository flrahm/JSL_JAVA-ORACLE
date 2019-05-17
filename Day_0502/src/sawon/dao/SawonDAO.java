package sawon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sawon.db.DBManager;
import sawon.vo.DeptVO;
import sawon.vo.SawonVO;

public class SawonDAO {

	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 삭제...5
	public int deleteByName(SawonVO svo) {
		String sql = "delete sawon where ename = ?";
		int deleteOK = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, svo.getEname());
			deleteOK = pstmt.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}
		return deleteOK;

	}

	// 매니저 이름 찾기
	public void findManager(SawonVO svo) {
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
	public SawonVO selectByEno(String eno) {
		SawonVO svo = null;

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
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}

		return svo;

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
	public int updateSawon(String ename, String job, String managerStr, String hireDate, String pay,
			String commission, String dno, int eno) {
		int updateOk= 0;
		String sql = "update sawon ";
		sql += "set ename = ?, job = ?, manager = ?, hiredate = ?, salary = ?, commission = ? , dno =?  ";
		sql += "where eno = " + eno;
		
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ename);
			pstmt.setString(2, job);
			/////
			if (managerStr == null || managerStr == "-1")
				pstmt.setString(3, null);
			else
				pstmt.setInt(3, Integer.parseInt(managerStr));
			/////
			pstmt.setString(4, hireDate);
			
			
			if (pay == null)
				pstmt.setString(5, null);
			else
				pstmt.setInt(5, Integer.parseInt(pay));

			if (commission == null || commission == "-1")
				pstmt.setString(6, null);
			else
				pstmt.setInt(6, Integer.parseInt(commission));
			
			pstmt.setInt(7, Integer.parseInt(dno));

			updateOk = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeAll();
		}
		
		return updateOk;
	}
	
	// 신규 사원 등록 ..2
	public int insertNewSawon(String ename, String job, String managerStr, String hireDate, String pay,
			String commission, String dno) {
		String sql = "insert into sawon(eno,ename,job,manager,salary,commission,dno,hiredate) ";
		sql += "values(sawon_dno_seq.nextval,?,?,?,?,?,?,?)";
		int insertOK = 0;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ename);
			pstmt.setString(2, job);
			/////
			if (managerStr == null)
				pstmt.setString(3, null);
			else
				pstmt.setInt(3, Integer.parseInt(managerStr));
			/////
			if (pay == null)
				pstmt.setString(4, null);
			else
				pstmt.setInt(4, Integer.parseInt(pay));

			if (commission == null)
				pstmt.setString(5, null);
			else
				pstmt.setInt(5, Integer.parseInt(commission));

			pstmt.setInt(6, Integer.parseInt(dno));
			pstmt.setString(7, hireDate);

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
