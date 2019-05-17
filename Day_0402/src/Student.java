
public class Student {

	int num;	// 학생 번호를 저장
	String name;	// 학생 이름을 저장
	int score;	// 학생 점수를 계산
	String graph = "";	// 출력할 별 문자열을 저장
	
	Student(){}	// 디폴트 생성자 
	Student(int num, String name, int score){	// 생성자. 번호 이름 점수를 받음 
		this.num = num;
		this.name = name;
		this.score = score;
		makeGraph();	// 별그래프 만들기 
		
	}
	
	
	void makeGraph() {		// 별 그래프를 만들기 위한 메소드 
		String temp = "";
			// 점수를 5로 나누어서 별 찍을 갯수를 저장
		
		for(int i = 1 ; i <= (score/5) ; i ++)	// 별 찍을 갯수만큼 * 을 더해줌
			temp += "*";
		
		graph = temp;	// temp 를 사용해서 끝난다음 대입해줘야 실수로 여러번 호출하더라도 제대로 찍힘
	}
	
	static void printTitle() {	// 타이틀을 출력하기 위한 메소드
		System.out.println("번호\t이름\t점수\t그래프");
	}
	
	void printStd() {	// 본문 출력을 위한 메소드

		System.out.print(num+"\t");	// 출력
		System.out.print(name+"\t");
		System.out.print(score+"\t");
		System.out.println(graph+"\t");
	}
	
}
