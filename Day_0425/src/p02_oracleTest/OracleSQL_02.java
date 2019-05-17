package p02_oracleTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleSQL_02 {

	public static void main(String[] args) {

		String myDriver = "oracle.jdbc.driver.OracleDriver"; // JAR ���� ��� ���Ȯ��
		String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
		String myID = "scott"; // ���̵�
		String myPass = "123123"; // ��й�ȣ

		// DB ����
		Connection myConn = null; // Ŀ�ؼ� ����
		Statement stmt = null; // sql�� ���� ����. 1ȸ��
		//PreparedStatement pstmt = null; // sql �� ���� ����. ���� ����. �̰��� �� ���� ��
		ResultSet re = null; // rscroeSet ����

		try {

			Class.forName(myDriver);
			myConn = DriverManager.getConnection(myURL, myID, myPass);
			System.out.println("successfully connected");

			String sql = "select * from dept";
			stmt = myConn.createStatement();
			// executeQuery : select // return : resultSet
			// executeUpdate : insert update delete return : int(����1 ���� 0)
			re = stmt.executeQuery(sql);
			
			
			if(re != null) {
				while(re.next()) {
				System.out.print(re.getInt(1) + "\t");
				System.out.print(re.getString(2) + "\t\t");
				System.out.print(re.getString(3) + "\t");
				
				System.out.println();
				// ���� ����
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
				System.out.println("������ �����մϴ�");
			}
			System.out.println("�ý����� �����մϴ�");
		}

	}

}
