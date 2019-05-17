package p01_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExam_02 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		// id pw
		map.put("java", 100);
		map.put("python", 200);
		map.put("c++", 300);
		map.put("pearl", 400);

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("id 와 pw를 입력하세요 : ");
			String id = scan.next();
			if (id == "0")
				break;
			int pw = scan.nextInt();

			if (map.containsKey(id)) {
				
				if (pw == map.get(id))
					System.out.println("로그인 성공");
				else
					System.out.println("비밀번호가 일치하지 않습니다");
				
			} else
				System.out.println("존재하지 않는 id 입니다");

		}
		System.out.println("종료합니다");
		scan.close();

	}

}
