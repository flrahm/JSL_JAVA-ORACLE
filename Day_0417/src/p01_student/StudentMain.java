// main 클래스
package p01_student;


public class StudentMain {	

	public static void main(String[] args) {
		
		String fileName = "E:\\라이브러리\\문서\\eclipse-workspace\\text\\Day_0417//data.txt";
		
		int[] answer = {1,2,3,4,5,6,7,8,9,10};
		
		//StudentDP sdp = new StudentDP();
		StudentDP sdp = new StudentDP(answer);	// 학생 데이터 처리 클래스 인스턴스를 만들어서 정답표를 넘겨줌
		
		
		
		sdp.readFile(fileName);	// 파일을 읽어서 학생 개개인에 저장하는 메소드를 실행. 파일 위치가 담긴 문자열을 넘겨줌 =
		sdp.body();	// 데이터 처리셋을 모아놓은 메소드를 실행 
		
	}

}
