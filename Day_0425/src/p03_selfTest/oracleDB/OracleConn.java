package p03_selfTest.oracleDB;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class OracleConn {
	private String myDriver = "oracle.jdbc.driver.OracleDriver"; // JAR ���� ��� ���Ȯ��
	private String myURL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String myID = "scott"; // ���̵�
	private String myPass = "123123"; // ��й�ȣ
	
	// ��������� ��� �ȵ�
	
	
	
	protected Connection myConn;	// Ŀ�ؼ� ��ü
	
	public OracleConn() {}	// ����Ʈ ������
	
	public void makeConn() throws Exception{	// Ŀ��Ʈ
		Class.forName(myDriver);
		myConn = DriverManager.getConnection(myURL , myID , myPass);	
		System.out.println("���� ����");
	}
	
	public abstract void cleanUp() throws Exception;
	
	public void takeDown() throws Exception{
		cleanUp();
		myConn.close();
		System.out.println("������ �����մϴ�");
	}
}
