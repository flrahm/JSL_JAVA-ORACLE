package p03_selfTest.oracleDB;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class OracleConn {
	private String myDriver = "oracle.jdbc.driver.OracleDriver"; // JAR 파일 열어서 경로확인
	private String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String myID = "scott"; // 아이디
	private String myPass = "123123"; // 비밀번호
	
	// 여기까지는 상속 안됨
	
	
	
	protected Connection myConn;	// 커넥션 개체
	
	public OracleConn() {}	// 디폴트 생성자
	
	public void makeConn() throws Exception{	// 커넥트
		Class.forName(myDriver);
		myConn = DriverManager.getConnection(myURL , myID , myPass);	
		System.out.println("연결 성공");
	}
	
	public abstract void cleanUp() throws Exception;
	
	public void takeDown() throws Exception{
		cleanUp();
		myConn.close();
		System.out.println("연결을 종료합니다");
	}
}
