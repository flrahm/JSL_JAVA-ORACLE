package p02_Sawon;

public class SawonMain {

	public static void main(String[] args) {
		
		String fileName = "E:\\라이브러리\\문서\\eclipse-workspace\\text\\Day_0417//sawonData.txt";
		SawonDP sdp = new SawonDP();
		sdp.readFile(fileName);
		sdp.printList();
		
		sdp.selectSawon("aaa");

		sdp.selectSawon(2103);
		sdp.printByDepartment(1);
	}

}
