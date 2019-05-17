package P02_insa;

import java.util.ArrayList;
import java.util.List;

public class Sawon2Test {

	public static void main(String[] args) {

		List<Sawon2> sList = new ArrayList<Sawon2>();
		Sawon2 sa = new Sawon2(0, "DDAA");
		sList.add(sa);

		sList.add(new Sawon2(1, "aaaa"));
		sList.add(new Sawon2(2, "bbbb"));
		sList.add(new Sawon2(3, "cccc"));
		sList.add(new Sawon2(4, "dddd"));
		sList.add(new Sawon2(5, "eeee"));

		// way 1
		sList.get(0).setName("홍길동");

		for (int i = 0; i < sList.size(); i++) {
			if (sList.get(i).getSabun() > 3)
				sList.get(i).sPrint();
		}
		
		
		System.out.println();
		// way 2
		for (int i = 0; i < sList.size(); i++) {
			Sawon2 temp = sList.get(i);
			// Sawon temp = (Sawon)sList.get(i); // 제네릭 설정을 안해줬으면 캐스팅을 해줘야 함
			temp.sPrint();
		}
	}

}
