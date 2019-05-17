package p01_ListExam.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// 이름을 키보드로 입력받아서 List 에 추가 후 출력
// 이름이 end 면 종료
// 동일한 이름 중복 안됨

public class ListTest02 {

	public static void main(String[] args) {

		List<TestClass> list = new ArrayList<TestClass>();
		list.add(new TestClass("1","aaa"));
		list.add(new TestClass("2","bbb"));
		list.add(new TestClass("3","ccc"));
		
		TestClass t = new TestClass("1","aaa");
		if(!list.contains(t))
			list.add(t);
		
		TestClass t2 = new TestClass("4","ddd");
		if(!list.contains(t2))
			list.add(t2);

		// 반복자를 이용하여 출력
		
		Iterator<TestClass> iter = list.iterator();

		while (iter.hasNext())
			System.out.println(iter.next());

	}

}
