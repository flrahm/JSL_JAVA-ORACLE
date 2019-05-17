package p01_map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExam_01 {

	public static void main(String[] args) {

		// Map 은 인터페이스임. key - value 의 쌍으로 이루어진 구조
		Map<Integer, String> map = new HashMap<Integer, String>(); // 동기화 지원안함. 일반적으로 사용
		Map<Integer, String> map2 = new Hashtable<Integer, String>(); // 동기화 지원. 스레드 이용시 사용함
		// Key Value : key 와 value 모두 객체임

		map2.put(1, "test"); // auto boxing

		/////////////////////////////////////////////////////////////////

		map.put(1, "java");
		map.put(2, "python");
		map.put(3, "c++");
		map.put(4, "pearl");
		map.put(1, "javascript"); // 키는 중복이 안됨. 마지막에 넣은것으로 저장

		System.out.println(map.size()); // 4
		System.out.println(map); // {1=javascript, 2=phython, 3=c++, 4=pearl}
		System.out.println(map.get(2)); // phython
		// get : key 값을 넣으면 value 값을 반환함

		System.out.println(map.containsKey(3)); // true
		System.out.println(map.containsValue("java")); // false
	}

}

class A { // 중첩 클래스. B 에 접근 : A.B.y = 50;
	int x = 10;

	class B {
		int y = 100;
	}
}