package p01_map.tree.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Student> sList = new ArrayList<Student>();	// 입력순 출력을 위한 어레이 리스트
		Set<Student> sSet = new TreeSet<Student>();	// 번호순 정렬 출력을 위한 트리셋

		while (true) {
			
			String inStr = scan.next();	// 문장을 입력받음
			
			if(inStr.equals("0"))	// 만약 0이면 종료
				break;	
			
			String[] str = inStr.split(",");	// "," 를 기준으로 쪼개서 문자열 배열로 받아줌

			if (str.length == 3) {	// 만약 3개가 맞을때
				if (str[0] != null && str[1] != null && str[2] != null) {	// 제대로 입력되었으면

					int num = Integer.parseInt(str[0]);	// 첫번째는 번호로
					if (num == 0)	// 만약 0번이면 종료
						break;	
					String name = str[1];	// 두번째를 이름으로
					int score = Integer.parseInt(str[2]);	// 세번째를 점수로 
					
					Student temp = new Student(num,name,score);	// 위의 3 요소들로 객체 생성
					if(!sList.contains(temp)) {	// 만약 중복이 아니면
						sList.add(temp);	// 리스트에 추가
						sSet.add(temp);	// 트리셋에 추가
					}
					

				} else
					System.out.println("잘못된 입력입니다");
			} else
				System.out.println("잘못된 입력입니다");

		}	// 반복문 종료
		scan.close();

		// 리스트 출력
		System.out.println("정렬 전");
		System.out.println("번호\t이름\t점수");
		for(int i = 0; i < sList.size();i++)
			System.out.println(sList.get(i));
		
		// 트리셋 출력
		System.out.println("-------------------------------------");
		System.out.println("번호순으로 정렬 후");
		System.out.println("번호\t이름\t점수");
		Iterator<Student> iter = sSet.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	}

}
