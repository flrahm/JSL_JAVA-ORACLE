package P01_sawon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SawonTest3 {

	public static void main(String[] args) {
		
		List<Sawon> saList = new ArrayList<Sawon>();
		
		saList.add(new Sawon(1,"aaa","�λ�",LocalDate.now()));
		saList.add(new Sawon(3,"ccc","������",LocalDate.now()));
		saList.add(new Sawon(5,"eee","��ȹ����",LocalDate.now()));
		saList.add(new Sawon(4,"ddd","����",LocalDate.now()));
		saList.add(new Sawon(2,"bbb","����",LocalDate.now()));

		SawonData saData = new SawonData(saList);
		
		saData.dataPrint();	// ���
		saData.dataSort();	// ����
		System.out.println();
		saData.dataPrint();	// �ٽ� ���
		
		
	}
	

}
