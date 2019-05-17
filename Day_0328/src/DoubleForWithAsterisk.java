
public class DoubleForWithAsterisk {

	public static void main(String[] args) {
		
		for(int i =1 ; i <=5 ; i++) {
			
			for(int  j = 1; j <= 5 ; j ++)
				System.out.print("*");
			
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		for(int i =1 ; i <=5 ; i++) {
			
			for(int  j = 1; j <= i ; j ++)
				System.out.print("*");
			
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		for(int i =1 ; i <=5 ; i++) {
			
			for(int  j = 1; j <= 6-i ; j ++)
				System.out.print("*");
			
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		for(int i =1 ; i <=5 ; i++) {
			
			for(int j = 1; j <= 5-i ; j ++)
				System.out.print(" ");
			
			for(int  j = 1; j <= 2*i-1 ; j ++)
				System.out.print("*");
			
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		int a = 0;
		
		for(int i = 1 ; i <= 10 ; i ++) {
			
			if (i<5)
				a = i;
			else
				a = 10 - i;
					
			
			for(int j = 1; j <= a ; j ++)
				System.out.print("*");
			
			
			System.out.println();
		}
		
		System.out.println("-----------------------");
					
		a = 0;
		int b = 0;
		
		for(int i = 1; i <= 10 ; i ++) {
			if (i <=5 ) {
				a = 5-i;
				b = 2*i - 1;
			}
			else {
				a = i-5;
				b = 9 - (i-5)*2;
			}
			for(int j = 1; j <= a ; j++)
				System.out.print(" ");
			
			for(int j = 1; j <=b ; j ++)
				System.out.print("*");
			
			
			
			System.out.println();
		}
		
	}

}
