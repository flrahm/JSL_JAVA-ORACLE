package p02_test;

//import java.util.Random;

public class toBinary {

	public static void main(String[] args) {
		/*
		Random r = new Random();
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length ; i++)
			arr[i] = r.nextInt(80) + 20;
        */
		
	
		int[] arrTest = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println("배열을 이용한 방법");
		test1(arrTest);
		
		System.out.println("---------------------------------------");
		
		System.out.println("문자열을 이용한 방법");
		for(int i = 0; i < arrTest.length ; i++) {
			System.out.println(test2(arrTest[i]));
		}
		
	}
	
	
	static void test1(int[] arr) {
		
		int[] temp = new int[1000];
		int cnt = 0;
		int num = 0;
		for(int i = 0; i < arr.length ; i++) {
			
			cnt = 0;
			num = arr[i];
			while(num > 0) {
				temp[cnt] = num%2;
				num = num/2;
				cnt++;
			}
			
			for(int j = cnt-1 ; j >=0 ; j--)
				System.out.print(temp[j]);
			
			System.out.println();
			
		}
		
	}
	
	static String test2(int num) {
		
		String str = "";
		int temp = 0;
		while(num >0) {
			
			temp = num%2;
			str = temp + str;
			
			num = num/2;
		}
		
		return str;
	}
	

}
