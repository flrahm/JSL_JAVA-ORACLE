package Sawon.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Sawon.dao.SawonDao;
import Sawon.vo.SawonVO;

public class SawonView {

	Scanner scan = new Scanner(System.in);
	SawonDao dao = new SawonDao();
	int cnt = 5;

	public void printAll_1() throws Exception {
		List<SawonVO> sList = new ArrayList<SawonVO>();
		sList = dao.selectAll();

		printAttribute();

		if (sList.size() > 0)
			for (int i = 0; i < sList.size(); i++) {
				System.out.print(sList.get(i).getSno() + "\t");
				System.out.print(sList.get(i).getName() + "\t");
				System.out.print(sList.get(i).getTel() + "\t");
				System.out.print(sList.get(i).getPay() + "\t");
				System.out.println(sList.get(i).getIndate() + "\t");
			}
		else
			System.out.println("등록된 사원이 없습니다");
		// SELECT * FROM SAWON;
	}

	public void insert_2() throws Exception {

		int sno = cnt;
		String name = "사원" + cnt;
		String tel = "010-1111-1111";
		int pay = 9000 + cnt;
		cnt++;

		SawonVO sawon = new SawonVO();
		sawon.setSno(sno);
		sawon.setName(name);
		sawon.setTel(tel);
		sawon.setPay(pay);

		if (dao.sawonInsert(sawon) != 0)
			System.out.println("사원정보가 등록되었습니다");
		else
			System.out.println("등록 실패");
	}

	public void update_3() throws Exception{
		SawonVO sawon = searchSawon();
		int updateOK = 0;
		
		if(sawon != null) {
			System.out.println("수정하시려면 [Y] 를 입력하세요");
			String sw = scan.next();
			if(sw.equalsIgnoreCase("y")) {
				System.out.println("새로운 연락처를 입력하세요 : ");
				String tel = scan.next();
				System.out.println("새로운 급여를 입력하세요 : ");
				int pay = scan.nextInt();
				sawon.setTel(tel);
				sawon.setPay(pay);
				
				updateOK = dao.sawonUpdate(sawon);
				if(updateOK != 0)
					System.out.println("업데이트 되었습니다");
				
			}
		}
	}

	public void delete_4() throws Exception {
		SawonVO sawon = searchSawon();
		int deleteOK = 0;
		if(sawon != null) {
			System.out.println("삭제하시려면 [Y] 를 입력하세요");
			String sw = scan.next();
			if(sw.equalsIgnoreCase("y")) {
				deleteOK = dao.sawonDelete(sawon);
				if(deleteOK != 0)
					System.out.println("삭제되었습니다");
			}
				
		}

	}

	public void search_5() throws Exception {
		searchSawon();

		//
	}

	public SawonVO searchSawon() throws Exception {
		String str = "";
		SawonVO sawon = null;
		while (true) {///
			System.out.println("무엇을 기준으로 검색하시겠습니까?");
			System.out.println("[1] 사원 번호");
			System.out.println("[2] 사원 이름 ");
			System.out.println("[0] 종료");
			int sw = scan.nextInt();
			if (sw == 1) {
				System.out.println("검색할 번호를 입력하세요 : ");
				str = scan.next();
				sawon = dao.select(sw, str);
				if (sawon != null) {
					printAttribute();
					printSawon(sawon);
					break;
				}
				else
					System.out.println("해당 사원이 없습니다");
			} else if (sw == 2) {
				System.out.println("검색할 이름을 입력하세요 : ");
				str = scan.next();
				sawon = dao.select(sw, str);
				if (sawon != null) {
					printAttribute();
					printSawon(sawon);
					break;
				}
				else
					System.out.println("해당 사원이 없습니다");
			} else if (sw == 0) {
				System.out.println("검색을 취소합니다");
				break;
			} else
				System.out.println("잘못된 입력입니다");
		} ///

		return sawon;
	}

	private void printSawon(SawonVO sawon) {
		System.out.print(sawon.getSno() + "\t");
		System.out.print(sawon.getName() + "\t");
		System.out.print(sawon.getTel() + "\t");
		System.out.print(sawon.getPay() + "\t");
		System.out.println(sawon.getIndate() + "\t");
	}
	
	private void printAttribute() {
		System.out.print("사원번호\t");
		System.out.print("이름\t");
		System.out.print("전화번호\t\t");
		System.out.print("임금\t");
		System.out.println("입사일\t");
	}
}
