package p01_map.tree.Sawon;

import java.util.Iterator;
import java.util.TreeSet;

public class SawonTest {

	public static void main(String[] args) {
		TreeSet<Sawon> sSet = new TreeSet<Sawon>();
		
		Sawon s = new Sawon();
		sSet.add(s);
		sSet.add(new Sawon(2,"aaa",50));	// 사용자 정의 객체는 java.lang.Comparable 을 구현해야함
		sSet.add(new Sawon(1,"bbb",40));
		sSet.add(new Sawon(4,"ccc",60));
		sSet.add(new Sawon(3,"ddd",30));
		
		Iterator<Sawon> iter = sSet.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
