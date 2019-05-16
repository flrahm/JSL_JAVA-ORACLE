
public class test2 {

	public static void main(String[] args) throws Exception {
		
		int size = 5;
		char[] arr = new char[size];
		
		
		for (int i = 0; i < size; i++) {
			arr[i] = (char)System.in.read();
		}
		
		for(int i = 0; i < size ; i ++)
			System.out.println(arr[i]);
		
	}
}
