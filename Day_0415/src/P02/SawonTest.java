package P02;

public class SawonTest {

	public static void main(String[] args) {
		
		SawonList sList = new SawonList();

		int num = 1102;
		Sawon sa = sList.sawonSearch_linear(num);
		if(sa == null)
			System.out.println(num + " �� ���� ��ȣ �Դϴ�");
		else {
			System.out.println(sa.sabun + " �� " + sa.name + " �Դϴ�");
		}
	}

}
