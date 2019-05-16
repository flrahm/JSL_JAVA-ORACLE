import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("10���� : ");
		int dec = scan.nextInt();
		
		System.out.print("2���� : ");
		String bin_input = scan.next();
		
		System.out.print("8���� : ");
		String oct_input = scan.next();
		System.out.print("16���� : ");
		String hex_input = scan.next();
		System.out.println("------------------------------");
		
		////////////////////////10����///////////////////////////////////////////
		System.out.println("10���� "+ dec + " �� 2���� 0b" + Integer.toBinaryString(dec));
		
		
		///////////////////////2����//////////////////////////////////////////
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
		System.out.println("2���� "+ bin_input + " �� 10���� " + bin);
		////////////////////////8����////////////////////////////////
		
		String oct_temp = oct_input.substring(1);
		int y = Integer.parseInt(oct_temp);
		int cnt2 = 1;
		int oct = 0;
		while(y>0) {
			oct = oct + ((y%10) * cnt2);
			cnt2 = cnt2 * 8;
			y = y/10;
		}
		System.out.println("8���� "+ oct_input + " �� 2���� 0b" + Integer.toBinaryString(oct));
		
		//////////////////////////////////16����////////////////////////
		
		String hex_temp = hex_input.substring(2);
		int z = Integer.parseInt(hex_temp);
		int cnt3 = 1;
		int hex = 0;
		while(z>0) {
			hex = hex + ((z%10) * cnt3);
			cnt3 = cnt3 * 16;
			z = z/10;
		}
		System.out.println("16���� "+ hex_input + " �� 8���� 0" + Integer.toOctalString(hex));
		
		/////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		scan.close();

	}

}
