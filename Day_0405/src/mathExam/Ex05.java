package mathExam;

public class Ex05 {

	public static void main(String[] args) {
		Math.random();	//	0~1 사이의 난수 
		
		for(int i = 0; i <10 ; i++)
			System.out.print(Math.random());
		
		for(int i = 0; i < 10 ; i++)
			System.out.print((int)(Math.random()*10) + 1);
		System.out.println();
		
		int num = 10000;
		int sum = 0;
		
		for(int i = 0; i < num ; i++) {
			sum += (int)(Math.random()*100);
		}
		
		double ave = 1.0*sum/num;
		System.out.println(ave);
	}

}
