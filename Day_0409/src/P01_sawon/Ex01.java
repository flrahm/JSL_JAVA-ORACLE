package P01_sawon;

public class Ex01 {

	public static void main(String[] args) {

		int[][] a = { { 1, 1 }, { 1, 2 }, { 1, 3 },
				{ 2, 1 }, { 2, 2 }, 
				{ 3, 1 }, { 3, 2 }, { 3, 3 } };

		boolean overlap = true;
		

		
		int ban = a[0][0];
		System.out.println("¹Ý\t¹øÈ£");
		for (int i = 0; i < a.length; i++) {
			
			if(overlap == true) {
				System.out.println(ban + "\t" + a[i][1]);
				
				overlap = false;
			}
			else {
				System.out.println("\t" + a[i][1]);
				if(a[i][0] != ban) {
					overlap = true;
					ban = a[i][0];
				}
			}
			//System.out.println();
		}

	}

}
