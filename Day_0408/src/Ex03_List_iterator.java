import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03_List_iterator {

	public static void main(String[] args) {
		
		List<Object> aList = new ArrayList<Object>();
		
		aList.add("1234");
		aList.add(3.14);
		aList.add("ȫ�浿");
		aList.add(90);
		
		//��� 1
		for(int i = 0; i < aList.size() ; i++) {
			System.out.println(aList.get(i));
		}
		System.out.println();
		//
		
		aList.set(2, "���ڹ�");	// �ε����� �ִ� �� �ٲٱ�
		aList.remove(3);	// �ε����� �ִ� �� �����
		//��� 2
		Iterator<Object> iter = aList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
