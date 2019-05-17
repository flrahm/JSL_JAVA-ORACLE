package p01_map.tree;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam_04 {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> score =new TreeMap<Integer,String>();
		
		score.put(87, "aaa");
		score.put(94, "bbb");
		score.put(52, "ccc");
		score.put(39, "ddd");
		score.put(95, "eee");
		score.put(73, "fff");
		score.put(65, "ggg");
		
		Map.Entry<Integer, String> entry = score.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getValue() + " " + entry.getKey());
		entry = score.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getValue() + " " + entry.getKey());
		
		System.out.println();
		System.out.println("80점 이하");
		Set<Map.Entry<Integer, String>> entrySet = score.headMap(80).entrySet();
		Iterator<Map.Entry<Integer, String>> iter = entrySet.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());
		
		
	}

}
