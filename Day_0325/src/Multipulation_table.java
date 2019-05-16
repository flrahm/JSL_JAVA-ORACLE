
public class Multipulation_table {

	public static void main(String[] args) {
		
		int[][] arr = new int[9][9];
		
		for(int i = 0;i < 9 ; i++) {
			for(int j = 0; j < 9 ; j++) {
				arr[i][j] = (i+1)*(j+1);
			}
		}

		
		for(int i = 0;i < 9 ; i++) {
			System.out.println("");
			for(int j = 0; j < 9 ; j++) {
				System.out.printf("%d x %d = %d \t",(j+1),(i+1),arr[i][j]);
			}
		}
		

	}

}
