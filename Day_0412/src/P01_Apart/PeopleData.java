//peopleData

package P01_Apart;

import java.util.ArrayList;
import java.util.List;

public class PeopleData {

	int dongNum = 10;	// 동 갯수
	int ageNum = 7;	// 인원범위 갯수
	List<People> pList = new ArrayList<People>();	// 메인에서 넘어오는 배열을 받아주기 위해 선언
	int[][] arr = new int[dongNum][ageNum];  // 인원 현황을 저장할 이차원 배열
	int[] ageSum = new int[ageNum];	// 인원별 합계를 출력하기 위한 일차원 배열
	
	
	public PeopleData(List<People> pList) {	// 생성자 선언해서 어레이리스트를 받아줌
		this.pList = pList;
	}
	
	public void body() {	// 실행할 메소드를 순서적으로 기입하고 이 메소드만 메인에서 불러줄꺼
		printTitle();	// 제목출력용
		calPeople();	// 인원현황 계산
		printBody();	// 계산한거 출력
	}
	
	static void printTitle() {	// 제목찍기
		System.out.println("\t\t아파트 인원 현황표");
		System.out.println("동*연령\t0~9\t10~19\t20~20\t30~39\t40~49\t50~59\t60이상\t합계");
	}
	
	
	void calPeople() {	// 인원수 계산
			
		int dong = 0;	// 중간 계산용
		int age = 0;	// 중간 계산용 2
		
		for(int i = 0; i < pList.size() ; i++) {	// 리스트의 갯수만큼 반복 
			dong = pList.get(i).getDong()-1;	// 동 계산. 인덱스가 0부터 시작하니까 0빼줌
			age = pList.get(i).getAge()/10;	// 연령계산. 10으로 나눠줌
			if(age>6)	// 60 이상일경우에는
				age = 6;	// 6으로 고정
			
			ageSum[age]++;	// 인원수 합을 저장하는 배열에서 해당 인덱스의 값 1 증가
			arr[dong][age]++;	// 각각의 동과 연령에 맞는 배열요소를 1 증가시킴
		}
	}
	
	void printBody() {	// 실질적인 데이터 출력용 메소드 
		
		int dongSum = 0;	// 동별 인원 합계를 계산할 변수
		
		for(int i = 0; i < dongNum ; i++) {	// 동 갯수만큼 반복
			System.out.print((i+1) + "동\t");	// 인덱스랑 1차이가 나니까 1 더해줬음 
			
			for(int j = 0; j < ageNum ; j++) {	// 연령범위 갯수만큼 반복
				System.out.print(arr[i][j] + "\t");	//	해당 요소 출력
				dongSum+=arr[i][j];	// 동별 인원수 합을 계산
			}
			
			System.out.print(dongSum);	// 동별 인원수 합을 출력
			dongSum = 0;	// 동별 인원수 합을 0으로 초기화
			System.out.println();	// 한줄 띄움
		}
		///////////
		System.out.print("합계\t");	// 연령별 인원수 합을 출력
		for(int i = 0; i < ageNum ; i++) {	// 인원범위 갯수만큼 출력
			System.out.print(ageSum[i]+"\t");	// 계산한 것을 출력해줌
		}
		System.out.println(pList.size());	// 총 인원수 출력
	}
	
}
