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

		// key : 이름 value = 점수
		map.put("java", 99);
		map.put("python", 85);
		map.put("c++", 97);
		map.put("pearl", 63);
		map.put("c#", 44);

		// key값과 value 값 추출해서 set에 넣기
		Set<Map.Entry<String, Integer>> set = map.entrySet(); // key 와 value 를 하나로 묶어버림
		System.out.println(set); // [c#=44, python=85, c++=97, java=99, pearl=63]

		Iterator<Map.Entry<String, Integer>> iter = set.iterator();

		while (iter.hasNext()) {
			Map.Entry<String, Integer> me = iter.next();
			System.out.println(me.getKey() + "\t" + me.getValue());
		}
		//////////////////////////////////////////
		// key 값만 추출하기
		System.out.println();
		Set<String> set2 = map.keySet();
		System.out.println("key값 모음 : " + set2);

		////////////////////////////////////////
		// value 값만 추출하기. Collection 으로 받음
		System.out.println();

		Collection<Integer> set3 = map.values();
		System.out.println("점수 목록");
		System.out.println(set3);

		Iterator<Integer> iter2 = set3.iterator();
		int valSum = 0;
		while (iter2.hasNext())
			valSum += iter2.next();

		System.out.println("총점 : " + valSum);
		System.out.println("평균 : " + (int) (1.0 * valSum / set3.size()));
		System.out.println("최대값 : " + Collections.max(set3));
		System.out.println("최소값 : " + Collections.min(set3));
	}

}
