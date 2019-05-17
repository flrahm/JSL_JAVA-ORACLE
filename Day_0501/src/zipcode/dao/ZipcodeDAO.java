package zipcode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import zipcode.db.DBManager;
import zipcode.vo.ZipcodeVO;

public class ZipcodeDAO {

	DBManager manager = DBManager.getInstance();
	Connection conn = null;

	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public List<ZipcodeVO> searchByDong(String dong) {

		List<ZipcodeVO> zipList = new ArrayList<ZipcodeVO>();

		String query = "select * from zipcode where dong like '%" + dong + "%'";

		try {
			conn = manager.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery(query);

			while (rs.next()) {
				ZipcodeVO zc = new ZipcodeVO();
				zc.setNo(rs.getString(1));
				zc.setZipcode(rs.getString(2));
				zc.setSiso(rs.getString(3));
				zc.setGugun(rs.getString(4));
				zc.setDong(rs.getString(5));
				zc.setBunji(rs.getString(6));

				zipList.add(zc);
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

		return zipList;
	}

}
