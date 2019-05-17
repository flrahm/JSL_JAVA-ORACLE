package p02_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam_02_Set2List {

	public static void main(String[] args) {
		
		//set : 순서가 없고 중복이 안됨
		
		Set<Object> set = new HashSet<Object>();
		set.add("java");
		set.add("phython");
		set.add("DataBase");
		System.out.println(set.add("java")); // 안들어감
		
		System.out.println(set.size());
		System.out.println(set);
		System.out.println(set.contains("java"));
		System.out.println();
		
		// 출력
		Iterator<Object> setIter = set.iterator();
		while(setIter.hasNext())
			System.out.println(setIter.next());
		System.out.println();
		for(Object obj : set)
			System.out.println(obj);
		
	}

}
