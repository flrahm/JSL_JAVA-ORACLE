import java.util.ArrayList;
import java.util.List;

public class Ex02_List_generic {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		//		¤¤ genetic type
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		
		int sum = 0 ;
		for(int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));
			sum+= list.get(i);
		}
		
		System.out.println("sum = " + sum);
		
	}

}
