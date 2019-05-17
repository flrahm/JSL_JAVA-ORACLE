package mathExam;

public class Ex06 {

	public static void main(String[] args) {
		
		int rollNum = 10; // 주사위를 몇번 굴릴지
		int[] cnt = new int[6];	// 각 번호가 나온 횟수를 저장하는 변수. 편하게 배열로 만들었음
		
		for(int i = 0; i <rollNum ; i++) {	// 0부터 10번을 돌림
			
			int a = (int)(Math.random()*6)+1;	// 1~6까지의 정수를 발생시킴
			System.out.println(a);	// a를 출력해봄. 테스트용임 없어도됨
			
			cnt[a-1]++;
			
			//adding(cnt,a);	// 주사위를 굴리면 그에 맞는 갯수를 증가시키는 메소드
		}
		
		for(int i =0 ; i <cnt.length ; i++) {	// 출력
			System.out.println((i+1)  + " 이 나온 횟수 : " + cnt[i]);
		}
	}
	
	/*
	static void adding(int[] cnt , int a) {	// 갯수를 저장하는 배열과  주사위값을 받아서
		
		switch (a){	// 주사위값의 결과에 따라
			case 1 :
				cnt[0]++;	// 주사위값이 1이면 1이 몇번나왔는지 저장하는 변수를 1증가
				break;
			case 2 :
				cnt[1]++;	// 주사위값이 2면 2가 몇번나왔는지 저장하는 변수를 1증가
				break;
			case 3 : 
				cnt[2]++;	// 마찬가지
				break;
			case 4 :
				cnt[3]++;
				break;
			case 5 :
				cnt[4]++;
				break;
			case 6 :
				cnt[5]++;
				break;
		}
		
	}
	*/

}
