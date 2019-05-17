// 상속. 원칙상으로 다중상속 안됨. 상속에 상속을 하여 편법으로 가능

class GG {
	int x = 10;
	int y = 20;

	public void print() {
		
		System.out.println("부모 클래스의 print() 메소드 입니다");
		System.out.println();
	}

}

class GGa extends GG { // extends : 상속 키워드
	// int x = 10;
	// int y = 20; 상속 받는 순간 이것들이 같이 존재함
	int x = 30;

	public void print() {	// 오버라이딩(재정의).  오버로딩과 착각하지 않도록
		
		super.print(); // 상위 클래스의 프린트라는 메소드를 호출	// this. 같이 사용
		
		System.out.println("자식 클래스의 print() 메소드 입니다");
		System.out.println(x +"   " +  super.x);
		System.out.println();
	}
}



public class Overwriting {

	public static void main(String[] args) {

		GG GG = new GG();
		GGa GGa = new GGa();


		GG.print();
		System.out.println("---------------------");
		GGa.print();
		System.out.println("---------------------");



	}

}
