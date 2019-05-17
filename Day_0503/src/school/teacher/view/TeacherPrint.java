package school.teacher.view;

import java.util.List;

import school.teacher.vo.TeacherVO;

public class TeacherPrint {
	
	// 교직원 메인 출력
	public static void printMain() {
		System.out.println("==================================");
		System.out.println("=        교직원 관리 프로그램                  =");
		System.out.println("==================================");
		System.out.println("	[1] 교직원 전체 목록");
		System.out.println("	[2] 신규 교직원 등록");
		System.out.println("	[3] 교직원 검색");
		System.out.println("	[4] 교직원 정보 수정");
		System.out.println("	[5] 교직원 정보 삭제");
		System.out.println("	[0] 프로그램 종료");
		System.out.println("----------------------------------");
		System.out.println("원하시는 항목을 선택하세요 : ");
	}

	// 교직원 리스트 출력
	public static void printTList(List<TeacherVO> tList) {		
		System.out.print("교사번호\t");
		System.out.print("이름\t");
		System.out.print("전화\t\t");
		System.out.print("담당과목\t");
		System.out.print("생년월일\t\t");
		System.out.print("등록일");
		System.out.println();
		
		for(int i = 0; i < tList.size(); i++) {
			
			System.out.print(tList.get(i).getTno());
			System.out.print("\t");
			System.out.print(tList.get(i).getName());
			System.out.print("\t");
			
			System.out.print(tList.get(i).getTel());
			System.out.print("\t");
			
			System.out.print(tList.get(i).getPart());
			System.out.print("\t");
			
			System.out.print(tList.get(i).getBirthday());
			System.out.print("\t");
			
			System.out.print(tList.get(i).getRegdate());
			System.out.print("\t");
			System.out.println();
		}
		
		
	}
}
