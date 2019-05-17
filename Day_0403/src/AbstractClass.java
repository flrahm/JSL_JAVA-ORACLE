abstract class AbsClass{	// 클래스 내에 하나라도 추상메소드가 있으면 추상클래스가 되어야 함 
							// 객체를 생성할 수 없음
							// 따라서 상속을 무조건 받아야 함
	
	public void add(int a , int b) {
		System.out.println("a + b = "+ (a+b));
	}
	
	public abstract void mul(int a, int b);	// 추상메소드 . 몸체가 없음
}

class Achild extends AbsClass {	// 추상메소드를 상속받으면 추상메소드를 무조건 구현해야함.  
	// 프로젝트 팀장이 추상클래스를 구현해서 팀원들한테 던져주는 식
	
	@Override		// ctrl + space 찍으면 자동으로 만들어야 할 것들이 보임. @Override 이건 없어도 됨
	public void mul(int a, int b) {
		
	}
	

}

public class AbstractClass {

	public static void main(String[] args) {
		
		//AbsClass a = new AbsClass();     // 불가능

	}

}
