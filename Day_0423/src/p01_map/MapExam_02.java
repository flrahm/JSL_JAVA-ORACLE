package p01_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExam_02 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		// id pw
		map.put("java", 100);
		map.put("python", 200);
		map.put("c++", 300);
		map.put("pearl", 400);

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("id �� pw�� �Է��ϼ��� : ");
			String id = scan.next();
			if (id == "0")
				break;
			int pw = scan.nextInt();

			if (map.containsKey(id)) {
				
				if (pw == map.get(id))
					System.out.println("�α��� ����");
				else
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
				
			} else
				System.out.println("�������� �ʴ� id �Դϴ�");

		}
		System.out.println("�����մϴ�");
		scan.close();

	}

}
