//sublist, equals , indexOf

package p01_ListExam;

import java.util.ArrayList;

import java.util.List;
public class ListExam_03 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Java");		// 0
		list.add("C++");		// 1
		list.add("phython");	// 2	
		list.add("Java");		// 3
		list.add("Assembly");	// 4
		list.add("Java");		// 5
		
		int index1 = list.indexOf("Java");	// 0������ �˻�
		System.out.println(index1);
		int index2 = list.lastIndexOf("Java");	// ���������� �˻�
		System.out.println(index2);
		
		///////////////////////////////////////////
		List<String> list2 = list.subList(3, 5);	// 3, 4
		// List<String> list2 = list.subList(0,list.size());	// �̷��� �ϸ� �����ɷ� ����
		System.out.println(list2);
		System.out.println(list.equals(list2));	// �ٸ�
		/////////////////////////////
		List<String> list3 = list;
		System.out.println(list.equals(list3));
		list3.add("new");
		System.out.println(list);
	}
}
