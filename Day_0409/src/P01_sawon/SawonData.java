package P01_sawon;

import java.util.ArrayList;
import java.util.List;

public class SawonData {

	List<Sawon> list = new ArrayList<Sawon>();

	public SawonData() {
	}

	public SawonData(List<Sawon> list) {
		this.list = list;
	}

	public void dataPrint() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public void dataSort() {

		for (int i = 0; i < list.size(); i++)	// 버블 정렬 알고리즘
			for (int j = 0; j < list.size() - 1 - i; j++)	
				if (list.get(j + 1).getSabun() < list.get(j).getSabun()) {// 사번에 의한 비교
					
					// Swap 
					Sawon saTemp = list.get(j);	
					list.set(j, list.get(j + 1));
					list.set(j + 1, saTemp);
				}

	}

}
