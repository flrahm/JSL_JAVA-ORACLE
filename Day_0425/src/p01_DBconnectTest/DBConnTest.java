package p01_DBconnectTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnTest {

	public static void main(String[] args) {

		/* ����̹� �ε� */

		// �⺻������ �ʿ��� ������
		String myDriver = "oracle.jdbc.driver.OracleDriver"; // JAR ���� ��� ���Ȯ��
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "scott"; // ���̵�
		String myPass = "123123"; // ��й�ȣ

		// JDBC ����̹� �ε�
		try {
			Class.forName(myDriver);
			System.out.println("driver loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("file not found");
		}
		
		// DB ���� 
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
