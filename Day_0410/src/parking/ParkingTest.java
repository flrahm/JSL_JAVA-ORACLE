package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Parking> pList = new ArrayList<Parking>();
		
		
		while(pList.size()<100) {
			
			System.out.println("차량 번호를 입력하세요");
			String carNum = scan.next();	// 차량번호 입력
			if(carNum.equalsIgnoreCase("0000"))	// 만약 0000이면 
				break;	//입력 종료
			
			System.out.println("주차 시간을 입력하세요");	
			int parkTime = scan.nextInt();	// 주차시간 입력
			if(parkTime > 1440) {	// 24시간 이상이면. 분으로 환산했음
				System.out.println("주차시간 초과입니다");	// 메시지 띄우고 객체 생성을 하지 않음
			}else {
				pList.add(new Parking(carNum,parkTime));	// 24시간 이내일때 객체 생성
				System.out.println("등록되었습니다");
			}
				

		}
			scan.close();
			
		
		for(int i = 0 ; i < pList.size() ; i++)	// 출력
			System.out.println(pList.get(i));
	}

}
