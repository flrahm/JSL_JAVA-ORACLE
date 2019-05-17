package customer.view;

import java.util.List;
import java.util.Scanner;

import customer.dao.CustomerDAO;
import customer.vo.CustomerVO;

public class CustomerView {

	Scanner scan = new Scanner(System.in);
	CustomerDAO dao = new CustomerDAO();

	// 고객 전체 목록
	public void selectAllCustomer_01() {
		System.out.println("\t\t** 고객 전체 목록 **");
		List<CustomerVO> cList = dao.selectAllCustomer();
		if (!cList.isEmpty())
			CustomerPrint.printCList(cList);
		else
			System.out.println("고객 리스트가 비었습니다");
	}

	// 신규 고객 등록
	public void insertNewCustomer_02() {
		System.out.println("\t\t** 신규 고객 정보 등록 **");
		System.out.print("고 객 명	: ");
		String name = "";
		while (true) {
			name = scan.nextLine();
			if(name.equals(""))
				System.out.println("이름은 필수 입력입니다");
			else
				break;
		}
		System.out.print("연 락 처	: ");

		String tel = "";
		while (true) {
			tel = scan.nextLine();
			if(tel.equals(""))
				System.out.println("전화번호는 필수 입력입니다");
			else
				break;
		}

		System.out.print("주 	소	: ");
		String addr = "";
		while (true) {
			addr = scan.nextLine();
			if(addr.equals(""))
				System.out.println("주소는 필수 입력입니다");
			else
				break;
		}
		
		System.out.print("직 장 명(선택)	: ");
		String office = scan.nextLine();
		if (office.equals(""))
			office = null;
		System.out.print("생	일(선택)	:");
		String birthDay = scan.nextLine();
		if (birthDay.length() != 10)
			birthDay = null;

		System.out.print("성	별 	:");
		String gender;
		while (true) {
			gender = scan.nextLine();
			if(gender.equals(""))
				System.out.println("성별은 필수 입력입니다");
			else
				break;
		}

		CustomerVO cvo = new CustomerVO();
		cvo.setName(name);
		cvo.setTel(tel);
		cvo.setAddr(addr);
		cvo.setOffice(office);
		cvo.setBirthDay(birthDay);
		cvo.setGender(gender);

		System.out.println("등록하시겠습니까? [Y]");
		String confirm = scan.nextLine();
		if (confirm.equalsIgnoreCase("y")) {
			int insertOK = dao.insertNewCustomer(cvo);
			if (insertOK != 0)
				System.out.println("성공적으로 등록되었습니다");
			else
				System.out.println("등록에 실패하였습니다");
		} else
			System.out.println("등록을 취소하였습니다");
	}

	// 고객 정보 검색(이름으로)
	public void selectByName_03() {
		System.out.println("\t\t** 고객 정보 검색 **");
		System.out.print("찾으실 고객 명을 입력하세요 : ");
		String name = scan.nextLine();
		CustomerVO cvo = dao.selectByName(name);

		System.out.println();
		if (cvo != null)
			CustomerPrint.printCVO(cvo);
		else
			System.out.println("해당 이름으로 등록된 고객이 없습니다");
	}

	// 고객 정보 수정
	public void updateByNum_04() {
		System.out.println("\t\t** 고객 정보 수정 **");
		System.out.print("수정할 고객의 번호를 입력하세요 : ");
		int num = scan.nextInt();
		CustomerVO cvo = dao.selectByNum(num);
		if (cvo != null) {
			System.out.print("고 객 명	:  ");
			System.out.println(cvo.getName());
			System.out.print("새로운 연락처를 입력하세요 : ");
			String tel = scan.nextLine();
			if (tel.equals(""))
				cvo.setTel(tel);
			System.out.print("새로운 직장명을 입력하세요 : ");
			String addr = scan.nextLine();
			if (addr.equals(""))
				cvo.setAddr(addr);

			System.out.println("업데이트 하시겠습니까? [Y]");
			String confirm = scan.nextLine();
			if (confirm.equalsIgnoreCase("y")) {
				int updateOK = dao.updateByNum(cvo);
				if (updateOK != 0)
					System.out.println("등록 성공");
			} else
				System.out.println("등록을 취소합니다");

		} else
			System.out.println("해당 번호에 맞는 고객이 없습니다");
	}

	// 고객 정보 삭제
	public void deleteByNum_05() {
		System.out.println("\t\t** 고객 정보 삭제 **");
		System.out.print("삭제할 고객의 번호를 입력하세요 : ");
		int deleteOK = 0;
		//String str = scan.nextLine();
		//int num = Integer.parseInt(str);
		int num = scan.nextInt();
		CustomerVO cvo = dao.selectByNum(num);
		if (cvo != null) {
			CustomerPrint.printCVO(cvo);

			System.out.println("삭제하시겠습니까? [1]");
			
			//String confirm = scan.nextLine();
			int confirm = scan.nextInt();
			
			//if (confirm.equalsIgnoreCase("Y")) {
			if(confirm == 1) {
				deleteOK = dao.deleteByNum(cvo);
				if (deleteOK != 0)
					System.out.println("삭제되었습니다");
				else
					System.out.println("삭제에 실패했습니다");
			} else
				System.out.println("삭제가 취소되었습니다");

		} else
			System.out.println("해당 번호에 맞는 고객이 없습니다");
	}

}
