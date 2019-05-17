package mathExam;

public class Exam_07_Lotto_2 {

	public static void main(String[] args) {
		int Lotto[] = new int[6];
		// 배열 생성

		System.out.println("Lotto");

		for (int i = 0; i < Lotto.length; i++) {
			Lotto[i] = (int) (Math.random() * 10) + 1;
			// 랜덤 값 반환

			for (int j = 0; j < i; j++) {
				if (Lotto[i] == Lotto[j]) {
					i--;
					break;
				} // 중복 값 제거
			}
		}

		for (int i = 0; i < Lotto.length; i++) {
			System.out.print(Lotto[i] + " ");
		}
		System.out.print("입니다.");

	}

}
