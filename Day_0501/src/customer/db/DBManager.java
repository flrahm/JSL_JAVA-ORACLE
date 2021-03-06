package customer.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
private DBManager() {}	// 생성자가 private. 외부에서 호출 불가능
	
	
	// singleton 
	private static DBManager instance = new DBManager();	// 자기 자신을 이용해서 객체 생성
	public static DBManager getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception{
		Connection myConn = null;
		String myDriver = "oracle.jdbc.driver.OracleDriver"; 
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "hr"; // 아이디
		String myPass = "123123"; // 비밀번호
		
		try {
			Class.forName(myDriver);
			//System.out.println("드라이버 로딩 성공");
		}catch(Exception e) {
			System.out.println("연결 실패");
			System.out.println(e);
		}
		try {
			myConn = DriverManager.getConnection(myURL,myID,myPass);
		//	System.out.println(myID + "로 커넥션 성공");
		}catch(Exception e) {
			System.out.println("커넥션 실패");
			System.out.println(e);
		}
		
		return myConn;
	}
}
