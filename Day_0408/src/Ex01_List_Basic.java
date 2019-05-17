import java.util.ArrayList;
import java.util.List;

public class Ex01_List_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list = new ArrayList<Object>();
		
		list.add(1);
		list.add('B');
		list.add("aaaa");
		list.add(3.14);
		list.add(true);
		

		
		
		System.out.println("list size : " + list.size());
		System.out.println();
		System.out.println("리스트 목록 : ");
		for(int i = 0; i < list.size() ; i++)
			System.out.println(list.get(i));
		
		System.out.println();
		if(list.contains("aaaa") == true)
			System.out.println("aaaa 가 리스트에 존재합니다 ");
		System.out.println();
		
		System.out.println("3.14 는 리스트의 " + (list.indexOf(3.14) + 1) + " 번 째에 존재합니다");
		
	}

}
