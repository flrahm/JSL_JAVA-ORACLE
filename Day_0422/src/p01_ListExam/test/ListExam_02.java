//iterator , enhanced for
package p01_ListExam.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ListExam_02 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();

		list.add("3");
		list.add("2");
		list.add("1");
		list.add("5");
		list.add("6");
		list.add("4");
		
		// way 1 : normal for
		for(int i = 0 ; i < list.size() ; i ++) {
			Object obj = list.get(i);
			System.out.print(obj + " ");
		}
		System.out.println();
		System.out.println("------------------------------");
		
		// way 2	: enhanced for
		for(Object obj : list)
			System.out.print(obj + " ");
		System.out.println();
		System.out.println("------------------------------");
		
		// way3 : using iterator 
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext())
			System.out.print(iter.next() + " ");
		System.out.println();
		System.out.println("------------------------------");
		//////////////////////////////////////////////////////////
		
		Collections.sort(list);	// 요소가 숫자나 문자 등 기본 자료형만 정렬 가능. 사용자 정의 클래스는 불가능
		// 정확히는 comparable, comparator 인터페이스가 구현되어있어야 가능
		System.out.println(list);
		
	}
	


	
	

}
