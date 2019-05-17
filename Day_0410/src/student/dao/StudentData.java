package student.dao;

import java.util.ArrayList;
import java.util.List;

import student.vo.Student;

public class StudentData {

	List<Student> sList = new ArrayList<Student>();	// Student 리스트를 사용하기 위해서 선언
	String[] ans;	// 문제의 정답을 받아오기위해 사용
	
	public StudentData() {}
	public StudentData(List<Student> sList , String ans) {
		this.sList = sList;
		this.ans = ans.split(",");
	}
	
	public void body() {	// 메인함수 실행용
		
		splitData();	// 데이터 쪼개기
		scoring();	// 점수매기기
		ranking();	// 등수매기기
		sorting();	// 등수로 정렬
		printTitle();	// 타이틀 출력
		printScore();	// 나머지 출력
	}
	
	private void sorting() {	// 버블정렬 
		
		for(int i = 0; i < sList.size() ; i++) {
			for (int j = 0; j < sList.size() - 1 - i ; j++) {
				if(sList.get(j).getRank() > sList.get(j+1).getRank()) {	
					
					// swap
					Student temp = sList.get(j);
					sList.set(j, sList.get(j+1));
					sList.set(j+1, temp);
				}
				
			}
		}
		
	}
	
	private void ranking() {	// 등수매기기
		int rank;
		for(int i = 0; i < sList.size() ; i++) {
			rank = 1;
			
			for(int j = 0; j < sList.size(); j++) {
				if(sList.get(i).getScore() < sList.get(j).getScore())	// 스코어를 기준으로 점수매기기
					rank++;
			}
			sList.get(i).setRank(rank);
			
		}
	}
	
	private void printTitle() {	// 제목 출력
		System.out.println("\t\t 성적일람표");
		System.out.println("반\t번호\t이름\t점수\t순위");
	}
	
	private void printScore() {	// 내용 출력
		// 반 번호 이름 점수 순위
		for(int i = 0; i < sList.size();i++) {
			
			System.out.print(sList.get(i).getBan());
			System.out.print("\t");
			System.out.print(sList.get(i).getNum());
			System.out.print("\t");
			System.out.print(sList.get(i).getName());
			System.out.print("\t");
			System.out.print(sList.get(i).getScore());
			System.out.print("\t");
			System.out.print(sList.get(i).getRank());
			
			System.out.println();
		}
		
	}
	
	
	private void scoring() {	// 점수매기기
		
		for(int i = 0; i < sList.size();i++) {	// 학생 명수만큼 반복
		
		int score = 0;	// 초기값 0으로 세팅
		//
		String[] dap = sList.get(i).getDap();	// 학생 개개인의 답을 불러와서 저장해놓음
		for(int j = 0; j < ans.length ; j++) {	// 문제 길이만큼 반복해서
			if(dap[j].equals(ans[j])) {	// 답과 맞는지 검사
				score+= 10;	// 맞으면 10문제니까 10점씩
			}
		}
		//
		sList.get(i).setScore(score);	// 점수에 저장
		}
	}
	
	private void splitData() {	// 맨 처음 데이터 들어온것 분리하기
		
	
		for(int i = 0; i < sList.size() ; i++) {	// 학생 명수 만큼 반복
			
			String[] str = sList.get(i).getInData().split(",");	// inData를 가져와서 자르기 
			sList.get(i).setBan(str[0]);	// 첫번째 조각을 반에
			sList.get(i).setNum(str[1]);	// 두번째 조각을 번호에
			sList.get(i).setName(str[2]);	// 세번째 조각을 이름에
			
			String[] dap = new String[str.length-3];	// 나머지 조각을 정답 배열로
			for(int j = 0; j <str.length-3 ; j++ ) {
				dap[j] = str[j+3];
			}
			sList.get(i).setDap(dap);
		}
		
	}
///
}
