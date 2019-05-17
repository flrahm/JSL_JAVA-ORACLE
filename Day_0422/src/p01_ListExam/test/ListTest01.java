package p01_ListExam.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// 이름을 키보드로 입력받아서 List 에 추가 후 출력
// 이름이 end 면 종료
// 동일한 이름 중복 안됨

public class ListTest01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in); //
		String name; // 이름을 입력받아서 저장할 변수
		boolean flag = true; // 중복되는것이 있는지 검사하는 플래그. true 이면 중복이 없음, false 이면 중복됨으로 할꺼

		System.out.println("이름을 입력하세요");
		while (true) {

			flag = true; // 플래그를 true 로 초기화
			name = scan.next(); // 이름을 입력받음

			if (name.equals("end")) { // end가 입력되면 종료
				System.out.println("종료합니다");
				break;
			}

			///// 중복되는 요소가 있는지 검사
			for (int i = 0; i < list.size(); i++) // 리스트의 사이즈만큼 반복
				if (name.equals(list.get(i))) { // 만약 입력된 이름과 저장된 이름값 중 같은것이 발견되면
					System.out.println("중복입니다");
					flag = false; // 플래그를 false 로 세팅
					break; // 더 볼 필요가 없으므로 빠져나옴
				}
			
			// flag = list.contains(name);		// 으로 대체 가능
			
			/////////////////////
			if (flag) // 만약 위의 검사를 통과하면(중복값이 없으면)
				list.add(name); // 입력된 이름을 리스트에 추가

		}
		scan.close();

		// 반복자를 이용하여 출력
		System.out.println("=======================");
		Iterator<String> iter = list.iterator();

		while (iter.hasNext())
			System.out.println(iter.next());

	}

}
