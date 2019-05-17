package mathExam;

import java.util.Arrays;
import java.util.Random;

public class Ex07_Lotto {

	public static void main(String[] args) {
		
		Random r = new Random(System.currentTimeMillis());	// 랜덤클래스 생성하고 시드를 현재 시간으로 
		
		int[] lotto = new int[6];	// 생성된 로또 번호를 저장할 배열
		int cnt = 0;	// 갯수를 카운팅
		while(cnt<6) {	// 6개의 배열이 다 찰때까지 돌림
			int a = r.nextInt(45+1);	// 1~46의 랜덤 번호 생성
			if(isOverlap(lotto,a)) {	// 만약에 새로 생성된 번호가 기존 번호와 겹치지 않으면
				lotto[cnt] = a;	// 배열에 추가함
				cnt++;	// 갯수 증가시킴
			}
			
		}
		
		sortArr(lotto);	// 오름차순으로 정렬
		
		System.out.println(Arrays.toString(lotto)); // 목록 출력
		
	}
	
	static void sortArr(int[] arr) {	// 배열을 정렬해주는 메소드
		
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr.length - 1 - i ; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	static boolean isOverlap(int[] arr, int a) {	// 배열과 입력값을 받아서 배열 안에 입력값이 있는지 판단하여
													// 중복되는 요소가 없으면 true , 있으면 false를 반환
		boolean b = true;	// 기본값은 트루로 놓음
		for(int i = 0; i < arr.length ; i++) {	// 배열 크기만큼 반복하여
			if(arr[i] == a)	// 새로 입력된 값이 기존의 요소들과 겹치는게 있으면
				b = false;	// false 로 바꿔줌
		}
		return b;	// 값 반환
	}
	
}
