package p01_DBConn_singleton.main;

import java.util.Scanner;

import p01_DBConn_singleton.dao.DeptDAO;
import p01_DBConn_singleton.oracle.vo.DepartmentVO;

public class DeptMain {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		System.out.println("부서번호 입력 : ");
		int dno = scan.nextInt();

		DeptDAO dept = new DeptDAO();
		DepartmentVO dvo = dept.deptSelect(dno);

		if (dvo != null)
			System.out.println(dvo);
		else
			System.out.println("해당 부서가 존재하지 않습니다");

		scan.close();
	}

}
