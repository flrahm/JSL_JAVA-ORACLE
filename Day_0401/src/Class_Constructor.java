class C{
	
	String na;
	int n;
	int m;
	
	// 생성자. 객체가 처음 만들어질때 호출되는 메소드
	// 클래스 이름과 똑같은 이름을 가짐.
	C(){}	// 디폴트 생성자를 만들어주고 작성하는것이 좋음
	C(String na){	// 생성자 오버로딩. 동일한 이름에 매개변수가 다른 메소드 여러개 작성
		this.na = na;
	}
	C(String na , int n, int m ){	// 생성자
		this.na = na;		// this. : 자기 자신을 의미. 멤버변수
		this.n = n;
		this.m = m;
	}
	
	public void  sum() {
		System.out.println(" 결과 : " + na);
		for(int i =n; i <= m ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
	}
	
}

public class Class_Constructor {

	public static void main(String[] args) {
		
		C c1 = new C("1~10 의 합 ",1,10);
		//			ㄴ생성자.   C()  <- 디폴트 생성자
		
		C c2 = new C("dddddd");
		c1.sum();
		c2.sum();
	}

}
