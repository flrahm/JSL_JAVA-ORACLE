package p01_map.member;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// member 객체가 동일하면 중복되지 않도록 구현
// 입력 : 7,홍길동,95 (번호 이름 점수)

public class MemberTest {

	public static void main(String[] args) {
	
		Map<Member,Integer> mMap = new HashMap<Member,Integer>();

		
		Scanner scan = new Scanner(System.in);

		System.out.println("번호 이름 점수를 입력하세요");
		while(true) {
			
			String[] str = scan.next().split(",");	// 입력값을 "," 로 쪼갬
			
			if(str.length == 3) {	// 3개가 제대로 입력되었을경우
				int bun = Integer.parseInt(str[0]);	// 첫번째것을 번호로
				if(bun == 0) {	// 번호가 0이면 종료
					System.out.println("입력이 종료되었습니다");
					break;
				}
				String name = str[1];	// 두번째것을 이름으로
				int score = Integer.parseInt(str[2]);	// 세번째 것을 번호로
				Member mem = new Member(bun,name);	// 입력값을 가지고 임시로 멤버 객체를 생성
				if(mMap.containsKey(mem)==false) {	// 만약 중복이 아니면
					mMap.put(mem,score);	// 맵 추가
				}
			}
			else
				System.out.println("잘못된 입력입니다");
		}
		
		scan.close();
		
		System.out.println();

		
		// 출력 way 1 : entry set 이용
		System.out.println("번호\t이름\t점수");
		
		Set<Map.Entry<Member, Integer>> mSet = mMap.entrySet();	 // 엔트리 셋
		Iterator<Map.Entry<Member, Integer>> mIter = mSet.iterator();	// 이터레이터

		while(mIter.hasNext()) {
			Map.Entry<Member, Integer> entry = mIter.next();	// 엔트리를 읽어서 저장
			Member mem = entry.getKey();	// 멤버값을 만들어서 키값을 받음
			int score = entry.getValue();	// 인트형 변수를 만들어서 밸류값을 받음
			
			System.out.println(mem.getNum() +"\t"+mem.getName()+"\t"+score);	// 출력
			
		}
		// 출력 way 2	: key set 이용
		System.out.println("----------------------------------");
		
		Set<Member> mSet2 = mMap.keySet();	// 키셋
		Iterator<Member> mIter2 = mSet2.iterator();	// 이터레이터
		while(mIter2.hasNext()) {	
			Member mem = mIter2.next();
			int score = mMap.get(mem);
			
			System.out.println(mem.getNum() +"\t"+mem.getName()+"\t"+score);
		}
	}

}
