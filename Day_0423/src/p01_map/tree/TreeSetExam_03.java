package p01_map.tree;


import java.util.TreeSet;

public class TreeSetExam_03 {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		int[] score = {3,2,4,1,5,8,7,9};

		for (int i = 0; i < score.length; i++)
			treeSet.add(score[i]);

		System.out.println(treeSet);
		int a = treeSet.pollFirst();	// 처음(가장 작은)의 요소를 반환하고 제거
		System.out.println(a);
		System.out.println(treeSet);
	}
}
