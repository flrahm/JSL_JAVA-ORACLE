package P02;

public class SawonTest {

	public static void main(String[] args) {
		
		SawonList sList = new SawonList();

		int num = 1102;
		Sawon sa = sList.sawonSearch_linear(num);
		if(sa == null)
			System.out.println(num + " 은 없는 번호 입니다");
		else {
			System.out.println(sa.sabun + " 은 " + sa.name + " 입니다");
		}
	}

}
