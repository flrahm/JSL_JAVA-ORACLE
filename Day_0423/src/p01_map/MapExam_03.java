package p01_map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam_03 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		// key : �̸� value = ����
		map.put("java", 99);
		map.put("python", 85);
		map.put("c++", 97);
		map.put("pearl", 63);
		map.put("c#", 44);

		// key���� value �� �����ؼ� set�� �ֱ�
		Set<Map.Entry<String, Integer>> set = map.entrySet(); // key �� value �� �ϳ��� �������
		System.out.println(set); // [c#=44, python=85, c++=97, java=99, pearl=63]

		Iterator<Map.Entry<String, Integer>> iter = set.iterator();

		while (iter.hasNext()) {
			Map.Entry<String, Integer> me = iter.next();
			System.out.println(me.getKey() + "\t" + me.getValue());
		}
		//////////////////////////////////////////
		// key ���� �����ϱ�
		System.out.println();
		Set<String> set2 = map.keySet();
		System.out.println("key�� ���� : " + set2);

		////////////////////////////////////////
		// value ���� �����ϱ�. Collection ���� ����
		System.out.println();

		Collection<Integer> set3 = map.values();
		System.out.println("���� ���");
		System.out.println(set3);

		Iterator<Integer> iter2 = set3.iterator();
		int valSum = 0;
		while (iter2.hasNext())
			valSum += iter2.next();

		System.out.println("���� : " + valSum);
		System.out.println("��� : " + (int) (1.0 * valSum / set3.size()));
		System.out.println("�ִ밪 : " + Collections.max(set3));
		System.out.println("�ּҰ� : " + Collections.min(set3));
	}

}
