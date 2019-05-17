import java.util.Scanner;

/*
 * 키보드로 10개의 데이터를 입력.
 * 입력 데이터는 -99 ~ 100 사이의 정수값
 * 0 이상의 값 10개만 카운팅 
 *	평균 이상인 데이터와 갯수를 출력하는 메소드작성	
 *	평균과 가장 가까운 수 출력
 */

public class ArrayBasic_2D {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		int cnt = 0;	// 양수의 값을 세기 위한 변수
		
		System.out.println("값을 입력하세요");
		
		while(cnt < 10) {	// 양수의 값이 10개가 될 때 까지 값을 입력받음
			int a = scan.nextInt();	// 키보드로 값을 입력받음
			
			if(a >= 0) {	// 입력값이 양수일경우에
				arr[cnt] = a;	// 그 값을 저장함
				cnt ++;		// 갯수를 증가시킴
			}
		}
		
		double avg = calAvg(arr);	// 배열을 입력받아 평균을 반환하는 메소드 calAvg 를 호출하여 그 값을 avg 에 저장
		upAvg(avg,arr);		// 평균값과 배열을 입력받아 평균 이상의 데이터를 출력하는 메소드 upAvg를 호출
		closeAvg(avg,arr);
		scan.close();

	}
	
	static double calAvg(int[] arr) {
		
		int sum = 0;	// 배열들의 총 합을 저장하기 위한 변수 선언. 값을 0으로 초기화
		double avg = 0;	// 평균을 저장할 변수 선언. 값을 0으로 초기화
		
		for(int i = 0; i < arr.length  ; i ++)
			sum += arr[i];	// 배열들의 총 합을 저장하기 위한 변수에 배열들의 각 값을 더해줌
		
		System.out.println("합계 : " + sum);	
		avg = 1.0 * sum / arr.length;	// 평균을 계산하여 avg 변수에 저장
		System.out.println("평균 : " + avg);
		return avg;	// 평균이 저장되어 있는 변수를 리턴함 
	}
	
	static void upAvg( double avg , int[] arr) {	//리턴타입이 없고 더블형 변수와 인트형 배열을 입력받는 메소드 
		int cnt = 0;	//평균 이상의 데이터를 세기 위한 변수
		
		System.out.print("평균 이상의 데이터 목록 : ");	
		for(int i =0; i < arr.length; i++) {	
			if(arr[i] >= avg) {		// 배열의 값이 평균보다 클 경우
				System.out.print(arr[i] + " ");	// 그 값을 출력해줌
				cnt ++;	// 카운터를 하나 증가시킴
			}
		}
		
		System.out.printf("평균 이상의 데이터는 %d 개 입니다 \n" , cnt);	// 평균 이상의 데이터 갯수 출력
	}
	

	static void closeAvg( double avg , int[] arr) {	//평균과 가장 가까운 수 출력
		/*
		 * 배열의 값과 평균값의 차이를 계산하여 가장 근접한 값을 찾아내는 메소드
		 * 1. 현재의 배열값과 평균의 차이를 계산 -> cha 에 저장 
		 * 2. cha 값을 stand(배열값들과 평균과의 차들 중 가장 작은값(가장 근접한 값))와 비교함
		 * 3. 만약 cha 값이 더 작으면( 현재 배열이 평균과 가장 가까운 값이면 )
		 * 4. stand값을 (가장 작은 차이를) cha 값으로 덮어씌우고
		 * 5. 가장 작은 배열값을 현재의 배열(arr[i]) 로 갱신하여 close 변수에 넣어줌
		 */
		
		double cha;	// 배열의 값과 평균의 차
		double stand = (avg>arr[0])?avg-arr[0]:arr[0]-avg;	// 가장 작은 차이값. 초기화는 첫번째 배열의 차잇값으로 했음 
									// 절대값 비교이기 때문에 음수가 나오지 않도록 삼항 연산자를 이용하여 무조건 양수값이 나오게
		
		// 실질적 비교는 위의 두 값을 비교하여 가장 가까운 값을 찾음
		
		int close = arr[0];		// 평균과 가장 가까운 값을 지닌 배열을 저장하기 위한 변수
		for(int i = 0; i < arr.length ; i ++) {
			
			cha = arr[i] - avg;		// 배열과 평균값의 차를 계산함
			if (cha < 0)			// 절대값을 비교하는 것이기 때문에 음수일경우 양수로 바꿔줌
				cha = (-1) * cha;
			
			
			if(cha < stand) {		// 만약  현재 배열의 평균과의 차가  기존까지의 가장 작은값보다 작다면
				close = arr[i];		// 가장 가까운 배열을 갱신해줌 
				stand = cha;		// 가장 가까운 배열의 차이 또한 갱신해줌
			}
			
			
		}
		System.out.println("평균과 가장 가까운 값 : " + close);
	}
	
}



