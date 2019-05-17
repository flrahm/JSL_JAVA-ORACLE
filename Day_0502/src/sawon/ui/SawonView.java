package sawon.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sawon.dao.SawonDAO;
import sawon.vo.DeptVO;
import sawon.vo.SawonVO;

public class SawonView {

	SawonDAO sDao = new SawonDAO();
	Scanner scan = new Scanner(System.in);
	List<DeptVO> dList = sDao.selectAllDepartment();
	// 부서 리스트 반환

	// 숫자를 입력받는 메소드
	public String inputNum() {
		String returnStr = null;
		boolean flag = true;
		while (flag) {
			String inStr = scan.nextLine();
			if (!inStr.equals("")) {
				for (int i = 0; i < inStr.length(); i++) {
					if (!(inStr.charAt(i) >= '0' && inStr.charAt(i) <= '9')) {
						System.out.println("잘못된 입력입니다. 숫자 또는 빈칸을 입력하세요");
						break;
					}

					if (i == inStr.length() - 1) {
						returnStr = inStr;
						flag = false;
					}
				}

			} else {
				returnStr = null;
				flag = false;
			}
		}

		return returnStr;
	}

	// 날짜를 입력받는 메소드
	public String inputHireDate() {
		LocalDate myDate = null;
		LocalDate nowDate = LocalDate.now();
		String hireDate = "";
		String inputStr;
		int year;
		int month;
		int day;

		while (true) {
			inputStr = scan.nextLine();
			if (!inputStr.equals("")) { // 빈칸입력이 아니면
				try {
					String[] input = inputStr.split("/");
					year = Integer.parseInt(input[0]);
					month = Integer.parseInt(input[1]);
					day = Integer.parseInt(input[2]);
					myDate = LocalDate.of(year, month, day);
					hireDate = "" + myDate.getYear() + "/" + myDate.getMonthValue() + "/" + myDate.getDayOfMonth();
					break;
				} catch (Exception e) {
					System.out.println("잘못된 형식의 입력입니다");
				}
			} else {
				hireDate = "" + nowDate.getYear() + "/" + nowDate.getMonthValue() + "/" + nowDate.getDayOfMonth();
				break;
			}
		}

		return hireDate;
	}

	// 5. 이름으로 검색 후 삭제
	public void deleteByName_05() {
		System.out.println("\t\t** 사원 정보 삭제 **");

		System.out.println("삭제할 사원을 입력하세요 : ");
		// 이름 입력
		String name;
		int deleteOk = 0;
		while (true) {
			name = scan.nextLine();
			if (name.equals(""))
				System.out.println("이름을 입력하세요");
			else
				break;
		}
		//
		List<SawonVO> sList = sDao.selectByName(name);

		if (sList.size() > 0) {
			for (int i = 0; i < sList.size(); i++) {
				sDao.findManager(sList.get(i));
				SawonPrint.printSVO(sList.get(i));
			}

			System.out.println("삭제하시겠습니까 [Y]");
			String check = scan.nextLine();
			if (check.equalsIgnoreCase("y")) {
				deleteOk = sDao.deleteByName(sList.get(0));
				if (deleteOk != 0)
					System.out.println("삭제 완료");
				else
					System.out.println("삭제 실패");
			}
		} else
			System.out.println("해당 이름에 맞는 사원이 없습니다");

	}

	// 4. 업데이트
	public void updateByName_04() {
		System.out.println("\t\t** 사원 정보 갱신 **");
		System.out.println("수정할 사원의 번호를 입력하세요 : ");
		String eno = inputNum();
		SawonVO svo = sDao.selectByEno(eno);
		int updateOk = 0;
		if (svo != null) {
			System.out.println("사원번호\t: " + svo.getEno());
			System.out.print("사원이름(" + svo.getEname() + "): ");
			String name = scan.nextLine();
			if (name.equals(""))
				name = svo.getEname();

			if (svo.getJob() != null)
				System.out.print("업무명(" + svo.getJob() + "): ");
			else
				System.out.print("업무명(" + "없음" + "): ");

			String job = scan.nextLine();
			if (job.equals(""))
				job = svo.getJob();

			if (svo.getManager() != -1)
				System.out.print("상사번호(" + svo.getManager() + "): ");
			else
				System.out.print("상사번호(" + "없음" + "): ");

			String manager = inputNum();
			if (manager == null)
				manager = "" + svo.getManager();

			System.out.print("입사일자(" + svo.getHireDate() + "): ");
			String hireDate = inputHireDate();
			if (hireDate.equals("")) {
				String[] dStr = svo.getHireDate().split("-");
				hireDate = dStr[0] + dStr[1] + dStr[2];
			}
			System.out.print("급여(" + svo.getSalary() + "): ");
			String salary = inputNum();
			if (salary == null)
				salary = "" + svo.getSalary();

			if (svo.getCommission() != -1)
				System.out.print("커미션(" + svo.getCommission() + "): ");
			else
				System.out.print("커미션(" + "없음" + "): ");
			String commission = inputNum();
			if (commission == null)
				commission = "" + svo.getCommission();

			System.out.print("부서정보");
			SawonPrint.printDnoList(dList);
			System.out.println();
			System.out.print("부서번호(" + svo.getDno() + "): ");
			String dno = "10";
			boolean flag = true;
			while (flag) {/////
				dno = inputNum();
				if (dno != null) {
					for (int i = 0; i < dList.size(); i++) {
						if (Integer.parseInt(dno) == dList.get(i).getDno()) {
							flag = false;
							break;
						}

						if (i == dList.size() - 1)
							System.out.println("부서번호 목록에 있는 값을 입력하세요");
					}
				} else
					System.out.println("값을 입력하세요");
			} /////

			System.out.println("수정하시겠습니까? [y]");
			String check = scan.nextLine();
			if (check.equalsIgnoreCase("y")) {
				updateOk = sDao.updateSawon(name, job, manager, hireDate, salary, commission, dno, svo.getEno());
				if (updateOk != 0)
					System.out.println("업데이트 성공");
				else
					System.out.println("업데이트 실패");
			} else
				System.out.println("수정을 취소합니다");
		} else
			System.out.println("해당 번호를 가진 사원이 없습니다");

	}

