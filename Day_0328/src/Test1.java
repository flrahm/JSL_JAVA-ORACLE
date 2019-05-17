
public class Test1 {

	public static void main(String[] args) {
		
		int a = 0;
		
		for(int i = 0; i < 10 ; i ++) {
			
			if(i >= 5)
				a = 10 - (i+1);
			else
				a = i+1;
			
			
			for(int j = 0 ; j < a ; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
	}

}
