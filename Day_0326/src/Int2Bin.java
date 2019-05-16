
public class Int2Bin {

	public static void main(String[] args) {
		
		int x = 12321;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(SelfMade.in2bin(x));
		String str = "";
		
		while(x>0) {
			if(x%2 == 1)
				str = "1" + str;
			else
				str = "0" + str;
			x = x/2;
		}

		System.out.println(str);
		
	}

}
