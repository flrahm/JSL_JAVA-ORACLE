import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);	// 스캐너 객체 생성
		
		Student[] std = new Student[10];	// Student 인스턴트 배열 10 개 생성
		
		int cnt = 0;	// 입력 개수를 카운팅
		while(cnt < 10) {	// 최대 10개이므로 10개 전에 저장

			System.out.println("번호 이름 점수를 입력하세요. 0번이면 종료, 최대 10개");
			int num = scan.nextInt();	// 번호를 키보드로 입력받음
			if(num == 0)	// 만약 번호가 0이면 종료
				break;
			String name = scan.next();	// 이름을 입력
			int score = scan.nextInt();	// 점수를 입력
			
			std[cnt] = new Student(num,name,score);	// 3요소를 모두 입력받았으면 인스턴트 배열객체에 저장
			cnt ++;	// 입력 갯수를 증가시켜줌
		}
		
		Student.printTitle();	// 타이틀 찍기. static 으로 선언했음
	
		for(int i = 0; i < cnt; i++) {	// 인스턴스 배열의 처음부터(0) ~ 입력받은 갯수만큼 출력
			std[i].printStd();	// 출력함
		}
		
		scan.close();
	}
	
	
}
