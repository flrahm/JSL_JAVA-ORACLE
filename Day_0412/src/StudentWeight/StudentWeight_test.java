//�л� ü�� ���θ޼ҵ�

package StudentWeight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentWeight_test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<StudentWeight> sList = new ArrayList<StudentWeight>();
		
		while(true) {
			
			System.out.println("�� ��ȣ ü���� �Է��ϼ���");
			String inStr = scan.next();
			inStr = inStr.trim();
			String[] str = inStr.split(",");
			int ban = Integer.parseInt(str[0]);
			if(ban == 0)
				break;
			int stdNum = Integer.parseInt(str[1]);
			int weight = Integer.parseInt(str[2]);
			
			sList.add(new StudentWeight(ban,stdNum,weight));
			
		}
		scan.close();
		
		StudentWeight_dataProcess stdDP = new StudentWeight_dataProcess(sList);
		stdDP.body();
	}

}
