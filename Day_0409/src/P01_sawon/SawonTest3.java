package P01_sawon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SawonTest3 {

	public static void main(String[] args) {
		
		List<Sawon> saList = new ArrayList<Sawon>();
		
		saList.add(new Sawon(1,"aaa","인사",LocalDate.now()));
		saList.add(new Sawon(3,"ccc","마케팅",LocalDate.now()));
		saList.add(new Sawon(5,"eee","기획재정",LocalDate.now()));
		saList.add(new Sawon(4,"ddd","생산",LocalDate.now()));
		saList.add(new Sawon(2,"bbb","물류",LocalDate.now()));

		SawonData saData = new SawonData(saList);
		
		saData.dataPrint();	// 출력
		saData.dataSort();	// 정렬
		System.out.println();
		saData.dataPrint();	// 다시 출력
		
		
	}
	

}
