// Teacher Data 클래스

package p01_School.teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherData {

	private List<Teacher> tList = new ArrayList<Teacher>();

	public TeacherData(String fileName) {
		tFileRead(fileName);
	}

	
	List<Teacher> searchByNum(int num) { // 번호로 검색
		List<Teacher> returnList = new ArrayList<Teacher>();

		for (int i = 0; i < tList.size(); i++) {
			if (num == tList.get(i).getTno()) {
				returnList.add(tList.get(i));
			}
		}

		return returnList;
	}
	
	List<Teacher> searchByPart(String str) { // 교과목으로 검색
		List<Teacher> returnList = new ArrayList<Teacher>();

		for (int i = 0; i < tList.size(); i++) {
			if (tList.get(i).getPart().indexOf(str) != -1) {
				returnList.add(tList.get(i));
			}
		}

		return returnList;
	}
	


	List<Teacher> searchByName(String str) { // 이름으로 검색
		List<Teacher> returnList = new ArrayList<Teacher>();

		for (int i = 0; i < tList.size(); i++) {
			if (tList.get(i).getName().indexOf(str) != -1) {
				returnList.add(tList.get(i));
			}
		}

		return returnList;
	}

	List<Teacher> allTeacherInfo() {// 전체 교사 목록 전달
		sortList();	// 정렬한 후
		return tList;	// 돌려줌
	}
	
	void sortList() {	// 리스트 입사일자로 정렬

		int jNum, jpNum;
		String tempStr;
		String[] tempStrArr;
		for(int i = 0; i < tList.size() ; i++)
			for(int j = 0 ; j < tList.size() - 1 - i ; j++) {	// 버블정렬 알고리즘
				
				tempStrArr = tList.get(j).getRegDate().split("/");	// 날짜를 불러와서 스플릿 한 다음에
				tempStr = tempStrArr[0]+tempStrArr[1]+tempStrArr[2];	// 하나로 합쳐서
				jNum = Integer.parseInt(tempStr);	//인트형 데이터로 변환
				
				tempStrArr = tList.get(j+1).getRegDate().split("/");	// 마찬가지로 해줌
				tempStr = tempStrArr[0]+tempStrArr[1]+tempStrArr[2];
				jpNum = Integer.parseInt(tempStr);
				
				if(jNum > jpNum) {	// 비교해서 스왑
					Teacher temp = tList.get(j);
					tList.set(j, tList.get(j+1));
					tList.set(j+1, temp);
				}
			}
	}
	
	static void printTTitle() { // 타이틀을 찍는 스테틱 메소드
		System.out.print("번호\t");
		System.out.print("이름\t");
		System.out.print("전화\t\t");
		System.out.print("담당과목\t");
		System.out.print("나이\t");
		System.out.print("입사일자\t");
		System.out.println();
	}
	
	static void printTList(List<Teacher> list) {	// 리스트 출력

			for (int i = 0; i < list.size(); i++)
				System.out.println(list.get(i));

	}

	void tFileRead(String fileName) {	// 파일 읽기

		try {
			Scanner scan = new Scanner(new File(fileName));

			while (scan.hasNext()) {

				String[] str = scan.next().split(",");
				int tno = Integer.parseInt(str[0]);
				String name = str[1];
				String tel = str[2];
				String part = str[3];
				int age = Integer.parseInt(str[4]);
				String regDate = str[5];
				tList.add(new Teacher(tno, name, tel, part, age,regDate));

			}

			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		}
	}

	public List<Teacher> gettList() {
		return tList;
	}

	public void settList(List<Teacher> tList) {
		this.tList = tList;
	}
}
