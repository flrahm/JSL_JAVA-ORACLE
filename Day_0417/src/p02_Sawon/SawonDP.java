package p02_Sawon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SawonDP {

	String fileName;
	List<Sawon> sList = new ArrayList<Sawon>();

	public SawonDP() {
	}

	void printByDepartment(int departmentCode) {

		System.out.println("부서코드 " + departmentCode + " 에 해당하는 사원들을 출력합니다");
		printTitle();
		for (int i = 0; i < sList.size(); i++) {

			if (departmentCode == sList.get(i).getDepartmentCode())
				System.out.println(sList.get(i));

		}

		System.out.println();
	}

	void selectSawon(String name) {

		System.out.println(name + " 의 이름을 가진 사원을 찾습니다");
		printTitle();
		Sawon temp = null;
		for (int i = 0; i < sList.size(); i++) {
			if (name.equals(sList.get(i).getName())) {
				temp = sList.get(i);
				break;
			}
		}

		if (temp == null)
			System.out.println("해당 이름을 가진 사원이 없습니다");
		else
			System.out.println(temp);
		System.out.println();
	}

	void selectSawon(int sabun) {
		
		System.out.println(sabun + " 의 사번을 가진 사원을 찾습니다");
		printTitle();
		Sawon temp = null;
		for (int i = 0; i < sList.size(); i++) {
			if (sabun == sList.get(i).getSabun()) {
				temp = sList.get(i);
				break;
			}
		}

		if (temp == null)
			System.out.println("해당 이름을 가진 사원이 없습니다");
		else
			System.out.println(temp);
		
		System.out.println();

	}

	void printList() {
		System.out.println("전체 사원 목록을 출력합니다");
		printTitle();
		for (int i = 0; i < sList.size(); i++)
			System.out.println(sList.get(i));
		System.out.println();
	}

	private void printTitle() {
		System.out.println("부서\t사번\t이름\t월급");
	}
	
	void readFile(String fileName) {

		try {
			Scanner scan = new Scanner(new File(fileName));
			while (scan.hasNext()) {
				String[] str = scan.next().split(",");

				int sabun = Integer.parseInt(str[0]);
				int departmentCode = (int) (str[0].charAt(0) - '1' + 1);
				String name = str[1];
				int pay = Integer.parseInt(str[2]);

				boolean flag = sList.add(new Sawon(sabun, departmentCode, name, pay));
				if (flag)
					System.out.println(sList.size() + " 번 째 사원이 정상적으로 등록되었습니다");
			}

			System.out.println();
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		}

	}

}
