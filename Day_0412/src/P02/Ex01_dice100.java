// 주사위 100번 

package P02;

public class Ex01_dice100 {
	public static void main(String[] args) {
		
		int cnt = 100;
		int dice = 6;
		
		int[] arr = new int[dice+1];
		
		for(int i = 0; i < cnt ; i++) {
			
			int a = (int)(Math.random()*dice) + 1;
			
			arr[a-1]++;
			arr[arr.length-1]++;
		}
		
		System.out.println("1\t2\t3\t4\t5\t6\t합");
		for(int i = 0; i < arr.length ; i ++)
			System.out.print(arr[i] + "\t");
		
	}
}
