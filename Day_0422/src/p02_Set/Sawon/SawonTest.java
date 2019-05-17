package p02_Set.Sawon;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SawonTest {

	public static void main(String[] args) {
		
		Set<Sawon> sSet = new HashSet<Sawon>();

		sSet.add(new Sawon("1","aaa",23));
		sSet.add(new Sawon("1","bbb",34));
		sSet.add(new Sawon("2","ccc",41));
		sSet.add(new Sawon("3","ddd",25));
		sSet.add(new Sawon("4","eee",29));
		sSet.add(new Sawon("4","fff",28));
		sSet.add(new Sawon("5","aaa",30));
		
		
		
		

		Iterator<Sawon> iter = sSet.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
