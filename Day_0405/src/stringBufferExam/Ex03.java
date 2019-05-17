package stringBufferExam;

public class Ex03 {

	public static void main(String[] args) {

		StringBuffer bf1 = new StringBuffer(); // 객체를 생성해서 사용
		// 16자가 저장될 수 있는 버퍼가 메모리상에 생성됨
		System.out.println("버퍼의크기 : " + bf1.capacity()); // capacity : 버퍼 크기 출력
		System.out.println("문자열의 길이 : " + bf1.length());
		System.out.println();

		StringBuffer bf2 = new StringBuffer("ABC");
		// ABC 가 차지하는 공간 3 + 기본 16 = 19자 크기의 버퍼가 생성됨
		System.out.println("버퍼의크기 : " + bf2.capacity());
		System.out.println("문자열의 길이 : " + bf2.length());
		System.out.println();
		
		
		bf2.append("abcasasasasasasasasasaasdasdasdasdasdasdasdasdasdasdasdde");
		System.out.println("버퍼의크기 : " + bf2.capacity());
		System.out.println("문자열의 길이 : " + bf2.length());

	}

}
