package P01;

import java.util.Random;

enum Fruit{
	Apple,Peach,Oracle;
}

public class test {

	public static void main(String[] args) {
		
		Random r;
		r = new Random(System.currentTimeMillis());
		

		for(int i = 0; i < 1000; i++) {
			
			
			int a = r.nextInt(45)+1;
			System.out.println(a);
			if(a > 45 || a == 0)
				System.out.println("오류입니다");
		}
	}

}
