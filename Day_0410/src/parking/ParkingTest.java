package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParkingTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Parking> pList = new ArrayList<Parking>();
		
		
		while(pList.size()<100) {
			
			System.out.println("���� ��ȣ�� �Է��ϼ���");
			String carNum = scan.next();	// ������ȣ �Է�
			if(carNum.equalsIgnoreCase("0000"))	// ���� 0000�̸� 
				break;	//�Է� ����
			
			System.out.println("���� �ð��� �Է��ϼ���");	
			int parkTime = scan.nextInt();	// �����ð� �Է�
			if(parkTime > 1440) {	// 24�ð� �̻��̸�. ������ ȯ������
				System.out.println("�����ð� �ʰ��Դϴ�");	// �޽��� ���� ��ü ������ ���� ����
			}else {
				pList.add(new Parking(carNum,parkTime));	// 24�ð� �̳��϶� ��ü ����
				System.out.println("��ϵǾ����ϴ�");
			}
				

		}
			scan.close();
			
		
		for(int i = 0 ; i < pList.size() ; i++)	// ���
			System.out.println(pList.get(i));
	}

}
