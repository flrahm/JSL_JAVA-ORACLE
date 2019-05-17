package customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import customer.vo.CustomerVO;
import zipcode.db.DBManager;

public class CustomerDAO {

	DBManager manager = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 1.고객 전체 목록 리스트로 전달
	public List<CustomerVO> selectAllCustomer() {
		List<CustomerVO> cList = new ArrayList<CustomerVO>();
		String sql = "select * from customer";

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {

				CustomerVO cvo = new CustomerVO();
				cvo.setNum(rs.getInt("num"));
				cvo.setName(rs.getString("name"));
				cvo.setTel(rs.getString("tel"));
				cvo.setAddr(rs.getString("addr"));
				cvo.setOffice(rs.getString("office"));

				if (rs.getString("birthday") != null)
					cvo.setBirthDay(rs.getString("birthday").substring(0, 11));
				else
					cvo.setBirthDay("\t");

				cvo.setGender(rs.getString("gender"));
				cvo.setIndate(rs.getString("indate").substring(0, 11));
				cList.add(cvo);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
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

		return cList;
	}

	// 2. 신규 고객 등록
	public int insertNewCustomer(CustomerVO cvo) {
		String sql = "insert into customer(num,name,tel,addr,office,birthday,gender)";
		sql += "values(customer_seq.nextval,?,?,?,?,?,?)";
		int insertOK = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cvo.getName());
			pstmt.setString(2, cvo.getTel());
			pstmt.setString(3, cvo.getAddr());
			pstmt.setString(4, cvo.getOffice());
			pstmt.setString(5, cvo.getBirthDay());
			pstmt.setString(6, cvo.getGender());

			insertOK = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
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

		return insertOK;
	}

	// 3. 이름으로 고객 검색
	public CustomerVO selectByName(String name) {
		CustomerVO cvo = null;
		String sql = "select * from customer where name = ?";

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {

				cvo = new CustomerVO();
				cvo.setNum(rs.getInt("num"));
				cvo.setName(rs.getString("name"));
				cvo.setTel(rs.getString("tel"));
				cvo.setAddr(rs.getString("addr"));
				cvo.setOffice(rs.getString("office"));
				cvo.setBirthDay(rs.getString("birthday").substring(0, 11));
				cvo.setGender(rs.getString("gender"));
				cvo.setIndate(rs.getString("indate").substring(0, 11));

			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
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

		return cvo;
	}
	
	// 번호로 고객 검색
	public CustomerVO selectByNum(int num) {
		CustomerVO cvo = null;
		String sql = "select * from customer where num = " + num;

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				cvo = new CustomerVO();
				cvo.setNum(rs.getInt("num"));
				cvo.setName(rs.getString("name"));
				cvo.setTel(rs.getString("tel"));
				cvo.setAddr(rs.getString("addr"));
				cvo.setOffice(rs.getString("office"));
				cvo.setBirthDay(rs.getString("birthday").substring(0, 11));
				cvo.setGender(rs.getString("gender"));
				cvo.setIndate(rs.getString("indate").substring(0, 11));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
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

		return cvo;
	}
	
	// 4. 고객 정보 변경
	public int updateByNum(CustomerVO cvo) {
		String sql = "update customer set tel = ?, addr = ? where num =" + cvo.getNum();
		int updateOK = 0;
		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cvo.getTel());
			pstmt.setString(2, cvo.getAddr());
			updateOK = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
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

		return updateOK;
	}

	// 5. 고객 정보 삭제
	public int deleteByNum(CustomerVO cvo) {
		
			String sql = "delete customer where num =" + cvo.getNum();
			int deleteOK = 0;
			try {
				conn = manager.getConnection();
				pstmt = conn.prepareStatement(sql);
				deleteOK = pstmt.executeUpdate();
			} catch (Exception e) {
				System.out.println(e);
			} finally {
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

			return deleteOK;
		}
	
}
