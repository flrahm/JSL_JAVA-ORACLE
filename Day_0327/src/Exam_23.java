import java.util.Scanner;

public class Exam_23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("1~100 사이의 정수를 입력하세요");
		int scr = scan.nextInt();

		score1(scr);

		scan.close();
	}

	static void score1(int a) {

		char grd;

		switch (a / 10) {
		case 10:
		case 9:
			grd = 'A';
			break;
		case 8:
			grd = 'B';
			break;
		case 7:
			grd = 'C';
			break;
		case 6:
			grd = 'D';
			break;
		default:
			grd = 'F';
		}

		System.out.println("성적 : " + grd);

	}

	static void score2(int a) {

		char grd;

		switch (a) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
			grd = 'A';
			break;
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
		case 84:
		case 83:
		case 82:
		case 81:
		case 80:
			grd = 'B';
			break;
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
		case 72:
		case 71:
		case 70:
			grd = 'C';
			break;
		case 69:
		case 68:
		case 67:
		case 66:
		case 65:
		case 64:
		case 63:
		case 62:
		case 61:
		case 60:
			grd = 'D';
			break;
		default:
			grd = 'F';

		}

		System.out.println("성적 : " + grd);

	}

}
