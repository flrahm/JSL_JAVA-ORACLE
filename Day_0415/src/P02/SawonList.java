package P02;

import java.util.ArrayList;
import java.util.List;

public class SawonList {

	List<Sawon> sList;
	
	SawonList(){
		sList = new ArrayList<Sawon>();
		
		sList.add(new Sawon(1101,"aaa"));
		sList.add(new Sawon(1102,"bbb"));
		sList.add(new Sawon(1103,"ccc"));
		sList.add(new Sawon(1104,"ddd"));
		sList.add(new Sawon(1105,"eee"));
		sList.add(new Sawon(1106,"fff"));
		sList.add(new Sawon(1107,"ggg"));
		sList.add(new Sawon(1108,"hhh"));
		sList.add(new Sawon(1109,"iii"));
		sList.add(new Sawon(1110,"jjj"));
	
	}
	
	public Sawon sawonSearch_linear (int num) {///
		
		Sawon sawon = null;
		
		for(int i = 0; i < sList.size();i++) {
			if(sList.get(i).sabun == num)
				sawon = sList.get(i);
		}
		
		return sawon;
		
	}///
	
}
