import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex03_List_iterator {

	public static void main(String[] args) {
		
		List<Object> aList = new ArrayList<Object>();
		
		aList.add("1234");
		aList.add(3.14);
		aList.add("홍길동");
		aList.add(90);
		
		//출력 1
		for(int i = 0; i < aList.size() ; i++) {
			System.out.println(aList.get(i));
		}
		System.out.println();
		//
		
		aList.set(2, "김자바");	// 인덱스에 있는 값 바꾸기
		aList.remove(3);	// 인덱스에 있는 값 지우기
		//출력 2
		Iterator<Object> iter = aList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
