package p01_DBConn_singleton.main;

import java.util.Scanner;

import p01_DBConn_singleton.dao.DeptDAO;
import p01_DBConn_singleton.oracle.vo.DepartmentVO;

public class DeptMain {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		System.out.println("�μ���ȣ �Է� : ");
		int dno = scan.nextInt();

		DeptDAO dept = new DeptDAO();
		DepartmentVO dvo = dept.deptSelect(dno);

		if (dvo != null)
			System.out.println(dvo);
		else
			System.out.println("�ش� �μ��� �������� �ʽ��ϴ�");

		scan.close();
	}

}
