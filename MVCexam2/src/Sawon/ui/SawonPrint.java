package Sawon.ui;

import java.util.List;

import Sawon.vo.DeptVO;
import Sawon.vo.SawonVO;

public class SawonPrint {
	// 메인 출력
	public static void printMain() {
		System.out.println("==================================");
		System.out.println("=        사원 & 부서관리 프로그램            =");
		System.out.println("==================================");
		System.out.println("	[1] 사원 전체 목록");
		System.out.println("	[2] 신규 사원 등록");
		System.out.println("	[3] 사원 검색");
		System.out.println("	[4] 사원 정보 수정");
		System.out.println("	[5] 사원 정보 삭제");
		System.out.println("	[0] 프로그램 종료");
		System.out.println("----------------------------------");
		System.out.println("원하시는 항목을 선택하세요 : ");
	}

	// 리스트 출력
	public static void printSList(List<SawonVO> sList) {

		System.out.print("사원번호\t");
		System.out.print("이름\t");
		System.out.print("\t");
		System.out.print("업무명\t");
		System.out.print("\t");
		System.out.print("상사번호\t");
		System.out.print("입사일자\t");
		System.out.print("\t");
		System.out.print("급여\t");
		System.out.print("커미션\t");
		System.out.print("부서명\t");
		System.out.println();

		for (int i = 0; i < sList.size(); i++) {
			SawonVO cvo = sList.get(i);
			// 사번
			System.out.print(cvo.getEno() + "\t");
			// 이름
			System.out.print(cvo.getEname() + "\t");
			if(cvo.getEname().length() < 8)
				System.out.print("\t");
			// 업무명
			if (cvo.getJob() != null) {
				System.out.print(cvo.getJob() + "\t");
				if (cvo.getJob().length() < 8)
					System.out.print("\t");
			} else
				System.out.print("\t\t");

			// 상사번호
			if (cvo.getManager() != -1)
				System.out.print(cvo.getManager() + "\t");
			else
				System.out.print("\t");
			// 입사일자
			if(cvo.getHireDate() != null)
			System.out.print(cvo.getHireDate() + "\t");
			else
				System.out.print("\t\t");
			// 급여
			System.out.print(cvo.getSalary() + "\t");

			// 커미션
			if (cvo.getCommission() != -1)
				System.out.print(cvo.getCommission() + "\t");
			else
				System.out.print("\t");

			// 부서명
			System.out.println(cvo.getDname());

		}
	}

	// 부서 번호 목록 출력 (10,20,30,40)
	public static void printDnoList(List<DeptVO> dList) {
		System.out.print("(");
		for(int i = 0; i < dList.size() ; i++) {
			System.out.print(dList.get(i).getDno()+" " + dList.get(i).getDname());
			if(i != (dList.size()-1))
				System.out.print(" / ");
		}
		System.out.print(")");
	}
	
	// 사원 한명 출력
	public static void printSVO(SawonVO svo) {
		
		System.out.println("------------------------------");
		System.out.print("사원번호\t: ");
		System.out.print(svo.getEno());
		System.out.print("\t\t");
		System.out.print("사원이름\t: ");
		System.out.print(svo.getEname());
		System.out.println();
		
		System.out.print("업무명\t: ");
		if(svo.getJob() != null) {
			System.out.print(svo.getJob());
		if(svo.getJob().length() < 7)
			System.out.print("\t");
		}else
			System.out.print("없음\t");
		System.out.print("\t");
		System.out.print("상사이름\t: ");
		if(svo.getMname() != null)
		System.out.print(svo.getMname());
		else
			System.out.print("없음");
		System.out.println();
		
		System.out.print("입사일자\t: ");
		System.out.print(svo.getHireDate());
		System.out.print("\t");
		System.out.print("급여\t: ");
		System.out.print(svo.getSalary());
		System.out.println();
		
		System.out.print("커미션\t: ");
		if(svo.getCommission() != -1)
		System.out.print(svo.getCommission());
		else
			System.out.print("없음");
		System.out.print("\t\t");
		System.out.print("부서명\t: ");
		System.out.print(svo.getDname());
		System.out.println();
		System.out.println("-----------------------------");
	}
}
