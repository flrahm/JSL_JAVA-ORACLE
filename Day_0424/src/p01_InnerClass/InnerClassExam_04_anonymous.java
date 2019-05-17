// 익명중첩 : 메소드를 오버라이드 하고싶을 때. 인터페이스의 익명구현객체와 같은개념.

package p01_InnerClass;

public class InnerClassExam_04_anonymous {

	public static void main(String[] args) {

		Outer4 out = new Outer4();
		out.aaa();
		out.bbb();
		
		
		Outer4 anonymous = new Outer4() {	// 인터페이스의 익명구현객체랑 비슷. 새로운 메소드 추가는 불가능함
			@Override
			public void aaa() {
				// TODO Auto-generated method stub
				System.out.println("오버라이딩aaaaaaaaaa");
			}@Override
			public void bbb() {
				// TODO Auto-generated method stub
				System.out.println("오버라이딩bbbbbbbbbb");
				ccc();
			}
			
			public void ccc() {
				System.out.println("밖에서 단독호출은 불가능 ccccccc");
			}
		};
		
		anonymous.aaa();
		anonymous.bbb();
		//anonymous.ccc();	 //새로운 메소드는 불가능 
	}

}

class Outer4 {
	
	public void aaa() {
		System.out.println("aaaaaaa");
	}
	public void bbb() {
		System.out.println("bbbbbbb");
	}


}