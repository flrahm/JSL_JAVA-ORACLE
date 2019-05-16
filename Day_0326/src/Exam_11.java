import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("10진수 : ");
		int dec = scan.nextInt();
		
		System.out.print("2진수 : ");
		String bin_input = scan.next();
		
		System.out.print("8진수 : ");
		String oct_input = scan.next();
		System.out.print("16진수 : ");
		String hex_input = scan.next();
		System.out.println("------------------------------");
		
		////////////////////////10진수///////////////////////////////////////////
		System.out.println("10진수 "+ dec + " 는 2진수 0b" + Integer.toBinaryString(dec));
		
		
		///////////////////////2진수//////////////////////////////////////////
		String bin_temp = bin_input.substring(2);
		int x = Integer.parseInt(bin_temp);
		int cnt = 1;
		int bin = 0;
		while(x > 0) {
			if(x%10 == 1)
				bin = bin + cnt;
			x = x/10;
			cnt = cnt * 2;
		}
		System.out.println("2진수 "+ bin_input + " 는 10진수 " + bin);
		////////////////////////8진수////////////////////////////////
		
		String oct_temp = oct_input.substring(1);
		int y = Integer.parseInt(oct_temp);
		int cnt2 = 1;
		int oct = 0;
		while(y>0) {
			oct = oct + ((y%10) * cnt2);
			cnt2 = cnt2 * 8;
			y = y/10;
		}
		System.out.println("8진수 "+ oct_input + " 는 2진수 0b" + Integer.toBinaryString(oct));
		
		//////////////////////////////////16진수////////////////////////
		
		String hex_temp = hex_input.substring(2);
		int z = Integer.parseInt(hex_temp);
		int cnt3 = 1;
		int hex = 0;
		while(z>0) {
			hex = hex + ((z%10) * cnt3);
			cnt3 = cnt3 * 16;
			z = z/10;
		}
		System.out.println("16진수 "+ hex_input + " 는 8진수 0" + Integer.toOctalString(hex));
		
		/////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		scan.close();

	}

}
