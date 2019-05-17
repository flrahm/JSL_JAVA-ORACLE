package forTest;

public class TestInfo {

	int[] arr;
	
	int[] arr2;
	
	public TestInfo(int[] arr) {
		this.arr = arr;
		
		arr2 = new int[arr.length];
	}
	
	
	void testMethod() {
		for(int i = 0; i < arr2.length;i++)
		System.out.println(arr2[i]);
		
	}
	
}
