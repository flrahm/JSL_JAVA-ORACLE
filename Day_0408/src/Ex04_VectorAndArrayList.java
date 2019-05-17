import java.util.Vector;

public class Ex04_VectorAndArrayList {

	public static void main(String[] args) {
		
		Vector<Object> vc = new Vector<Object>();		
		// vector : 스레드 등에서 동기화 지원. ArrayList : 지원 안함 
		
		vc.add(1234);
		vc.add("aa");
		vc.add(3.14);
		
		for(int i = 0; i < vc.size();i++)
			System.out.println(vc.get(i));
		
	}
}
