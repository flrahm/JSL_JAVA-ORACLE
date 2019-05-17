class DD {
	int x;
	int y;
	{
		x = 10;		// 초기화 코드 블럭
		y = 0;		
	}
	
	static int a;
	static int b;
	static {
		a = 1000;	// 정적 초기화 코드 블럭
		b = 500;
	}

	public DD(int x, int y) {	// 생성자를 이용한 초기화
		this.x = x;
		this.y = y;
	}
	
	public void test(int a) {
		
	}
	
	
}

public class Class_Initialization {

	public static void main(String[] args) {

	}

}
