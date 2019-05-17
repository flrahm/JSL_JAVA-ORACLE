package customer.view;

import java.util.List;

import customer.vo.CustomerVO;

public class CustomerPrint {

	// 메인 출력
	public static void printMain() {
		System.out.println("==================================");
		System.out.println("=         고객관리 프로그램                    =");
		System.out.println("==================================");
		System.out.println("	[1] 고객 전체 목록");
		System.out.println("	[2] 신규 고객 등록");
		System.out.println("	[3] 고객 검색");
		System.out.println("	[4] 고객 정보 수정");
		System.out.println("	[5] 고객 정보 삭제");
		System.out.println("	[0] 프로그램 종료");
		System.out.println("----------------------------------");
		System.out.println("원하시는 항목을 선택하세요 : ");
	}
	
	// 리스트 출력
	public static void printCList(List<CustomerVO> cList) {
		
		System.out.print("고객번호\t");
		System.out.print("이름\t");
		System.out.print("연락처\t");
		System.out.print("\t");
		System.out.print("직장명\t");
		System.out.print("생년월일\t");
		System.out.print("\t");
		System.out.print("성별\t");
		System.out.print("등록일자\t");
		System.out.println();
		
		for(int i = 0; i < cList.size() ; i++) {
			CustomerVO cvo = cList.get(i);
			System.out.print(cvo.getNum()+"\t");
			System.out.print(cvo.getName()+"\t");
			System.out.print(cvo.getTel()+"\t");
			System.out.print(cvo.getOffice()+"\t");
			System.out.print(cvo.getBirthDay()+"\t");
			System.out.print(cvo.getGender()+"\t");
			System.out.print(cvo.getIndate()+"\t");
			System.out.println();
		}
	}
	
	// 고객 한명 출력 
	public static void printCVO(CustomerVO cvo) {
		System.out.print("고 객 명	:  ");
		System.out.println(cvo.getName());
		System.out.print("연 락 처	:  ");
		System.out.println(cvo.getTel());
		System.out.print("주     소	:  ");
		System.out.println(cvo.getAddr());
		System.out.print("직 장 명	:  ");
		System.out.println(cvo.getOffice());
		System.out.print("생     일	:  ");
		System.out.println(cvo.getBirthDay());
		System.out.print("성     별	:  ");
		System.out.println(cvo.getGender());
		System.out.print("등록일자 :" );
		System.out.println(cvo.getIndate());
		
	}
}
