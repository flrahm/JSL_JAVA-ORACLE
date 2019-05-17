package P01_sawon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SawonTest2_ArrayList_vs_objectArray {

	public static void main(String[] args) {
		
		//어레이 리스트 vs 객체 배열
		Sawon[] saArr = new Sawon[5];	// way 1 : 객체 배열
		List<Sawon> saList = new ArrayList<Sawon>();	// way 2 : 어레이 리스트
		
		
		// Sawon 객체 하나 생성해서 어레이 리스트 또는 객체배열에 대입하여 생성하는 방법
		Sawon sa = new Sawon(1,"김자바","인사",LocalDate.now());
		
		saArr[0] = sa;	// way 1	
		saList.add(sa);	// way 2
		
		// 객체를 생성하지 않고 직접 생성하는 방법
		saArr[1] = new Sawon(2,"박씨샵from객체배열","마케팅",LocalDate.now());	// way 1
		saList.add(new Sawon(2,"박씨샵from어레이리스트","마케팅",LocalDate.now()));	// way 2
		
		// 출력해보기. toString 은 오버라이딩 되어있음
		System.out.println(saArr[0]);	// way 1
		System.out.println(saList.get(0));	// way 2 
		
		// 각각의 객체에 접근하는 방법 
		System.out.println(saArr[1].getName());	// way 1 : saArr[인덱스].메소드or변수
		System.out.println(saList.get(1).getName());	// way 2 : saList.get(인덱스).메소드or변수
		

	}

}
