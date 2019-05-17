package p01_map.tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam_01 {

	public static void main(String[] args) {

		Set<Integer> set  = new HashSet<Integer>();
		for(; set.size()<6;) {
			int r = (int)(Math.random()*45) + 1;
			set.add(r);
		}
		
		System.out.println(set);
		
		//Set tree = new TreeSet();	// 트리셋 만의 고유 메소드를 사용하지 못함
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		for(; treeSet.size()<6;) {
			int r = (int)(Math.random()*45) + 1;
			treeSet.add(r);
		}
		
		System.out.println(treeSet);
		
		Iterator<Integer> iter = treeSet.descendingIterator();
		while(iter.hasNext())
			System.out.print(iter.next()+" ");
	}

}
