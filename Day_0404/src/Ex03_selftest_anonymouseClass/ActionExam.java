package Ex03_selftest_anonymouseClass;

public class ActionExam {

	public static void main(String[] args) {
		
		Action action = new Action() {	// �͸� ���� ��ü
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�");
			}
			
		};
		
		action.work();
		
	}

}
