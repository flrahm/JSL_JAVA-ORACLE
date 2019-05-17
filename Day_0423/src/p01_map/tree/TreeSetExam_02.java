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
		System.out.println("51�̻� : " + treeSet.headSet(51));
		System.out.println("51���� : " + treeSet.tailSet(51));
		
		System.out.println("90���� ���� �� �߿��� 90�� ���� ����� �� : " + treeSet.lower(90));
		System.out.println("90���� ū �� �߿��� 90�� ���� ����� �� : " + treeSet.higher(90));
		
		System.out.println("90�� ���ų� ���� �� �߿��� 90�� ���� ����� �� : " + treeSet.floor(90));
		System.out.println("90�� ���ų� ū �� �߿��� 90�� ���� ����� �� : " + treeSet.ceiling(90));
		
		System.out.println("���� ���� �� : " + treeSet.first());
		System.out.println("���� ū �� : " + treeSet.last());

		
		Iterator<Integer> iter = treeSet.iterator();

		int sum = 0;
		while (iter.hasNext()) {
			sum += iter.next();
		}
		System.out.println("�հ�  : " + sum);
	}

}
