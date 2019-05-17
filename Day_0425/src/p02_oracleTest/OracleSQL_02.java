package p02_oracleTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleSQL_02 {

	public static void main(String[] args) {

		String myDriver = "oracle.jdbc.driver.OracleDriver"; // JAR 파일 열어서 경로확인
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "scott"; // 아이디
		String myPass = "123123"; // 비밀번호

		// DB 연결
		Connection myConn = null; // 커넥션 정보
		Statement stmt = null; // sql문 정보 저장. 1회성
		//PreparedStatement pstmt = null; // sql 문 정보 저장. 재사용 가능. 이것을 더 많이 씀
		ResultSet re = null; // rscroeSet 정보

		try {

			Class.forName(myDriver);
			myConn = DriverManager.getConnection(myURL, myID, myPass);
			System.out.println("successfully connected");

			String sql = "select * from dept";
			stmt = myConn.createStatement();
			// executeQuery : select // return : resultSet
			// executeUpdate : insert update delete return : int(성공1 실패 0)
			re = stmt.executeQuery(sql);
			
			
			if(re != null) {
				while(re.next()) {
				System.out.print(re.getInt(1) + "\t");
				System.out.print(re.getString(2) + "\t\t");
				System.out.print(re.getString(3) + "\t");
				
				System.out.println();
				// 위와 같음
				System.out.print(re.getInt("deptno") + "\t");
				System.out.print(re.getString("dname") + "\t\t");
				System.out.print(re.getString("loc") + "\t");
				System.out.println();
				}
			}
			
			

		} catch (Exception e) {
			System.out.println("connection failed");
			// e.getStackTrace();
			System.out.println(e);
		} finally {
			try {
				stmt.close();
				myConn.close();
			} catch (Exception e) {
				System.out.println("연결을 종료합니다");
			}
			System.out.println("시스템을 종료합니다");
		}

	}

}
