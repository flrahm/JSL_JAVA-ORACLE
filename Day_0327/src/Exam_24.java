
public class Exam_24 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		
		for(int tmp : arr) 
			arr[tmp] = tmp;
		
		for (int tmp : arr)
			System.out.println(tmp);

	}

}
