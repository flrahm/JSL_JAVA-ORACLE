/*
ex) 마우스의 기능 : 선택(원클릭) , 실행(더블클릭), 커서 이동, 드래그 등 
 		마우스의 속성 : 버튼 수, 광학-볼마우스 , 색상, 무선 유선
 		기능 : 메소드로 구현 / 속성 : 변수로 구현
*/
public class Mouse {

	int button;		// 멤버 변수 ( 클래스에 속해있는 변수들)
	String color;
	
	void check() {	// 멤버 메소드 ( 클래스에 속해있는 메소드들)
		System.out.println(color + " 색상의 마우스가 동작합니다");
		System.out.println("~ 가 선택되었습니다");
	}
	
	void execute() {
		System.out.println("~를 실행합니다");
	}
	
	void move() {
		System.out.println("~ 로 이동합니다");
	}
}
