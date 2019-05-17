class AA{
	int x;
	int y;
	
	AA(){	// 오버로딩
		this(100);	// 자기 자신의 생성자를 호출.1
		System.out.println("1111");
		
	}	
	AA(int x){
		this(x,30);	// 그럼 여기로 감.2
		this.x = x;	// 둘 순서가 바뀌면 안됨.
		System.out.println("2222");
	}
	AA(int x, int y){
		this.x = x;	// 이건 다시 여기로 감.3
		this.y = y;
		System.out.println("3333");
	}
	
	
	
	void add(int a) {
		System.out.println(a);
	}
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	void add(int ... x) { // 가변 인자. x 는 자동적으로 배열이 됨
		int sum = 0;
		
		for(int i = 0; i < x.length ; i++)
			sum += x[i];
		
		System.out.println(sum);
	}
}


public class OverloadingWithConstructor {

	public static void main(String[] args) {
		
		AA a = new AA();
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println();
		
		a.add(1);
		a.add(1,2);
		a.add(1,2,3);
		a.add(1,2,3,4,5,6,7,8,9,10);
	}

}
