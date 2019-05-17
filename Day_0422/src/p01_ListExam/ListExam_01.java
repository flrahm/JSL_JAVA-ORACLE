//isEmpty	remove

package p01_ListExam;

import java.util.*;
public class ListExam_01 {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<Object>();

		list.add(123);	// auto boxing
		list.add(new Integer(1234));
		list.add("java");
		list.add(new String("java2"));
		list.add("java3");
		System.out.println(list); // Ãâ·Â : [123, 1234, java, java2, java3]
		System.out.println(list.size());	// 5
		System.out.println(list.isEmpty());	// false
		System.out.println(list.contains("java2"));	// true
		System.out.println(list.get(2));	 // java 
		System.out.println(list.remove(2));	// java
		System.out.println(list);	// [123, 1234, java2, java3]
		
		int a = (int)list.get(0);
		int b = (int)list.get(1);
		String str1 = (String)list.get(2);
		String str2 = (String)list.get(3);
		System.out.println();
		System.out.println(""+a+b+str1+str2);
		
	}

}
