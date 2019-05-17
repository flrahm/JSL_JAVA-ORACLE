package P03;

import java.util.Scanner;

public class AlphabetCounter {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);	
		int[] apbCnt = new int[26];	
		//String str = "ABCdefgabcsdf";
		String str = scan.next();
		str = str.toUpperCase();
		
		for(int i = 0; i < str.length(); i++) {
			apbCnt[str.charAt(i)-65]++;
		}
		
		for(int i = 0; i < apbCnt.length ; i++) 
			if(apbCnt[i] != 0) 
				System.out.print((char)(i+65) + " ");
		
		System.out.println();
		
		for(int i = 0; i < apbCnt.length ; i++)
			if(apbCnt[i] != 0)
				System.out.print(apbCnt[i] + " ");
			
		
		
		scan.close();
	}
	
}
