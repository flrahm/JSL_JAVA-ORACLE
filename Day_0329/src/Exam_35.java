
public class Exam_35 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		int cnt = 1;
		
		// for 문 안에서만 조작
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = 0; j < arr[i].length-1 ; j++) {
				arr[i][j] = cnt;
				
				
				 arr[i][arr[i].length-1] += cnt; // way 2
				 arr[arr.length-1][j] += cnt; // way 2
				 arr[arr.length-1][arr[i].length-1] += cnt; // way 2
				 
				 cnt++;
			}
			
			//arr[i][4] = 10 + i*16;	// way 1
			//arr[4][i] = 28 + i*4;	// way 1
			//arr[4][4] += arr[4][i];	// way 1
					}
		
	///////////////////////////////////////////////////////////
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++)
				System.out.print(arr[i][j] + "\t");
			
			System.out.println("");
		}

	}

}