	// 3. 이름으로 사원 검색
	public void selectByName_03() {

		System.out.println("\t\t** 사원 정보 검색 **");
		while (true) {
			System.out.println("검색할 사원을 입력하세요 : ");
			// 이름 입력
			String name;
			while (true) {
				name = scan.nextLine();
				if (name.equals(""))
					System.out.println("이름을 입력하세요");
				else
					break;
			}
			//
			List<SawonVO> sList = sDao.selectByName(name);

			if (sList.size() > 0) {
				for (int i = 0; i < sList.size(); i++) {
					sDao.findManager(sList.get(i));
					SawonPrint.printSVO(sList.get(i));
				}
			} else
				System.out.println("해당 이름에 맞는 사원이 없습니다");

			System.out.println("계속 검색하시겠습니까 [Y]");
			String check = scan.nextLine();
			if (!check.equalsIgnoreCase("y"))
				break;
		}
	}

	// 2. 신규 사원등록
	public void insertNewSawon_02() {
		System.out.println("\t\t** 신규 사원 등록 **");
		// 사원이름
		String ename;
		System.out.print("사원이름	\t: ");
		while (true) {
			ename = scan.nextLine();
			if (!ename.equals("")) {
				if (ename.length() <= 10)
					break;
				else
					System.out.println("10자 이내로 입력하세요");
			} else
				System.out.println("이름은 필수 입력입니다");
		}
		// 업무명
		System.out.print("업무명\t: ");
		String job = scan.nextLine();
		if (job.equals(""))
			job = null;
		// 상사번호
		System.out.println("상사번호\t: ");
		String manager = inputNum();
		// 입사일자
		System.out.print("입사일자 (" + LocalDate.now() + ") : ");
		String hireDate = inputHireDate();
		// 급여
		System.out.println("급여\t: ");
		String pay = inputNum();

		// 커미션
		System.out.println("커미션\t: ");
		String commission = inputNum();
		// 부서번호

		System.out.print("부서번호");
		SawonPrint.printDnoList(dList);
		System.out.println(" : ");
		String dno = "10";
		boolean flag = true;

		while (flag) {
			dno = inputNum();
			if (dno != null) {
				for (int i = 0; i < dList.size(); i++) {
					if (Integer.parseInt(dno) == dList.get(i).getDno()) {
						flag = false;
						break;
					}

					if (i == dList.size() - 1)
						System.out.println("부서번호 목록에 있는 값을 입력하세요");
				}
			} else
				System.out.println("값을 입력하세요");
		}

		///////////////////////////////////
		System.out.println("등록하시겠습니까? [y]");
		String check = scan.nextLine();

		if (check.equalsIgnoreCase("y")) {
			int insertOk = sDao.insertNewSawon(ename, job, manager, hireDate, pay, commission, dno);
			if (insertOk != 0)
				System.out.println("등록 성공");
			else
				System.out.println("등록 실패");
		} else
			System.out.println("등록이 취소되었습니다");
	}

	// 1.사원 전체 목록 출력
	public void selectAllSawon_01() {
		System.out.println("\t\t** 사원 전체 목록 **");
		List<SawonVO> sList = new ArrayList<SawonVO>();
		sList = sDao.selectAllSawon();
		if (sList.size() > 0)
			SawonPrint.printSList(sList);
		else
			System.out.println("사원 리스트가 비어있습니다");

		System.out.println("메인 메뉴로 이동합니다 [enter]");
		String check;
		while (true) {
			check = scan.nextLine();
			if (check.equals(""))
				break;
		}

	}

}
