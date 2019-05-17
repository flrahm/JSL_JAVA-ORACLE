import java.util.Scanner;

/*
 * 	입력 형식
 * 번호 :	(1~10)
 * 이름 :
 * 입사일 :	(2019/01/01)
 * 기본급 :	(100 ~ 300)
 *
 * 	출력 형식
 * 번호	 이름	 입사일자 	기본급	연봉순위
 * 
 * 
*/

public class PersonTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	// 스캐너 객체 생성
		Person[] psArr = new Person[10];	// person 인스턴스 10개 생성
		int cnt = 0;	// person 인스턴스 갯수를 세기 위한 변수
		while(cnt < 10) {	// 10개가 되면 종료
			System.out.println("값을 입력하세요");
			System.out.println("번호 이름 입사일 기본급");
			int num = scan.nextInt();	// 번호를 저장
			
			if(num == 0)	// 만약 번호가 0이면 종료
				break;
			
			String name = scan.next();	// 이름을 저장
			String regDate = scan.next();	// 입사일을 저장
			int salary = scan.nextInt();	// 연봉을 저장
			
			psArr[cnt] = new Person(num,name,regDate,salary);	// 번호 이름 입사일 연봉을 전달
			cnt++;	// 갯수를 증가
		}

		ranking(psArr,cnt);	// 월급 랭킹 매기기
		sortByNum(psArr,cnt);	// 번호순 정렬
		printClass(psArr,cnt);	// 출력
		
		sortByRank(psArr,cnt);	// 월급순 정렬
		printClass(psArr,cnt);	// 출력
		
		scan.close();
	}
	
	static void sortByRank(Person[] psArr , int cnt) {	// 월급을 기준으로 정렬
		for(int i = 0; i < cnt ; i++) {
			for(int j = 0; j < cnt - 1 - i ; j++) {
				if(psArr[j].rank > psArr[j+1].rank) {	// 여기까지가 정렬 알고리즘
					
					Person temp = psArr[j];		// 밑의 세줄이 swap 하는 코드
					psArr[j] = psArr[j+1];
					psArr[j+1] = temp;
				}
			}
		}
		
	}

	static void sortByNum(Person[] psArr , int cnt) {	// 번호에 의해 정렬하는 메소드
		
		for(int i = 0; i < cnt ; i++) {
			for(int j = 0; j < cnt - 1 - i ; j++) {
				if(psArr[j].num > psArr[j+1].num) {	// 여기까지가 정렬 알고리즘
					
					Person temp = psArr[j];	 //  밑의 세줄이 swap 하는 코드
					psArr[j] = psArr[j+1];
					psArr[j+1] = temp;
				}
			}
		}
		
	}
	
	static void ranking(Person[] psArr, int cnt) {	// 월급순으로 랭킹을 매기는 메소드
		
		for(int i = 0; i < cnt ; i++) {
			int add = 1;
			for(int j = 0; j < cnt ; j++) {
				if (psArr[i].salary < psArr[j].salary) {
					add++;
				}
			}
			
			psArr[i].rank = add;
		}
		
	}
	
	static void printClass(Person[] psArr,int cnt) {	// 출력하는 메소드
		
		Person.printTitle();
		
		for(int i = 0; i < cnt ; i++) {
			psArr[i].printPerson();
		}
		System.out.println();
	}
	
	
}
