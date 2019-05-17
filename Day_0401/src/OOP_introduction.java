/* 
  		객체지향 3단계
 1. 객체 모델링 : 추상화단계(기능과 속성으로 분리)
 	ex) 마우스의 기능 : 선택(원클릭) , 실행(더블클릭), 커서 이동, 드래그 등 
 		마우스의 속성 : 버튼 수, 광학-볼마우스 , 색상, 무선 유선
 		기능 : 메소드로 구현 / 속성 : 변수로 구현
 2. 클래스 정의 : Mouse.java
 3. 객체 생성 및 사용 : 
*/

public class OOP_introduction {

	public static void main(String[] args) {
		
		Mouse m;	// Mouse 클래스에 대한 참조변소 m 선언
		m = new Mouse();	// 객체 생성. 객체가 저장되는 메모리 공간 : heap 
		
		Mouse m2 = new Mouse();
		
		System.out.println(m);
		System.out.println(m2);
		
		m2.color = "blue";
		m2.button = 2;
		
		m.color = "red";
		m.button = 3;
		
		m.check();
		m2.check();
		System.out.println(m.button);
		System.out.println(m2.button);
		
		m2 = m;
		m.check();
		m2.check();
		System.out.println(m.button);
		System.out.println(m2.button);

		
	}

}
