package Ex04_StringExam;

import java.util.Scanner;

/*
 * 입력형식
 * 자료입력 1:홍길동,900206-1,010-2242-3810
 * 자료입력 2:김자바,070102-2,010-4232-2938
 * 자료입력 3:박씨샵,890232-1,010-3423-5123
 * 자료입력 4:end
 * 
 * 출력형식
 * 이름	전화	4t			성별	나이
 * 홍길동	010-2242-3810	남성	30
 * 김자바	010-4232-2938	여	12
 * 
 * 처리조건
 * 1라인씩 키보드로, "," 로 구분. 
 * end 입력시 출력함
 * 입력인원 최대 10명 
 */
public class MemberExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// 스캐너 객체 생성
		Member[] mem = new Member[10];	// 맴버 인스턴스 배열 10개 생성
		
		int cnt = 0;	// 입력 갯수를 카운트할 변수
		
		while(cnt < 10) {	// 입력갯수는 10개로 제한
			
			System.out.print("자료 입력 " + (cnt+1) + " : ");
			String str = scan.nextLine();	// 값을 입력받음
			
		
			if(str.equalsIgnoreCase("end"))	// 만약 대소문자에 관계없이 end를 입력받으면 빠져나옴
				break;
			
			mem[cnt] = new Member();	// 멤버 인스턴스를 생성하고
			mem[cnt].inputData(str);	// 입력받은 문자열을 넘겨줌
			cnt++;	// 입력갯수 증가
		}
		
		Member.printTitle();	// 타이틀 출력
		for(int i = 0; i < cnt ; i++) {	// 입력받은 갯수만큼 
			mem[i].printMember();	// 출력해줌
		}
		
		scan.close();
		
		
	}

}


