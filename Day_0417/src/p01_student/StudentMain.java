// main Ŭ����
package p01_student;


public class StudentMain {	

	public static void main(String[] args) {
		
		String fileName = "E:\\���̺귯��\\����\\eclipse-workspace\\text\\Day_0417//data.txt";
		
		int[] answer = {1,2,3,4,5,6,7,8,9,10};
		
		//StudentDP sdp = new StudentDP();
		StudentDP sdp = new StudentDP(answer);	// �л� ������ ó�� Ŭ���� �ν��Ͻ��� ���� ����ǥ�� �Ѱ���
		
		
		
		sdp.readFile(fileName);	// ������ �о �л� �����ο� �����ϴ� �޼ҵ带 ����. ���� ��ġ�� ��� ���ڿ��� �Ѱ��� =
		sdp.body();	// ������ ó������ ��Ƴ��� �޼ҵ带 ���� 
		
	}

}
