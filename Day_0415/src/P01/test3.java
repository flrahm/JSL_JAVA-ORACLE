package P01;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Lotto[] = new int[6];
		// �迭 ����

		System.out.println("Lotto");

		for (int i = 0; i < Lotto.length; i++) {
			Lotto[i] = (int) (Math.random() * 10) + 1;
			// ���� �� ��ȯ

			for (int j = 0; j < i; j++) {
				if (Lotto[i] == Lotto[j]) {
					i--;
					break;
				} // �ߺ� �� ����
			}
		}

		for (int i = 0; i < Lotto.length; i++) {
			System.out.print(Lotto[i] + " ");
		}
		System.out.print("�Դϴ�.");
		
		
		AA a = new AA();
		
		System.out.println();
		System.out.println(a.test2(12));
		
		TestInterface b = new TestInterface() {
			@Override
			public void test() {
				System.out.println("test");
				
			}@Override
			public String test2(int ss) {
				
				return ""+ss+MAX;
			}
		};
		
		//System.out.println(sa.test(100));
		
		b.test();
		System.out.println(b.test2(55));
		
		System.out.println("sdfSDF");
		
	}

}
