package Ex03_selftest_anonymouseClass;

public class ActionExam {

	public static void main(String[] args) {
		
		Action action = new Action() {	// 익명 구현 객체
			@Override
			public void work() {
				System.out.println("복사를 합니다");
			}
			
		};
		
		action.work();
		
	}

}
