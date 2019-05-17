package school.teacher.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import school.db.DBManager;
import school.db.IO;
import school.teacher.vo.TeacherVO;

public class TeacherDAO {

	IO io = new IO();	// ����¿� ���õ� �޼ҵ尡 ���ǵǾ�����
	DBManager dbm = DBManager.getInstance();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	TeacherNameSetting tns = new TeacherNameSetting();	// Į�� �̸��� ���õǾ��ִ� Ŭ����
	

	
	// �ű� ������ ���
	public int insertTeacher(String name, String tel, String part, String birthday, String regdate ) {
		int insertOk = 0;
		String sql = "insert into " + tns.tableName + " ";
		sql += "values(" + tns.tno_seq + ",?,?,?,?,?)";
		
		try {
			
			System.out.println(name);
			System.out.println(tel);
			System.out.println(part);
			System.out.println(birthday);
			System.out.println(regdate);
			
			conn = dbm.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			pstmt.setString(3, part);
			pstmt.setString(4, birthday);
			pstmt.setString(5, regdate);
			insertOk = pstmt.executeUpdate();
			
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			closeAll();
		}
		
		
		return insertOk;
	}
	
	// ��ü ������ ��� ...1
	public List<TeacherVO> selectAllTeacher() {
		List<TeacherVO> tList = new ArrayList<TeacherVO>();
		String sql = "select * from " + tns.tableName + " ";
		
		try {
			conn = dbm.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				TeacherVO tvo = new TeacherVO();
				tvo.setTno(rs.getInt(tns.tno));
				tvo.setName(rs.getString(tns.name));
				tvo.setPart(rs.getString(tns.part));
				tvo.setTel(rs.getString(tns.tel));
				tvo.setRegdate(io.getDateFromDB(rs.getString(tns.regdate)));
				tvo.setBirthday(io.getDateFromDB(rs.getString(tns.birthday)));
				tList.add(tvo);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			closeAll();
		}
		
		return tList;
	}
	
	
	// close all
	private void closeAll() {
		try {
		if(conn != null)
			conn.close();
		if(pstmt != null)
			pstmt.close();
		if(rs != null)
			rs.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
