package p02_oracleTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OracleSQL_01 {

	public static void main(String[] args) {

		String myDriver = "oracle.jdbc.driver.OracleDriver"; // JAR ���� ��� ���Ȯ��
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "scott"; // ���̵�
		String myPass = "123123"; // ��й�ȣ

		// DB ����
		Connection myConn = null; // Ŀ�ؼ� ����
		Statement stmt = null; // sql�� ���� ����. 1ȸ��
		// PreparedStatement pstmt = null; // sql �� ���� ����. ���� ����. �̰��� �� ���� ��
		//ResultSet re = null; // rscroeSet ����

		try {

			Class.forName(myDriver);
			myConn = DriverManager.getConnection(myURL, myID, myPass);
			System.out.println("successfully connected");

			String sql = " insert into dept values(71,'123','11') ";
			stmt = myConn.createStatement();
			// executeQuery : select // return : resultSet
			// executeUpdate : insert update delete return : int(����1 ���� 0)
			stmt.executeQuery(sql);
			

		} catch (Exception e) {
			System.out.println("connection failed");
			// e.getStackTrace();
			System.out.println(e);
		} finally {
			try {
				stmt.close();
				myConn.close();
			} catch (Exception e) {
				System.out.println("������ �����մϴ�");
			}
			System.out.println("�ý����� �����մϴ�");
		}

	}

}
