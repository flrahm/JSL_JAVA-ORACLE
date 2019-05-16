
public class SelfMade {

	public static String in2bin(int x) {
		
		String str = "";
		
		while(x > 0) {
			if (x%2==1)
				str = "1" + str;
			else
				str = "0" + str;
			
			x = x/2;	
		}

		return str;
	}

}
