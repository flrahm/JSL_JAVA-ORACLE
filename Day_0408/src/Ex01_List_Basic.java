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
		System.out.println("����Ʈ ��� : ");
		for(int i = 0; i < list.size() ; i++)
			System.out.println(list.get(i));
		
		System.out.println();
		if(list.contains("aaaa") == true)
			System.out.println("aaaa �� ����Ʈ�� �����մϴ� ");
		System.out.println();
		
		System.out.println("3.14 �� ����Ʈ�� " + (list.indexOf(3.14) + 1) + " �� °�� �����մϴ�");
		
	}

}
