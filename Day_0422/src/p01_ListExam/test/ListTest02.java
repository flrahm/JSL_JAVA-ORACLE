package p01_ListExam.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// �̸��� Ű����� �Է¹޾Ƽ� List �� �߰� �� ���
// �̸��� end �� ����
// ������ �̸� �ߺ� �ȵ�

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

		// �ݺ��ڸ� �̿��Ͽ� ���
		
		Iterator<TestClass> iter = list.iterator();

		while (iter.hasNext())
			System.out.println(iter.next());

	}

}
