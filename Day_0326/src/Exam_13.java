

public class Exam_13 {

	public static void main(String[] args) throws Exception {

		int i = 0;
	
		while(true) {
			
			int a = System.in.read();			// 엔터 치면 밸류  + 엔터 + 줄바꿈 등 3개가 들어감
			
			i++;
			System.out.println(i);
			
			
			if (a == '0') 
				break;
		
		}
		
		System.out.println(i);
	
	}

}
