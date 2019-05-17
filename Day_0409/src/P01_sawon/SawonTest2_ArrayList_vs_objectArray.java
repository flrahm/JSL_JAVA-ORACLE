package P01_sawon;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SawonTest2_ArrayList_vs_objectArray {

	public static void main(String[] args) {
		
		//��� ����Ʈ vs ��ü �迭
		Sawon[] saArr = new Sawon[5];	// way 1 : ��ü �迭
		List<Sawon> saList = new ArrayList<Sawon>();	// way 2 : ��� ����Ʈ
		
		
		// Sawon ��ü �ϳ� �����ؼ� ��� ����Ʈ �Ǵ� ��ü�迭�� �����Ͽ� �����ϴ� ���
		Sawon sa = new Sawon(1,"���ڹ�","�λ�",LocalDate.now());
		
		saArr[0] = sa;	// way 1	
		saList.add(sa);	// way 2
		
		// ��ü�� �������� �ʰ� ���� �����ϴ� ���
		saArr[1] = new Sawon(2,"�ھ���from��ü�迭","������",LocalDate.now());	// way 1
		saList.add(new Sawon(2,"�ھ���from��̸���Ʈ","������",LocalDate.now()));	// way 2
		
		// ����غ���. toString �� �������̵� �Ǿ�����
		System.out.println(saArr[0]);	// way 1
		System.out.println(saList.get(0));	// way 2 
		
		// ������ ��ü�� �����ϴ� ��� 
		System.out.println(saArr[1].getName());	// way 1 : saArr[�ε���].�޼ҵ�or����
		System.out.println(saList.get(1).getName());	// way 2 : saList.get(�ε���).�޼ҵ�or����
		

	}

}
