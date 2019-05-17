
public class test2 {

	public static void main(String[] args) {

		int num = 50;
		int primeSum = 0;
		int cnt = 0;

		for (int i = 2; i < num; i++) {

			if (isPrime(i) == true) {
				
				System.out.print(i + "\t");
				cnt ++;
				
				if(cnt%5 == 0) 
					System.out.println();

				primeSum += i;
			}
		}
		
		System.out.println();
		System.out.printf("소수의 갯수는 %d 개, 소수의 합은 %d 입니다",cnt,primeSum);
		

	}

	static boolean isPrime(int a) {
			
			boolean b = true;

			for(int i = 2; i < a ; i++) 
				if(a%i == 0)
					b = false;
			
			if(a == 2)
				b = true;
			
			return b;
		
	}

}
