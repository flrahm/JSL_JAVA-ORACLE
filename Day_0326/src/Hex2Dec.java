//input type : 0x1a2f34d   

import java.util.Scanner;

public class Hex2Dec {
	
	public static int changer(char c) {
		
		int s = 0;
		
		switch (c) {
		case '1': 
			s = 1; break;
		case '2':
			s = 2; break;	
		case '3' :
			s = 3; break;	
		case '4' :
			s = 4; break;	
		case '5' :
			s = 5; break;
		case '6' :
			s = 6; break;		
		case '7' :
			s = 7; break;	
		case '8' :
			s = 8; break;	
		case '9' :
			s = 9; break;
		case 'a' :
			s = 10; break;
		case 'b' :
			s = 11; break;
		case 'c' :
			s = 12; break;
		case 'd' :
			s = 13; break;
		case 'e' :
			s = 14; break;
		case 'f' :
			s = 15; break;
		}		
		return s;
	}
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("16진수 값을 입력하세요 : ");
		String str_input = scan.next();

		String str = str_input.substring(2);

		
		
		int index = str.length() -1;
		
		int dec = 0;
		int cnt = 1;
		
		for(int i = 0; i < index+1 ; i++) {
			
			dec = dec + cnt * changer(str.charAt(index-i));
			cnt = cnt * 16;
			
		}
		
			System.out.println("10진수 : " + dec);
			System.out.println("8진수 : " + Integer.toOctalString(dec));
		scan.close();
	}

}
