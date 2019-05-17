package p02_Set.member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberTest {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("AAA",30));
		set.add(new Member("BBB",40));
		set.add(new Member("CCC",50));
		set.add(new Member("DDD",60));
		set.add(new Member("EEE",70));
		set.add(new Member("AAA",30));
		
		System.out.println(set.size());
		Iterator<Member> iter = set.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
