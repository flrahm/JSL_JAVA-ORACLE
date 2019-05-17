package P01_Lotto;

import java.util.Scanner;

public class Lotto2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	// 스캐너 객체 생성

		System.out.println("게임 수를 입력하세요 : ");	// 게임 수를 먼저 입력받음
		int gameNum = scan.nextInt();	// 게임수를 스캐너를 통해 입력받음
		int cnt = 0;	// 갯수를 세기 위한 변수

		int[][] arr = new int[gameNum][6];	// 게임 횟수 & 로또 번호를 저장하기 위한 이차원 정수배열

		while (cnt < gameNum) {	// 게임 수 만큼 반복

			System.out.print((cnt + 1) + " : ");	// 몇 번째 입력인지 띄워주기 위해 cnt+1 해줬음. cnt는 0부터 시작하니까
			String inStr = scan.next();	// 한 줄 전체를 문자열을 생성해서 입력받음 
			inStr.trim();	// 공백제거
			String[] str = inStr.split(",");  // "," 를 기준으로 분리

			for (int i = 0; i < 6; i++) {
				arr[cnt][i] = Integer.parseInt(str[i]);	// 문자열을 정수로 변환해서 배열에 저장
			}
			cnt++;	// 갯수 증가
		}

		int[] win = winGenerate();	// 당첨번호를 인트형 배열로 생성. 메소드 밑에 따로 구현
		sortArr(win);	// 당첨 번호를 정렬함
		System.out.println("당첨 결과");
		System.out.print("당첨 번호 : ");
		for(int i = 0; i < win.length ; i++) {	// 당첨번호 출력용
			System.out.print(win[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < gameNum ; i++) {	// 밑에 출력. 게임 수만큼 반복
			
			System.out.print((i+1)+": " );	// 몇번째인지 출력
			
			for(int j=0; j < arr[i].length ; j++) {	// 현재 게임의 번호 목록을 출력함, 6개 출력
				System.out.print(arr[i][j] + " ");
			}
			
			//몇등인지 결정하는 메소드에 배열을 넘겨주기 위해 임시 배열을 만들어서 현재 게임의 정답목록을 저장
			int[] temp = new int[arr[i].length];
			
			for(int j = 0; j < arr[i].length;j++)
				temp[j] = arr[i][j];
			//
			
			System.out.println(lottoCheck(win,temp));	
			// 당첨번호가 들어있는 배열과 현재 게임의 선택 번호를 넘겨줘 등수계싼하는 메소드
		}


		scan.close();
	}

	static void sortArr(int[] arr) {	// 배열을 받아서 정렬하는 메소드. 전에 한거니까 주석안달게요
		
		for(int i = 0; i < arr.length ; i++) 
			for(int j = 0; j < arr.length -1 - i ; j++) 
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

	}
	
	static int[] winGenerate() {	// 당첨번호를 랜덤으로 생성해주는 메소드. 전에 한거니까 주석안달게요

		int[] win = new int[7];
		int cnt = 0;

		while (cnt < win.length) {

			win[cnt] = (int) (Math.random() * 45) + 1;

			for (int i = 0; i < cnt; i++) {
				if (win[cnt] == win[i]) {
					cnt--;
					break;
				}
			}
			cnt++;
		}

		return win;
	}

	static String lottoCheck(int[] win, int[] str) {	// 로또 등수를 결정해주는 메소드
														// 당첨번호 배열과 내가 입력한 번호가 들어있는 배열을 받음

		boolean bonus = false;	// 보너스 번호를 따로 다루기 위한 스위치
		int score = 0;	// 몇개 맞았나 체크하는 변수
		String rank = "";	// 1등, 2등 같은 리턴해줄 문자열을 담고있음

		for (int i = 0; i < str.length; i++) {	// 입력 번호 수만큼 반복
			for (int j = 0; j < win.length - 1; j++) {	// 당첨번호 배열에서 마지막꺼는 제외하고 돌림. 마지막꺼는 보너스번호로 이따가 따로할꺼임

				if (str[i] == win[j])	// 일치하는걸 찾아서
					score++;	// 찾았으면 스코어 늘려줌
			}
		}
		
		// 보너스번호를 따로 체크
		for (int i = 0; i < str.length; i++)	// 입력 번호 수만큼 반복
			if (str[i] == win[win.length-1])	// win[6] 에 당첨번호가 들어있으니까 이거랑만 비교해서
				bonus = true;	// 일치하는게 있으면 스위치를 켜줌

		////////////////////////////

		switch (score) {	// 몇개 일치하는게 있나 를 기준으로
		case 6:	// 6개 다맞았으면 1등
			rank = "1등";
			break;
		case 5:	// 5개맞았는데
			if (bonus == true)	// 보너스번호를 맞췄으면 2등	
				rank = "2등";	
			else	// 보너스번호 못맞췄으면 3등
				rank = "3등";
			break;
		case 4:	// 나머지는 아시겠죠?
			rank = "4등";
			break;
		case 3:
			rank = "5등";
			break;
		default:
			rank = "꽝";
		}

		return rank;	// 문자열 반환

	}
}
