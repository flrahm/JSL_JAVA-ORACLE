
public class MemberTest_AbstractClass {

	public static void main(String[] args) {
		
		MemberExam mem = new MemberExam(1,"홍길동",30 );
		
		
		mem.Mprint();
		//1 홍길동 30
		
		
		int money = mem.result(10000);
		//300000		:  나이 * money 결과값
		System.out.println("money = " + money);
		
		mem.update(3,50);
		//1 홍길동 50 -> 동일
		
		mem.update(1,70);
		
	}
}
