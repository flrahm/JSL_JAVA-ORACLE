package P01_Lotto;

public class Lotto {

	public static void main(String[] args) {


		int[] str1 = { 1, 2, 3, 4, 5, 6 };
		int[] str2 = { 1, 2, 3, 4, 5, 7 };
		int[] str3 = { 1, 2, 3, 4, 5, 9 };
		int[] str4 = { 1, 2, 3, 4, 10, 11 };
		int[] str5 = { 1, 15, 14, 10, 11, 12 };

		int[] win = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println(lotto(win,str1));
		System.out.println(lotto(win,str2));
		System.out.println(lotto(win,str3));
		System.out.println(lotto(win,str4));
		System.out.println(lotto(win,str5));
		
	}

	static String lotto(int[] win, int[] str) {

		boolean bonus = false;
		int score = 0;
		String rank = "";
		
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < win.length - 1; j++) {

				if (str[i] == win[j])
					score++;
			}
		}

		for (int i = 0; i < str.length; i++)
			if (str[i] == win[6])
				bonus = true;

		////////////////////////////

		switch (score) {
		case 6:
			rank = "1등";
			break;
		case 5:
			if (bonus == true)
				rank = "2등";
			else
				rank = "3등";
			break;
		case 4:
			rank = "4등";
			break;
		case 3:
			rank = "5등";
			break;
		default:
			rank = "꽝";
		}
		
		return rank;

	}
}
