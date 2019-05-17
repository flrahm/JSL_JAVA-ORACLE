// list initialization with asList

package p01_ListExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExam_04 {

	public static void main(String[] args) {
		
		
		//way 1
		List<Object> list = new ArrayList<Object>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		////////////////////////////////////////////
		
		//way2 
		List<Object> list2 = Arrays.asList(10,20,30,"aaa");
		
		System.out.println(list2);
		
	}
}
