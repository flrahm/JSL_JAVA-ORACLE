package p01_map.tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExam_02 {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		int[] score = { 80, 97, 50, 12, 53, 19, 52, 63 ,89,96,95,90};

		for (int i = 0; i < score.length; i++)
			treeSet.add(score[i]);

		System.out.println(treeSet);
		System.out.println("51이상 : " + treeSet.headSet(51));
		System.out.println("51이하 : " + treeSet.tailSet(51));
		
		System.out.println("90보다 작은 수 중에서 90과 가장 가까운 수 : " + treeSet.lower(90));
		System.out.println("90보다 큰 수 중에서 90과 가장 가까운 수 : " + treeSet.higher(90));
		
		System.out.println("90과 같거나 작은 수 중에서 90과 가장 가까운 수 : " + treeSet.floor(90));
		System.out.println("90과 같거나 큰 수 중에서 90과 가장 가까운 수 : " + treeSet.ceiling(90));
		
		System.out.println("가장 작은 값 : " + treeSet.first());
		System.out.println("가장 큰 값 : " + treeSet.last());

		
		Iterator<Integer> iter = treeSet.iterator();

		int sum = 0;
		while (iter.hasNext()) {
			sum += iter.next();
		}
		System.out.println("합계  : " + sum);
	}

}
