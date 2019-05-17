package Sawon.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import Sawon.vo.DeptVO;
import Sawon.vo.SawonVO;


public class SawonView {


	
	
	// 작업 실행 확인
	public boolean insureWork(String work, Scanner scan) {
		System.out.println(work + " 하시겠습니까? [y/n]");
		
		while (true) {
			String choice = scan.nextLine();
			if (choice.equalsIgnoreCase("y"))
				return true;
			else if (choice.equalsIgnoreCase("n")) {
				System.out.println(work + "이(가) 취소되었습니다");
				return false;
			}
			else
				System.out.println("잘못된 입력입니다");
		}
	}

	// 쿼리문 실행 결과
	public void printOk(String work, int workOk) {
		if (workOk != 0)
			System.out.println(work + " 성공");
		else
			System.out.println(work + " 실패");
	}

	// 사원 번호 입력받기
	public int getEno(Scanner scan) {
		System.out.println("사원 번호를 입력하세요");
		System.out.println("사원 번호 : ");
		String eno = IO.inputNum(scan,4);
		return Integer.parseInt(eno);
	}
	
	// 사원 이름으로 검색 입력
	public String getName(Scanner scan) {
		System.out.println("검색할 사원 이름을 입력하세요 ");
		System.out.print("사원이름	\t: ");
		String ename;
		while (true) {
			ename = IO.inputStr(scan, 10);
			if (!ename.equals("")) {
				if (ename.length() <= 10)
					return ename;
				else
					System.out.println("10자 이내로 입력하세요");
			} else
				System.out.println("이름은 필수 입력입니다");
		}
	}

	// 업데이트할 사원 정보 입력
	public SawonVO updateSawonInput(Scanner scan, SawonVO svo,List<DeptVO> dList) {
		System.out.println("사원번호\t: " + svo.getEno());
		// 이름
		System.out.print("사원이름(" + svo.getEname() + "): ");
		String ename = IO.inputStr(scan, 10);
		if(!ename.equals(""))
			svo.setEname(ename);
		
		//업무명
		if (svo.getJob() != null)
			System.out.print("업무명(" + svo.getJob() + "): ");
		else
			System.out.print("업무명(" + "없음" + "): ");
		String job = IO.inputStr(scan, 9);
		if(!job.equals(""))
			svo.setJob(job);
		
		// 상사 번호
		if (svo.getManager() != -1)
			System.out.print("상사번호(" + svo.getManager() + "): ");
		else
			System.out.print("상사번호(" + "없음" + "): ");
		String manager = IO.inputNum(scan,4);
		if (manager != null)
			svo.setManager(Integer.parseInt(manager));
		
		// 입사일자
		System.out.print("입사일자(" + svo.getHireDate() + "): ");
		String hireDate = IO.inputDate(3, scan);
		if(hireDate != null)
			svo.setHireDate(hireDate);
		
		// 급여
		System.out.print("급여(" + svo.getSalary() + "): ");
		String salary = IO.inputNum(scan,0);
		if(salary != null)
			svo.setSalary(Integer.parseInt(salary));
		
		// 커미션
		if (svo.getCommission() != -1)
			System.out.print("커미션(" + svo.getCommission() + "): ");
		else
			System.out.print("커미션(" + "없음" + "): ");
		String commission = IO.inputNum(scan,0);
		if(commission != null)
			svo.setCommission(Integer.parseInt(commission));
		
		// 부서번호
		System.out.print("부서정보");
		SawonPrint.printDnoList(dList);
		System.out.println();
		System.out.print("부서번호(" + svo.getDno() + "): ");
		String dno = "10";
		boolean flag = true;
		while (flag) {/////
			dno = IO.inputNum(scan,2);
			if (dno != null) {
				for (int i = 0; i < dList.size(); i++) {
					if (Integer.parseInt(dno) == dList.get(i).getDno()) {
						flag = false;
						svo.setDno(Integer.parseInt(dno));
						break;
					}

					if (i == dList.size() - 1)
						System.out.println("부서번호 목록에 있는 값을 입력하세요");
				}
			} else {
				break;
			}
				
		} /////
		
		return svo;
	
	}
	// 이름으로 검색한 사원 리스트 출력 ... 3
	public void printSawonList(List<SawonVO> sList) {
		System.out.println("** 사원 목록 **");
		if (sList.size() != 0) {
			for(int i = 0; i < sList.size(); i++)
				SawonPrint.printSVO(sList.get(i));
		}
		else
			System.out.println("등록된 사원이 없습니다");

	}
	
	// 사원 전체 리스트 출력 ... 1
	public void printAllSawonList(List<SawonVO> sList) {
		System.out.println("** 사원 목록 **");
		if (sList.size() != 0)
			SawonPrint.printSList(sList);
		else
			System.out.println("등록된 사원이 없습니다");

	}

	// 등록할 사원 정보 입력 ...2
	public SawonVO insertNewSawon(Scanner scan, List<DeptVO> dList) {
		System.out.println("** 신규 사원 등록 **");
		// 사원이름
		String ename;
		System.out.print("사원이름	\t: ");
		while (true) {
			ename = IO.inputStr(scan, 10);
			if (!ename.equals("")) {
				break;
			} else
				System.out.println("이름은 필수 입력입니다");
		}
		// 업무명
		System.out.print("업무명\t: ");
		String job = IO.inputStr(scan, 9);
		if (job.equals(""))
			job = null;
		// 상사번호
		System.out.println("상사번호\t: ");
		String manager = IO.inputNum(scan,4);
		// 입사일자
		System.out.print("입사일자 (" + LocalDate.now() + ") : ");
		String hireDate = IO.inputDate(1, scan);
		// 급여
		System.out.println("급여\t: ");
		String salary = IO.inputNum(scan,0);
		if(salary == null)
			salary = "0";
		// 커미션
		System.out.println("커미션\t: ");
		String commission = IO.inputNum(scan,0);
		// 부서번호

		System.out.print("부서번호");
		SawonPrint.printDnoList(dList);
		System.out.println(" : ");
		String dno = "10";
		boolean flag = true;

		while (flag) {
			dno = IO.inputNum(scan,2);
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
		SawonVO svo = new SawonVO();
		svo.setEname(ename);
		svo.setJob(job);
		if (manager != null)
			svo.setManager(Integer.parseInt(manager));
		else
			svo.setManager(-1);
		svo.setHireDate(hireDate);
		svo.setSalary(Integer.parseInt(salary));

		if (commission != null)
			svo.setCommission(Integer.parseInt(commission));
		else
			svo.setCommission(-1);

		svo.setDno(Integer.parseInt(dno));

		return svo;
	}

}
