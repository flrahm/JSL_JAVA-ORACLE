class F{
	int x = 10;
	int y = 100;
	
	static int a = 1000;
	void print() {
		System.out.println("부모 인스턴스입니다");
	}
}

class Fa extends F{
	int x = 20;
	int z = 30;

	
	static int a = 2000;
	
	@Override
	void print() {
		System.out.println("자식 인스턴스입니다");
	}
}

class Fb extends F{
	int k = 40;
	void print() {
		System.out.println("자식 인스턴스입니다");
	}
}

public class Inheritance_2 {

	public static void main(String[] args) {
		
		F f = new F();
		Fa fa = new Fa();
		Fb fb = new Fb();
		
		
		
		System.out.println(f.x);
		f.print();
		
			// 조상 클래스를 이용하여 자식클래스에 접근 가능
		F test = new Fa();	// 가능
		//Fa test2 = new F();	 불가능
		f = fa;	// 부모인스턴스에 자식인스턴스 대입 가능
		//Fa = f; // 불가능
			

		System.out.println(f.x);
		f.print();
	}

}
