package p01_map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExam_01 {

	public static void main(String[] args) {

		// Map �� �������̽���. key - value �� ������ �̷���� ����
		Map<Integer, String> map = new HashMap<Integer, String>(); // ����ȭ ��������. �Ϲ������� ���
		Map<Integer, String> map2 = new Hashtable<Integer, String>(); // ����ȭ ����. ������ �̿�� �����
		// Key Value : key �� value ��� ��ü��

		map2.put(1, "test"); // auto boxing

		/////////////////////////////////////////////////////////////////

		map.put(1, "java");
		map.put(2, "python");
		map.put(3, "c++");
		map.put(4, "pearl");
		map.put(1, "javascript"); // Ű�� �ߺ��� �ȵ�. �������� ���������� ����

		System.out.println(map.size()); // 4
		System.out.println(map); // {1=javascript, 2=phython, 3=c++, 4=pearl}
		System.out.println(map.get(2)); // phython
		// get : key ���� ������ value ���� ��ȯ��

		System.out.println(map.containsKey(3)); // true
		System.out.println(map.containsValue("java")); // false
	}

}

class A { // ��ø Ŭ����. B �� ���� : A.B.y = 50;
	int x = 10;

	class B {
		int y = 100;
	}
}