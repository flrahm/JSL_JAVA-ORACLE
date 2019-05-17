package p01_DBconnectTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnTest {

	public static void main(String[] args) {

		/* 드라이버 로딩 */

		// 기본적으로 필요한 변수들
		String myDriver = "oracle.jdbc.driver.OracleDriver"; // JAR 파일 열어서 경로확인
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "scott"; // 아이디
		String myPass = "123123"; // 비밀번호

		// JDBC 드라이버 로딩
		try {
			Class.forName(myDriver);
			System.out.println("driver loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("file not found");
		}
		
		// DB 연결 
		Connection myConn = null;
		try {
			myConn = DriverManager.getConnection(myURL,myID,myPass);
			System.out.println("successfully connected");
			myConn.close();
		} catch(SQLException e) {
			System.out.println("Connection Failed");
		}
		
		

	}

}
