package p02_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExam_01_addAndPrint {

	public static void main(String[] args) {
		
		//set : ������ ���� �ߺ��� �ȵ�
		
		Set<Object> set = new HashSet<Object>();
		set.add("java");
		set.add("phython");
		set.add("DataBase");
		set.add("phython");
		
		// set ��  list �� ��ȯ 
		List<Object> list = new ArrayList<Object>(set);
		for(int i = 0 ;i < list.size() ; i++)
			System.out.println(list.get(i));
		
	}

}
