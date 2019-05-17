package P01;

public class RandomSeed {

	public static void main(String[] args) {

		int size = 10;

		int[] primeArr = new int[size];
		primeArr[0] = 2;
		
		int cnt = 1;

		int nowNum = 3;

		while(cnt < size) {
			
			for(int j = 3; j<nowNum ; j++) {
				
				if(nowNum%2 == 0)
					break;
				
				if(nowNum%j == 0) {
					
					if(nowNum == j) 
						primeArr[cnt++] = nowNum;
					
					break;
				}
					
			}	
		}
		
		for(int i = 0; i < size ; i++)
			System.out.println(primeArr[i]);
		

	}

}
