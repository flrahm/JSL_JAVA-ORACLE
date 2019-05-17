// 학생 정보 처리 클래스. 실질적 작업

package p01_student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDP {

	List<StudentInfo> sList = new ArrayList<StudentInfo>();	// 어레이 리스트 생성
	
	int answerSize = 10; // 문제 갯수
	
	int[] answer = new int[answerSize];	// 정답 배열
	
	int[] answerCntArr = new int [answerSize];	// 
	int[] answerRatioArr = new int[answerSize];

	
	public StudentDP() {}
	
	public StudentDP(int[] answer) {	// 메인메소드에서 정답표를 받아옴
		this.answer = answer;
	}


	void body() {	// 메소드들을 실행해줄 통합 메소드
		
		scoring();	// 학생 개개인 점수매기기
		calAnswerRatio();	// 문제당 정답 비율 계산
		printTitle();	// 타이틀 출력	
		printBody();	// 나머지 출력
	}
	
	void printBody() {	// 실질적 데이터를 출력해주는 메소드
		
		for(int i = 0; i < sList.size() ; i++) {	// 학생 명수만큼 반복
			
			System.out.print(sList.get(i).getStuNum() + "\t");	// 학생번호 출력
			System.out.print(sList.get(i).getStuName() + "\t");	// 학생 이름 출력
			
			for(int j = 0; j < answer.length ; j++) {	// 문제 갯수만큼 반복
				System.out.print(sList.get(i).getErrata()[j] + "\t");	// 정오표를 출력
				//System.out.print(sList.get(i).getStuAnswer()[j] + "\t");
			}
			System.out.print(sList.get(i).getScore());	// 점수를 출력
			
			System.out.println();
		}
		
		
		
		System.out.print("정답 비율 : \t");		// 문제당 정답 비율을 출력
		for(int i = 0; i < answerRatioArr.length ; i++) {	// 문제 수만 큼 반복해서
			System.out.print(answerRatioArr[i] + "%\t");	// 계산한 값을 출력
		}
		
	}
	
	
	void printTitle() {	// 타이틀 출력
		System.out.println("\t\t\t**객관식 채점 결과표**");
		System.out.print("번호\t이름\t");
		for(int i = 0; i < answer.length ; i ++) 
			System.out.print((i+1) + "\t");
		System.out.print("점수");
		System.out.println();
	}
	
	void calAnswerRatio() {	// 문제당 비율을 출력
	
		int cnt = 0;	// 문제당 몇문제 맞았나 카운트
		for(int i =0; i < answerCntArr.length;i++) {	// 문제 갯수만큼 반복
			cnt = 0;	// 카운터를 0으로 초기화
			for(int j = 0; j < sList.size();j++) {	// 학생 명수만큼 반복
				if(sList.get(j).getErrata()[i] == 'O')	// 만약 맞았으면
					cnt++;	// 카운트 증가
			}
			answerCntArr[i] = cnt;	// 갯수를 세서 몇문제 맞췄는지 갯수를 저장하는 배열에 저장
		}
		
		
		for(int i = 0; i < answerCntArr.length;i++) {	// 위에 저장한 배열을 가지고
			
			if(answerCntArr[i] == sList.size())	// 만약 맞은 갯수와 전체 인원수가 같으면
				answerRatioArr[i] = 100;	// 100점으로 셋. 사실 밑에만 해도되는데 문제 갯수가 11개 뭐 이러면 100이 안나오고 99 이런식으로 나와서 필요한거
			else
				answerRatioArr[i] = 100/sList.size() * answerCntArr[i];	// 한문제당 비율 계산해서 갯수를 곱해주는 식.
		}
		
	}
	
	void scoring() {

		int score4question = 100/answer.length;	// 한문제당 점수 계산
		
		int score = 0;	// 학생 개개인 점수를 저장할 변수
	
		
		for (int i = 0; i < sList.size(); i++) {	// 학생 명수만큼 반복
			
			score = 0;	// 0으로 초기화
			
			for (int j = 0; j < answer.length; j++) {//// 문제 갯수만큼 반복
				if (answer[j] == sList.get(i).getStuAnswer()[j]) {	// 만약 학생이 쓴 답과 정답이 일치하면
					sList.get(i).getErrata()[j] = 'O';	// 정오표 배열에 O 를 저장
					score += score4question;	// 점수를 증가시킴
					
				} else {	// 아니면
					sList.get(i).getErrata()[j] = 'X'; // 정오표에 X를 저장
				}

			}////
			sList.get(i).setScore(score);	// 점수를 대입해줌
		}	// 바깥 for문이 끝남

	}

	void readFile(String fileName) {	// 파일을 한줄한줄 읽어서 이것을 가지고 학생정보 객체 생성

		try {
			Scanner scan = new Scanner(new File(fileName));

			while (scan.hasNext())
				sList.add(new StudentInfo(scan.next()));

			scan.close();

		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일명입니다");
		}

	}

}
