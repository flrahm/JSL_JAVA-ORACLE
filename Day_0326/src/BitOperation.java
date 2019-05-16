
public class BitOperation {

	public static void main(String[] args) {
		
		
		
		int x1 = 0b0_111_100;
		int x2 = x1 >> 3;	
		int x3 = x1 << 2;
		int x4 = x1 ^ 0b0_101_101;	// 배타적 논리합. 같을때는 0, 다를때는 1 
		int x4_2 = x4 ^ 0b0_101_101;
		int x5 = x1 | 0b0_000_001;
		int x6 = x1 & 0b0_110_111;
		int x7 = ~x1;
		boolean a = true;
		boolean b = !a;
		boolean c = a^b; 

		int aa = 10;
		int bb = ~aa + 1;	// -10 
		int cc = ~bb + 1;	// 10
		
		System.out.println(Integer.toBinaryString(x1)+"  " + x1);
		System.out.println(Integer.toBinaryString(x2));
		System.out.println(Integer.toBinaryString(x3));
		System.out.println(Integer.toBinaryString(x4));
		System.out.println(Integer.toBinaryString(x4_2));
		System.out.println(Integer.toBinaryString(x5));
		System.out.println(Integer.toBinaryString(x6));
		System.out.println(Integer.toBinaryString(x7));
		System.out.println(x7);
		System.out.println("------------------------------");
		System.out.println(b);
		System.out.println(c);
		System.out.println("------------------------------");
		System.out.println(bb);
		System.out.println(cc);
	}

}
