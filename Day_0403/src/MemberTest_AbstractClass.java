
public class MemberTest_AbstractClass {

	public static void main(String[] args) {
		
		MemberExam mem = new MemberExam(1,"ȫ�浿",30 );
		
		
		mem.Mprint();
		//1 ȫ�浿 30
		
		
		int money = mem.result(10000);
		//300000		:  ���� * money �����
		System.out.println("money = " + money);
		
		mem.update(3,50);
		//1 ȫ�浿 50 -> ����
		
		mem.update(1,70);
		
	}
}
